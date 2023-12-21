// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.tracing.SpanKind;
import com.azure.core.util.tracing.StartSpanOptions;
import com.azure.core.util.tracing.Tracer;
import com.azure.core.util.tracing.TracingLink;
import com.azure.messaging.servicebus.implementation.instrumentation.ReceiverKind;
import com.azure.messaging.servicebus.implementation.instrumentation.ServiceBusReceiverInstrumentation;
import com.azure.messaging.servicebus.implementation.ServiceBusProcessorClientOptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

import static com.azure.core.util.tracing.Tracer.DIAGNOSTIC_ID_KEY;
import static com.azure.core.util.tracing.Tracer.ENTITY_PATH_KEY;
import static com.azure.core.util.tracing.Tracer.HOST_NAME_KEY;
import static com.azure.core.util.tracing.Tracer.PARENT_TRACE_CONTEXT_KEY;
import static com.azure.core.util.tracing.Tracer.SPAN_CONTEXT_KEY;
import static com.azure.messaging.servicebus.implementation.instrumentation.ServiceBusTracer.MESSAGE_ENQUEUED_TIME_ATTRIBUTE_NAME;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Unit tests for {@link ServiceBusProcessorClient}.
 */
public class ServiceBusProcessorTest {

    private static final String NAMESPACE = "namespace";
    private static final String ENTITY_NAME = "entity";
    private static final ServiceBusReceiverInstrumentation DEFAULT_INSTRUMENTATION =
        new ServiceBusReceiverInstrumentation(null, null, NAMESPACE, ENTITY_NAME, "subscription", ReceiverKind.PROCESSOR);

    /**
     * Tests receiving messages using a {@link ServiceBusProcessorClient}.
     *
     * @throws InterruptedException If the test is interrupted.
     */
    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    public void testReceivingMessagesWithProcessor(boolean isV2) throws InterruptedException {
        Flux<ServiceBusReceivedMessage> messageFlux =
            Flux.create(emitter -> {
                for (int i = 0; i < 5; i++) {
                    ServiceBusReceivedMessage serviceBusReceivedMessage =
                        new ServiceBusReceivedMessage(BinaryData.fromString("hello"));
                    serviceBusReceivedMessage.setMessageId(String.valueOf(i));
                    emitter.next(serviceBusReceivedMessage);
                }
            });

        ServiceBusClientBuilder.ServiceBusReceiverClientBuilder receiverBuilder = getBuilder(messageFlux, isV2, null);
        final ServiceBusProcessorClientOptions options = new ServiceBusProcessorClientOptions()
            .setMaxConcurrentCalls(1);
        if (isV2) {
            options.setV2(true);
        }
        AtomicInteger messageId = new AtomicInteger();
        CountDownLatch countDownLatch = new CountDownLatch(5);
        ServiceBusProcessorClient serviceBusProcessorClient = new ServiceBusProcessorClient(receiverBuilder, ENTITY_NAME,
                null, null,
            messageContext -> {
                assertEquals(String.valueOf(messageId.getAndIncrement()), messageContext.getMessage().getMessageId());
                countDownLatch.countDown();
            },
            error -> Assertions.fail("Error occurred when receiving messages from the processor"),
            options);

        serviceBusProcessorClient.start();
        boolean success = countDownLatch.await(5, TimeUnit.SECONDS);
        serviceBusProcessorClient.close();
        assertTrue(success, "Failed to receive all expected messages");
    }

    /**
     * Tests receiving messages using a session-enabled {@link ServiceBusProcessorClient}.
     *
     * @throws InterruptedException If the test is interrupted.
     */
    @Test
    public void testReceivingMultiSessionMessagesWithProcessor() throws InterruptedException {
        int numberOfMessages = 10;
        Flux<ServiceBusMessageContext> messageFlux =
            Flux.create(emitter -> {
                for (int i = 0; i < numberOfMessages; i++) {
                    ServiceBusReceivedMessage serviceBusReceivedMessage =
                        new ServiceBusReceivedMessage(BinaryData.fromString("hello"));
                    serviceBusReceivedMessage.setMessageId(String.valueOf(i));
                    serviceBusReceivedMessage.setSessionId(String.valueOf(i % 3));
                    ServiceBusMessageContext serviceBusMessageContext =
                        new ServiceBusMessageContext(serviceBusReceivedMessage);
                    emitter.next(serviceBusMessageContext);
                }
            });

        ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder receiverBuilder = getSessionBuilder(messageFlux, null);

        AtomicInteger messageId = new AtomicInteger();
        CountDownLatch countDownLatch = new CountDownLatch(numberOfMessages);
        ServiceBusProcessorClient serviceBusProcessorClient = new ServiceBusProcessorClient(receiverBuilder, ENTITY_NAME,
                null, null,
            messageContext -> {
                int expectedMessageId = messageId.getAndIncrement();
                assertEquals(String.valueOf(expectedMessageId), messageContext.getMessage().getMessageId());
                assertEquals(String.valueOf(expectedMessageId % 3), messageContext.getMessage().getSessionId());
                countDownLatch.countDown();
            },
            error -> Assertions.fail("Error occurred when receiving messages from the processor"),
            new ServiceBusProcessorClientOptions().setMaxConcurrentCalls(1));

        serviceBusProcessorClient.start();
        boolean success = countDownLatch.await(5, TimeUnit.SECONDS);
        serviceBusProcessorClient.close();
        assertTrue(success, "Failed to receive all expected messages");
    }

    /**
     * Tests receiving messages using a {@link ServiceBusProcessorClient}, pausing the processor and then resuming
     * the processor to continue receiving messages.
     *
     * @throws InterruptedException If the test is interrupted.
     */
    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    public void testStartStopResume(boolean isV2) throws InterruptedException {
        AtomicReference<FluxSink<ServiceBusReceivedMessage>> sink = new AtomicReference<>();
        Flux<ServiceBusReceivedMessage> messageFlux = Flux.create(sink::set);
        ServiceBusClientBuilder.ServiceBusReceiverClientBuilder receiverBuilder = getBuilder(messageFlux, isV2, null);
        final ServiceBusProcessorClientOptions options = new ServiceBusProcessorClientOptions()
            .setMaxConcurrentCalls(1);
        if (isV2) {
            options.setV2(true);
        }
        AtomicInteger messageId = new AtomicInteger();
        AtomicReference<CountDownLatch> countDownLatch = new AtomicReference<>();
        countDownLatch.set(new CountDownLatch(2));

        AtomicBoolean assertionFailed = new AtomicBoolean();
        ServiceBusProcessorClient serviceBusProcessorClient = new ServiceBusProcessorClient(receiverBuilder, ENTITY_NAME,
                null, null,
            messageContext -> {
                try {
                    assertEquals(String.valueOf(messageId.getAndIncrement()),
                        messageContext.getMessage().getMessageId());
                } catch (AssertionError error) {
                    assertionFailed.set(true);
                } finally {
                    countDownLatch.get().countDown();
                }
            },
            error -> Assertions.fail("Error occurred when receiving messages from the processor"),
            options);

        serviceBusProcessorClient.start();
        for (int i = 0; i < 2; i++) {
            ServiceBusReceivedMessage serviceBusReceivedMessage =
                new ServiceBusReceivedMessage(BinaryData.fromString("hello"));
            serviceBusReceivedMessage.setMessageId(String.valueOf(i));
            sink.get().next(serviceBusReceivedMessage);
        }
        boolean success = countDownLatch.get().await(5, TimeUnit.SECONDS);
        serviceBusProcessorClient.stop();
        assertTrue(!assertionFailed.get() && success, "Failed to receive all expected messages");

        countDownLatch.set(new CountDownLatch(8));
        serviceBusProcessorClient.start();
        for (int i = 2; i < 10; i++) {
            ServiceBusReceivedMessage serviceBusReceivedMessage =
                new ServiceBusReceivedMessage(BinaryData.fromString("hello"));
            serviceBusReceivedMessage.setMessageId(String.valueOf(i));
            sink.get().next(serviceBusReceivedMessage);
        }
        success = countDownLatch.get().await(5, TimeUnit.SECONDS);
        serviceBusProcessorClient.close();
        assertTrue(!assertionFailed.get() && success, "Failed to receive all expected messages");
    }


    /**
     * Tests receiving messages using a {@link ServiceBusProcessorClient}, handles errors while receiving messages
     * and then recovers from the error and continues receiving messages.
     *
     * @throws InterruptedException If the test is interrupted.
     */
    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    public void testErrorRecovery(boolean isV2) throws InterruptedException {
        List<ServiceBusReceivedMessage> messageList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ServiceBusReceivedMessage serviceBusReceivedMessage =
                new ServiceBusReceivedMessage(BinaryData.fromString("hello"));
            serviceBusReceivedMessage.setMessageId(String.valueOf(i));
            messageList.add(serviceBusReceivedMessage);
        }

        final Flux<ServiceBusReceivedMessage> messageFlux = Flux.generate(() -> 0,
            (state, sink) -> {
                ServiceBusReceivedMessage serviceBusReceivedMessage =
                    new ServiceBusReceivedMessage(BinaryData.fromString("hello"));
                serviceBusReceivedMessage.setMessageId(String.valueOf(state));
                if (state == 2) {
                    throw new IllegalStateException("error");
                } else {
                    sink.next(serviceBusReceivedMessage);
                }
                return state + 1;
            });

        ServiceBusClientBuilder.ServiceBusReceiverClientBuilder receiverBuilder = getBuilder(messageFlux, isV2, null);
        final ServiceBusProcessorClientOptions options = new ServiceBusProcessorClientOptions()
            .setMaxConcurrentCalls(1);
        if (isV2) {
            options.setV2(true);
        }
        AtomicInteger messageId = new AtomicInteger();
        AtomicReference<CountDownLatch> countDownLatch = new AtomicReference<>();
        countDownLatch.set(new CountDownLatch(4));
        AtomicBoolean assertionFailed = new AtomicBoolean();
        StringBuffer messageIdNotMatched = new StringBuffer();
        ServiceBusProcessorClient serviceBusProcessorClient = new ServiceBusProcessorClient(receiverBuilder, ENTITY_NAME,
                null, null,
            messageContext -> {
                try {
                    assertEquals(String.valueOf(messageId.getAndIncrement() % 2),
                        messageContext.getMessage().getMessageId());
                } catch (AssertionError error) {
                    messageIdNotMatched.append(messageContext.getMessage().getMessageId()).append(",");
                    assertionFailed.set(true);
                } finally {
                    countDownLatch.get().countDown();
                }
            },
            error -> { /* ignored */ },
            options);

        serviceBusProcessorClient.start();
        boolean success = countDownLatch.get().await(20, TimeUnit.SECONDS);
        serviceBusProcessorClient.close();
        Assertions.assertTrue(!assertionFailed.get(), "Message id did not match. Invalid message Ids: " + messageIdNotMatched);
        Assertions.assertTrue(success, "Failed to receive all expected messages");
    }

    /**
     * Tests user message processing code throwing an error which should result in the message being abandoned.
     * @throws InterruptedException If the test is interrupted.
     */
    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    public void testUserMessageHandlerError(boolean isV2) throws InterruptedException {
        final int numberOfEvents = 5;
        final Flux<ServiceBusReceivedMessage> messageFlux = Flux.generate(() -> 0,
            (state, sink) -> {
                ServiceBusReceivedMessage serviceBusReceivedMessage =
                    new ServiceBusReceivedMessage(BinaryData.fromString("hello"));
                serviceBusReceivedMessage.setMessageId(String.valueOf(state));
                sink.next(serviceBusReceivedMessage);
                if (state == numberOfEvents) {
                    sink.complete();
                }
                return state + 1;
            });

        final ServiceBusClientBuilder.ServiceBusReceiverClientBuilder receiverBuilder =
            mock(ServiceBusClientBuilder.ServiceBusReceiverClientBuilder.class);
        final ServiceBusReceiverAsyncClient asyncClient = mock(ServiceBusReceiverAsyncClient.class);
        when(receiverBuilder.buildAsyncClientForProcessor()).thenReturn(asyncClient);
        final ServiceBusProcessorClientOptions options = new ServiceBusProcessorClientOptions()
            .setMaxConcurrentCalls(1);
        if (isV2) {
            options.setV2(true);
        }
        if (isV2) {
            when(asyncClient.nonSessionProcessorReceiveV2()).thenReturn(messageFlux);
        } else {
            when(asyncClient.receiveMessagesWithContext()).thenReturn(messageFlux.map(ServiceBusMessageContext::new));
        }
        when(asyncClient.isConnectionClosed()).thenReturn(false);
        when(asyncClient.abandon(any(ServiceBusReceivedMessage.class))).thenReturn(Mono.empty());
        when(asyncClient.getFullyQualifiedNamespace()).thenReturn(NAMESPACE);
        when(asyncClient.getEntityPath()).thenReturn(ENTITY_NAME);
        when(asyncClient.getInstrumentation()).thenReturn(DEFAULT_INSTRUMENTATION);
        doNothing().when(asyncClient).close();

        final AtomicInteger messageId = new AtomicInteger();
        final CountDownLatch countDownLatch = new CountDownLatch(numberOfEvents);
        ServiceBusProcessorClient serviceBusProcessorClient = new ServiceBusProcessorClient(receiverBuilder, ENTITY_NAME,
                null, null,
            messageContext -> {
                assertEquals(String.valueOf(messageId.getAndIncrement()), messageContext.getMessage().getMessageId());
                throw new IllegalStateException(); // throw error from user handler
            },
            serviceBusProcessErrorContext -> {
                ServiceBusException exception = (ServiceBusException) serviceBusProcessErrorContext.getException();
                assertSame(exception.getErrorSource(), ServiceBusErrorSource.USER_CALLBACK);
                countDownLatch.countDown();
            },
            options);

        serviceBusProcessorClient.start();
        boolean success = countDownLatch.await(5, TimeUnit.SECONDS);
        serviceBusProcessorClient.close();
        assertTrue(success, "Failed to receive all expected messages");

        // It's possible that the last event has not been abandoned yet because this is in the background. Which is
        // annoying but is a timing issue.
        verify(asyncClient, atLeast(numberOfEvents - 1))
            .abandon(any(ServiceBusReceivedMessage.class));
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    public void testUserMessageHandlerErrorWithAutoCompleteDisabled(boolean isV2) throws InterruptedException {

        final Flux<ServiceBusReceivedMessage> messageFlux = Flux.generate(() -> 0,
            (state, sink) -> {
                ServiceBusReceivedMessage serviceBusReceivedMessage =
                    new ServiceBusReceivedMessage(BinaryData.fromString("hello"));
                serviceBusReceivedMessage.setMessageId(String.valueOf(state));
                sink.next(serviceBusReceivedMessage);
                if (state == 5) {
                    sink.complete();
                }
                return state + 1;
            }).publish().autoConnect().cast(ServiceBusReceivedMessage.class);

        ServiceBusClientBuilder.ServiceBusReceiverClientBuilder receiverBuilder =
            mock(ServiceBusClientBuilder.ServiceBusReceiverClientBuilder.class);

        ServiceBusReceiverAsyncClient asyncClient = mock(ServiceBusReceiverAsyncClient.class);
        when(receiverBuilder.buildAsyncClientForProcessor()).thenReturn(asyncClient);
        final ServiceBusProcessorClientOptions options = new ServiceBusProcessorClientOptions()
            .setMaxConcurrentCalls(1)
            .setDisableAutoComplete(true);
        if (isV2) {
            options.setV2(true);
        }
        if (isV2) {
            when(asyncClient.nonSessionProcessorReceiveV2()).thenReturn(messageFlux);
        } else {
            when(asyncClient.receiveMessagesWithContext()).thenReturn(messageFlux.map(ServiceBusMessageContext::new));
        }
        when(asyncClient.isConnectionClosed()).thenReturn(false);
        when(asyncClient.getFullyQualifiedNamespace()).thenReturn(NAMESPACE);
        when(asyncClient.getEntityPath()).thenReturn(ENTITY_NAME);
        when(asyncClient.getInstrumentation()).thenReturn(DEFAULT_INSTRUMENTATION);

        doNothing().when(asyncClient).close();

        AtomicInteger messageId = new AtomicInteger();
        CountDownLatch countDownLatch = new CountDownLatch(5);
        ServiceBusProcessorClient serviceBusProcessorClient = new ServiceBusProcessorClient(receiverBuilder, ENTITY_NAME,
                null, null,
            messageContext -> {
                assertEquals(String.valueOf(messageId.getAndIncrement()), messageContext.getMessage().getMessageId());
                throw new IllegalStateException(); // throw error from user handler
            },
            serviceBusProcessErrorContext -> {
                ServiceBusException exception = (ServiceBusException) serviceBusProcessErrorContext.getException();
                assertEquals(ServiceBusErrorSource.USER_CALLBACK, exception.getErrorSource());
                countDownLatch.countDown();
            },
            options);

        serviceBusProcessorClient.start();
        boolean success = countDownLatch.await(30, TimeUnit.SECONDS);
        serviceBusProcessorClient.close();
        assertTrue(success, "Failed to receive all expected messages");

        verify(asyncClient, never()).abandon(any(ServiceBusReceivedMessage.class));
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    @SuppressWarnings("unchecked")
    public void testProcessorWithTracingEnabled(boolean isV2) throws InterruptedException {
        final Tracer tracer = mock(Tracer.class);
        final int numberOfTimes = 5;

        String diagnosticId = "00-08ee063508037b1719dddcbf248e30e2-1365c684eb25daed-01";
        when(tracer.isEnabled()).thenReturn(true);
        when(tracer.extractContext(any())).thenAnswer(invocation -> {
            Function<String, String> consumer = invocation.getArgument(0, Function.class);
            assertEquals(diagnosticId, consumer.apply("traceparent"));
            assertNull(consumer.apply("tracestate"));
            return new Context(SPAN_CONTEXT_KEY, "value");
        });

        when(tracer.start(eq("ServiceBus.process"), any(StartSpanOptions.class), any())).thenAnswer(
            invocation -> {
                assertStartOptions(invocation.getArgument(1, StartSpanOptions.class), 0);
                Context passed = invocation.getArgument(2, Context.class);
                return passed
                    .addData(PARENT_TRACE_CONTEXT_KEY, "value2");
            }
        );
        Flux<ServiceBusReceivedMessage> messageFlux =
            Flux.create(emitter -> {
                for (int i = 0; i < numberOfTimes; i++) {
                    ServiceBusReceivedMessage serviceBusReceivedMessage =
                        new ServiceBusReceivedMessage(BinaryData.fromString("hello"));
                    serviceBusReceivedMessage.setMessageId(String.valueOf(i));
                    serviceBusReceivedMessage.setEnqueuedTime(OffsetDateTime.now());
                    serviceBusReceivedMessage.getApplicationProperties().put(DIAGNOSTIC_ID_KEY, diagnosticId);
                    emitter.next(serviceBusReceivedMessage);
                }
            });

        ServiceBusClientBuilder.ServiceBusReceiverClientBuilder receiverBuilder = getBuilder(messageFlux, isV2, tracer);
        final ServiceBusProcessorClientOptions options = new ServiceBusProcessorClientOptions()
            .setMaxConcurrentCalls(1);
        if (isV2) {
            options.setV2(true);
        }
        AtomicInteger messageId = new AtomicInteger();
        CountDownLatch countDownLatch = new CountDownLatch(numberOfTimes);
        ServiceBusProcessorClient serviceBusProcessorClient = new ServiceBusProcessorClient(receiverBuilder, ENTITY_NAME,
                null, null,
            messageContext -> {
                assertEquals(String.valueOf(messageId.getAndIncrement()), messageContext.getMessage().getMessageId());
                countDownLatch.countDown();
            },
            error -> Assertions.fail("Error occurred when receiving messages from the processor"),
            options);

        serviceBusProcessorClient.start();
        boolean success = countDownLatch.await(numberOfTimes, TimeUnit.SECONDS);
        serviceBusProcessorClient.close();

        assertTrue(success, "Failed to receive all expected messages");
        verify(tracer, times(numberOfTimes)).extractContext(any());
        verify(tracer, times(numberOfTimes)).start(eq("ServiceBus.process"), any(StartSpanOptions.class), any(Context.class));

        // This is one less because the processEvent is called before the end span call, so it is possible for
        // to reach this line without calling it the 5th time yet. (Timing issue.)
        verify(tracer, atLeast(numberOfTimes - 1)).end(isNull(), isNull(), any());
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testProcessorWithTracingEnabledAndNullMessage() throws InterruptedException {
        final Tracer tracer = mock(Tracer.class);
        final int numberOfTimes = 1;

        when(tracer.isEnabled()).thenReturn(true);
        when(tracer.extractContext(any())).thenReturn(Context.NONE);

        when(tracer.start(eq("ServiceBus.process"), any(StartSpanOptions.class), any())).thenReturn(new Context(PARENT_TRACE_CONTEXT_KEY, "span"));

        Flux<ServiceBusMessageContext> messageFlux = Flux.just(new ServiceBusMessageContext("sessionId", new RuntimeException("foo")));
        ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder receiverBuilder = getSessionBuilder(messageFlux, tracer);

        CountDownLatch countDownLatch = new CountDownLatch(numberOfTimes);
        ServiceBusProcessorClient serviceBusProcessorClient = new ServiceBusProcessorClient(receiverBuilder, ENTITY_NAME,
            null, null,
            messageContext -> fail("Should not have received a message"),
            error -> {
                assertEquals("foo", error.getException().getMessage());
                countDownLatch.countDown();
            },
            new ServiceBusProcessorClientOptions().setMaxConcurrentCalls(1));

        serviceBusProcessorClient.start();
        assertTrue(countDownLatch.await(20, TimeUnit.SECONDS));
        serviceBusProcessorClient.close();

        verify(tracer, never()).start(eq("ServiceBus.process"), any(StartSpanOptions.class), any(Context.class));
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    @SuppressWarnings("unchecked")
    public void testProcessorWithTracingDisabled(boolean isV2) throws InterruptedException {
        final Tracer tracer = mock(Tracer.class);

        when(tracer.isEnabled()).thenReturn(false);

        Flux<ServiceBusReceivedMessage> messageFlux =
            Flux.create(emitter -> {
                ServiceBusReceivedMessage serviceBusReceivedMessage =
                    new ServiceBusReceivedMessage(BinaryData.fromString("hello"));
                emitter.next(serviceBusReceivedMessage);
            });

        ServiceBusClientBuilder.ServiceBusReceiverClientBuilder receiverBuilder = getBuilder(messageFlux, isV2, tracer);
        final ServiceBusProcessorClientOptions options = new ServiceBusProcessorClientOptions()
            .setMaxConcurrentCalls(1);
        if (isV2) {
            options.setV2(true);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ServiceBusProcessorClient serviceBusProcessorClient = new ServiceBusProcessorClient(receiverBuilder, ENTITY_NAME,
            null, null,
            messageContext -> countDownLatch.countDown(),
            error -> Assertions.fail("Error occurred when receiving messages from the processor"),
            options);

        serviceBusProcessorClient.start();
        boolean success = countDownLatch.await(1, TimeUnit.SECONDS);
        serviceBusProcessorClient.close();

        assertTrue(success, "Failed to receive message");
        verify(tracer, never()).extractContext(any());
        verify(tracer, never()).start(eq("ServiceBus.process"), any(StartSpanOptions.class), any(Context.class));
        verify(tracer, never()).end(any(), any(), any());
    }

    @ParameterizedTest
    @ValueSource(booleans = {true, false})
    public void testProcessorWithTracingEnabledWithoutDiagnosticId(boolean isV2) throws InterruptedException {
        final Tracer tracer = mock(Tracer.class);
        final int numberOfTimes = 5;
        when(tracer.isEnabled()).thenReturn(true);
        when(tracer.start(eq("ServiceBus.process"), any(StartSpanOptions.class), any())).thenAnswer(
            invocation -> {
                assertStartOptions(invocation.getArgument(1, StartSpanOptions.class), 0);
                Context passed = invocation.getArgument(2, Context.class);
                return passed
                    .addData(PARENT_TRACE_CONTEXT_KEY, "value2");
            }
        );
        Flux<ServiceBusReceivedMessage> messageFlux =
            Flux.create(emitter -> {
                for (int i = 0; i < numberOfTimes; i++) {
                    ServiceBusReceivedMessage serviceBusReceivedMessage =
                        new ServiceBusReceivedMessage(BinaryData.fromString("hello"));
                    serviceBusReceivedMessage.setMessageId(String.valueOf(i));
                    serviceBusReceivedMessage.setEnqueuedTime(OffsetDateTime.now());
                    emitter.next(serviceBusReceivedMessage);
                }
            });

        ServiceBusClientBuilder.ServiceBusReceiverClientBuilder receiverBuilder = getBuilder(messageFlux, isV2, tracer);
        final ServiceBusProcessorClientOptions options = new ServiceBusProcessorClientOptions()
            .setMaxConcurrentCalls(1);
        if (isV2) {
            options.setV2(true);
        }
        AtomicInteger messageId = new AtomicInteger();
        CountDownLatch countDownLatch = new CountDownLatch(numberOfTimes);
        ServiceBusProcessorClient serviceBusProcessorClient = new ServiceBusProcessorClient(receiverBuilder, ENTITY_NAME,
                null, null,
            messageContext -> {
                assertEquals(String.valueOf(messageId.getAndIncrement()), messageContext.getMessage().getMessageId());
                countDownLatch.countDown();
            },
            error -> Assertions.fail("Error occurred when receiving messages from the processor"),
            options);

        serviceBusProcessorClient.start();
        boolean success = countDownLatch.await(numberOfTimes, TimeUnit.SECONDS);
        serviceBusProcessorClient.close();

        assertTrue(success, "Failed to receive all expected messages");
        verify(tracer, times(numberOfTimes)).start(eq("ServiceBus.process"), any(StartSpanOptions.class), any(Context.class));

        // This is one less because the processEvent is called before the end span call, so it is possible for
        // to reach this line without calling it the 5th time yet. (Timing issue.)
        verify(tracer, atLeast(numberOfTimes - 1)).end(isNull(), isNull(), any());

    }

    private ServiceBusClientBuilder.ServiceBusReceiverClientBuilder getBuilder(
        Flux<ServiceBusReceivedMessage> messageFlux, boolean isV2, Tracer tracer) {

        ServiceBusClientBuilder.ServiceBusReceiverClientBuilder receiverBuilder =
            mock(ServiceBusClientBuilder.ServiceBusReceiverClientBuilder.class);

        ServiceBusReceiverAsyncClient asyncClient = mock(ServiceBusReceiverAsyncClient.class);
        when(receiverBuilder.buildAsyncClientForProcessor()).thenReturn(asyncClient);
        when(asyncClient.getFullyQualifiedNamespace()).thenReturn(NAMESPACE);
        when(asyncClient.getEntityPath()).thenReturn(ENTITY_NAME);

        ServiceBusReceiverInstrumentation instrumentation = new ServiceBusReceiverInstrumentation(tracer, null, NAMESPACE, ENTITY_NAME, null, ReceiverKind.PROCESSOR);
        if (isV2) {
            when(asyncClient.nonSessionProcessorReceiveV2()).thenReturn(messageFlux.publishOn(Schedulers.boundedElastic()));
        } else {
            when(asyncClient.receiveMessagesWithContext()).thenReturn(
                new FluxTrace(messageFlux.map(ServiceBusMessageContext::new), instrumentation).publishOn(Schedulers.boundedElastic()));
        }
        when(asyncClient.getInstrumentation()).thenReturn(instrumentation);
        when(asyncClient.isConnectionClosed()).thenReturn(false);
        doNothing().when(asyncClient).close();
        return receiverBuilder;
    }

    private ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder getSessionBuilder(
        Flux<ServiceBusMessageContext> messageFlux, Tracer tracer) {

        ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder receiverBuilder =
            mock(ServiceBusClientBuilder.ServiceBusSessionReceiverClientBuilder.class);

        ServiceBusReceiverAsyncClient asyncClient = mock(ServiceBusReceiverAsyncClient.class);
        when(asyncClient.getFullyQualifiedNamespace()).thenReturn(NAMESPACE);
        when(asyncClient.getEntityPath()).thenReturn(ENTITY_NAME);
        when(receiverBuilder.buildAsyncClientForProcessor()).thenReturn(asyncClient);
        if (tracer != null) {
            ServiceBusReceiverInstrumentation instrumentation = new ServiceBusReceiverInstrumentation(tracer, null, NAMESPACE, ENTITY_NAME, null, ReceiverKind.PROCESSOR);
            when(asyncClient.receiveMessagesWithContext()).thenReturn(
                new FluxTrace(messageFlux, instrumentation).publishOn(Schedulers.boundedElastic()));
            when(asyncClient.getInstrumentation()).thenReturn(instrumentation);
        } else {
            when(asyncClient.receiveMessagesWithContext()).thenReturn(messageFlux);
        }
        when(asyncClient.isConnectionClosed()).thenReturn(false);
        when(asyncClient.getInstrumentation()).thenReturn(DEFAULT_INSTRUMENTATION);
        doNothing().when(asyncClient).close();
        return receiverBuilder;
    }

    private void assertStartOptions(StartSpanOptions startOpts, int linkCount) {
        assertEquals(SpanKind.CONSUMER, startOpts.getSpanKind());
        assertEquals(ENTITY_NAME, startOpts.getAttributes().get(ENTITY_PATH_KEY));
        assertEquals(NAMESPACE, startOpts.getAttributes().get(HOST_NAME_KEY));

        if (linkCount == 0) {
            assertTrue(startOpts.getAttributes().containsKey(MESSAGE_ENQUEUED_TIME_ATTRIBUTE_NAME));
            assertNull(startOpts.getLinks());
        } else {
            assertEquals(linkCount, startOpts.getLinks().size());
            for (TracingLink link : startOpts.getLinks()) {
                assertTrue(link.getAttributes().containsKey(MESSAGE_ENQUEUED_TIME_ATTRIBUTE_NAME));
            }
        }
    }
}
