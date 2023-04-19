// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.CspmMonitorGcpOfferingNativeCloudConnection;
import org.junit.jupiter.api.Assertions;

public final class CspmMonitorGcpOfferingNativeCloudConnectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CspmMonitorGcpOfferingNativeCloudConnection model =
            BinaryData
                .fromString("{\"workloadIdentityProviderId\":\"wjrkb\",\"serviceAccountEmailAddress\":\"jhbtqq\"}")
                .toObject(CspmMonitorGcpOfferingNativeCloudConnection.class);
        Assertions.assertEquals("wjrkb", model.workloadIdentityProviderId());
        Assertions.assertEquals("jhbtqq", model.serviceAccountEmailAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CspmMonitorGcpOfferingNativeCloudConnection model =
            new CspmMonitorGcpOfferingNativeCloudConnection()
                .withWorkloadIdentityProviderId("wjrkb")
                .withServiceAccountEmailAddress("jhbtqq");
        model = BinaryData.fromObject(model).toObject(CspmMonitorGcpOfferingNativeCloudConnection.class);
        Assertions.assertEquals("wjrkb", model.workloadIdentityProviderId());
        Assertions.assertEquals("jhbtqq", model.serviceAccountEmailAddress());
    }
}
