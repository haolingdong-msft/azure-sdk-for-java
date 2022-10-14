// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.GetOutboundRoutesParameters;

/** Samples for VirtualHubs GetOutboundRoutes. */
public final class VirtualHubsGetOutboundRoutesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/GetOutboundRoutes.json
     */
    /**
     * Sample code: Outbound Routes for the Virtual Hub on a Particular Connection.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void outboundRoutesForTheVirtualHubOnAParticularConnection(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualHubs()
            .getOutboundRoutes(
                "rg1",
                "virtualHub1",
                new GetOutboundRoutesParameters()
                    .withResourceUri(
                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/expressRouteGateways/exrGw1/expressRouteConnections/exrConn1")
                    .withConnectionType("ExpressRouteConnection"),
                Context.NONE);
    }
}
