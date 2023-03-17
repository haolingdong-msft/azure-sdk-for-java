// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

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
import com.azure.resourcemanager.netapp.fluent.NetAppResourceQuotaLimitsClient;
import com.azure.resourcemanager.netapp.fluent.models.SubscriptionQuotaItemInner;
import com.azure.resourcemanager.netapp.models.SubscriptionQuotaItemList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in NetAppResourceQuotaLimitsClient. */
public final class NetAppResourceQuotaLimitsClientImpl implements NetAppResourceQuotaLimitsClient {
    /** The proxy service used to perform REST calls. */
    private final NetAppResourceQuotaLimitsService service;

    /** The service client containing this operation class. */
    private final NetAppManagementClientImpl client;

    /**
     * Initializes an instance of NetAppResourceQuotaLimitsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    NetAppResourceQuotaLimitsClientImpl(NetAppManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    NetAppResourceQuotaLimitsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetAppManagementClientNetAppResourceQuotaLimits to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetAppManagementClie")
    public interface NetAppResourceQuotaLimitsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.NetApp/locations/{location}/quotaLimits")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SubscriptionQuotaItemList>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.NetApp/locations/{location}/quotaLimits/{quotaLimitName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SubscriptionQuotaItemInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @PathParam("quotaLimitName") String quotaLimitName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get quota limits
     *
     * <p>Get the default and current limits for quotas.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current limits for quotas along with {@link PagedResponse} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SubscriptionQuotaItemInner>> listSinglePageAsync(String location) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .<PagedResponse<SubscriptionQuotaItemInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get quota limits
     *
     * <p>Get the default and current limits for quotas.
     *
     * @param location The name of Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current limits for quotas along with {@link PagedResponse} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<SubscriptionQuotaItemInner>> listSinglePageAsync(String location, Context context) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                this.client.getApiVersion(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Get quota limits
     *
     * <p>Get the default and current limits for quotas.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current limits for quotas as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SubscriptionQuotaItemInner> listAsync(String location) {
        return new PagedFlux<>(() -> listSinglePageAsync(location));
    }

    /**
     * Get quota limits
     *
     * <p>Get the default and current limits for quotas.
     *
     * @param location The name of Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current limits for quotas as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<SubscriptionQuotaItemInner> listAsync(String location, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(location, context));
    }

    /**
     * Get quota limits
     *
     * <p>Get the default and current limits for quotas.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current limits for quotas as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SubscriptionQuotaItemInner> list(String location) {
        return new PagedIterable<>(listAsync(location));
    }

    /**
     * Get quota limits
     *
     * <p>Get the default and current limits for quotas.
     *
     * @param location The name of Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current limits for quotas as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<SubscriptionQuotaItemInner> list(String location, Context context) {
        return new PagedIterable<>(listAsync(location, context));
    }

    /**
     * Get quota limits
     *
     * <p>Get the default and current subscription quota limit.
     *
     * @param location The name of Azure region.
     * @param quotaLimitName The name of the Quota Limit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current subscription quota limit along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SubscriptionQuotaItemInner>> getWithResponseAsync(String location, String quotaLimitName) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (quotaLimitName == null) {
            return Mono.error(new IllegalArgumentException("Parameter quotaLimitName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            location,
                            quotaLimitName,
                            this.client.getApiVersion(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get quota limits
     *
     * <p>Get the default and current subscription quota limit.
     *
     * @param location The name of Azure region.
     * @param quotaLimitName The name of the Quota Limit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current subscription quota limit along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SubscriptionQuotaItemInner>> getWithResponseAsync(
        String location, String quotaLimitName, Context context) {
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
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (quotaLimitName == null) {
            return Mono.error(new IllegalArgumentException("Parameter quotaLimitName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                location,
                quotaLimitName,
                this.client.getApiVersion(),
                accept,
                context);
    }

    /**
     * Get quota limits
     *
     * <p>Get the default and current subscription quota limit.
     *
     * @param location The name of Azure region.
     * @param quotaLimitName The name of the Quota Limit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current subscription quota limit on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<SubscriptionQuotaItemInner> getAsync(String location, String quotaLimitName) {
        return getWithResponseAsync(location, quotaLimitName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get quota limits
     *
     * <p>Get the default and current subscription quota limit.
     *
     * @param location The name of Azure region.
     * @param quotaLimitName The name of the Quota Limit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current subscription quota limit along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SubscriptionQuotaItemInner> getWithResponse(
        String location, String quotaLimitName, Context context) {
        return getWithResponseAsync(location, quotaLimitName, context).block();
    }

    /**
     * Get quota limits
     *
     * <p>Get the default and current subscription quota limit.
     *
     * @param location The name of Azure region.
     * @param quotaLimitName The name of the Quota Limit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default and current subscription quota limit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SubscriptionQuotaItemInner get(String location, String quotaLimitName) {
        return getWithResponse(location, quotaLimitName, Context.NONE).getValue();
    }
}
