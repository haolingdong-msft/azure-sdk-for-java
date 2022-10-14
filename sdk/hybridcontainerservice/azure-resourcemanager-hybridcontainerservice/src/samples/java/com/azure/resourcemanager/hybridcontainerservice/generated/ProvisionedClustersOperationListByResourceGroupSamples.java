// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.Context;

/** Samples for ProvisionedClustersOperation ListByResourceGroup. */
public final class ProvisionedClustersOperationListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/preview/2022-05-01-preview/examples/ListProvisionedClusterByResourceGroup.json
     */
    /**
     * Sample code: ListProvisionedClusterByResourceGroup.
     *
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void listProvisionedClusterByResourceGroup(
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager.provisionedClustersOperations().listByResourceGroup("test-arcappliance-resgrp", Context.NONE);
    }
}
