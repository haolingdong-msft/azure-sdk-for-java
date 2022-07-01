// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.generated;

import com.azure.core.util.Context;

/** Samples for FederatedIdentityCredentials Delete. */
public final class FederatedIdentityCredentialsDeleteSamples {
    /*
     * x-ms-original-file: specification/msi/resource-manager/Microsoft.ManagedIdentity/preview/2022-01-31-preview/examples/FederatedIdentityCredentialDelete.json
     */
    /**
     * Sample code: FederatedIdentityCredentialDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void federatedIdentityCredentialDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .identities()
            .manager()
            .serviceClient()
            .getFederatedIdentityCredentials()
            .deleteWithResponse("rgName", "resourceName", "ficResourceName", Context.NONE);
    }
}
