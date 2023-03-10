// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.LongTermSchedulePolicy;

public final class LongTermSchedulePolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LongTermSchedulePolicy model =
            BinaryData
                .fromString("{\"schedulePolicyType\":\"LongTermSchedulePolicy\"}")
                .toObject(LongTermSchedulePolicy.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LongTermSchedulePolicy model = new LongTermSchedulePolicy();
        model = BinaryData.fromObject(model).toObject(LongTermSchedulePolicy.class);
    }
}
