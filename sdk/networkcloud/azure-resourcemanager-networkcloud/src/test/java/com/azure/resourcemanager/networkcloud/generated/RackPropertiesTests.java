// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.RackProperties;
import org.junit.jupiter.api.Assertions;

public final class RackPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RackProperties model =
            BinaryData
                .fromString(
                    "{\"availabilityZone\":\"xmrhu\",\"clusterId\":\"wp\",\"detailedStatus\":\"Provisioning\",\"detailedStatusMessage\":\"trgjupauutpwoqh\",\"provisioningState\":\"Canceled\",\"rackLocation\":\"jqgwzp\",\"rackSerialNumber\":\"fqntcyp\",\"rackSkuId\":\"xjvfoimwksl\"}")
                .toObject(RackProperties.class);
        Assertions.assertEquals("xmrhu", model.availabilityZone());
        Assertions.assertEquals("jqgwzp", model.rackLocation());
        Assertions.assertEquals("fqntcyp", model.rackSerialNumber());
        Assertions.assertEquals("xjvfoimwksl", model.rackSkuId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RackProperties model =
            new RackProperties()
                .withAvailabilityZone("xmrhu")
                .withRackLocation("jqgwzp")
                .withRackSerialNumber("fqntcyp")
                .withRackSkuId("xjvfoimwksl");
        model = BinaryData.fromObject(model).toObject(RackProperties.class);
        Assertions.assertEquals("xmrhu", model.availabilityZone());
        Assertions.assertEquals("jqgwzp", model.rackLocation());
        Assertions.assertEquals("fqntcyp", model.rackSerialNumber());
        Assertions.assertEquals("xjvfoimwksl", model.rackSkuId());
    }
}
