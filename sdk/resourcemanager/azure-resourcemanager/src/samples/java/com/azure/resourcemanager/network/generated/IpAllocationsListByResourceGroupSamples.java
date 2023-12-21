// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for IpAllocations ListByResourceGroup.
 */
public final class IpAllocationsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * IpAllocationListByResourceGroup.json
     */
    /**
     * Sample code: List IpAllocations in resource group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listIpAllocationsInResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getIpAllocations().listByResourceGroup("rg1",
            com.azure.core.util.Context.NONE);
    }
}
