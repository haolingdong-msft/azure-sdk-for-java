// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.models.CheckPrivateLinkServiceVisibilityRequest;

/** Samples for PrivateLinkServices CheckPrivateLinkServiceVisibility. */
public final class PrivateLinkServicesCheckPrivateLinkServiceVisibilitySamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/CheckPrivateLinkServiceVisibility.json
     */
    /**
     * Sample code: Check private link service visibility.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void checkPrivateLinkServiceVisibility(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPrivateLinkServices()
            .checkPrivateLinkServiceVisibility(
                "westus",
                new CheckPrivateLinkServiceVisibilityRequest()
                    .withPrivateLinkServiceAlias("mypls.00000000-0000-0000-0000-000000000000.azure.privatelinkservice"),
                com.azure.core.util.Context.NONE);
    }
}
