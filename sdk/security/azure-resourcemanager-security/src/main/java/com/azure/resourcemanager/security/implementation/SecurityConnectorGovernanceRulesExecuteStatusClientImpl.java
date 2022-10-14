// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

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
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.security.fluent.SecurityConnectorGovernanceRulesExecuteStatusClient;
import com.azure.resourcemanager.security.fluent.models.ExecuteRuleStatusInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * SecurityConnectorGovernanceRulesExecuteStatusClient.
 */
public final class SecurityConnectorGovernanceRulesExecuteStatusClientImpl
    implements SecurityConnectorGovernanceRulesExecuteStatusClient {
    /** The proxy service used to perform REST calls. */
    private final SecurityConnectorGovernanceRulesExecuteStatusService service;

    /** The service client containing this operation class. */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of SecurityConnectorGovernanceRulesExecuteStatusClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    SecurityConnectorGovernanceRulesExecuteStatusClientImpl(SecurityCenterImpl client) {
        this.service =
            RestProxy
                .create(
                    SecurityConnectorGovernanceRulesExecuteStatusService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterSecurityConnectorGovernanceRulesExecuteStatus to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterSecuri")
    private interface SecurityConnectorGovernanceRulesExecuteStatusService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security"
                + "/securityConnectors/{securityConnectorName}/providers/Microsoft.Security/governanceRules/{ruleId}"
                + "/operationResults/{operationId}")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("securityConnectorName") String securityConnectorName,
            @PathParam("ruleId") String ruleId,
            @PathParam("operationId") String operationId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get a specific governanceRule execution status for the requested scope by ruleId and operationId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param operationId The security GovernanceRule execution key - unique key for the execution of GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceRule execution status for the requested scope by ruleId and operationId along with
     *     {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> getWithResponseAsync(
        String resourceGroupName, String securityConnectorName, String ruleId, String operationId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (securityConnectorName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter securityConnectorName is required and cannot be null."));
        }
        if (ruleId == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleId is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String apiVersion = "2022-01-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            securityConnectorName,
                            ruleId,
                            operationId,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a specific governanceRule execution status for the requested scope by ruleId and operationId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param operationId The security GovernanceRule execution key - unique key for the execution of GovernanceRule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceRule execution status for the requested scope by ruleId and operationId along with
     *     {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> getWithResponseAsync(
        String resourceGroupName, String securityConnectorName, String ruleId, String operationId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (securityConnectorName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter securityConnectorName is required and cannot be null."));
        }
        if (ruleId == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleId is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String apiVersion = "2022-01-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                securityConnectorName,
                ruleId,
                operationId,
                accept,
                context);
    }

    /**
     * Get a specific governanceRule execution status for the requested scope by ruleId and operationId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param operationId The security GovernanceRule execution key - unique key for the execution of GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a specific governanceRule execution status for the requested scope
     *     by ruleId and operationId.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<ExecuteRuleStatusInner>, ExecuteRuleStatusInner> beginGetAsync(
        String resourceGroupName, String securityConnectorName, String ruleId, String operationId) {
        Mono<Response<Flux<ByteBuffer>>> mono =
            getWithResponseAsync(resourceGroupName, securityConnectorName, ruleId, operationId);
        return this
            .client
            .<ExecuteRuleStatusInner, ExecuteRuleStatusInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                ExecuteRuleStatusInner.class,
                ExecuteRuleStatusInner.class,
                this.client.getContext());
    }

    /**
     * Get a specific governanceRule execution status for the requested scope by ruleId and operationId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param operationId The security GovernanceRule execution key - unique key for the execution of GovernanceRule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a specific governanceRule execution status for the requested scope
     *     by ruleId and operationId.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<ExecuteRuleStatusInner>, ExecuteRuleStatusInner> beginGetAsync(
        String resourceGroupName, String securityConnectorName, String ruleId, String operationId, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            getWithResponseAsync(resourceGroupName, securityConnectorName, ruleId, operationId, context);
        return this
            .client
            .<ExecuteRuleStatusInner, ExecuteRuleStatusInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                ExecuteRuleStatusInner.class,
                ExecuteRuleStatusInner.class,
                context);
    }

    /**
     * Get a specific governanceRule execution status for the requested scope by ruleId and operationId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param operationId The security GovernanceRule execution key - unique key for the execution of GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a specific governanceRule execution status for the requested scope
     *     by ruleId and operationId.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<ExecuteRuleStatusInner>, ExecuteRuleStatusInner> beginGet(
        String resourceGroupName, String securityConnectorName, String ruleId, String operationId) {
        return beginGetAsync(resourceGroupName, securityConnectorName, ruleId, operationId).getSyncPoller();
    }

    /**
     * Get a specific governanceRule execution status for the requested scope by ruleId and operationId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param operationId The security GovernanceRule execution key - unique key for the execution of GovernanceRule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a specific governanceRule execution status for the requested scope
     *     by ruleId and operationId.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<ExecuteRuleStatusInner>, ExecuteRuleStatusInner> beginGet(
        String resourceGroupName, String securityConnectorName, String ruleId, String operationId, Context context) {
        return beginGetAsync(resourceGroupName, securityConnectorName, ruleId, operationId, context).getSyncPoller();
    }

    /**
     * Get a specific governanceRule execution status for the requested scope by ruleId and operationId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param operationId The security GovernanceRule execution key - unique key for the execution of GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceRule execution status for the requested scope by ruleId and operationId on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ExecuteRuleStatusInner> getAsync(
        String resourceGroupName, String securityConnectorName, String ruleId, String operationId) {
        return beginGetAsync(resourceGroupName, securityConnectorName, ruleId, operationId)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Get a specific governanceRule execution status for the requested scope by ruleId and operationId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param operationId The security GovernanceRule execution key - unique key for the execution of GovernanceRule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceRule execution status for the requested scope by ruleId and operationId on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ExecuteRuleStatusInner> getAsync(
        String resourceGroupName, String securityConnectorName, String ruleId, String operationId, Context context) {
        return beginGetAsync(resourceGroupName, securityConnectorName, ruleId, operationId, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Get a specific governanceRule execution status for the requested scope by ruleId and operationId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param operationId The security GovernanceRule execution key - unique key for the execution of GovernanceRule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceRule execution status for the requested scope by ruleId and operationId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExecuteRuleStatusInner get(
        String resourceGroupName, String securityConnectorName, String ruleId, String operationId) {
        return getAsync(resourceGroupName, securityConnectorName, ruleId, operationId).block();
    }

    /**
     * Get a specific governanceRule execution status for the requested scope by ruleId and operationId.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     *     insensitive.
     * @param securityConnectorName The security connector name.
     * @param ruleId The security GovernanceRule key - unique key for the standard GovernanceRule.
     * @param operationId The security GovernanceRule execution key - unique key for the execution of GovernanceRule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceRule execution status for the requested scope by ruleId and operationId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ExecuteRuleStatusInner get(
        String resourceGroupName, String securityConnectorName, String ruleId, String operationId, Context context) {
        return getAsync(resourceGroupName, securityConnectorName, ruleId, operationId, context).block();
    }
}
