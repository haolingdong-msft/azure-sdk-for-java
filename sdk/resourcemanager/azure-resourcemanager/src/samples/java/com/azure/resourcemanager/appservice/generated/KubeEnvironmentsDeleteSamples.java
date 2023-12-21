// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for KubeEnvironments Delete.
 */
public final class KubeEnvironmentsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/KubeEnvironments_Delete.json
     */
    /**
     * Sample code: Delete kube environment by name.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteKubeEnvironmentByName(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getKubeEnvironments().delete("examplerg", "examplekenv",
            com.azure.core.util.Context.NONE);
    }
}
