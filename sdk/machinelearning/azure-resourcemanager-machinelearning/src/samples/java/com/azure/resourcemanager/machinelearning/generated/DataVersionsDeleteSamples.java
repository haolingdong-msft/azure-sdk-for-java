// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for DataVersions Delete. */
public final class DataVersionsDeleteSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/DataVersionBase/delete.json
     */
    /**
     * Sample code: Delete Data Version Base.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void deleteDataVersionBase(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.dataVersions().deleteWithResponse("test-rg", "my-aml-workspace", "string", "string", Context.NONE);
    }
}
