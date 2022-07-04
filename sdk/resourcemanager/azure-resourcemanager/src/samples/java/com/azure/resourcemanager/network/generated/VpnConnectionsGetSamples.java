// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for VpnConnections Get. */
public final class VpnConnectionsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/VpnConnectionGet.json
     */
    /**
     * Sample code: VpnConnectionGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void vpnConnectionGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getVpnConnections()
            .getWithResponse("rg1", "gateway1", "vpnConnection1", Context.NONE);
    }
}
