// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.resourcemanager.networkcloud.models.BareMetalMachine;
import java.util.HashMap;
import java.util.Map;

/** Samples for BareMetalMachines Update. */
public final class BareMetalMachinesUpdateSamples {
    /*
     * x-ms-original-file: specification/networkcloud/resource-manager/Microsoft.NetworkCloud/preview/2023-05-01-preview/examples/BareMetalMachines_Patch.json
     */
    /**
     * Sample code: Patch bare metal machine.
     *
     * @param manager Entry point to NetworkCloudManager.
     */
    public static void patchBareMetalMachine(com.azure.resourcemanager.networkcloud.NetworkCloudManager manager) {
        BareMetalMachine resource =
            manager
                .bareMetalMachines()
                .getByResourceGroupWithResponse(
                    "resourceGroupName", "bareMetalMachineName", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("key1", "myvalue1", "key2", "myvalue2"))
            .withMachineDetails("machinedetails")
            .apply();
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
