// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.implementation;

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
import com.azure.resourcemanager.cosmos.fluent.RestorableGremlinDatabasesClient;
import com.azure.resourcemanager.cosmos.fluent.models.RestorableGremlinDatabaseGetResultInner;
import com.azure.resourcemanager.cosmos.models.RestorableGremlinDatabasesListResult;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RestorableGremlinDatabasesClient. */
public final class RestorableGremlinDatabasesClientImpl implements RestorableGremlinDatabasesClient {
    /** The proxy service used to perform REST calls. */
    private final RestorableGremlinDatabasesService service;

    /** The service client containing this operation class. */
    private final CosmosDBManagementClientImpl client;

    /**
     * Initializes an instance of RestorableGremlinDatabasesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RestorableGremlinDatabasesClientImpl(CosmosDBManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    RestorableGremlinDatabasesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CosmosDBManagementClientRestorableGremlinDatabases to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CosmosDBManagementCl")
    public interface RestorableGremlinDatabasesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}/restorableDatabaseAccounts/{instanceId}/restorableGremlinDatabases")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RestorableGremlinDatabasesListResult>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @PathParam("instanceId") String instanceId,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB Gremlin databases under the restorable
     * account. This helps in scenario where database was accidentally deleted to get the deletion time. This API
     * requires 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin database events and their properties along with
     *     {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RestorableGremlinDatabaseGetResultInner>> listSinglePageAsync(
        String location, String instanceId) {
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
        if (instanceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            location,
                            instanceId,
                            accept,
                            context))
            .<PagedResponse<RestorableGremlinDatabaseGetResultInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB Gremlin databases under the restorable
     * account. This helps in scenario where database was accidentally deleted to get the deletion time. This API
     * requires 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin database events and their properties along with
     *     {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RestorableGremlinDatabaseGetResultInner>> listSinglePageAsync(
        String location, String instanceId, Context context) {
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
        if (instanceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter instanceId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                location,
                instanceId,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB Gremlin databases under the restorable
     * account. This helps in scenario where database was accidentally deleted to get the deletion time. This API
     * requires 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin database events and their properties as paginated
     *     response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RestorableGremlinDatabaseGetResultInner> listAsync(String location, String instanceId) {
        return new PagedFlux<>(() -> listSinglePageAsync(location, instanceId));
    }

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB Gremlin databases under the restorable
     * account. This helps in scenario where database was accidentally deleted to get the deletion time. This API
     * requires 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin database events and their properties as paginated
     *     response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RestorableGremlinDatabaseGetResultInner> listAsync(
        String location, String instanceId, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(location, instanceId, context));
    }

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB Gremlin databases under the restorable
     * account. This helps in scenario where database was accidentally deleted to get the deletion time. This API
     * requires 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin database events and their properties as paginated
     *     response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RestorableGremlinDatabaseGetResultInner> list(String location, String instanceId) {
        return new PagedIterable<>(listAsync(location, instanceId));
    }

    /**
     * Show the event feed of all mutations done on all the Azure Cosmos DB Gremlin databases under the restorable
     * account. This helps in scenario where database was accidentally deleted to get the deletion time. This API
     * requires 'Microsoft.DocumentDB/locations/restorableDatabaseAccounts/.../read' permission.
     *
     * @param location Cosmos DB region, with spaces between words and each word capitalized.
     * @param instanceId The instanceId GUID of a restorable database account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List operation response, that contains the Gremlin database events and their properties as paginated
     *     response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RestorableGremlinDatabaseGetResultInner> list(
        String location, String instanceId, Context context) {
        return new PagedIterable<>(listAsync(location, instanceId, context));
    }
}
