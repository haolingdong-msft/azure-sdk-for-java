// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.ComputeNodeIdentityReference;
import com.azure.resourcemanager.batch.models.ResourceFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ResourceFileTests {
    @Test
    public void testDeserialize() {
        ResourceFile model =
            BinaryData
                .fromString(
                    "{\"autoStorageContainerName\":\"ljphuopxodl\",\"storageContainerUrl\":\"ynt\",\"httpUrl\":\"zihleosjswsr\",\"blobPrefix\":\"lyzrpzbchckqqzqi\",\"filePath\":\"iysui\",\"fileMode\":\"ynkedyatrwyhqmib\",\"identityReference\":{\"resourceId\":\"wit\"}}")
                .toObject(ResourceFile.class);
        Assertions.assertEquals("ljphuopxodl", model.autoStorageContainerName());
        Assertions.assertEquals("ynt", model.storageContainerUrl());
        Assertions.assertEquals("zihleosjswsr", model.httpUrl());
        Assertions.assertEquals("lyzrpzbchckqqzqi", model.blobPrefix());
        Assertions.assertEquals("iysui", model.filePath());
        Assertions.assertEquals("ynkedyatrwyhqmib", model.fileMode());
        Assertions.assertEquals("wit", model.identityReference().resourceId());
    }

    @Test
    public void testSerialize() {
        ResourceFile model =
            new ResourceFile()
                .withAutoStorageContainerName("ljphuopxodl")
                .withStorageContainerUrl("ynt")
                .withHttpUrl("zihleosjswsr")
                .withBlobPrefix("lyzrpzbchckqqzqi")
                .withFilePath("iysui")
                .withFileMode("ynkedyatrwyhqmib")
                .withIdentityReference(new ComputeNodeIdentityReference().withResourceId("wit"));
        model = BinaryData.fromObject(model).toObject(ResourceFile.class);
        Assertions.assertEquals("ljphuopxodl", model.autoStorageContainerName());
        Assertions.assertEquals("ynt", model.storageContainerUrl());
        Assertions.assertEquals("zihleosjswsr", model.httpUrl());
        Assertions.assertEquals("lyzrpzbchckqqzqi", model.blobPrefix());
        Assertions.assertEquals("iysui", model.filePath());
        Assertions.assertEquals("ynkedyatrwyhqmib", model.fileMode());
        Assertions.assertEquals("wit", model.identityReference().resourceId());
    }
}
