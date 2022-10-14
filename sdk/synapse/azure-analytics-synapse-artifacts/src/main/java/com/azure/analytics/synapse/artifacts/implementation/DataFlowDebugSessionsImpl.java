// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.implementation;

import com.azure.analytics.synapse.artifacts.models.AddDataFlowToDebugSessionResponse;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.CreateDataFlowDebugSessionRequest;
import com.azure.analytics.synapse.artifacts.models.CreateDataFlowDebugSessionResponse;
import com.azure.analytics.synapse.artifacts.models.DataFlowDebugCommandRequest;
import com.azure.analytics.synapse.artifacts.models.DataFlowDebugCommandResponse;
import com.azure.analytics.synapse.artifacts.models.DataFlowDebugPackage;
import com.azure.analytics.synapse.artifacts.models.DataFlowDebugSessionInfo;
import com.azure.analytics.synapse.artifacts.models.DataFlowDebugSessionsCreateDataFlowDebugSessionResponse;
import com.azure.analytics.synapse.artifacts.models.DataFlowDebugSessionsExecuteCommandResponse;
import com.azure.analytics.synapse.artifacts.models.DeleteDataFlowDebugSessionRequest;
import com.azure.analytics.synapse.artifacts.models.QueryDataFlowDebugSessionsResponse;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DataFlowDebugSessions. */
public final class DataFlowDebugSessionsImpl {
    /** The proxy service used to perform REST calls. */
    private final DataFlowDebugSessionsService service;

    /** The service client containing this operation class. */
    private final ArtifactsClientImpl client;

    /**
     * Initializes an instance of DataFlowDebugSessionsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DataFlowDebugSessionsImpl(ArtifactsClientImpl client) {
        this.service =
                RestProxy.create(
                        DataFlowDebugSessionsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ArtifactsClientDataFlowDebugSessions to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ArtifactsClientDataF")
    public interface DataFlowDebugSessionsService {
        @Post("/createDataFlowDebugSession")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<DataFlowDebugSessionsCreateDataFlowDebugSessionResponse> createDataFlowDebugSession(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") CreateDataFlowDebugSessionRequest request,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/queryDataFlowDebugSessions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<QueryDataFlowDebugSessionsResponse>> queryDataFlowDebugSessionsByWorkspace(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/addDataFlowToDebugSession")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<AddDataFlowToDebugSessionResponse>> addDataFlow(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") DataFlowDebugPackage request,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/deleteDataFlowDebugSession")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<Void>> deleteDataFlowDebugSession(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") DeleteDataFlowDebugSessionRequest request,
                @HeaderParam("Accept") String accept,
                Context context);

        @Post("/executeDataFlowDebugCommand")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<DataFlowDebugSessionsExecuteCommandResponse> executeCommand(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") DataFlowDebugCommandRequest request,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudErrorException.class)
        Mono<Response<QueryDataFlowDebugSessionsResponse>> queryDataFlowDebugSessionsByWorkspaceNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Creates a data flow debug session.
     *
     * @param request Data flow debug session definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for creating data flow debug session on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataFlowDebugSessionsCreateDataFlowDebugSessionResponse> createDataFlowDebugSessionWithResponseAsync(
            CreateDataFlowDebugSessionRequest request) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.createDataFlowDebugSession(
                                this.client.getEndpoint(), apiVersion, request, accept, context));
    }

    /**
     * Creates a data flow debug session.
     *
     * @param request Data flow debug session definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for creating data flow debug session on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataFlowDebugSessionsCreateDataFlowDebugSessionResponse> createDataFlowDebugSessionWithResponseAsync(
            CreateDataFlowDebugSessionRequest request, Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.createDataFlowDebugSession(this.client.getEndpoint(), apiVersion, request, accept, context);
    }

    /**
     * Creates a data flow debug session.
     *
     * @param request Data flow debug session definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for creating data flow debug session on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CreateDataFlowDebugSessionResponse> createDataFlowDebugSessionAsync(
            CreateDataFlowDebugSessionRequest request) {
        return createDataFlowDebugSessionWithResponseAsync(request).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Creates a data flow debug session.
     *
     * @param request Data flow debug session definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for creating data flow debug session on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CreateDataFlowDebugSessionResponse> createDataFlowDebugSessionAsync(
            CreateDataFlowDebugSessionRequest request, Context context) {
        return createDataFlowDebugSessionWithResponseAsync(request, context)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Creates a data flow debug session.
     *
     * @param request Data flow debug session definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for creating data flow debug session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CreateDataFlowDebugSessionResponse createDataFlowDebugSession(CreateDataFlowDebugSessionRequest request) {
        return createDataFlowDebugSessionAsync(request).block();
    }

    /**
     * Creates a data flow debug session.
     *
     * @param request Data flow debug session definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for creating data flow debug session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataFlowDebugSessionsCreateDataFlowDebugSessionResponse createDataFlowDebugSessionWithResponse(
            CreateDataFlowDebugSessionRequest request, Context context) {
        return createDataFlowDebugSessionWithResponseAsync(request, context).block();
    }

    /**
     * Query all active data flow debug sessions.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of active debug sessions along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DataFlowDebugSessionInfo>> queryDataFlowDebugSessionsByWorkspaceSinglePageAsync() {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(
                        context ->
                                service.queryDataFlowDebugSessionsByWorkspace(
                                        this.client.getEndpoint(), apiVersion, accept, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Query all active data flow debug sessions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of active debug sessions along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DataFlowDebugSessionInfo>> queryDataFlowDebugSessionsByWorkspaceSinglePageAsync(
            Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.queryDataFlowDebugSessionsByWorkspace(this.client.getEndpoint(), apiVersion, accept, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Query all active data flow debug sessions.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of active debug sessions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DataFlowDebugSessionInfo> queryDataFlowDebugSessionsByWorkspaceAsync() {
        return new PagedFlux<>(
                () -> queryDataFlowDebugSessionsByWorkspaceSinglePageAsync(),
                nextLink -> queryDataFlowDebugSessionsByWorkspaceNextSinglePageAsync(nextLink));
    }

    /**
     * Query all active data flow debug sessions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of active debug sessions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DataFlowDebugSessionInfo> queryDataFlowDebugSessionsByWorkspaceAsync(Context context) {
        return new PagedFlux<>(
                () -> queryDataFlowDebugSessionsByWorkspaceSinglePageAsync(context),
                nextLink -> queryDataFlowDebugSessionsByWorkspaceNextSinglePageAsync(nextLink, context));
    }

    /**
     * Query all active data flow debug sessions.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of active debug sessions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataFlowDebugSessionInfo> queryDataFlowDebugSessionsByWorkspace() {
        return new PagedIterable<>(queryDataFlowDebugSessionsByWorkspaceAsync());
    }

    /**
     * Query all active data flow debug sessions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of active debug sessions as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataFlowDebugSessionInfo> queryDataFlowDebugSessionsByWorkspace(Context context) {
        return new PagedIterable<>(queryDataFlowDebugSessionsByWorkspaceAsync(context));
    }

    /**
     * Add a data flow into debug session.
     *
     * @param request Data flow debug session definition with debug content.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for starting data flow debug session along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AddDataFlowToDebugSessionResponse>> addDataFlowWithResponseAsync(
            DataFlowDebugPackage request) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.addDataFlow(this.client.getEndpoint(), apiVersion, request, accept, context));
    }

    /**
     * Add a data flow into debug session.
     *
     * @param request Data flow debug session definition with debug content.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for starting data flow debug session along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<AddDataFlowToDebugSessionResponse>> addDataFlowWithResponseAsync(
            DataFlowDebugPackage request, Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.addDataFlow(this.client.getEndpoint(), apiVersion, request, accept, context);
    }

    /**
     * Add a data flow into debug session.
     *
     * @param request Data flow debug session definition with debug content.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for starting data flow debug session on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AddDataFlowToDebugSessionResponse> addDataFlowAsync(DataFlowDebugPackage request) {
        return addDataFlowWithResponseAsync(request).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Add a data flow into debug session.
     *
     * @param request Data flow debug session definition with debug content.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for starting data flow debug session on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AddDataFlowToDebugSessionResponse> addDataFlowAsync(DataFlowDebugPackage request, Context context) {
        return addDataFlowWithResponseAsync(request, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Add a data flow into debug session.
     *
     * @param request Data flow debug session definition with debug content.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for starting data flow debug session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AddDataFlowToDebugSessionResponse addDataFlow(DataFlowDebugPackage request) {
        return addDataFlowAsync(request).block();
    }

    /**
     * Add a data flow into debug session.
     *
     * @param request Data flow debug session definition with debug content.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for starting data flow debug session along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AddDataFlowToDebugSessionResponse> addDataFlowWithResponse(
            DataFlowDebugPackage request, Context context) {
        return addDataFlowWithResponseAsync(request, context).block();
    }

    /**
     * Deletes a data flow debug session.
     *
     * @param request Data flow debug session definition for deletion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteDataFlowDebugSessionWithResponseAsync(DeleteDataFlowDebugSessionRequest request) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.deleteDataFlowDebugSession(
                                this.client.getEndpoint(), apiVersion, request, accept, context));
    }

    /**
     * Deletes a data flow debug session.
     *
     * @param request Data flow debug session definition for deletion.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteDataFlowDebugSessionWithResponseAsync(
            DeleteDataFlowDebugSessionRequest request, Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.deleteDataFlowDebugSession(this.client.getEndpoint(), apiVersion, request, accept, context);
    }

    /**
     * Deletes a data flow debug session.
     *
     * @param request Data flow debug session definition for deletion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteDataFlowDebugSessionAsync(DeleteDataFlowDebugSessionRequest request) {
        return deleteDataFlowDebugSessionWithResponseAsync(request).flatMap(ignored -> Mono.empty());
    }

    /**
     * Deletes a data flow debug session.
     *
     * @param request Data flow debug session definition for deletion.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteDataFlowDebugSessionAsync(DeleteDataFlowDebugSessionRequest request, Context context) {
        return deleteDataFlowDebugSessionWithResponseAsync(request, context).flatMap(ignored -> Mono.empty());
    }

    /**
     * Deletes a data flow debug session.
     *
     * @param request Data flow debug session definition for deletion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteDataFlowDebugSession(DeleteDataFlowDebugSessionRequest request) {
        deleteDataFlowDebugSessionAsync(request).block();
    }

    /**
     * Deletes a data flow debug session.
     *
     * @param request Data flow debug session definition for deletion.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteDataFlowDebugSessionWithResponse(
            DeleteDataFlowDebugSessionRequest request, Context context) {
        return deleteDataFlowDebugSessionWithResponseAsync(request, context).block();
    }

    /**
     * Execute a data flow debug command.
     *
     * @param request Data flow debug command definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure of data flow result for data preview, statistics or expression preview on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataFlowDebugSessionsExecuteCommandResponse> executeCommandWithResponseAsync(
            DataFlowDebugCommandRequest request) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.executeCommand(this.client.getEndpoint(), apiVersion, request, accept, context));
    }

    /**
     * Execute a data flow debug command.
     *
     * @param request Data flow debug command definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure of data flow result for data preview, statistics or expression preview on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataFlowDebugSessionsExecuteCommandResponse> executeCommandWithResponseAsync(
            DataFlowDebugCommandRequest request, Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.executeCommand(this.client.getEndpoint(), apiVersion, request, accept, context);
    }

    /**
     * Execute a data flow debug command.
     *
     * @param request Data flow debug command definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure of data flow result for data preview, statistics or expression preview on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataFlowDebugCommandResponse> executeCommandAsync(DataFlowDebugCommandRequest request) {
        return executeCommandWithResponseAsync(request).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Execute a data flow debug command.
     *
     * @param request Data flow debug command definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure of data flow result for data preview, statistics or expression preview on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataFlowDebugCommandResponse> executeCommandAsync(
            DataFlowDebugCommandRequest request, Context context) {
        return executeCommandWithResponseAsync(request, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Execute a data flow debug command.
     *
     * @param request Data flow debug command definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure of data flow result for data preview, statistics or expression preview.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataFlowDebugCommandResponse executeCommand(DataFlowDebugCommandRequest request) {
        return executeCommandAsync(request).block();
    }

    /**
     * Execute a data flow debug command.
     *
     * @param request Data flow debug command definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure of data flow result for data preview, statistics or expression preview.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataFlowDebugSessionsExecuteCommandResponse executeCommandWithResponse(
            DataFlowDebugCommandRequest request, Context context) {
        return executeCommandWithResponseAsync(request, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of active debug sessions along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DataFlowDebugSessionInfo>> queryDataFlowDebugSessionsByWorkspaceNextSinglePageAsync(
            String nextLink) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                        context ->
                                service.queryDataFlowDebugSessionsByWorkspaceNext(
                                        nextLink, this.client.getEndpoint(), accept, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of active debug sessions along with {@link PagedResponse} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<DataFlowDebugSessionInfo>> queryDataFlowDebugSessionsByWorkspaceNextSinglePageAsync(
            String nextLink, Context context) {
        final String accept = "application/json";
        return service.queryDataFlowDebugSessionsByWorkspaceNext(nextLink, this.client.getEndpoint(), accept, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }
}
