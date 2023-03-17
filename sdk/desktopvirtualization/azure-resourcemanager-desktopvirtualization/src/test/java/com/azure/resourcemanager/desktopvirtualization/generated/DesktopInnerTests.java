// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.DesktopInner;
import org.junit.jupiter.api.Assertions;

public final class DesktopInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DesktopInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"objectId\":\"qig\",\"description\":\"duhavhqlkt\",\"friendlyName\":\"maqolbgycduie\",\"iconHash\":\"gccymvaolpssl\"},\"id\":\"fmmdnbbg\",\"name\":\"zpswiydmc\",\"type\":\"yhz\"}")
                .toObject(DesktopInner.class);
        Assertions.assertEquals("duhavhqlkt", model.description());
        Assertions.assertEquals("maqolbgycduie", model.friendlyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DesktopInner model = new DesktopInner().withDescription("duhavhqlkt").withFriendlyName("maqolbgycduie");
        model = BinaryData.fromObject(model).toObject(DesktopInner.class);
        Assertions.assertEquals("duhavhqlkt", model.description());
        Assertions.assertEquals("maqolbgycduie", model.friendlyName());
    }
}
