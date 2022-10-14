// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.Context;

/** Samples for ProvisionedClustersOperation Delete. */
public final class ProvisionedClustersOperationDeleteSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/preview/2022-05-01-preview/examples/DeleteProvisionedCluster.json
     */
    /**
     * Sample code: DeleteProvisionedCluster.
     *
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void deleteProvisionedCluster(
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager
            .provisionedClustersOperations()
            .deleteByResourceGroupWithResponse("test-arcappliance-resgrp", "test-hybridakscluster", Context.NONE);
    }
}
