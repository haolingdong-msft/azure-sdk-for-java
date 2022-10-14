// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for NetworkConnections ListByResourceGroup. */
public final class NetworkConnectionsListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-09-01-preview/examples/NetworkConnections_ListByResourceGroup.json
     */
    /**
     * Sample code: NetworkConnections_ListByResourceGroup.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void networkConnectionsListByResourceGroup(
        com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.networkConnections().listByResourceGroup("rg1", null, Context.NONE);
    }
}
