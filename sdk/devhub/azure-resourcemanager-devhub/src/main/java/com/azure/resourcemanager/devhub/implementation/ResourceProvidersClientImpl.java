// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.devhub.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.devhub.fluent.models.GitHubOAuthInfoResponseInner;
import com.azure.resourcemanager.devhub.fluent.models.GitHubOAuthListResponseInner;
import com.azure.resourcemanager.devhub.fluent.models.GitHubOAuthResponseInner;
import com.azure.resourcemanager.devhub.models.GitHubOAuthCallRequest;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public final class ResourceProvidersClientImpl implements ResourceProvidersClient {
    /** The proxy service used to perform REST calls. */
    private final ResourceProvidersService service;

    /** The service client containing this operation class. */
    private final DeveloperHubServiceClientImpl client;

    /**
     * Initializes an instance of ResourceProvidersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ResourceProvidersClientImpl(DeveloperHubServiceClientImpl client) {
        this.service =
            RestProxy.create(ResourceProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for DeveloperHubServiceClientResourceProviders to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "DeveloperHubServiceC")
    private interface ResourceProvidersService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/providers/Microsoft.DevHub/locations/{location}/githuboauth/default"
                + "/getGitHubOAuthInfo")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<GitHubOAuthInfoResponseInner>> gitHubOAuth(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @BodyParam("application/json") GitHubOAuthCallRequest parameters,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.DevHub/locations/{location}/githuboauth/default")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<GitHubOAuthResponseInner>> gitHubOAuthCallback(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @QueryParam("code") String code,
            @QueryParam("state") String state,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.DevHub/locations/{location}/githuboauth")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<GitHubOAuthListResponseInner>> listGitHubOAuth(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("location") String location,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets GitHubOAuth info used to authenticate users with the Developer Hub GitHub App.
     *
     * @param location The name of Azure region.
     * @param parameters GitHubOAuth request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHubOAuth info used to authenticate users with the Developer Hub GitHub App along with {@link Response}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GitHubOAuthInfoResponseInner>> gitHubOAuthWithResponseAsync(
        String location, GitHubOAuthCallRequest parameters) {
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
        if (parameters != null) {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .gitHubOAuth(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            location,
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets GitHubOAuth info used to authenticate users with the Developer Hub GitHub App.
     *
     * @param location The name of Azure region.
     * @param parameters GitHubOAuth request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHubOAuth info used to authenticate users with the Developer Hub GitHub App along with {@link Response}
     *     on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GitHubOAuthInfoResponseInner>> gitHubOAuthWithResponseAsync(
        String location, GitHubOAuthCallRequest parameters, Context context) {
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
        if (parameters != null) {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .gitHubOAuth(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                location,
                parameters,
                accept,
                context);
    }

    /**
     * Gets GitHubOAuth info used to authenticate users with the Developer Hub GitHub App.
     *
     * @param location The name of Azure region.
     * @param parameters GitHubOAuth request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHubOAuth info used to authenticate users with the Developer Hub GitHub App on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<GitHubOAuthInfoResponseInner> gitHubOAuthAsync(String location, GitHubOAuthCallRequest parameters) {
        return gitHubOAuthWithResponseAsync(location, parameters).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets GitHubOAuth info used to authenticate users with the Developer Hub GitHub App.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHubOAuth info used to authenticate users with the Developer Hub GitHub App on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<GitHubOAuthInfoResponseInner> gitHubOAuthAsync(String location) {
        final GitHubOAuthCallRequest parameters = null;
        return gitHubOAuthWithResponseAsync(location, parameters).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets GitHubOAuth info used to authenticate users with the Developer Hub GitHub App.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHubOAuth info used to authenticate users with the Developer Hub GitHub App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GitHubOAuthInfoResponseInner gitHubOAuth(String location) {
        final GitHubOAuthCallRequest parameters = null;
        return gitHubOAuthAsync(location, parameters).block();
    }

    /**
     * Gets GitHubOAuth info used to authenticate users with the Developer Hub GitHub App.
     *
     * @param location The name of Azure region.
     * @param parameters GitHubOAuth request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHubOAuth info used to authenticate users with the Developer Hub GitHub App along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<GitHubOAuthInfoResponseInner> gitHubOAuthWithResponse(
        String location, GitHubOAuthCallRequest parameters, Context context) {
        return gitHubOAuthWithResponseAsync(location, parameters, context).block();
    }

    /**
     * Callback URL to hit once authenticated with GitHub App to have the service store the OAuth token.
     *
     * @param location The name of Azure region.
     * @param code The code response from authenticating the GitHub App.
     * @param state The state response from authenticating the GitHub App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return singleton response of GitHubOAuth containing along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GitHubOAuthResponseInner>> gitHubOAuthCallbackWithResponseAsync(
        String location, String code, String state) {
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
        if (code == null) {
            return Mono.error(new IllegalArgumentException("Parameter code is required and cannot be null."));
        }
        if (state == null) {
            return Mono.error(new IllegalArgumentException("Parameter state is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .gitHubOAuthCallback(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            location,
                            code,
                            state,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Callback URL to hit once authenticated with GitHub App to have the service store the OAuth token.
     *
     * @param location The name of Azure region.
     * @param code The code response from authenticating the GitHub App.
     * @param state The state response from authenticating the GitHub App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return singleton response of GitHubOAuth containing along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GitHubOAuthResponseInner>> gitHubOAuthCallbackWithResponseAsync(
        String location, String code, String state, Context context) {
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
        if (code == null) {
            return Mono.error(new IllegalArgumentException("Parameter code is required and cannot be null."));
        }
        if (state == null) {
            return Mono.error(new IllegalArgumentException("Parameter state is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .gitHubOAuthCallback(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                location,
                code,
                state,
                accept,
                context);
    }

    /**
     * Callback URL to hit once authenticated with GitHub App to have the service store the OAuth token.
     *
     * @param location The name of Azure region.
     * @param code The code response from authenticating the GitHub App.
     * @param state The state response from authenticating the GitHub App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return singleton response of GitHubOAuth containing on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<GitHubOAuthResponseInner> gitHubOAuthCallbackAsync(String location, String code, String state) {
        return gitHubOAuthCallbackWithResponseAsync(location, code, state)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Callback URL to hit once authenticated with GitHub App to have the service store the OAuth token.
     *
     * @param location The name of Azure region.
     * @param code The code response from authenticating the GitHub App.
     * @param state The state response from authenticating the GitHub App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return singleton response of GitHubOAuth containing.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GitHubOAuthResponseInner gitHubOAuthCallback(String location, String code, String state) {
        return gitHubOAuthCallbackAsync(location, code, state).block();
    }

    /**
     * Callback URL to hit once authenticated with GitHub App to have the service store the OAuth token.
     *
     * @param location The name of Azure region.
     * @param code The code response from authenticating the GitHub App.
     * @param state The state response from authenticating the GitHub App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return singleton response of GitHubOAuth containing along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<GitHubOAuthResponseInner> gitHubOAuthCallbackWithResponse(
        String location, String code, String state, Context context) {
        return gitHubOAuthCallbackWithResponseAsync(location, code, state, context).block();
    }

    /**
     * Callback URL to hit once authenticated with GitHub App to have the service store the OAuth token.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from List GitHubOAuth operation along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GitHubOAuthListResponseInner>> listGitHubOAuthWithResponseAsync(String location) {
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
                        .listGitHubOAuth(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            location,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Callback URL to hit once authenticated with GitHub App to have the service store the OAuth token.
     *
     * @param location The name of Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from List GitHubOAuth operation along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GitHubOAuthListResponseInner>> listGitHubOAuthWithResponseAsync(
        String location, Context context) {
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
            .listGitHubOAuth(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                location,
                accept,
                context);
    }

    /**
     * Callback URL to hit once authenticated with GitHub App to have the service store the OAuth token.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from List GitHubOAuth operation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<GitHubOAuthListResponseInner> listGitHubOAuthAsync(String location) {
        return listGitHubOAuthWithResponseAsync(location).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Callback URL to hit once authenticated with GitHub App to have the service store the OAuth token.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from List GitHubOAuth operation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GitHubOAuthListResponseInner listGitHubOAuth(String location) {
        return listGitHubOAuthAsync(location).block();
    }

    /**
     * Callback URL to hit once authenticated with GitHub App to have the service store the OAuth token.
     *
     * @param location The name of Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response from List GitHubOAuth operation along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<GitHubOAuthListResponseInner> listGitHubOAuthWithResponse(String location, Context context) {
        return listGitHubOAuthWithResponseAsync(location, context).block();
    }
}
