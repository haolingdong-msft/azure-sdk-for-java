// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.webpubsub;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.FluxUtil;
import com.azure.messaging.webpubsub.implementation.WebPubSubUtil;
import com.azure.messaging.webpubsub.implementation.WebPubSubsImpl;
import com.azure.messaging.webpubsub.models.GetClientAccessTokenOptions;
import com.azure.messaging.webpubsub.models.WebPubSubClientAccessToken;
import com.azure.messaging.webpubsub.models.WebPubSubContentType;
import com.azure.messaging.webpubsub.models.WebPubSubPermission;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

/** Initializes a new instance of the asynchronous AzureWebPubSubServiceRestAPI type. */
@ServiceClient(builder = WebPubSubServiceClientBuilder.class, isAsync = true)
public final class WebPubSubServiceAsyncClient {
    private final WebPubSubsImpl serviceClient;
    private final String hub;
    private final String endpoint;
    private final AzureKeyCredential keyCredential;
    private final WebPubSubServiceVersion version;

    /**
     * Initializes an instance of WebPubSubs client.
     * @param serviceClient the service client implementation.
     */
    WebPubSubServiceAsyncClient(WebPubSubsImpl serviceClient, String hub,
                                final String endpoint,
                                final AzureKeyCredential keyCredential,
                                final WebPubSubServiceVersion version) {
        this.serviceClient = serviceClient;
        this.hub = hub;
        this.endpoint = endpoint;
        this.keyCredential = keyCredential;
        this.version = version;
    }

    /**
     * Creates a client access token.
     *
     * @param options Options to apply when creating the client access token.
     * @return A new client access token instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<WebPubSubClientAccessToken> getClientAccessToken(GetClientAccessTokenOptions options) {
        if (this.keyCredential == null) {
            RequestOptions requestOptions = new RequestOptions();
            if (options.getUserId() != null) {
                requestOptions.addQueryParam("userId", options.getUserId());
            }
            if (options.getExpiresAfter() != null) {
                requestOptions.addQueryParam("minutesToExpire", String.valueOf(options.getExpiresAfter().toMinutes()));
            }
            if (CoreUtils.isNullOrEmpty(options.getRoles())) {
                options.getRoles().stream().forEach(roleName -> requestOptions.addQueryParam("role", roleName));
            }
            if (CoreUtils.isNullOrEmpty(options.getGroups())) {
                options.getGroups().stream().forEach(groupName -> requestOptions.addQueryParam("group", groupName));
            }
            requestOptions.addQueryParam("api-version", version.getVersion());
            return this.serviceClient.generateClientTokenWithResponseAsync(hub, requestOptions)
                    .map(Response::getValue)
                    .map(binaryData -> {
                        String token = WebPubSubUtil.getToken(binaryData);
                        return WebPubSubUtil.createToken(token, endpoint, hub);
                    });
        }
        return Mono.defer(() -> {
            final String audience = endpoint + (endpoint.endsWith("/") ? "" : "/") + "client/hubs/" + hub;
            final String token = WebPubSubAuthenticationPolicy.getAuthenticationToken(
                    audience, options, keyCredential);
            return Mono.just(WebPubSubUtil.createToken(token, endpoint, hub));
        });

    }

    /**
     * Generate token for the client to connect Azure Web PubSub service.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>userId</td><td>String</td><td>No</td><td>User Id.</td></tr>
     *     <tr><td>role</td><td>String</td><td>No</td><td>Roles that the connection with the generated token will have.</td></tr>
     *     <tr><td>minutesToExpire</td><td>String</td><td>No</td><td>The expire time of the generated token.</td></tr>
     *     <tr><td>group</td><td>Iterable&lt;String&gt;</td><td>No</td><td>Groups that the connection will join when it connects. Call {@link RequestOptions#addQueryParam} to add string to array.</td></tr>
     * </table>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     token: String
     * }
     * }</pre>
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the response.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     * false.
     */
    Mono<Response<BinaryData>> generateClientTokenWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.generateClientTokenWithResponseAsync(hub, requestOptions);
    }


    /**
     * Broadcast content inside request body to all the connected client connections.
     * @param message The payload body.
     * @param contentType Upload file type.
     * @param contentLength The contentLength parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToAllWithResponse(
            BinaryData message, WebPubSubContentType contentType, long contentLength, RequestOptions requestOptions) {
        if (requestOptions == null) {
            requestOptions = new RequestOptions();
        }
        requestOptions.setHeader("Content-Type", contentType.toString());
        requestOptions.setHeader("Content-Length", String.valueOf(contentLength));
        return this.serviceClient.sendToAllWithResponseAsync(hub, "", message, requestOptions);
    }

    /**
     * Broadcast content inside request body to all the connected client connections.
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToAllWithResponse(BinaryData message, RequestOptions requestOptions) {
        return this.serviceClient.sendToAllWithResponseAsync(hub, "", message, requestOptions);
    }

    /**
     * Broadcast content inside request body to all the connected client connections.
     * @param message The payload body.
     * @param contentType Upload file type.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> sendToAll(String message, WebPubSubContentType contentType) {
        return sendToAllWithResponse(BinaryData.fromString(message),
                new RequestOptions().setHeader("Content-Type", contentType.toString()))
            .flatMap(FluxUtil::toMono);
    }

    /**
     * Check if the connection with the given connectionId exists.
     * @param connectionId The connection Id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return whether resource exists.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Boolean>> connectionExistsWithResponse(
            String connectionId, RequestOptions requestOptions) {
        return this.serviceClient.connectionExistsWithResponseAsync(hub, connectionId, requestOptions);
    }

    /**
     * Close the client connection.
     * @param connectionId Target connection Id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> closeConnectionWithResponse(
            String connectionId, RequestOptions requestOptions) {
        return this.serviceClient.closeConnectionWithResponseAsync(hub, connectionId, requestOptions);
    }

    /**
     * Send content inside request body to the specific connection.
     * @param connectionId The connection Id.
     * @param message The payload body.
     * @param contentType Upload file type.
     * @param contentLength The contentLength parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToConnectionWithResponse(
            String connectionId,
            BinaryData message,
            WebPubSubContentType contentType,
            long contentLength,
            RequestOptions requestOptions) {
        if (requestOptions == null) {
            requestOptions = new RequestOptions();
        }
        requestOptions.setHeader("Content-Type", contentType.toString());
        requestOptions.setHeader("Content-Length", String.valueOf(contentLength));
        return this.serviceClient.sendToConnectionWithResponseAsync(
                hub, connectionId, "", message, requestOptions);
    }

    /**
     * Send content inside request body to the specific connection.
     * @param connectionId The connection Id.
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToConnectionWithResponse(
            String connectionId, BinaryData message, RequestOptions requestOptions) {
        return this.serviceClient.sendToConnectionWithResponseAsync(hub, connectionId, "", message, requestOptions);
    }

    /**
     * Send content inside request body to the specific connection.
     * @param connectionId The connection Id.
     * @param message The payload body.
     * @param contentType Upload file type.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> sendToConnection(
            String connectionId, String message, WebPubSubContentType contentType) {
        return this.sendToConnectionWithResponse(connectionId, BinaryData.fromString(message),
                new RequestOptions().setHeader("Content-Type", contentType.toString())).flatMap(FluxUtil::toMono);
    }

    /**
     * Check if there are any client connections inside the given group.
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return whether resource exists.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Boolean>> groupExistsWithResponse(String group, RequestOptions requestOptions) {
        return this.serviceClient.groupExistsWithResponseAsync(hub, group, requestOptions);
    }

    /**
     * Send content inside request body to a group of connections.
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param message The payload body.
     * @param contentType Upload file type.
     * @param contentLength The contentLength parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToGroupWithResponse(
            String group,
            BinaryData message,
            WebPubSubContentType contentType,
            long contentLength,
            RequestOptions requestOptions) {
        if (requestOptions == null) {
            requestOptions = new RequestOptions();
        }
        requestOptions.setHeader("Content-Type", contentType.toString());
        requestOptions.setHeader("Content-Length", String.valueOf(contentLength));
        return this.serviceClient.sendToGroupWithResponseAsync(
                hub, group, "", message, requestOptions);
    }

    /**
     * Send content inside request body to a group of connections.
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToGroupWithResponse(
            String group, BinaryData message, RequestOptions requestOptions) {
        return this.serviceClient.sendToGroupWithResponseAsync(hub, group, "", message, requestOptions);
    }

    /**
     * Send content inside request body to a group of connections.
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param message The payload body.
     * @param contentType Upload file type.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> sendToGroup(String group, String message, WebPubSubContentType contentType) {
        return sendToGroupWithResponse(group, BinaryData.fromString(message), new RequestOptions()
                .setHeader("Content-Type", contentType.toString()))
                .flatMap(FluxUtil::toMono);
    }

    /**
     * Add a connection to the target group.
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param connectionId Target connection Id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> addConnectionToGroupWithResponse(
            String group, String connectionId, RequestOptions requestOptions) {
        return this.serviceClient.addConnectionToGroupWithResponseAsync(hub, group, connectionId, requestOptions);
    }

    /**
     * Remove a connection from the target group.
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param connectionId Target connection Id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> removeConnectionFromGroupWithResponse(
            String group, String connectionId, RequestOptions requestOptions) {
        return this.serviceClient.removeConnectionFromGroupWithResponseAsync(hub, group, connectionId, requestOptions);
    }

    /**
     * Remove a connection from all groups.
     *
     * @param connectionId Target connection Id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> removeConnectionFromAllGroupsWithResponse(
        String connectionId, RequestOptions requestOptions) {
        return this.serviceClient.removeConnectionFromAllGroupsWithResponseAsync(hub, connectionId, requestOptions);
    }

    /**
     * Check if there are any client connections connected for the given user.
     * @param userId Target user Id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return whether resource exists.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Boolean>> userExistsWithResponse(String userId, RequestOptions requestOptions) {
        return this.serviceClient.userExistsWithResponseAsync(hub, userId, requestOptions);
    }

    /**
     * Send content inside request body to the specific user.
     * @param userId The user Id.
     * @param message The payload body.
     * @param contentType Upload file type.
     * @param contentLength The contentLength parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToUserWithResponse(
            String userId,
            BinaryData message,
            WebPubSubContentType contentType,
            long contentLength,
            RequestOptions requestOptions) {
        if (requestOptions == null) {
            requestOptions = new RequestOptions();
        }
        requestOptions.setHeader("Content-Type", contentType.toString());
        requestOptions.setHeader("Content-Length", String.valueOf(contentLength));
        return this.serviceClient.sendToUserWithResponseAsync(
                hub, userId, "", message, requestOptions);
    }

    /**
     * Send content inside request body to the specific user.
     * @param userId The user Id.
     * @param message The payload body.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> sendToUserWithResponse(
            String userId, BinaryData message, RequestOptions requestOptions) {
        return this.serviceClient.sendToUserWithResponseAsync(hub, userId, "", message, requestOptions);
    }

    /**
     * Send content inside request body to the specific user.
     * @param userId The user Id.
     * @param message The payload body.
     * @param contentType Upload file type.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> sendToUser(String userId, String message, WebPubSubContentType contentType) {
        return sendToUserWithResponse(userId, BinaryData.fromString(message), new RequestOptions()
                .setHeader("Content-Type", contentType.toString()))
                .flatMap(FluxUtil::toMono);
    }

    /**
     * Add a user to the target group.
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param userId Target user Id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> addUserToGroupWithResponse(
            String group, String userId, RequestOptions requestOptions) {
        return this.serviceClient.addUserToGroupWithResponseAsync(hub, group, userId, requestOptions);
    }

    /**
     * Remove a user from the target group.
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param userId Target user Id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> removeUserFromGroupWithResponse(
            String group, String userId, RequestOptions requestOptions) {
        return this.serviceClient.removeUserFromGroupWithResponseAsync(hub, group, userId, requestOptions);
    }

    /**
     * Remove a user from all groups.
     * @param userId Target user Id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> removeUserFromAllGroupsWithResponse(
            String userId, RequestOptions requestOptions) {
        return this.serviceClient.removeUserFromAllGroupsWithResponseAsync(hub, userId, requestOptions);
    }

    /**
     * Grant permission to the connection.
     * @param permission The permission: current supported actions are joinLeaveGroup and sendToGroup.
     * @param connectionId Target connection Id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> grantPermissionWithResponse(
            WebPubSubPermission permission, String connectionId, RequestOptions requestOptions) {
        return this.serviceClient.grantPermissionWithResponseAsync(hub, permission.toString(), connectionId,
            requestOptions);
    }

    /**
     * Revoke permission for the connection.
     * @param permission The permission: current supported actions are joinLeaveGroup and sendToGroup.
     * @param connectionId Target connection Id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return the completion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> revokePermissionWithResponse(
            WebPubSubPermission permission, String connectionId, RequestOptions requestOptions) {
        return this.serviceClient.revokePermissionWithResponseAsync(hub, permission.toString(), connectionId,
            requestOptions);
    }

    /**
     * Check if a connection has permission to the specified action.
     * @param permission The permission: current supported actions are joinLeaveGroup and sendToGroup.
     * @param connectionId Target connection Id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @return whether resource exists.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Boolean>> checkPermissionWithResponse(
            WebPubSubPermission permission, String connectionId, RequestOptions requestOptions) {
        return this.serviceClient.checkPermissionWithResponseAsync(hub, permission.toString(), connectionId,
            requestOptions);
    }

    /**
     * Close the connections in the hub.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>excluded</td><td>String</td><td>No</td><td>Exclude these connectionIds when closing the connections in the hub.</td></tr>
     *     <tr><td>reason</td><td>String</td><td>No</td><td>The reason closing the client connection.</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> closeAllConnectionsWithResponse(RequestOptions requestOptions) {
        return this.serviceClient.closeAllConnectionsWithResponseAsync(hub, requestOptions);
    }

    /**
     * Close connections in the specific group.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>excluded</td><td>String</td><td>No</td><td>Exclude these connectionIds when closing the connections in the group.</td></tr>
     *     <tr><td>reason</td><td>String</td><td>No</td><td>The reason closing the client connection.</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param group Target group name, which length should be greater than 0 and less than 1025.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> closeGroupConnectionsWithResponse(
        String group, RequestOptions requestOptions) {
        return this.serviceClient.closeGroupConnectionsWithResponseAsync(hub, group, requestOptions);
    }

    /**
     * Close connections for the specific user.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>excluded</td><td>String</td><td>No</td><td>Exclude these connectionIds when closing the connections for the user.</td></tr>
     *     <tr><td>reason</td><td>String</td><td>No</td><td>The reason closing the client connection.</td></tr>
     *     <tr><td>apiVersion</td><td>String</td><td>Yes</td><td>Api Version</td></tr>
     * </table>
     *
     * @param userId The user Id.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if status code is 400 or above, if throwOnError in requestOptions is not
     *     false.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> closeUserConnectionsWithResponse(
        String userId, RequestOptions requestOptions) {
        return this.serviceClient.closeUserConnectionsWithResponseAsync(hub, userId, requestOptions);
    }
}
