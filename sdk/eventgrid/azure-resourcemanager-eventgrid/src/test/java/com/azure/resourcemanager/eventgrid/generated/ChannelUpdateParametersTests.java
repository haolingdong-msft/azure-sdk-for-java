// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.models.ChannelUpdateParameters;
import com.azure.resourcemanager.eventgrid.models.EventDefinitionKind;
import com.azure.resourcemanager.eventgrid.models.EventTypeInfo;
import com.azure.resourcemanager.eventgrid.models.InlineEventProperties;
import com.azure.resourcemanager.eventgrid.models.PartnerUpdateDestinationInfo;
import com.azure.resourcemanager.eventgrid.models.PartnerUpdateTopicInfo;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ChannelUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChannelUpdateParameters model = BinaryData.fromString(
            "{\"properties\":{\"expirationTimeIfNotActivatedUtc\":\"2021-08-27T18:55:51Z\",\"partnerDestinationInfo\":{\"endpointType\":\"PartnerUpdateDestinationInfo\"},\"partnerTopicInfo\":{\"eventTypeInfo\":{\"kind\":\"Inline\",\"inlineEventTypes\":{\"gbquxigj\":{\"description\":\"rtumkdosvq\",\"displayName\":\"bmdg\",\"documentationUrl\":\"jfddgmbmbe\",\"dataSchemaUrl\":\"pbhtqqrolfpfpsa\"},\"vpys\":{\"description\":\"gzjaoyfhrtxilne\",\"displayName\":\"ujysvle\",\"documentationUrl\":\"vfqawrlyxwjkcpr\",\"dataSchemaUrl\":\"wbxgjvt\"}}}}}}")
            .toObject(ChannelUpdateParameters.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-27T18:55:51Z"), model.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.partnerTopicInfo().eventTypeInfo().kind());
        Assertions.assertEquals("rtumkdosvq",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("gbquxigj").description());
        Assertions.assertEquals("bmdg",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("gbquxigj").displayName());
        Assertions.assertEquals("jfddgmbmbe",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("gbquxigj").documentationUrl());
        Assertions.assertEquals("pbhtqqrolfpfpsa",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("gbquxigj").dataSchemaUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChannelUpdateParameters model = new ChannelUpdateParameters()
            .withExpirationTimeIfNotActivatedUtc(OffsetDateTime.parse("2021-08-27T18:55:51Z"))
            .withPartnerDestinationInfo(new PartnerUpdateDestinationInfo()).withPartnerTopicInfo(
                new PartnerUpdateTopicInfo().withEventTypeInfo(new EventTypeInfo().withKind(EventDefinitionKind.INLINE)
                    .withInlineEventTypes(mapOf("gbquxigj",
                        new InlineEventProperties().withDescription("rtumkdosvq").withDisplayName("bmdg")
                            .withDocumentationUrl("jfddgmbmbe").withDataSchemaUrl("pbhtqqrolfpfpsa"),
                        "vpys",
                        new InlineEventProperties().withDescription("gzjaoyfhrtxilne").withDisplayName("ujysvle")
                            .withDocumentationUrl("vfqawrlyxwjkcpr").withDataSchemaUrl("wbxgjvt")))));
        model = BinaryData.fromObject(model).toObject(ChannelUpdateParameters.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-27T18:55:51Z"), model.expirationTimeIfNotActivatedUtc());
        Assertions.assertEquals(EventDefinitionKind.INLINE, model.partnerTopicInfo().eventTypeInfo().kind());
        Assertions.assertEquals("rtumkdosvq",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("gbquxigj").description());
        Assertions.assertEquals("bmdg",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("gbquxigj").displayName());
        Assertions.assertEquals("jfddgmbmbe",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("gbquxigj").documentationUrl());
        Assertions.assertEquals("pbhtqqrolfpfpsa",
            model.partnerTopicInfo().eventTypeInfo().inlineEventTypes().get("gbquxigj").dataSchemaUrl());
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
