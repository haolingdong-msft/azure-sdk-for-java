// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.WorkspaceConnectionManagedIdentity;
import org.junit.jupiter.api.Assertions;

public final class WorkspaceConnectionManagedIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspaceConnectionManagedIdentity model
            = BinaryData.fromString("{\"resourceId\":\"rvrk\",\"clientId\":\"abdu\"}")
                .toObject(WorkspaceConnectionManagedIdentity.class);
        Assertions.assertEquals("rvrk", model.resourceId());
        Assertions.assertEquals("abdu", model.clientId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspaceConnectionManagedIdentity model
            = new WorkspaceConnectionManagedIdentity().withResourceId("rvrk").withClientId("abdu");
        model = BinaryData.fromObject(model).toObject(WorkspaceConnectionManagedIdentity.class);
        Assertions.assertEquals("rvrk", model.resourceId());
        Assertions.assertEquals("abdu", model.clientId());
    }
}
