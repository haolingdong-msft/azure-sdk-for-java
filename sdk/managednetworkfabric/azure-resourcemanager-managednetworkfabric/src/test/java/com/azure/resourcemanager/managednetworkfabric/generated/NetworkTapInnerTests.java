// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkTapInner;
import com.azure.resourcemanager.managednetworkfabric.models.DestinationType;
import com.azure.resourcemanager.managednetworkfabric.models.Encapsulation;
import com.azure.resourcemanager.managednetworkfabric.models.IsolationDomainProperties;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkTapPropertiesDestinationsItem;
import com.azure.resourcemanager.managednetworkfabric.models.PollingType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NetworkTapInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NetworkTapInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"networkPacketBrokerId\":\"czmrjgobe\",\"sourceTapRuleId\":\"eheow\",\"destinations\":[{\"name\":\"afdrz\",\"destinationType\":\"Direct\",\"destinationId\":\"i\",\"isolationDomainProperties\":{\"encapsulation\":\"None\",\"neighborGroupIds\":[\"bmseesacuicnvq\"]},\"destinationTapRuleId\":\"suivmrf\"},{\"name\":\"tnd\",\"destinationType\":\"IsolationDomain\",\"destinationId\":\"lh\",\"isolationDomainProperties\":{\"encapsulation\":\"GRE\",\"neighborGroupIds\":[\"kekc\",\"aviiebeqrfz\"]},\"destinationTapRuleId\":\"qymcwt\"},{\"name\":\"uceplbrzgkuorwp\",\"destinationType\":\"IsolationDomain\",\"destinationId\":\"weobptscr\",\"isolationDomainProperties\":{\"encapsulation\":\"None\",\"neighborGroupIds\":[\"layynoyjy\",\"l\",\"msbnlyoifg\",\"fzjqthy\"]},\"destinationTapRuleId\":\"voevcwfzo\"},{\"name\":\"xxlwwooxgbsdz\",\"destinationType\":\"Direct\",\"destinationId\":\"ypjh\",\"isolationDomainProperties\":{\"encapsulation\":\"GRE\",\"neighborGroupIds\":[\"bxehujcqgzwvx\",\"iuaoibmjklqrljd\",\"uky\"]},\"destinationTapRuleId\":\"xrjiqoqovqhg\"}],\"pollingType\":\"Push\",\"configurationState\":\"DeferredControl\",\"provisioningState\":\"Accepted\",\"administrativeState\":\"MAT\",\"annotation\":\"yqruvumryddnqiva\"},\"location\":\"cqwnjz\",\"tags\":{\"spwwibpybq\":\"icciyoypoed\",\"ffnhcgnaqsrmrfqd\":\"igxuyxsxteuikhzn\",\"b\":\"rkrgsdc\"},\"id\":\"mgqlwyqznbbyzpo\",\"name\":\"zfutgpbygbnb\",\"type\":\"moiqg\"}")
                .toObject(NetworkTapInner.class);
        Assertions.assertEquals("cqwnjz", model.location());
        Assertions.assertEquals("icciyoypoed", model.tags().get("spwwibpybq"));
        Assertions.assertEquals("czmrjgobe", model.networkPacketBrokerId());
        Assertions.assertEquals("afdrz", model.destinations().get(0).name());
        Assertions.assertEquals(DestinationType.DIRECT, model.destinations().get(0).destinationType());
        Assertions.assertEquals("i", model.destinations().get(0).destinationId());
        Assertions
            .assertEquals(Encapsulation.NONE, model.destinations().get(0).isolationDomainProperties().encapsulation());
        Assertions
            .assertEquals(
                "bmseesacuicnvq", model.destinations().get(0).isolationDomainProperties().neighborGroupIds().get(0));
        Assertions.assertEquals("suivmrf", model.destinations().get(0).destinationTapRuleId());
        Assertions.assertEquals(PollingType.PUSH, model.pollingType());
        Assertions.assertEquals("yqruvumryddnqiva", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NetworkTapInner model =
            new NetworkTapInner()
                .withLocation("cqwnjz")
                .withTags(mapOf("spwwibpybq", "icciyoypoed", "ffnhcgnaqsrmrfqd", "igxuyxsxteuikhzn", "b", "rkrgsdc"))
                .withNetworkPacketBrokerId("czmrjgobe")
                .withDestinations(
                    Arrays
                        .asList(
                            new NetworkTapPropertiesDestinationsItem()
                                .withName("afdrz")
                                .withDestinationType(DestinationType.DIRECT)
                                .withDestinationId("i")
                                .withIsolationDomainProperties(
                                    new IsolationDomainProperties()
                                        .withEncapsulation(Encapsulation.NONE)
                                        .withNeighborGroupIds(Arrays.asList("bmseesacuicnvq")))
                                .withDestinationTapRuleId("suivmrf"),
                            new NetworkTapPropertiesDestinationsItem()
                                .withName("tnd")
                                .withDestinationType(DestinationType.ISOLATION_DOMAIN)
                                .withDestinationId("lh")
                                .withIsolationDomainProperties(
                                    new IsolationDomainProperties()
                                        .withEncapsulation(Encapsulation.GRE)
                                        .withNeighborGroupIds(Arrays.asList("kekc", "aviiebeqrfz")))
                                .withDestinationTapRuleId("qymcwt"),
                            new NetworkTapPropertiesDestinationsItem()
                                .withName("uceplbrzgkuorwp")
                                .withDestinationType(DestinationType.ISOLATION_DOMAIN)
                                .withDestinationId("weobptscr")
                                .withIsolationDomainProperties(
                                    new IsolationDomainProperties()
                                        .withEncapsulation(Encapsulation.NONE)
                                        .withNeighborGroupIds(Arrays.asList("layynoyjy", "l", "msbnlyoifg", "fzjqthy")))
                                .withDestinationTapRuleId("voevcwfzo"),
                            new NetworkTapPropertiesDestinationsItem()
                                .withName("xxlwwooxgbsdz")
                                .withDestinationType(DestinationType.DIRECT)
                                .withDestinationId("ypjh")
                                .withIsolationDomainProperties(
                                    new IsolationDomainProperties()
                                        .withEncapsulation(Encapsulation.GRE)
                                        .withNeighborGroupIds(Arrays.asList("bxehujcqgzwvx", "iuaoibmjklqrljd", "uky")))
                                .withDestinationTapRuleId("xrjiqoqovqhg")))
                .withPollingType(PollingType.PUSH)
                .withAnnotation("yqruvumryddnqiva");
        model = BinaryData.fromObject(model).toObject(NetworkTapInner.class);
        Assertions.assertEquals("cqwnjz", model.location());
        Assertions.assertEquals("icciyoypoed", model.tags().get("spwwibpybq"));
        Assertions.assertEquals("czmrjgobe", model.networkPacketBrokerId());
        Assertions.assertEquals("afdrz", model.destinations().get(0).name());
        Assertions.assertEquals(DestinationType.DIRECT, model.destinations().get(0).destinationType());
        Assertions.assertEquals("i", model.destinations().get(0).destinationId());
        Assertions
            .assertEquals(Encapsulation.NONE, model.destinations().get(0).isolationDomainProperties().encapsulation());
        Assertions
            .assertEquals(
                "bmseesacuicnvq", model.destinations().get(0).isolationDomainProperties().neighborGroupIds().get(0));
        Assertions.assertEquals("suivmrf", model.destinations().get(0).destinationTapRuleId());
        Assertions.assertEquals(PollingType.PUSH, model.pollingType());
        Assertions.assertEquals("yqruvumryddnqiva", model.annotation());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
