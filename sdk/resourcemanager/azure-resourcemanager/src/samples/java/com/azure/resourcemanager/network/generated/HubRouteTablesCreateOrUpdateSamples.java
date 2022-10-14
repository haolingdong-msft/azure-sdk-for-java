// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.HubRouteTableInner;
import com.azure.resourcemanager.network.models.HubRoute;
import java.util.Arrays;

/** Samples for HubRouteTables CreateOrUpdate. */
public final class HubRouteTablesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/HubRouteTablePut.json
     */
    /**
     * Sample code: RouteTablePut.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void routeTablePut(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getHubRouteTables()
            .createOrUpdate(
                "rg1",
                "virtualHub1",
                "hubRouteTable1",
                new HubRouteTableInner()
                    .withRoutes(
                        Arrays
                            .asList(
                                new HubRoute()
                                    .withName("route1")
                                    .withDestinationType("CIDR")
                                    .withDestinations(Arrays.asList("10.0.0.0/8", "20.0.0.0/8", "30.0.0.0/8"))
                                    .withNextHopType("ResourceId")
                                    .withNextHop(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/azureFirewalls/azureFirewall1")))
                    .withLabels(Arrays.asList("label1", "label2")),
                Context.NONE);
    }
}
