// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.Context;

/** Samples for DetachAndDeleteTrafficFilter Delete. */
public final class DetachAndDeleteTrafficFilterDeleteSamples {
    /*
     * x-ms-original-file: specification/elastic/resource-manager/Microsoft.Elastic/preview/2022-07-01-preview/examples/DetachAndDeleteTrafficFilter_Delete.json
     */
    /**
     * Sample code: DetachAndDeleteTrafficFilter_Delete.
     *
     * @param manager Entry point to ElasticManager.
     */
    public static void detachAndDeleteTrafficFilterDelete(com.azure.resourcemanager.elastic.ElasticManager manager) {
        manager
            .detachAndDeleteTrafficFilters()
            .deleteWithResponse("myResourceGroup", "myMonitor", "31d91b5afb6f4c2eaaf104c97b1991dd", Context.NONE);
    }
}
