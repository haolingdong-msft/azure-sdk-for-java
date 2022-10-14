// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.PrepareNetworkPoliciesRequest;

/** Samples for Subnets PrepareNetworkPolicies. */
public final class SubnetsPrepareNetworkPoliciesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/SubnetPrepareNetworkPolicies.json
     */
    /**
     * Sample code: Prepare Network Policies.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void prepareNetworkPolicies(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getSubnets()
            .prepareNetworkPolicies(
                "rg1",
                "test-vnet",
                "subnet1",
                new PrepareNetworkPoliciesRequest().withServiceName("Microsoft.Sql/managedInstances"),
                Context.NONE);
    }
}
