// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;

/** Samples for DiskRestorePoint Get. */
public final class DiskRestorePointGetSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2022-03-02/examples/diskRestorePointExamples/DiskRestorePoint_Get_WhenSourceResourceIsFromDifferentRegion.json
     */
    /**
     * Sample code: Get an incremental disk restorePoint when source resource is from a different region.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAnIncrementalDiskRestorePointWhenSourceResourceIsFromADifferentRegion(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDiskRestorePoints()
            .getWithResponse(
                "myResourceGroup",
                "rpc",
                "vmrp",
                "TestDisk45ceb03433006d1baee0_b70cd924-3362-4a80-93c2-9415eaa12745",
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/DiskRP/stable/2022-03-02/examples/diskRestorePointExamples/DiskRestorePoint_Get.json
     */
    /**
     * Sample code: Get an incremental disk restorePoint resource.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAnIncrementalDiskRestorePointResource(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDiskRestorePoints()
            .getWithResponse(
                "myResourceGroup",
                "rpc",
                "vmrp",
                "TestDisk45ceb03433006d1baee0_b70cd924-3362-4a80-93c2-9415eaa12745",
                Context.NONE);
    }
}
