// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.BreakFileLocksRequest;
import org.junit.jupiter.api.Assertions;

public final class BreakFileLocksRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BreakFileLocksRequest model
            = BinaryData.fromString("{\"clientIp\":\"adbzmnvdfznud\",\"confirmRunningDisruptiveOperation\":true}")
                .toObject(BreakFileLocksRequest.class);
        Assertions.assertEquals("adbzmnvdfznud", model.clientIp());
        Assertions.assertEquals(true, model.confirmRunningDisruptiveOperation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BreakFileLocksRequest model
            = new BreakFileLocksRequest().withClientIp("adbzmnvdfznud").withConfirmRunningDisruptiveOperation(true);
        model = BinaryData.fromObject(model).toObject(BreakFileLocksRequest.class);
        Assertions.assertEquals("adbzmnvdfznud", model.clientIp());
        Assertions.assertEquals(true, model.confirmRunningDisruptiveOperation());
    }
}
