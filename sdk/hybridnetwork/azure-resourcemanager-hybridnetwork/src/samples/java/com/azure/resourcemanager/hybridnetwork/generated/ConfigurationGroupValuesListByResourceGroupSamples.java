// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

/**
 * Samples for ConfigurationGroupValues ListByResourceGroup.
 */
public final class ConfigurationGroupValuesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * ConfigurationGroupValueListByResourceGroup.json
     */
    /**
     * Sample code: List all hybrid network configurationGroupValues in a subscription.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void listAllHybridNetworkConfigurationGroupValuesInASubscription(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.configurationGroupValues().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
