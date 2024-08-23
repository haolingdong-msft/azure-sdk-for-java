// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.implementation;

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
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.standbypool.fluent.StandbyContainerGroupPoolRuntimeViewsClient;
import com.azure.resourcemanager.standbypool.fluent.models.StandbyContainerGroupPoolRuntimeViewResourceInner;
import com.azure.resourcemanager.standbypool.implementation.models.StandbyContainerGroupPoolRuntimeViewResourceListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * StandbyContainerGroupPoolRuntimeViewsClient.
 */
public final class StandbyContainerGroupPoolRuntimeViewsClientImpl
    implements StandbyContainerGroupPoolRuntimeViewsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final StandbyContainerGroupPoolRuntimeViewsService service;

    /**
     * The service client containing this operation class.
     */
    private final StandbyPoolClientImpl client;

    /**
     * Initializes an instance of StandbyContainerGroupPoolRuntimeViewsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    StandbyContainerGroupPoolRuntimeViewsClientImpl(StandbyPoolClientImpl client) {
        this.service = RestProxy.create(StandbyContainerGroupPoolRuntimeViewsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StandbyPoolClientStandbyContainerGroupPoolRuntimeViews to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "StandbyPoolClientSta")
    public interface StandbyContainerGroupPoolRuntimeViewsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.StandbyPool/standbyContainerGroupPools/{standbyContainerGroupPoolName}/runtimeViews/{runtimeView}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<StandbyContainerGroupPoolRuntimeViewResourceInner>> get(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("standbyContainerGroupPoolName") String standbyContainerGroupPoolName,
            @PathParam("runtimeView") String runtimeView, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.StandbyPool/standbyContainerGroupPools/{standbyContainerGroupPoolName}/runtimeViews")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<StandbyContainerGroupPoolRuntimeViewResourceListResult>> listByStandbyPool(
            @HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("standbyContainerGroupPoolName") String standbyContainerGroupPoolName,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<StandbyContainerGroupPoolRuntimeViewResourceListResult>> listByStandbyPoolNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("endpoint") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Get a StandbyContainerGroupPoolRuntimeViewResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @param runtimeView The unique identifier for the runtime view. The input string should be the word 'latest',
     * which will get the latest runtime view of the pool, otherwise the request will fail with NotFound exception.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyContainerGroupPoolRuntimeViewResource along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<StandbyContainerGroupPoolRuntimeViewResourceInner>>
        getWithResponseAsync(String resourceGroupName, String standbyContainerGroupPoolName, String runtimeView) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (standbyContainerGroupPoolName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter standbyContainerGroupPoolName is required and cannot be null."));
        }
        if (runtimeView == null) {
            return Mono.error(new IllegalArgumentException("Parameter runtimeView is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, standbyContainerGroupPoolName, runtimeView, accept,
                context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get a StandbyContainerGroupPoolRuntimeViewResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @param runtimeView The unique identifier for the runtime view. The input string should be the word 'latest',
     * which will get the latest runtime view of the pool, otherwise the request will fail with NotFound exception.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyContainerGroupPoolRuntimeViewResource along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<StandbyContainerGroupPoolRuntimeViewResourceInner>> getWithResponseAsync(
        String resourceGroupName, String standbyContainerGroupPoolName, String runtimeView, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (standbyContainerGroupPoolName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter standbyContainerGroupPoolName is required and cannot be null."));
        }
        if (runtimeView == null) {
            return Mono.error(new IllegalArgumentException("Parameter runtimeView is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
            resourceGroupName, standbyContainerGroupPoolName, runtimeView, accept, context);
    }

    /**
     * Get a StandbyContainerGroupPoolRuntimeViewResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @param runtimeView The unique identifier for the runtime view. The input string should be the word 'latest',
     * which will get the latest runtime view of the pool, otherwise the request will fail with NotFound exception.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyContainerGroupPoolRuntimeViewResource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<StandbyContainerGroupPoolRuntimeViewResourceInner> getAsync(String resourceGroupName,
        String standbyContainerGroupPoolName, String runtimeView) {
        return getWithResponseAsync(resourceGroupName, standbyContainerGroupPoolName, runtimeView)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get a StandbyContainerGroupPoolRuntimeViewResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @param runtimeView The unique identifier for the runtime view. The input string should be the word 'latest',
     * which will get the latest runtime view of the pool, otherwise the request will fail with NotFound exception.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyContainerGroupPoolRuntimeViewResource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<StandbyContainerGroupPoolRuntimeViewResourceInner> getWithResponse(String resourceGroupName,
        String standbyContainerGroupPoolName, String runtimeView, Context context) {
        return getWithResponseAsync(resourceGroupName, standbyContainerGroupPoolName, runtimeView, context).block();
    }

    /**
     * Get a StandbyContainerGroupPoolRuntimeViewResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @param runtimeView The unique identifier for the runtime view. The input string should be the word 'latest',
     * which will get the latest runtime view of the pool, otherwise the request will fail with NotFound exception.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyContainerGroupPoolRuntimeViewResource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public StandbyContainerGroupPoolRuntimeViewResourceInner get(String resourceGroupName,
        String standbyContainerGroupPoolName, String runtimeView) {
        return getWithResponse(resourceGroupName, standbyContainerGroupPoolName, runtimeView, Context.NONE).getValue();
    }

    /**
     * List StandbyContainerGroupPoolRuntimeViewResource resources by StandbyContainerGroupPoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyContainerGroupPoolRuntimeViewResource list operation along with
     * {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StandbyContainerGroupPoolRuntimeViewResourceInner>>
        listByStandbyPoolSinglePageAsync(String resourceGroupName, String standbyContainerGroupPoolName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (standbyContainerGroupPoolName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter standbyContainerGroupPoolName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByStandbyPool(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, standbyContainerGroupPoolName, accept, context))
            .<PagedResponse<StandbyContainerGroupPoolRuntimeViewResourceInner>>map(
                res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                    res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List StandbyContainerGroupPoolRuntimeViewResource resources by StandbyContainerGroupPoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyContainerGroupPoolRuntimeViewResource list operation along with
     * {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StandbyContainerGroupPoolRuntimeViewResourceInner>> listByStandbyPoolSinglePageAsync(
        String resourceGroupName, String standbyContainerGroupPoolName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (standbyContainerGroupPoolName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter standbyContainerGroupPoolName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByStandbyPool(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
                resourceGroupName, standbyContainerGroupPoolName, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * List StandbyContainerGroupPoolRuntimeViewResource resources by StandbyContainerGroupPoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyContainerGroupPoolRuntimeViewResource list operation as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<StandbyContainerGroupPoolRuntimeViewResourceInner>
        listByStandbyPoolAsync(String resourceGroupName, String standbyContainerGroupPoolName) {
        return new PagedFlux<>(() -> listByStandbyPoolSinglePageAsync(resourceGroupName, standbyContainerGroupPoolName),
            nextLink -> listByStandbyPoolNextSinglePageAsync(nextLink));
    }

    /**
     * List StandbyContainerGroupPoolRuntimeViewResource resources by StandbyContainerGroupPoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyContainerGroupPoolRuntimeViewResource list operation as paginated response with
     * {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<StandbyContainerGroupPoolRuntimeViewResourceInner>
        listByStandbyPoolAsync(String resourceGroupName, String standbyContainerGroupPoolName, Context context) {
        return new PagedFlux<>(
            () -> listByStandbyPoolSinglePageAsync(resourceGroupName, standbyContainerGroupPoolName, context),
            nextLink -> listByStandbyPoolNextSinglePageAsync(nextLink, context));
    }

    /**
     * List StandbyContainerGroupPoolRuntimeViewResource resources by StandbyContainerGroupPoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyContainerGroupPoolRuntimeViewResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<StandbyContainerGroupPoolRuntimeViewResourceInner> listByStandbyPool(String resourceGroupName,
        String standbyContainerGroupPoolName) {
        return new PagedIterable<>(listByStandbyPoolAsync(resourceGroupName, standbyContainerGroupPoolName));
    }

    /**
     * List StandbyContainerGroupPoolRuntimeViewResource resources by StandbyContainerGroupPoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyContainerGroupPoolName Name of the standby container group pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyContainerGroupPoolRuntimeViewResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<StandbyContainerGroupPoolRuntimeViewResourceInner> listByStandbyPool(String resourceGroupName,
        String standbyContainerGroupPoolName, Context context) {
        return new PagedIterable<>(listByStandbyPoolAsync(resourceGroupName, standbyContainerGroupPoolName, context));
    }

    /**
     * List StandbyContainerGroupPoolRuntimeViewResource resources by StandbyContainerGroupPoolResource
     * 
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyContainerGroupPoolRuntimeViewResource list operation along with
     * {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StandbyContainerGroupPoolRuntimeViewResourceInner>>
        listByStandbyPoolNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByStandbyPoolNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<StandbyContainerGroupPoolRuntimeViewResourceInner>>map(
                res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                    res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List StandbyContainerGroupPoolRuntimeViewResource resources by StandbyContainerGroupPoolResource
     * 
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyContainerGroupPoolRuntimeViewResource list operation along with
     * {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<StandbyContainerGroupPoolRuntimeViewResourceInner>>
        listByStandbyPoolNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByStandbyPoolNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
