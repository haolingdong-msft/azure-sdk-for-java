// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.network.fluent.NetworkManagerCommitsClient;
import com.azure.resourcemanager.network.fluent.models.NetworkManagerCommitInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NetworkManagerCommitsClient. */
public final class NetworkManagerCommitsClientImpl implements NetworkManagerCommitsClient {
    /** The proxy service used to perform REST calls. */
    private final NetworkManagerCommitsService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of NetworkManagerCommitsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    NetworkManagerCommitsClientImpl(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(NetworkManagerCommitsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientNetworkManagerCommits to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface NetworkManagerCommitsService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/networkManagers/{networkManagerName}/commit")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Flux<ByteBuffer>>> post(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("networkManagerName") String networkManagerName,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") NetworkManagerCommitInner parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Post a Network Manager Commit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network commit is.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Manager Commit along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Flux<ByteBuffer>>> postWithResponseAsync(
        String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters) {
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
        if (networkManagerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter networkManagerName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2022-05-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .post(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            networkManagerName,
                            apiVersion,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Post a Network Manager Commit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network commit is.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Manager Commit along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<Flux<ByteBuffer>>> postWithResponseAsync(
        String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters, Context context) {
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
        if (networkManagerName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter networkManagerName is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2022-05-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .post(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                networkManagerName,
                apiVersion,
                parameters,
                accept,
                context);
    }

    /**
     * Post a Network Manager Commit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network commit is.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of network Manager Commit.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<PollResult<NetworkManagerCommitInner>, NetworkManagerCommitInner> beginPostAsync(
        String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters) {
        Mono<Response<Flux<ByteBuffer>>> mono =
            postWithResponseAsync(resourceGroupName, networkManagerName, parameters);
        return this
            .client
            .<NetworkManagerCommitInner, NetworkManagerCommitInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                NetworkManagerCommitInner.class,
                NetworkManagerCommitInner.class,
                this.client.getContext());
    }

    /**
     * Post a Network Manager Commit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network commit is.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of network Manager Commit.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    private PollerFlux<PollResult<NetworkManagerCommitInner>, NetworkManagerCommitInner> beginPostAsync(
        String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters, Context context) {
        context = this.client.mergeContext(context);
        Mono<Response<Flux<ByteBuffer>>> mono =
            postWithResponseAsync(resourceGroupName, networkManagerName, parameters, context);
        return this
            .client
            .<NetworkManagerCommitInner, NetworkManagerCommitInner>getLroResult(
                mono,
                this.client.getHttpPipeline(),
                NetworkManagerCommitInner.class,
                NetworkManagerCommitInner.class,
                context);
    }

    /**
     * Post a Network Manager Commit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network commit is.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of network Manager Commit.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<NetworkManagerCommitInner>, NetworkManagerCommitInner> beginPost(
        String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters) {
        return beginPostAsync(resourceGroupName, networkManagerName, parameters).getSyncPoller();
    }

    /**
     * Post a Network Manager Commit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network commit is.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of network Manager Commit.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<PollResult<NetworkManagerCommitInner>, NetworkManagerCommitInner> beginPost(
        String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters, Context context) {
        return beginPostAsync(resourceGroupName, networkManagerName, parameters, context).getSyncPoller();
    }

    /**
     * Post a Network Manager Commit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network commit is.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Manager Commit on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<NetworkManagerCommitInner> postAsync(
        String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters) {
        return beginPostAsync(resourceGroupName, networkManagerName, parameters)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Post a Network Manager Commit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network commit is.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Manager Commit on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<NetworkManagerCommitInner> postAsync(
        String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters, Context context) {
        return beginPostAsync(resourceGroupName, networkManagerName, parameters, context)
            .last()
            .flatMap(this.client::getLroFinalResultOrError);
    }

    /**
     * Post a Network Manager Commit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network commit is.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Manager Commit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkManagerCommitInner post(
        String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters) {
        return postAsync(resourceGroupName, networkManagerName, parameters).block();
    }

    /**
     * Post a Network Manager Commit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param parameters Parameters supplied to specify which Managed Network commit is.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network Manager Commit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NetworkManagerCommitInner post(
        String resourceGroupName, String networkManagerName, NetworkManagerCommitInner parameters, Context context) {
        return postAsync(resourceGroupName, networkManagerName, parameters, context).block();
    }
}
