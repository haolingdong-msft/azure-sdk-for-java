// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.EventHandler;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentitySettings;
import com.azure.resourcemanager.webpubsub.models.UpstreamAuthSettings;
import com.azure.resourcemanager.webpubsub.models.UpstreamAuthType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class EventHandlerTests {
    @Test
    public void testDeserialize() {
        EventHandler model =
            BinaryData
                .fromString(
                    "{\"urlTemplate\":\"hxcr\",\"userEventPattern\":\"fovasr\",\"systemEvents\":[\"wbhsqfsub\"],\"auth\":{\"type\":\"None\",\"managedIdentity\":{\"resource\":\"xb\"}}}")
                .toObject(EventHandler.class);
        Assertions.assertEquals("hxcr", model.urlTemplate());
        Assertions.assertEquals("fovasr", model.userEventPattern());
        Assertions.assertEquals("wbhsqfsub", model.systemEvents().get(0));
        Assertions.assertEquals(UpstreamAuthType.NONE, model.auth().type());
        Assertions.assertEquals("xb", model.auth().managedIdentity().resource());
    }

    @Test
    public void testSerialize() {
        EventHandler model =
            new EventHandler()
                .withUrlTemplate("hxcr")
                .withUserEventPattern("fovasr")
                .withSystemEvents(Arrays.asList("wbhsqfsub"))
                .withAuth(
                    new UpstreamAuthSettings()
                        .withType(UpstreamAuthType.NONE)
                        .withManagedIdentity(new ManagedIdentitySettings().withResource("xb")));
        model = BinaryData.fromObject(model).toObject(EventHandler.class);
        Assertions.assertEquals("hxcr", model.urlTemplate());
        Assertions.assertEquals("fovasr", model.userEventPattern());
        Assertions.assertEquals("wbhsqfsub", model.systemEvents().get(0));
        Assertions.assertEquals(UpstreamAuthType.NONE, model.auth().type());
        Assertions.assertEquals("xb", model.auth().managedIdentity().resource());
    }
}
