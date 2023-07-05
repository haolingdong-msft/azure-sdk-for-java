// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.RackInner;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class RackInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RackInner model =
            BinaryData
                .fromString(
                    "{\"extendedLocation\":{\"name\":\"pjbi\",\"type\":\"gjmfxumvfcl\"},\"properties\":{\"availabilityZone\":\"yo\",\"clusterId\":\"xnbkfezzxscyhwzd\",\"detailedStatus\":\"Error\",\"detailedStatusMessage\":\"jbzbomvzzbtdcq\",\"provisioningState\":\"Succeeded\",\"rackLocation\":\"iyujviylwdshfs\",\"rackSerialNumber\":\"n\",\"rackSkuId\":\"bgye\"},\"location\":\"ymsgaojfmwnc\",\"tags\":{\"rctym\":\"rfh\",\"xacpqjli\":\"xoftpipiwyczu\",\"skasdvlmfwdgzxu\":\"hyus\"},\"id\":\"ucvpamrs\",\"name\":\"euzvx\",\"type\":\"risjnhnytxifqjz\"}")
                .toObject(RackInner.class);
        Assertions.assertEquals("ymsgaojfmwnc", model.location());
        Assertions.assertEquals("rfh", model.tags().get("rctym"));
        Assertions.assertEquals("pjbi", model.extendedLocation().name());
        Assertions.assertEquals("gjmfxumvfcl", model.extendedLocation().type());
        Assertions.assertEquals("yo", model.availabilityZone());
        Assertions.assertEquals("iyujviylwdshfs", model.rackLocation());
        Assertions.assertEquals("n", model.rackSerialNumber());
        Assertions.assertEquals("bgye", model.rackSkuId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RackInner model =
            new RackInner()
                .withLocation("ymsgaojfmwnc")
                .withTags(mapOf("rctym", "rfh", "xacpqjli", "xoftpipiwyczu", "skasdvlmfwdgzxu", "hyus"))
                .withExtendedLocation(new ExtendedLocation().withName("pjbi").withType("gjmfxumvfcl"))
                .withAvailabilityZone("yo")
                .withRackLocation("iyujviylwdshfs")
                .withRackSerialNumber("n")
                .withRackSkuId("bgye");
        model = BinaryData.fromObject(model).toObject(RackInner.class);
        Assertions.assertEquals("ymsgaojfmwnc", model.location());
        Assertions.assertEquals("rfh", model.tags().get("rctym"));
        Assertions.assertEquals("pjbi", model.extendedLocation().name());
        Assertions.assertEquals("gjmfxumvfcl", model.extendedLocation().type());
        Assertions.assertEquals("yo", model.availabilityZone());
        Assertions.assertEquals("iyujviylwdshfs", model.rackLocation());
        Assertions.assertEquals("n", model.rackSerialNumber());
        Assertions.assertEquals("bgye", model.rackSkuId());
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
