// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.TopicSpaceInner;
import com.azure.resourcemanager.eventgrid.models.TopicSpacesListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TopicSpacesListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TopicSpacesListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"description\":\"maupxvpi\",\"topicTemplates\":[\"aifyzyzeyuubeids\"],\"provisioningState\":\"Creating\"},\"id\":\"toi\",\"name\":\"hgygvfltgvd\",\"type\":\"hoynk\"},{\"properties\":{\"description\":\"etwkdrcyrucpc\",\"topicTemplates\":[\"uzdqumoenod\",\"aienhqhsknd\"],\"provisioningState\":\"Creating\"},\"id\":\"kaa\",\"name\":\"lknwfoanniyop\",\"type\":\"txiv\"},{\"properties\":{\"description\":\"lyxnucaephb\",\"topicTemplates\":[\"qp\",\"tv\",\"qsdtcjbctvivuzq\",\"mtuowogtgitsqhzv\"],\"provisioningState\":\"Creating\"},\"id\":\"dbanfznd\",\"name\":\"cxmxeatkdb\",\"type\":\"wnrdjyibqbnaom\"},{\"properties\":{\"description\":\"mk\",\"topicTemplates\":[\"axljal\",\"i\",\"cjmobcanc\"],\"provisioningState\":\"Failed\"},\"id\":\"qcwgaxfgvaknokz\",\"name\":\"jjzr\",\"type\":\"tixldzyyfytpqs\"}],\"nextLink\":\"ymmpujivy\"}")
            .toObject(TopicSpacesListResult.class);
        Assertions.assertEquals("maupxvpi", model.value().get(0).description());
        Assertions.assertEquals("aifyzyzeyuubeids", model.value().get(0).topicTemplates().get(0));
        Assertions.assertEquals("ymmpujivy", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TopicSpacesListResult model = new TopicSpacesListResult().withValue(Arrays.asList(
            new TopicSpaceInner().withDescription("maupxvpi").withTopicTemplates(Arrays.asList("aifyzyzeyuubeids")),
            new TopicSpaceInner().withDescription("etwkdrcyrucpc")
                .withTopicTemplates(Arrays.asList("uzdqumoenod", "aienhqhsknd")),
            new TopicSpaceInner().withDescription("lyxnucaephb")
                .withTopicTemplates(Arrays.asList("qp", "tv", "qsdtcjbctvivuzq", "mtuowogtgitsqhzv")),
            new TopicSpaceInner().withDescription("mk").withTopicTemplates(Arrays.asList("axljal", "i", "cjmobcanc"))))
            .withNextLink("ymmpujivy");
        model = BinaryData.fromObject(model).toObject(TopicSpacesListResult.class);
        Assertions.assertEquals("maupxvpi", model.value().get(0).description());
        Assertions.assertEquals("aifyzyzeyuubeids", model.value().get(0).topicTemplates().get(0));
        Assertions.assertEquals("ymmpujivy", model.nextLink());
    }
}
