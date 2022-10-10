// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for VirtualHubIpConfiguration Delete. */
public final class VirtualHubIpConfigurationDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VirtualHubIpConfigurationDelete.json
     */
    /**
     * Sample code: VirtualHubIpConfigurationDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void virtualHubIpConfigurationDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVirtualHubIpConfigurations()
            .delete("rg1", "hub1", "ipconfig1", Context.NONE);
    }
}
