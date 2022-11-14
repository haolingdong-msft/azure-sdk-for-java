// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.SkuResourceInner;
import com.azure.resourcemanager.machinelearning.models.SkuCapacity;
import com.azure.resourcemanager.machinelearning.models.SkuScaleType;
import com.azure.resourcemanager.machinelearning.models.SkuSetting;
import com.azure.resourcemanager.machinelearning.models.SkuTier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SkuResourceInnerTests {
    @Test
    public void testDeserialize() {
        SkuResourceInner model =
            BinaryData
                .fromString(
                    "{\"capacity\":{\"default\":1475743122,\"maximum\":1335142199,\"minimum\":1634012333,\"scaleType\":\"Manual\"},\"resourceType\":\"cqiosmgbza\",\"sku\":{\"name\":\"xqdlyrtltlapr\",\"tier\":\"Basic\"}}")
                .toObject(SkuResourceInner.class);
        Assertions.assertEquals(1475743122, model.capacity().defaultProperty());
        Assertions.assertEquals(1335142199, model.capacity().maximum());
        Assertions.assertEquals(1634012333, model.capacity().minimum());
        Assertions.assertEquals(SkuScaleType.MANUAL, model.capacity().scaleType());
        Assertions.assertEquals("xqdlyrtltlapr", model.sku().name());
        Assertions.assertEquals(SkuTier.BASIC, model.sku().tier());
    }

    @Test
    public void testSerialize() {
        SkuResourceInner model =
            new SkuResourceInner()
                .withCapacity(
                    new SkuCapacity()
                        .withDefaultProperty(1475743122)
                        .withMaximum(1335142199)
                        .withMinimum(1634012333)
                        .withScaleType(SkuScaleType.MANUAL))
                .withSku(new SkuSetting().withName("xqdlyrtltlapr").withTier(SkuTier.BASIC));
        model = BinaryData.fromObject(model).toObject(SkuResourceInner.class);
        Assertions.assertEquals(1475743122, model.capacity().defaultProperty());
        Assertions.assertEquals(1335142199, model.capacity().maximum());
        Assertions.assertEquals(1634012333, model.capacity().minimum());
        Assertions.assertEquals(SkuScaleType.MANUAL, model.capacity().scaleType());
        Assertions.assertEquals("xqdlyrtltlapr", model.sku().name());
        Assertions.assertEquals(SkuTier.BASIC, model.sku().tier());
    }
}
