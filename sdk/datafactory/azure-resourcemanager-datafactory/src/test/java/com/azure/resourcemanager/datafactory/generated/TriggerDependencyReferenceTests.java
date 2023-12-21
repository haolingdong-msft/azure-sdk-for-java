// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.TriggerDependencyReference;
import com.azure.resourcemanager.datafactory.models.TriggerReference;
import com.azure.resourcemanager.datafactory.models.TriggerReferenceType;
import org.junit.jupiter.api.Assertions;

public final class TriggerDependencyReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TriggerDependencyReference model = BinaryData.fromString(
            "{\"type\":\"TriggerDependencyReference\",\"referenceTrigger\":{\"type\":\"TriggerReference\",\"referenceName\":\"n\"}}")
            .toObject(TriggerDependencyReference.class);
        Assertions.assertEquals(TriggerReferenceType.TRIGGER_REFERENCE, model.referenceTrigger().type());
        Assertions.assertEquals("n", model.referenceTrigger().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TriggerDependencyReference model = new TriggerDependencyReference().withReferenceTrigger(
            new TriggerReference().withType(TriggerReferenceType.TRIGGER_REFERENCE).withReferenceName("n"));
        model = BinaryData.fromObject(model).toObject(TriggerDependencyReference.class);
        Assertions.assertEquals(TriggerReferenceType.TRIGGER_REFERENCE, model.referenceTrigger().type());
        Assertions.assertEquals("n", model.referenceTrigger().referenceName());
    }
}
