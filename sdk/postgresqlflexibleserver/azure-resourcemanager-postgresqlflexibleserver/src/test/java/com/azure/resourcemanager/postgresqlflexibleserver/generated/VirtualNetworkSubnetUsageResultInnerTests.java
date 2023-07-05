// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.VirtualNetworkSubnetUsageResultInner;

public final class VirtualNetworkSubnetUsageResultInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualNetworkSubnetUsageResultInner model =
            BinaryData
                .fromString(
                    "{\"delegatedSubnetsUsage\":[{\"subnetName\":\"d\",\"usage\":6537183488569541179}],\"location\":\"wubmwmbesldn\",\"subscriptionId\":\"wtppjflcxogaoko\"}")
                .toObject(VirtualNetworkSubnetUsageResultInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualNetworkSubnetUsageResultInner model = new VirtualNetworkSubnetUsageResultInner();
        model = BinaryData.fromObject(model).toObject(VirtualNetworkSubnetUsageResultInner.class);
    }
}
