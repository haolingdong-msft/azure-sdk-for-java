// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.Layer3Configuration;
import org.junit.jupiter.api.Assertions;

public final class Layer3ConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Layer3Configuration model =
            BinaryData
                .fromString(
                    "{\"importRoutePolicyId\":\"fzpbgtgkyl\",\"exportRoutePolicyId\":\"ghrjeuutl\",\"peerASN\":409326471,\"vlanId\":234998658,\"fabricASN\":2023455303,\"primaryIpv4Prefix\":\"kvbwnhhtqlgeh\",\"primaryIpv6Prefix\":\"pipifh\",\"secondaryIpv4Prefix\":\"e\",\"secondaryIpv6Prefix\":\"jvgcxtx\"}")
                .toObject(Layer3Configuration.class);
        Assertions.assertEquals("kvbwnhhtqlgeh", model.primaryIpv4Prefix());
        Assertions.assertEquals("pipifh", model.primaryIpv6Prefix());
        Assertions.assertEquals("e", model.secondaryIpv4Prefix());
        Assertions.assertEquals("jvgcxtx", model.secondaryIpv6Prefix());
        Assertions.assertEquals("fzpbgtgkyl", model.importRoutePolicyId());
        Assertions.assertEquals("ghrjeuutl", model.exportRoutePolicyId());
        Assertions.assertEquals(409326471, model.peerAsn());
        Assertions.assertEquals(234998658, model.vlanId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Layer3Configuration model =
            new Layer3Configuration()
                .withPrimaryIpv4Prefix("kvbwnhhtqlgeh")
                .withPrimaryIpv6Prefix("pipifh")
                .withSecondaryIpv4Prefix("e")
                .withSecondaryIpv6Prefix("jvgcxtx")
                .withImportRoutePolicyId("fzpbgtgkyl")
                .withExportRoutePolicyId("ghrjeuutl")
                .withPeerAsn(409326471)
                .withVlanId(234998658);
        model = BinaryData.fromObject(model).toObject(Layer3Configuration.class);
        Assertions.assertEquals("kvbwnhhtqlgeh", model.primaryIpv4Prefix());
        Assertions.assertEquals("pipifh", model.primaryIpv6Prefix());
        Assertions.assertEquals("e", model.secondaryIpv4Prefix());
        Assertions.assertEquals("jvgcxtx", model.secondaryIpv6Prefix());
        Assertions.assertEquals("fzpbgtgkyl", model.importRoutePolicyId());
        Assertions.assertEquals("ghrjeuutl", model.exportRoutePolicyId());
        Assertions.assertEquals(409326471, model.peerAsn());
        Assertions.assertEquals(234998658, model.vlanId());
    }
}
