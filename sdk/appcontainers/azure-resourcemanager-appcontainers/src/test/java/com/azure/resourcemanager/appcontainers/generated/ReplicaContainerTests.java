// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ReplicaContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ReplicaContainerTests {
    @Test
    public void testDeserialize() {
        ReplicaContainer model =
            BinaryData
                .fromString(
                    "{\"name\":\"fhsxttaugz\",\"containerId\":\"faazpxdtnkdmkqjj\",\"ready\":false,\"started\":false,\"restartCount\":1886433502,\"logStreamEndpoint\":\"pyouaibrebqaays\",\"execEndpoint\":\"ixqtn\"}")
                .toObject(ReplicaContainer.class);
        Assertions.assertEquals("fhsxttaugz", model.name());
        Assertions.assertEquals("faazpxdtnkdmkqjj", model.containerId());
        Assertions.assertEquals(false, model.ready());
        Assertions.assertEquals(false, model.started());
        Assertions.assertEquals(1886433502, model.restartCount());
    }

    @Test
    public void testSerialize() {
        ReplicaContainer model =
            new ReplicaContainer()
                .withName("fhsxttaugz")
                .withContainerId("faazpxdtnkdmkqjj")
                .withReady(false)
                .withStarted(false)
                .withRestartCount(1886433502);
        model = BinaryData.fromObject(model).toObject(ReplicaContainer.class);
        Assertions.assertEquals("fhsxttaugz", model.name());
        Assertions.assertEquals("faazpxdtnkdmkqjj", model.containerId());
        Assertions.assertEquals(false, model.ready());
        Assertions.assertEquals(false, model.started());
        Assertions.assertEquals(1886433502, model.restartCount());
    }
}
