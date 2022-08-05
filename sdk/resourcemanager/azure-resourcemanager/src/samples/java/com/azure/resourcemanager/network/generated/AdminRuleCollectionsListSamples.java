// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for AdminRuleCollections List. */
public final class AdminRuleCollectionsListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-01-01/examples/NetworkManagerAdminRuleCollectionList.json
     */
    /**
     * Sample code: List security admin rule collections.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listSecurityAdminRuleCollections(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getAdminRuleCollections()
            .list("rg1", "testNetworkManager", "myTestSecurityConfig", null, null, Context.NONE);
    }
}
