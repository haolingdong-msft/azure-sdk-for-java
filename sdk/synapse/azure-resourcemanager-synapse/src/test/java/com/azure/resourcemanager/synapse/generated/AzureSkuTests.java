// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.AzureSku;
import com.azure.resourcemanager.synapse.models.SkuName;
import com.azure.resourcemanager.synapse.models.SkuSize;
import org.junit.jupiter.api.Assertions;

public final class AzureSkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureSku model =
            BinaryData
                .fromString("{\"name\":\"Compute optimized\",\"capacity\":1186548828,\"size\":\"Extra small\"}")
                .toObject(AzureSku.class);
        Assertions.assertEquals(SkuName.COMPUTE_OPTIMIZED, model.name());
        Assertions.assertEquals(1186548828, model.capacity());
        Assertions.assertEquals(SkuSize.EXTRA_SMALL, model.size());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureSku model =
            new AzureSku().withName(SkuName.COMPUTE_OPTIMIZED).withCapacity(1186548828).withSize(SkuSize.EXTRA_SMALL);
        model = BinaryData.fromObject(model).toObject(AzureSku.class);
        Assertions.assertEquals(SkuName.COMPUTE_OPTIMIZED, model.name());
        Assertions.assertEquals(1186548828, model.capacity());
        Assertions.assertEquals(SkuSize.EXTRA_SMALL, model.size());
    }
}
