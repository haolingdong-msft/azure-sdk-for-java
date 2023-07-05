// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.resourcemanager.managednetworkfabric.models.AdministrativeState;
import com.azure.resourcemanager.managednetworkfabric.models.UpdateAdministrativeState;
import java.util.Arrays;

/** Samples for L3IsolationDomains UpdateOptionBAdministrativeState. */
public final class L3IsolationDomainsUpdateOptionBAdministrativeStateSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/preview/2023-02-01-preview/examples/L3IsolationDomains_updateOptionBAdministrativeState_MaximumSet_Gen.json
     */
    /**
     * Sample code: L3IsolationDomains_updateOptionBAdministrativeState_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void l3IsolationDomainsUpdateOptionBAdministrativeStateMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager
            .l3IsolationDomains()
            .updateOptionBAdministrativeState(
                "resourceGroupName",
                "example-l3domain",
                new UpdateAdministrativeState()
                    .withResourceIds(
                        Arrays
                            .asList(
                                "/subscriptions/xxxxxx/resourceGroups/resourcegroupname/providers/Microsoft.ManagedNetworkFabric/l3IsolationDomains/example-l3domain"))
                    .withState(AdministrativeState.ENABLE),
                com.azure.core.util.Context.NONE);
    }
}
