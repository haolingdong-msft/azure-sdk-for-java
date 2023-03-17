// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.PoolChangeRequest;
import org.junit.jupiter.api.Assertions;

public final class PoolChangeRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PoolChangeRequest model =
            BinaryData.fromString("{\"newPoolResourceId\":\"bvmeuecivy\"}").toObject(PoolChangeRequest.class);
        Assertions.assertEquals("bvmeuecivy", model.newPoolResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PoolChangeRequest model = new PoolChangeRequest().withNewPoolResourceId("bvmeuecivy");
        model = BinaryData.fromObject(model).toObject(PoolChangeRequest.class);
        Assertions.assertEquals("bvmeuecivy", model.newPoolResourceId());
    }
}
