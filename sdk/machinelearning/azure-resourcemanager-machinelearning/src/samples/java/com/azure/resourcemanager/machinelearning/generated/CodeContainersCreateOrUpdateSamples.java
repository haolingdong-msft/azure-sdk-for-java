// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.resourcemanager.machinelearning.models.CodeContainerProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for CodeContainers CreateOrUpdate. */
public final class CodeContainersCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/machinelearningservices/resource-manager/Microsoft.MachineLearningServices/stable/2022-10-01/examples/CodeContainer/createOrUpdate.json
     */
    /**
     * Sample code: CreateOrUpdate Code Container.
     *
     * @param manager Entry point to MachineLearningManager.
     */
    public static void createOrUpdateCodeContainer(
        com.azure.resourcemanager.machinelearning.MachineLearningManager manager) {
        manager
            .codeContainers()
            .define("testContainer")
            .withExistingWorkspace("testrg123", "testworkspace")
            .withProperties(
                new CodeContainerProperties()
                    .withDescription("string")
                    .withTags(mapOf("tag1", "value1", "tag2", "value2")))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
