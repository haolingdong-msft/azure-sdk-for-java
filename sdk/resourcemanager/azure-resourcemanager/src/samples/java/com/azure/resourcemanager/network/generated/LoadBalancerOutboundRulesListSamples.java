// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for LoadBalancerOutboundRules List. */
public final class LoadBalancerOutboundRulesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/LoadBalancerOutboundRuleList.json
     */
    /**
     * Sample code: LoadBalancerOutboundRuleList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void loadBalancerOutboundRuleList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getLoadBalancerOutboundRules()
            .list("testrg", "lb1", com.azure.core.util.Context.NONE);
    }
}
