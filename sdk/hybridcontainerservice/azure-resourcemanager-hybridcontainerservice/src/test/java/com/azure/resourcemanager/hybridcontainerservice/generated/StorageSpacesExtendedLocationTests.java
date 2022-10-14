// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.StorageSpacesExtendedLocation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class StorageSpacesExtendedLocationTests {
    @Test
    public void testDeserialize() {
        StorageSpacesExtendedLocation model =
            BinaryData
                .fromString("{\"type\":\"wutwbdsre\",\"name\":\"drhneuyow\"}")
                .toObject(StorageSpacesExtendedLocation.class);
        Assertions.assertEquals("wutwbdsre", model.type());
        Assertions.assertEquals("drhneuyow", model.name());
    }

    @Test
    public void testSerialize() {
        StorageSpacesExtendedLocation model =
            new StorageSpacesExtendedLocation().withType("wutwbdsre").withName("drhneuyow");
        model = BinaryData.fromObject(model).toObject(StorageSpacesExtendedLocation.class);
        Assertions.assertEquals("wutwbdsre", model.type());
        Assertions.assertEquals("drhneuyow", model.name());
    }
}
