// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for SecurityPartnerProviders Delete. */
public final class SecurityPartnerProvidersDeleteSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/SecurityPartnerProviderDelete.json
     */
    /**
     * Sample code: Delete Security Partner Provider.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteSecurityPartnerProvider(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getSecurityPartnerProviders()
            .delete("rg1", "securityPartnerProvider", Context.NONE);
    }
}
