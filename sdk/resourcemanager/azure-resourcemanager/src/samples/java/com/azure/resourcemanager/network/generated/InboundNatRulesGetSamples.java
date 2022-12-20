// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for InboundNatRules Get. */
public final class InboundNatRulesGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-07-01/examples/InboundNatRuleGet.json
     */
    /**
     * Sample code: InboundNatRuleGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void inboundNatRuleGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getInboundNatRules()
            .getWithResponse("testrg", "lb1", "natRule1.1", null, Context.NONE);
    }
}
