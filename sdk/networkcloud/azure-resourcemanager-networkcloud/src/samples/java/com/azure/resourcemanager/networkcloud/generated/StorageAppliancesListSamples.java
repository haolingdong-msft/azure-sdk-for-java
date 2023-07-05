// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

/** Samples for StorageAppliances List. */
public final class StorageAppliancesListSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/StorageAppliances_ListBySubscription.json
     */
    /**
     * Sample code: List storage appliances for subscription.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void listStorageAppliancesForSubscription(
        com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        manager.storageAppliances().list(com.azure.core.util.Context.NONE);
    }
}
