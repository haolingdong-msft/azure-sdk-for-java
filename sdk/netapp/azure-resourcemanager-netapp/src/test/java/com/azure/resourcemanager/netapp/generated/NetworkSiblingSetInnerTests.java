// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.NetworkSiblingSetInner;
import com.azure.resourcemanager.netapp.models.NetworkFeatures;
import com.azure.resourcemanager.netapp.models.NicInfo;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NetworkSiblingSetInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkSiblingSetInner model = BinaryData.fromString(
            "{\"networkSiblingSetId\":\"ynhijggme\",\"subnetId\":\"siarbutrcvpn\",\"networkSiblingSetStateId\":\"zmhjrunmp\",\"networkFeatures\":\"Basic_Standard\",\"provisioningState\":\"Succeeded\",\"nicInfoList\":[{\"ipAddress\":\"nlankxmyskpb\",\"volumeResourceIds\":[\"btkcxywnytnrsyn\",\"qidybyx\",\"zfcl\",\"aaxdbabphlwrq\"]},{\"ipAddress\":\"ktsthsucocmny\",\"volumeResourceIds\":[\"t\"]},{\"ipAddress\":\"twwrqp\",\"volumeResourceIds\":[\"ckzywbiexzfeyue\",\"xibxujwbhqwalm\",\"zyoxaepdkzjan\"]},{\"ipAddress\":\"xrhdwbavxbniwdjs\",\"volumeResourceIds\":[\"s\",\"bpg\"]}]}")
            .toObject(NetworkSiblingSetInner.class);
        Assertions.assertEquals("ynhijggme", model.networkSiblingSetId());
        Assertions.assertEquals("siarbutrcvpn", model.subnetId());
        Assertions.assertEquals("zmhjrunmp", model.networkSiblingSetStateId());
        Assertions.assertEquals(NetworkFeatures.BASIC_STANDARD, model.networkFeatures());
        Assertions.assertEquals("btkcxywnytnrsyn", model.nicInfoList().get(0).volumeResourceIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkSiblingSetInner model
            = new NetworkSiblingSetInner().withNetworkSiblingSetId("ynhijggme").withSubnetId("siarbutrcvpn")
                .withNetworkSiblingSetStateId("zmhjrunmp").withNetworkFeatures(NetworkFeatures.BASIC_STANDARD)
                .withNicInfoList(Arrays.asList(
                    new NicInfo()
                        .withVolumeResourceIds(Arrays.asList("btkcxywnytnrsyn", "qidybyx", "zfcl", "aaxdbabphlwrq")),
                    new NicInfo().withVolumeResourceIds(Arrays.asList("t")),
                    new NicInfo()
                        .withVolumeResourceIds(Arrays.asList("ckzywbiexzfeyue", "xibxujwbhqwalm", "zyoxaepdkzjan")),
                    new NicInfo().withVolumeResourceIds(Arrays.asList("s", "bpg"))));
        model = BinaryData.fromObject(model).toObject(NetworkSiblingSetInner.class);
        Assertions.assertEquals("ynhijggme", model.networkSiblingSetId());
        Assertions.assertEquals("siarbutrcvpn", model.subnetId());
        Assertions.assertEquals("zmhjrunmp", model.networkSiblingSetStateId());
        Assertions.assertEquals(NetworkFeatures.BASIC_STANDARD, model.networkFeatures());
        Assertions.assertEquals("btkcxywnytnrsyn", model.nicInfoList().get(0).volumeResourceIds().get(0));
    }
}
