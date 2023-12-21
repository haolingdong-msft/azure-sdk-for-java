// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ConnectionStateProperties;
import com.azure.resourcemanager.datafactory.models.ManagedPrivateEndpoint;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ManagedPrivateEndpointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedPrivateEndpoint model = BinaryData.fromString(
            "{\"connectionState\":{\"actionsRequired\":\"idmhmwf\",\"description\":\"lfmu\",\"status\":\"pckc\"},\"fqdns\":[\"vwe\"],\"groupId\":\"xoy\",\"isReserved\":false,\"privateLinkResourceId\":\"haim\",\"provisioningState\":\"iroqbosh\",\"\":{\"pavbo\":\"datagapyyrmfsv\"}}")
            .toObject(ManagedPrivateEndpoint.class);
        Assertions.assertEquals("vwe", model.fqdns().get(0));
        Assertions.assertEquals("xoy", model.groupId());
        Assertions.assertEquals("haim", model.privateLinkResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedPrivateEndpoint model = new ManagedPrivateEndpoint().withConnectionState(new ConnectionStateProperties())
            .withFqdns(Arrays.asList("vwe")).withGroupId("xoy").withPrivateLinkResourceId("haim")
            .withAdditionalProperties(mapOf("isReserved", false, "provisioningState", "iroqbosh"));
        model = BinaryData.fromObject(model).toObject(ManagedPrivateEndpoint.class);
        Assertions.assertEquals("vwe", model.fqdns().get(0));
        Assertions.assertEquals("xoy", model.groupId());
        Assertions.assertEquals("haim", model.privateLinkResourceId());
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
