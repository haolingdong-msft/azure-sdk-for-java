// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureIaaSvmJobTaskDetails;
import java.time.Duration;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class AzureIaaSvmJobTaskDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureIaaSvmJobTaskDetails model =
            BinaryData
                .fromString(
                    "{\"taskId\":\"nizshqvcim\",\"startTime\":\"2021-12-04T05:53:02Z\",\"endTime\":\"2021-02-23T02:47:27Z\",\"instanceId\":\"b\",\"duration\":\"PT19H5M11S\",\"status\":\"lbywdxsm\",\"progressPercentage\":31.605477205960717,\"taskExecutionDetails\":\"wfscjfn\"}")
                .toObject(AzureIaaSvmJobTaskDetails.class);
        Assertions.assertEquals("nizshqvcim", model.taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-04T05:53:02Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-23T02:47:27Z"), model.endTime());
        Assertions.assertEquals("b", model.instanceId());
        Assertions.assertEquals(Duration.parse("PT19H5M11S"), model.duration());
        Assertions.assertEquals("lbywdxsm", model.status());
        Assertions.assertEquals(31.605477205960717D, model.progressPercentage());
        Assertions.assertEquals("wfscjfn", model.taskExecutionDetails());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureIaaSvmJobTaskDetails model =
            new AzureIaaSvmJobTaskDetails()
                .withTaskId("nizshqvcim")
                .withStartTime(OffsetDateTime.parse("2021-12-04T05:53:02Z"))
                .withEndTime(OffsetDateTime.parse("2021-02-23T02:47:27Z"))
                .withInstanceId("b")
                .withDuration(Duration.parse("PT19H5M11S"))
                .withStatus("lbywdxsm")
                .withProgressPercentage(31.605477205960717D)
                .withTaskExecutionDetails("wfscjfn");
        model = BinaryData.fromObject(model).toObject(AzureIaaSvmJobTaskDetails.class);
        Assertions.assertEquals("nizshqvcim", model.taskId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-04T05:53:02Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-23T02:47:27Z"), model.endTime());
        Assertions.assertEquals("b", model.instanceId());
        Assertions.assertEquals(Duration.parse("PT19H5M11S"), model.duration());
        Assertions.assertEquals("lbywdxsm", model.status());
        Assertions.assertEquals(31.605477205960717D, model.progressPercentage());
        Assertions.assertEquals("wfscjfn", model.taskExecutionDetails());
    }
}
