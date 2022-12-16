// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.fluent.models.ExternalUserCreationResponseInner;
import org.junit.jupiter.api.Test;

public final class ExternalUserCreationResponseInnerTests {
    @Test
    public void testDeserialize() {
        ExternalUserCreationResponseInner model =
            BinaryData.fromString("{\"created\":false}").toObject(ExternalUserCreationResponseInner.class);
    }

    @Test
    public void testSerialize() {
        ExternalUserCreationResponseInner model = new ExternalUserCreationResponseInner();
        model = BinaryData.fromObject(model).toObject(ExternalUserCreationResponseInner.class);
    }
}
