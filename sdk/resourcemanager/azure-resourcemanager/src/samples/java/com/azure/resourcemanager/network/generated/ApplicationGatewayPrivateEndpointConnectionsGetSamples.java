// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ApplicationGatewayPrivateEndpointConnections Get. */
public final class ApplicationGatewayPrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/ApplicationGatewayPrivateEndpointConnectionGet.json
     */
    /**
     * Sample code: Get Application Gateway Private Endpoint Connection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getApplicationGatewayPrivateEndpointConnection(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getApplicationGatewayPrivateEndpointConnections()
            .getWithResponse("rg1", "appgw", "connection1", Context.NONE);
    }
}
