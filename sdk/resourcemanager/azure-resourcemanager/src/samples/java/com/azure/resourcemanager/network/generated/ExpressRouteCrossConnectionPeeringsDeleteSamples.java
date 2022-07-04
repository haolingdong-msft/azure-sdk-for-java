// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCrossConnectionPeerings Delete. */
public final class ExpressRouteCrossConnectionPeeringsDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/ExpressRouteCrossConnectionBgpPeeringDelete.json
     */
    /**
     * Sample code: DeleteExpressRouteCrossConnectionBgpPeering.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteExpressRouteCrossConnectionBgpPeering(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getExpressRouteCrossConnectionPeerings()
            .delete("CrossConnection-SiliconValley", "<circuitServiceKey>", "AzurePrivatePeering", Context.NONE);
    }
}
