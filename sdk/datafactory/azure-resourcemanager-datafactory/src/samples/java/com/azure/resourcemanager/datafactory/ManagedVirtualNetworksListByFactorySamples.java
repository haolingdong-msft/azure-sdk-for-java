// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for ManagedVirtualNetworks ListByFactory. */
public final class ManagedVirtualNetworksListByFactorySamples {
    /**
     * Sample code: ManagedVirtualNetworks_ListByFactory.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void managedVirtualNetworksListByFactory(
        com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.managedVirtualNetworks().listByFactory("exampleResourceGroup", "exampleFactoryName", Context.NONE);
    }
}
