// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.generated;

import com.azure.core.util.Context;

/** Samples for AzureDevOpsConnector ListByResourceGroup. */
public final class AzureDevOpsConnectorListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/securitydevops/resource-manager/Microsoft.SecurityDevOps/preview/2022-09-01-preview/examples/AzureDevOpsConnectorListByResourceGroup.json
     */
    /**
     * Sample code: AzureDevOpsConnector_ListByResourceGroup.
     *
     * @param manager Entry point to SecuritydevopsManager.
     */
    public static void azureDevOpsConnectorListByResourceGroup(
        com.azure.resourcemanager.securitydevops.SecuritydevopsManager manager) {
        manager.azureDevOpsConnectors().listByResourceGroup("westusrg", Context.NONE);
    }
}
