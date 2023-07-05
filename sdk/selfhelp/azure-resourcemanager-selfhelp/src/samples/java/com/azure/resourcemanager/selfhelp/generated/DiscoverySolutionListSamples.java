// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

/** Samples for DiscoverySolution List. */
public final class DiscoverySolutionListSamples {
    /*
     * x-ms-original-file: specification/help/resource-manager/Microsoft.Help/stable/2023-06-01/examples/ListDiscoverySolutionsForKeyVaultResource.json
     */
    /**
     * Sample code: List DiscoverySolutions for a KeyVault resource.
     *
     * @param manager Entry point to SelfHelpManager.
     */
    public static void listDiscoverySolutionsForAKeyVaultResource(
        com.azure.resourcemanager.selfhelp.SelfHelpManager manager) {
        manager
            .discoverySolutions()
            .list(
                "subscriptions/0d0fcd2e-c4fd-4349-8497-200edb3923c6/resourcegroups/myresourceGroup/providers/Microsoft.KeyVault/vaults/test-keyvault-non-read",
                null,
                null,
                com.azure.core.util.Context.NONE);
    }
}
