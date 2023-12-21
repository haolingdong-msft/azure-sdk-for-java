// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ApplicationGatewayPrivateEndpointConnections List.
 */
public final class ApplicationGatewayPrivateEndpointConnectionsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * ApplicationGatewayPrivateEndpointConnectionList.json
     */
    /**
     * Sample code: Lists all private endpoint connections on application gateway.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        listsAllPrivateEndpointConnectionsOnApplicationGateway(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getApplicationGatewayPrivateEndpointConnections().list("rg1",
            "appgw", com.azure.core.util.Context.NONE);
    }
}
