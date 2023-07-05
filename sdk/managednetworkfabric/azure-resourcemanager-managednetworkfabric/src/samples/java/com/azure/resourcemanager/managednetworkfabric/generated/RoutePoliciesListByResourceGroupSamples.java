// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

/** Samples for RoutePolicies ListByResourceGroup. */
public final class RoutePoliciesListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/preview/2023-02-01-preview/examples/RoutePolicies_ListByResourceGroup_MaximumSet_Gen.json
     */
    /**
     * Sample code: RoutePolicies_ListByResourceGroup_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void routePoliciesListByResourceGroupMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager.routePolicies().listByResourceGroup("rgRoutePolicies", com.azure.core.util.Context.NONE);
    }
}
