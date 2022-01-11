// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.streamanalytics.fluent.SubscriptionsClient;
import com.azure.resourcemanager.streamanalytics.fluent.models.SubscriptionQuotasListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SubscriptionsClient. */
public final class SubscriptionsClientImpl implements SubscriptionsClient {
    private final ClientLogger logger = new ClientLogger(SubscriptionsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final SubscriptionsService service;

    /** The service client containing this operation class. */
    private final StreamAnalyticsManagementClientImpl client;

    /**
     * Initializes an instance of SubscriptionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SubscriptionsClientImpl(StreamAnalyticsManagementClientImpl client) {
        this.service =
            RestProxy.create(SubscriptionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StreamAnalyticsManagementClientSubscriptions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StreamAnalyticsManag")
    private interface SubscriptionsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.StreamAnalytics/locations/{location}/quotas")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SubscriptionQuotasListResultInner>> listQuotas(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Retrieves the subscription's current quota information in a particular region.
     *
     * @param location The region in which to retrieve the subscription's quota information. You can find out which
     *     regions Azure Stream Analytics is supported in here: https://azure.microsoft.com/en-us/regions/.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the GetQuotas operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SubscriptionQuotasListResultInner>> listQuotasWithResponseAsync(String location) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listQuotas(
                            this.client.getEndpoint(),
                            location,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieves the subscription's current quota information in a particular region.
     *
     * @param location The region in which to retrieve the subscription's quota information. You can find out which
     *     regions Azure Stream Analytics is supported in here: https://azure.microsoft.com/en-us/regions/.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the GetQuotas operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SubscriptionQuotasListResultInner>> listQuotasWithResponseAsync(
        String location, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listQuotas(
                this.client.getEndpoint(),
                location,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Retrieves the subscription's current quota information in a particular region.
     *
     * @param location The region in which to retrieve the subscription's quota information. You can find out which
     *     regions Azure Stream Analytics is supported in here: https://azure.microsoft.com/en-us/regions/.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the GetQuotas operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SubscriptionQuotasListResultInner> listQuotasAsync(String location) {
        return listQuotasWithResponseAsync(location)
            .flatMap(
                (Response<SubscriptionQuotasListResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Retrieves the subscription's current quota information in a particular region.
     *
     * @param location The region in which to retrieve the subscription's quota information. You can find out which
     *     regions Azure Stream Analytics is supported in here: https://azure.microsoft.com/en-us/regions/.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the GetQuotas operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SubscriptionQuotasListResultInner listQuotas(String location) {
        return listQuotasAsync(location).block();
    }

    /**
     * Retrieves the subscription's current quota information in a particular region.
     *
     * @param location The region in which to retrieve the subscription's quota information. You can find out which
     *     regions Azure Stream Analytics is supported in here: https://azure.microsoft.com/en-us/regions/.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the GetQuotas operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SubscriptionQuotasListResultInner> listQuotasWithResponse(String location, Context context) {
        return listQuotasWithResponseAsync(location, context).block();
    }
}
