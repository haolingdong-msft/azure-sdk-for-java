// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.DaprMetadata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DaprMetadataTests {
    @Test
    public void testDeserialize() {
        DaprMetadata model =
            BinaryData
                .fromString("{\"name\":\"wp\",\"value\":\"sutrgjup\",\"secretRef\":\"utpwoqhihejqgw\"}")
                .toObject(DaprMetadata.class);
        Assertions.assertEquals("wp", model.name());
        Assertions.assertEquals("sutrgjup", model.value());
        Assertions.assertEquals("utpwoqhihejqgw", model.secretRef());
    }

    @Test
    public void testSerialize() {
        DaprMetadata model = new DaprMetadata().withName("wp").withValue("sutrgjup").withSecretRef("utpwoqhihejqgw");
        model = BinaryData.fromObject(model).toObject(DaprMetadata.class);
        Assertions.assertEquals("wp", model.name());
        Assertions.assertEquals("sutrgjup", model.value());
        Assertions.assertEquals("utpwoqhihejqgw", model.secretRef());
    }
}
