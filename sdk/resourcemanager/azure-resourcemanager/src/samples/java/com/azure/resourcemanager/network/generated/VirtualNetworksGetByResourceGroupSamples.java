// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VirtualNetworks GetByResourceGroup.
 */
public final class VirtualNetworksGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * VirtualNetworkGetWithSubnetDelegation.json
     */
    /**
     * Sample code: Get virtual network with a delegated subnet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVirtualNetworkWithADelegatedSubnet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getVirtualNetworks().getByResourceGroupWithResponse("rg1",
            "test-vnet", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * VirtualNetworkGetWithServiceAssociationLink.json
     */
    /**
     * Sample code: Get virtual network with service association links.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getVirtualNetworkWithServiceAssociationLinks(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getVirtualNetworks().getByResourceGroupWithResponse("rg1",
            "test-vnet", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/VirtualNetworkGet.json
     */
    /**
     * Sample code: Get virtual network.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getVirtualNetwork(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getVirtualNetworks().getByResourceGroupWithResponse("rg1",
            "test-vnet", null, com.azure.core.util.Context.NONE);
    }
}
