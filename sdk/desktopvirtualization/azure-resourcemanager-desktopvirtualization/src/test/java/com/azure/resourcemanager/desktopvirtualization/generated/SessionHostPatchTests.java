// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.SessionHostPatch;
import org.junit.jupiter.api.Assertions;

public final class SessionHostPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SessionHostPatch model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"allowNewSession\":true,\"assignedUser\":\"lr\",\"friendlyName\":\"yjmoadsu\"},\"id\":\"arm\",\"name\":\"wdmjsjqbjhhyx\",\"type\":\"rw\"}")
                .toObject(SessionHostPatch.class);
        Assertions.assertEquals(true, model.allowNewSession());
        Assertions.assertEquals("lr", model.assignedUser());
        Assertions.assertEquals("yjmoadsu", model.friendlyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SessionHostPatch model =
            new SessionHostPatch().withAllowNewSession(true).withAssignedUser("lr").withFriendlyName("yjmoadsu");
        model = BinaryData.fromObject(model).toObject(SessionHostPatch.class);
        Assertions.assertEquals(true, model.allowNewSession());
        Assertions.assertEquals("lr", model.assignedUser());
        Assertions.assertEquals("yjmoadsu", model.friendlyName());
    }
}
