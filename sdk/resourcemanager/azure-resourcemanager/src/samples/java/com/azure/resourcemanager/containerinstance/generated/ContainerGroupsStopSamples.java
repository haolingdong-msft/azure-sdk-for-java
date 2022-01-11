// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.generated;

import com.azure.core.util.Context;

/** Samples for ContainerGroups Stop. */
public final class ContainerGroupsStopSamples {
    /*
     * x-ms-original-file: specification/containerinstance/resource-manager/Microsoft.ContainerInstance/stable/2021-09-01/examples/ContainerGroupsStop.json
     */
    /**
     * Sample code: ContainerStop.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void containerStop(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerGroups()
            .manager()
            .serviceClient()
            .getContainerGroups()
            .stopWithResponse("demo", "demo1", Context.NONE);
    }
}
