// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.ComponentContainerInner;
import com.azure.resourcemanager.machinelearning.models.ComponentContainerProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ComponentContainerInnerTests {
    @Test
    public void testDeserialize() {
        ComponentContainerInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"isArchived\":true,\"latestVersion\":\"snjvcdwxlpqekftn\",\"nextVersion\":\"tjsyin\",\"description\":\"fq\",\"properties\":{\"ikdgszywkbir\":\"tdhtmdvyp\"},\"tags\":{\"hkjoqr\":\"zh\",\"mfiibfggj\":\"qqaatjinrvgou\",\"rwxkvtkkgl\":\"ool\"}},\"id\":\"wjygvjayvblmhvk\",\"name\":\"uhbxvvy\",\"type\":\"gsopbyrqufegxu\"}")
                .toObject(ComponentContainerInner.class);
        Assertions.assertEquals("fq", model.properties().description());
        Assertions.assertEquals("tdhtmdvyp", model.properties().properties().get("ikdgszywkbir"));
        Assertions.assertEquals("zh", model.properties().tags().get("hkjoqr"));
        Assertions.assertEquals(true, model.properties().isArchived());
    }

    @Test
    public void testSerialize() {
        ComponentContainerInner model =
            new ComponentContainerInner()
                .withProperties(
                    new ComponentContainerProperties()
                        .withDescription("fq")
                        .withProperties(mapOf("ikdgszywkbir", "tdhtmdvyp"))
                        .withTags(mapOf("hkjoqr", "zh", "mfiibfggj", "qqaatjinrvgou", "rwxkvtkkgl", "ool"))
                        .withIsArchived(true));
        model = BinaryData.fromObject(model).toObject(ComponentContainerInner.class);
        Assertions.assertEquals("fq", model.properties().description());
        Assertions.assertEquals("tdhtmdvyp", model.properties().properties().get("ikdgszywkbir"));
        Assertions.assertEquals("zh", model.properties().tags().get("hkjoqr"));
        Assertions.assertEquals(true, model.properties().isArchived());
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
