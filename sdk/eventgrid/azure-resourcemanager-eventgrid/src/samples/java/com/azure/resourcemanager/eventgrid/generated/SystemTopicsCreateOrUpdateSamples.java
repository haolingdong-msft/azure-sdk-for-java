// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import java.util.HashMap;
import java.util.Map;

/**
 * Samples for SystemTopics CreateOrUpdate.
 */
public final class SystemTopicsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-12-15-preview/examples/
     * SystemTopics_CreateOrUpdate.json
     */
    /**
     * Sample code: SystemTopics_CreateOrUpdate.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void systemTopicsCreateOrUpdate(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.systemTopics().define("exampleSystemTopic1").withRegion("westus2")
            .withExistingResourceGroup("examplerg").withTags(mapOf("tag1", "value1", "tag2", "value2"))
            .withSource(
                "/subscriptions/8f6b6269-84f2-4d09-9e31-1127efcd1e40/resourceGroups/azureeventgridrunnerrgcentraluseuap/providers/microsoft.storage/storageaccounts/pubstgrunnerb71cd29e")
            .withTopicType("microsoft.storage.storageaccounts").create();
    }

    // Use "Map.of" if available
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
