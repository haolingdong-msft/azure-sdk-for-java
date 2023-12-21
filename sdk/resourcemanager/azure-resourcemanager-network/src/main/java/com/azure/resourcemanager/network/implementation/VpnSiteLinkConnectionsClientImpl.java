// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

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
import com.azure.resourcemanager.network.fluent.VpnSiteLinkConnectionsClient;
import com.azure.resourcemanager.network.fluent.models.VpnSiteLinkConnectionInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in VpnSiteLinkConnectionsClient.
 */
public final class VpnSiteLinkConnectionsClientImpl implements VpnSiteLinkConnectionsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final VpnSiteLinkConnectionsService service;

    /**
     * The service client containing this operation class.
     */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnSiteLinkConnectionsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    VpnSiteLinkConnectionsClientImpl(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(VpnSiteLinkConnectionsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientVpnSiteLinkConnections to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    public interface VpnSiteLinkConnectionsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnGateways/{gatewayName}/vpnConnections/{connectionName}/vpnLinkConnections/{linkConnectionName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<VpnSiteLinkConnectionInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("gatewayName") String gatewayName,
            @PathParam("connectionName") String connectionName,
            @PathParam("linkConnectionName") String linkConnectionName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Retrieves the details of a vpn site link connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSiteLinkConnection Resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<VpnSiteLinkConnectionInner>> getWithResponseAsync(String resourceGroupName, String gatewayName,
        String connectionName, String linkConnectionName) {
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
        if (gatewayName == null) {
            return Mono.error(new IllegalArgumentException("Parameter gatewayName is required and cannot be null."));
        }
        if (connectionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter connectionName is required and cannot be null."));
        }
        if (linkConnectionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter linkConnectionName is required and cannot be null."));
        }
        final String apiVersion = "2023-06-01";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, gatewayName, connectionName, linkConnectionName, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieves the details of a vpn site link connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSiteLinkConnection Resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<VpnSiteLinkConnectionInner>> getWithResponseAsync(String resourceGroupName,
        String gatewayName, String connectionName, String linkConnectionName, Context context) {
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
        if (gatewayName == null) {
            return Mono.error(new IllegalArgumentException("Parameter gatewayName is required and cannot be null."));
        }
        if (connectionName == null) {
            return Mono.error(new IllegalArgumentException("Parameter connectionName is required and cannot be null."));
        }
        if (linkConnectionName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter linkConnectionName is required and cannot be null."));
        }
        final String apiVersion = "2023-06-01";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, gatewayName,
            connectionName, linkConnectionName, apiVersion, accept, context);
    }

    /**
     * Retrieves the details of a vpn site link connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSiteLinkConnection Resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnSiteLinkConnectionInner> getAsync(String resourceGroupName, String gatewayName,
        String connectionName, String linkConnectionName) {
        return getWithResponseAsync(resourceGroupName, gatewayName, connectionName, linkConnectionName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Retrieves the details of a vpn site link connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSiteLinkConnection Resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<VpnSiteLinkConnectionInner> getWithResponse(String resourceGroupName, String gatewayName,
        String connectionName, String linkConnectionName, Context context) {
        return getWithResponseAsync(resourceGroupName, gatewayName, connectionName, linkConnectionName, context)
            .block();
    }

    /**
     * Retrieves the details of a vpn site link connection.
     * 
     * @param resourceGroupName The resource group name of the VpnGateway.
     * @param gatewayName The name of the gateway.
     * @param connectionName The name of the vpn connection.
     * @param linkConnectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSiteLinkConnection Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnSiteLinkConnectionInner get(String resourceGroupName, String gatewayName, String connectionName,
        String linkConnectionName) {
        return getWithResponse(resourceGroupName, gatewayName, connectionName, linkConnectionName, Context.NONE)
            .getValue();
    }
}
