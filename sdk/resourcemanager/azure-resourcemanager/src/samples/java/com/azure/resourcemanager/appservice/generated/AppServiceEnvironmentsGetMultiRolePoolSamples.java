// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for AppServiceEnvironments GetMultiRolePool.
 */
public final class AppServiceEnvironmentsGetMultiRolePoolSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/
     * AppServiceEnvironments_GetMultiRolePool.json
     */
    /**
     * Sample code: Get properties of a multi-role pool.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getPropertiesOfAMultiRolePool(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getAppServiceEnvironments().getMultiRolePoolWithResponse("test-rg",
            "test-ase", com.azure.core.util.Context.NONE);
    }
}
