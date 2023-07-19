// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.IpExtendedCommunityProperties;
import com.azure.resourcemanager.managednetworkfabric.models.CommunityActionTypes;
import com.azure.resourcemanager.managednetworkfabric.models.IpExtendedCommunityRule;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IpExtendedCommunityPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpExtendedCommunityProperties model =
            BinaryData
                .fromString(
                    "{\"configurationState\":\"Deprovisioning\",\"provisioningState\":\"Succeeded\",\"administrativeState\":\"MAT\",\"ipExtendedCommunityRules\":[{\"action\":\"Permit\",\"sequenceNumber\":71110697464047174,\"routeTargets\":[\"oum\",\"znv\",\"l\"]},{\"action\":\"Permit\",\"sequenceNumber\":5729494135721513095,\"routeTargets\":[\"zgfxonjtpusl\",\"ywpvt\",\"otz\",\"pdbollg\"]}],\"annotation\":\"fqiu\"}")
                .toObject(IpExtendedCommunityProperties.class);
        Assertions.assertEquals("fqiu", model.annotation());
        Assertions.assertEquals(CommunityActionTypes.PERMIT, model.ipExtendedCommunityRules().get(0).action());
        Assertions.assertEquals(71110697464047174L, model.ipExtendedCommunityRules().get(0).sequenceNumber());
        Assertions.assertEquals("oum", model.ipExtendedCommunityRules().get(0).routeTargets().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpExtendedCommunityProperties model =
            new IpExtendedCommunityProperties()
                .withAnnotation("fqiu")
                .withIpExtendedCommunityRules(
                    Arrays
                        .asList(
                            new IpExtendedCommunityRule()
                                .withAction(CommunityActionTypes.PERMIT)
                                .withSequenceNumber(71110697464047174L)
                                .withRouteTargets(Arrays.asList("oum", "znv", "l")),
                            new IpExtendedCommunityRule()
                                .withAction(CommunityActionTypes.PERMIT)
                                .withSequenceNumber(5729494135721513095L)
                                .withRouteTargets(Arrays.asList("zgfxonjtpusl", "ywpvt", "otz", "pdbollg"))));
        model = BinaryData.fromObject(model).toObject(IpExtendedCommunityProperties.class);
        Assertions.assertEquals("fqiu", model.annotation());
        Assertions.assertEquals(CommunityActionTypes.PERMIT, model.ipExtendedCommunityRules().get(0).action());
        Assertions.assertEquals(71110697464047174L, model.ipExtendedCommunityRules().get(0).sequenceNumber());
        Assertions.assertEquals("oum", model.ipExtendedCommunityRules().get(0).routeTargets().get(0));
    }
}
