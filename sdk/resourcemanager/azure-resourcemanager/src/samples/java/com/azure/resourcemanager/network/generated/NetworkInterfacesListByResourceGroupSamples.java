// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaces ListByResourceGroup. */
public final class NetworkInterfacesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkInterfaceList.json
     */
    /**
     * Sample code: List network interfaces in resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listNetworkInterfacesInResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getNetworkInterfaces().listByResourceGroup("rg1", Context.NONE);
    }
}
