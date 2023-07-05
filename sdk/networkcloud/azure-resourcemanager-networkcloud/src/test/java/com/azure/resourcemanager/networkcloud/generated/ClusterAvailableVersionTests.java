// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.ClusterAvailableVersion;

public final class ClusterAvailableVersionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterAvailableVersion model =
            BinaryData
                .fromString("{\"supportExpiryDate\":\"hmpvecx\",\"targetClusterVersion\":\"debfqkkrbmpukgri\"}")
                .toObject(ClusterAvailableVersion.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterAvailableVersion model = new ClusterAvailableVersion();
        model = BinaryData.fromObject(model).toObject(ClusterAvailableVersion.class);
    }
}
