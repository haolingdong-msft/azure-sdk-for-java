// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.BackupProperties;
import org.junit.jupiter.api.Assertions;

public final class BackupPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupProperties model = BinaryData.fromString(
            "{\"backupId\":\"qkgh\",\"creationDate\":\"2021-11-17T03:58:19Z\",\"provisioningState\":\"zwmk\",\"size\":1102306209532433694,\"label\":\"pjorwkqnyhg\",\"backupType\":\"Manual\",\"failureReason\":\"jivfxzsjabib\",\"volumeResourceId\":\"ystawfsdjpvkvp\",\"useExistingSnapshot\":true,\"snapshotName\":\"kzbzkdvncjabudu\",\"backupPolicyResourceId\":\"kakmokzh\"}")
            .toObject(BackupProperties.class);
        Assertions.assertEquals("pjorwkqnyhg", model.label());
        Assertions.assertEquals("ystawfsdjpvkvp", model.volumeResourceId());
        Assertions.assertEquals(true, model.useExistingSnapshot());
        Assertions.assertEquals("kzbzkdvncjabudu", model.snapshotName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupProperties model = new BackupProperties().withLabel("pjorwkqnyhg").withVolumeResourceId("ystawfsdjpvkvp")
            .withUseExistingSnapshot(true).withSnapshotName("kzbzkdvncjabudu");
        model = BinaryData.fromObject(model).toObject(BackupProperties.class);
        Assertions.assertEquals("pjorwkqnyhg", model.label());
        Assertions.assertEquals("ystawfsdjpvkvp", model.volumeResourceId());
        Assertions.assertEquals(true, model.useExistingSnapshot());
        Assertions.assertEquals("kzbzkdvncjabudu", model.snapshotName());
    }
}
