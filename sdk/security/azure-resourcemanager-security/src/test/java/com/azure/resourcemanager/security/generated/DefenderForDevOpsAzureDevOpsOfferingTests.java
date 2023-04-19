// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.DefenderForDevOpsAzureDevOpsOffering;

public final class DefenderForDevOpsAzureDevOpsOfferingTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DefenderForDevOpsAzureDevOpsOffering model =
            BinaryData
                .fromString("{\"offeringType\":\"DefenderForDevOpsAzureDevOps\",\"description\":\"rb\"}")
                .toObject(DefenderForDevOpsAzureDevOpsOffering.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DefenderForDevOpsAzureDevOpsOffering model = new DefenderForDevOpsAzureDevOpsOffering();
        model = BinaryData.fromObject(model).toObject(DefenderForDevOpsAzureDevOpsOffering.class);
    }
}
