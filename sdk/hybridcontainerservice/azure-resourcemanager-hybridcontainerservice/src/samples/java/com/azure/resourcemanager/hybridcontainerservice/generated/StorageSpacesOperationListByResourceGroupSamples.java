// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

/** Samples for StorageSpacesOperation ListByResourceGroup. */
public final class StorageSpacesOperationListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/hybridaks/resource-manager/Microsoft.HybridContainerService/preview/2022-09-01-preview/examples/ListStorageSpaceByResourceGroup.json
     */
    /**
     * Sample code: ListStorageSpaceByResourceGroup.
     *
     * @param manager Entry point to HybridContainerServiceManager.
     */
    public static void listStorageSpaceByResourceGroup(
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager) {
        manager
            .storageSpacesOperations()
            .listByResourceGroup("test-arcappliance-resgrp", com.azure.core.util.Context.NONE);
    }
}
