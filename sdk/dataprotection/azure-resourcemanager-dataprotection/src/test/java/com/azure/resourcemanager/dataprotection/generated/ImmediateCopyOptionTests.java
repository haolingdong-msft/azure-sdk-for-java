// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.ImmediateCopyOption;

public final class ImmediateCopyOptionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImmediateCopyOption model
            = BinaryData.fromString("{\"objectType\":\"ImmediateCopyOption\"}").toObject(ImmediateCopyOption.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImmediateCopyOption model = new ImmediateCopyOption();
        model = BinaryData.fromObject(model).toObject(ImmediateCopyOption.class);
    }
}
