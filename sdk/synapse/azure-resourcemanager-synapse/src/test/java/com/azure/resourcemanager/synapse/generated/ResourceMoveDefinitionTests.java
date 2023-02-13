// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.models.ResourceMoveDefinition;
import org.junit.jupiter.api.Assertions;

public final class ResourceMoveDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceMoveDefinition model =
            BinaryData.fromString("{\"id\":\"qlveualupjmkh\"}").toObject(ResourceMoveDefinition.class);
        Assertions.assertEquals("qlveualupjmkh", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceMoveDefinition model = new ResourceMoveDefinition().withId("qlveualupjmkh");
        model = BinaryData.fromObject(model).toObject(ResourceMoveDefinition.class);
        Assertions.assertEquals("qlveualupjmkh", model.id());
    }
}
