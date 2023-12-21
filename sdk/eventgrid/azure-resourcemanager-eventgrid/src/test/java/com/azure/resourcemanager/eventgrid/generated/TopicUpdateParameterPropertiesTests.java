// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.TopicUpdateParameterProperties;
import com.azure.resourcemanager.eventgrid.models.DataResidencyBoundary;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.InboundIpRule;
import com.azure.resourcemanager.eventgrid.models.InlineEventProperties;
import com.azure.resourcemanager.eventgrid.models.IpActionType;
import com.azure.resourcemanager.eventgrid.models.PublicNetworkAccess;
import com.azure.resourcemanager.eventgrid.models.TlsVersion;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TopicUpdateParameterPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TopicUpdateParameterProperties model = BinaryData.fromString(
            "{\"publicNetworkAccess\":\"Disabled\",\"inboundIpRules\":[{\"ipMask\":\"tnhqsycl\",\"action\":\"Allow\"},{\"ipMask\":\"pkpbafvafhlbylcc\",\"action\":\"Allow\"},{\"ipMask\":\"rhyzdf\",\"action\":\"Allow\"}],\"minimumTlsVersionAllowed\":\"1.1\",\"disableLocalAuth\":false,\"dataResidencyBoundary\":\"WithinRegion\",\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"y\":{\"description\":\"hvhfnracw\",\"displayName\":\"qigtuujwouhdaws\",\"documentationUrl\":\"rb\",\"dataSchemaUrl\":\"xsjybvitvqk\"},\"noakiz\":{\"description\":\"nu\",\"displayName\":\"ggmuwdcho\",\"documentationUrl\":\"nkf\",\"dataSchemaUrl\":\"lv\"},\"xhxknlc\":{\"description\":\"aikn\",\"displayName\":\"lnuwiguy\",\"documentationUrl\":\"ykwphvxzcwxhmpe\",\"dataSchemaUrl\":\"lkexaonwivkcqh\"},\"pdxphlkksnmgzvyf\":{\"description\":\"mmkyu\",\"displayName\":\"jubyqjfkakfq\",\"documentationUrl\":\"kemyil\",\"dataSchemaUrl\":\"dxjascowvfdj\"}}}}")
            .toObject(TopicUpdateParameterProperties.class);
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
        Assertions.assertEquals("tnhqsycl", model.inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.inboundIpRules().get(0).action());
        Assertions.assertEquals(TlsVersion.ONE_ONE, model.minimumTlsVersionAllowed());
        Assertions.assertEquals(false, model.disableLocalAuth());
        Assertions.assertEquals(DataResidencyBoundary.WITHIN_REGION, model.dataResidencyBoundary());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.eventTypeInfo().kind());
        Assertions.assertEquals("hvhfnracw", model.eventTypeInfo().inlineEventTypes().get("y").description());
        Assertions.assertEquals("qigtuujwouhdaws", model.eventTypeInfo().inlineEventTypes().get("y").displayName());
        Assertions.assertEquals("rb", model.eventTypeInfo().inlineEventTypes().get("y").documentationUrl());
        Assertions.assertEquals("xsjybvitvqk", model.eventTypeInfo().inlineEventTypes().get("y").dataSchemaUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TopicUpdateParameterProperties model = new TopicUpdateParameterProperties()
            .withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
            .withInboundIpRules(Arrays.asList(new InboundIpRule().withIpMask("tnhqsycl").withAction(IpActionType.ALLOW),
                new InboundIpRule().withIpMask("pkpbafvafhlbylcc").withAction(IpActionType.ALLOW),
                new InboundIpRule().withIpMask("rhyzdf").withAction(IpActionType.ALLOW)))
            .withMinimumTlsVersionAllowed(TlsVersion.ONE_ONE).withDisableLocalAuth(false)
            .withDataResidencyBoundary(DataResidencyBoundary.WITHIN_REGION)
            .withEventTypeInfo(new EventTypeInfo().withKind(EventDefinitionKind.INLINE)
                .withInlineEventTypes(mapOf("y", new InlineEventProperties().withDescription("hvhfnracw")
                    .withDisplayName("qigtuujwouhdaws").withDocumentationUrl("rb").withDataSchemaUrl("xsjybvitvqk"),
                    "noakiz",
                    new InlineEventProperties().withDescription("nu").withDisplayName("ggmuwdcho")
                        .withDocumentationUrl("nkf").withDataSchemaUrl("lv"),
                    "xhxknlc",
                    new InlineEventProperties().withDescription("aikn").withDisplayName("lnuwiguy")
                        .withDocumentationUrl("ykwphvxzcwxhmpe").withDataSchemaUrl("lkexaonwivkcqh"),
                    "pdxphlkksnmgzvyf",
                    new InlineEventProperties().withDescription("mmkyu").withDisplayName("jubyqjfkakfq")
                        .withDocumentationUrl("kemyil").withDataSchemaUrl("dxjascowvfdj"))));
        model = BinaryData.fromObject(model).toObject(TopicUpdateParameterProperties.class);
        Assertions.assertEquals(PublicNetworkAccess.DISABLED, model.publicNetworkAccess());
        Assertions.assertEquals("tnhqsycl", model.inboundIpRules().get(0).ipMask());
        Assertions.assertEquals(IpActionType.ALLOW, model.inboundIpRules().get(0).action());
        Assertions.assertEquals(TlsVersion.ONE_ONE, model.minimumTlsVersionAllowed());
        Assertions.assertEquals(false, model.disableLocalAuth());
        Assertions.assertEquals(DataResidencyBoundary.WITHIN_REGION, model.dataResidencyBoundary());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.eventTypeInfo().kind());
        Assertions.assertEquals("hvhfnracw", model.eventTypeInfo().inlineEventTypes().get("y").description());
        Assertions.assertEquals("qigtuujwouhdaws", model.eventTypeInfo().inlineEventTypes().get("y").displayName());
        Assertions.assertEquals("rb", model.eventTypeInfo().inlineEventTypes().get("y").documentationUrl());
        Assertions.assertEquals("xsjybvitvqk", model.eventTypeInfo().inlineEventTypes().get("y").dataSchemaUrl());
    }

    // Use "Map.of" if available
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
