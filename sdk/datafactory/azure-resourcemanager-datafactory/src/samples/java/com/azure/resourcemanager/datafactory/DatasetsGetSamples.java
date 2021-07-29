// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for Datasets Get. */
public final class DatasetsGetSamples {
    /**
     * Sample code: Datasets_Get.
     *
     * @param dataFactoryManager Entry point to DataFactoryManager. The Azure Data Factory V2 management API provides a
     *     RESTful set of web services that interact with Azure Data Factory V2 services.
     */
    public static void datasetsGet(com.azure.resourcemanager.datafactory.DataFactoryManager dataFactoryManager) {
        dataFactoryManager
            .datasets()
            .getWithResponse("exampleResourceGroup", "exampleFactoryName", "exampleDataset", null, Context.NONE);
    }
}
