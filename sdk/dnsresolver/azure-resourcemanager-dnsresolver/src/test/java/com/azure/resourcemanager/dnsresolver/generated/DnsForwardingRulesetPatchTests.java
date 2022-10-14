// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.management.SubResource;
import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dnsresolver.models.DnsForwardingRulesetPatch;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DnsForwardingRulesetPatchTests {
    @Test
    public void testDeserialize() {
        DnsForwardingRulesetPatch model =
            BinaryData
                .fromString(
                    "{\"dnsResolverOutboundEndpoints\":[{\"id\":\"pzaoqvuhr\"}],\"tags\":{\"mjthjqkwp\":\"fcyddg\"}}")
                .toObject(DnsForwardingRulesetPatch.class);
        Assertions.assertEquals("pzaoqvuhr", model.dnsResolverOutboundEndpoints().get(0).id());
        Assertions.assertEquals("fcyddg", model.tags().get("mjthjqkwp"));
    }

    @Test
    public void testSerialize() {
        DnsForwardingRulesetPatch model =
            new DnsForwardingRulesetPatch()
                .withDnsResolverOutboundEndpoints(Arrays.asList(new SubResource().withId("pzaoqvuhr")))
                .withTags(mapOf("mjthjqkwp", "fcyddg"));
        model = BinaryData.fromObject(model).toObject(DnsForwardingRulesetPatch.class);
        Assertions.assertEquals("pzaoqvuhr", model.dnsResolverOutboundEndpoints().get(0).id());
        Assertions.assertEquals("fcyddg", model.tags().get("mjthjqkwp"));
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
