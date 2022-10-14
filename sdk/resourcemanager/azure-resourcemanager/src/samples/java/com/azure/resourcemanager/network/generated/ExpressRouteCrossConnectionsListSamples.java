// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCrossConnections List. */
public final class ExpressRouteCrossConnectionsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/ExpressRouteCrossConnectionList.json
     */
    /**
     * Sample code: ExpressRouteCrossConnectionList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void expressRouteCrossConnectionList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getExpressRouteCrossConnections().list(Context.NONE);
    }
}
