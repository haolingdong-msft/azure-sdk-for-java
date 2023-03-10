// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkResourceProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceProperties model =
            BinaryData
                .fromString(
                    "{\"groupId\":\"ets\",\"requiredMembers\":[\"zhedplvwiw\",\"bmwmbesldnkw\",\"tppjflcx\"],\"requiredZoneNames\":[\"okonzmnsikvmkqz\",\"qqkdltfzxmhhvhgu\",\"eodkwobda\"],\"displayName\":\"tibqdxbxwakb\"}")
                .toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("okonzmnsikvmkqz", model.requiredZoneNames().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceProperties model =
            new PrivateLinkResourceProperties()
                .withRequiredZoneNames(Arrays.asList("okonzmnsikvmkqz", "qqkdltfzxmhhvhgu", "eodkwobda"));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceProperties.class);
        Assertions.assertEquals("okonzmnsikvmkqz", model.requiredZoneNames().get(0));
    }
}
