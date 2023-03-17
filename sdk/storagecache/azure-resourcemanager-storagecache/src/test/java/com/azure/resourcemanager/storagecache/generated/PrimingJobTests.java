// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.PrimingJob;
import org.junit.jupiter.api.Assertions;

public final class PrimingJobTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrimingJob model =
            BinaryData
                .fromString(
                    "{\"primingJobName\":\"cnjbkcnxdhbt\",\"primingManifestUrl\":\"kphywpnvjto\",\"primingJobId\":\"ermclfplphoxuscr\",\"primingJobState\":\"Running\",\"primingJobStatus\":\"ye\",\"primingJobDetails\":\"bjtazqugxywpmu\",\"primingJobPercentComplete\":17.17857902556815}")
                .toObject(PrimingJob.class);
        Assertions.assertEquals("cnjbkcnxdhbt", model.primingJobName());
        Assertions.assertEquals("kphywpnvjto", model.primingManifestUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrimingJob model = new PrimingJob().withPrimingJobName("cnjbkcnxdhbt").withPrimingManifestUrl("kphywpnvjto");
        model = BinaryData.fromObject(model).toObject(PrimingJob.class);
        Assertions.assertEquals("cnjbkcnxdhbt", model.primingJobName());
        Assertions.assertEquals("kphywpnvjto", model.primingManifestUrl());
    }
}
