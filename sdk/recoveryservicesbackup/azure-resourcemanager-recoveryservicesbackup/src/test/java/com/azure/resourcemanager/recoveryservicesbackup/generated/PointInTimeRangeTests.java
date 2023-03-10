// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.PointInTimeRange;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class PointInTimeRangeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PointInTimeRange model =
            BinaryData
                .fromString("{\"startTime\":\"2021-08-15T17:15:42Z\",\"endTime\":\"2021-11-06T16:53:49Z\"}")
                .toObject(PointInTimeRange.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-15T17:15:42Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-06T16:53:49Z"), model.endTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PointInTimeRange model =
            new PointInTimeRange()
                .withStartTime(OffsetDateTime.parse("2021-08-15T17:15:42Z"))
                .withEndTime(OffsetDateTime.parse("2021-11-06T16:53:49Z"));
        model = BinaryData.fromObject(model).toObject(PointInTimeRange.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-15T17:15:42Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-06T16:53:49Z"), model.endTime());
    }
}
