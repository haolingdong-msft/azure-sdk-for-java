// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

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
import com.azure.resourcemanager.synapse.fluent.LibrariesClient;
import com.azure.resourcemanager.synapse.fluent.models.LibraryResourceInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in LibrariesClient. */
public final class LibrariesClientImpl implements LibrariesClient {
    /** The proxy service used to perform REST calls. */
    private final LibrariesService service;

    /** The service client containing this operation class. */
    private final SynapseManagementClientImpl client;

    /**
     * Initializes an instance of LibrariesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    LibrariesClientImpl(SynapseManagementClientImpl client) {
        this.service =
            RestProxy.create(LibrariesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SynapseManagementClientLibraries to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SynapseManagementCli")
    public interface LibrariesService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Synapse/workspaces"
                + "/{workspaceName}/libraries/{libraryName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LibraryResourceInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("libraryName") String libraryName,
            @PathParam("workspaceName") String workspaceName,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get library by name.
     *
     * <p>Get library by name in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param libraryName Library name.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return library by name in a workspace along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LibraryResourceInner>> getWithResponseAsync(
        String resourceGroupName, String libraryName, String workspaceName) {
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
        if (libraryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter libraryName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01-preview";
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
                            libraryName,
                            workspaceName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get library by name.
     *
     * <p>Get library by name in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param libraryName Library name.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return library by name in a workspace along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<LibraryResourceInner>> getWithResponseAsync(
        String resourceGroupName, String libraryName, String workspaceName, Context context) {
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
        if (libraryName == null) {
            return Mono.error(new IllegalArgumentException("Parameter libraryName is required and cannot be null."));
        }
        if (workspaceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter workspaceName is required and cannot be null."));
        }
        final String apiVersion = "2021-06-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                libraryName,
                workspaceName,
                accept,
                context);
    }

    /**
     * Get library by name.
     *
     * <p>Get library by name in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param libraryName Library name.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return library by name in a workspace on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<LibraryResourceInner> getAsync(String resourceGroupName, String libraryName, String workspaceName) {
        return getWithResponseAsync(resourceGroupName, libraryName, workspaceName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get library by name.
     *
     * <p>Get library by name in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param libraryName Library name.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return library by name in a workspace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LibraryResourceInner> getWithResponse(
        String resourceGroupName, String libraryName, String workspaceName, Context context) {
        return getWithResponseAsync(resourceGroupName, libraryName, workspaceName, context).block();
    }

    /**
     * Get library by name.
     *
     * <p>Get library by name in a workspace.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param libraryName Library name.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return library by name in a workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public LibraryResourceInner get(String resourceGroupName, String libraryName, String workspaceName) {
        return getWithResponse(resourceGroupName, libraryName, workspaceName, Context.NONE).getValue();
    }
}
