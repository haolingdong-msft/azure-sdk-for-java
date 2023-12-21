// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.resourcemanager.netapp.models.SubvolumeInfo;

/**
 * Samples for Subvolumes Update.
 */
public final class SubvolumesUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/netapp/resource-manager/Microsoft.NetApp/preview/2023-05-01-preview/examples/Subvolumes_Update.json
     */
    /**
     * Sample code: Subvolumes_Update.
     * 
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void subvolumesUpdate(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        SubvolumeInfo resource = manager.subvolumes()
            .getWithResponse("myRG", "account1", "pool1", "volume1", "subvolume1", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withPath("/subvolumePath").apply();
    }
}
