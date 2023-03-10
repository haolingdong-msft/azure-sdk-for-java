// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for VirtualApplianceSites List. */
public final class VirtualApplianceSitesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/NetworkVirtualApplianceSiteList.json
     */
    /**
     * Sample code: List all Network Virtual Appliance sites for a given Network Virtual Appliance.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAllNetworkVirtualApplianceSitesForAGivenNetworkVirtualAppliance(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualApplianceSites()
            .list("rg1", "nva", com.azure.core.util.Context.NONE);
    }
}
