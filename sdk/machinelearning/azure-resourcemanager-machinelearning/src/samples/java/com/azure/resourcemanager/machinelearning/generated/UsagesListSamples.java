// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.Context;

/** Samples for Usages List. */
public final class UsagesListSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/Usage/list.json
     */
    /**
     * Sample code: List Usages.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void listUsages(com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager.usages().list("eastus", Context.NONE);
    }
}
