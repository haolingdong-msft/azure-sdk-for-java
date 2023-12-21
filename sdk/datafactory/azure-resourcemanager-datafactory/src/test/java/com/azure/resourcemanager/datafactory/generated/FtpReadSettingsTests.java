// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FtpReadSettings;

public final class FtpReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FtpReadSettings model = BinaryData.fromString(
            "{\"type\":\"FtpReadSettings\",\"recursive\":\"datanpwgchl\",\"wildcardFolderPath\":\"datattxfitt\",\"wildcardFileName\":\"dataaxq\",\"enablePartitionDiscovery\":\"dataflnl\",\"partitionRootPath\":\"dataacss\",\"deleteFilesAfterCompletion\":\"datallfukqurrtcfgq\",\"fileListPath\":\"dataxyrsle\",\"useBinaryTransfer\":\"dataozsmjjsvymozr\",\"disableChunking\":\"datayv\",\"maxConcurrentConnections\":\"datamspjqafsxvqqu\",\"disableMetricsCollection\":\"dataoblxxksputi\",\"\":{\"sdolodfodokhaog\":\"datavihg\"}}")
            .toObject(FtpReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FtpReadSettings model = new FtpReadSettings().withMaxConcurrentConnections("datamspjqafsxvqqu")
            .withDisableMetricsCollection("dataoblxxksputi").withRecursive("datanpwgchl")
            .withWildcardFolderPath("datattxfitt").withWildcardFileName("dataaxq")
            .withEnablePartitionDiscovery("dataflnl").withPartitionRootPath("dataacss")
            .withDeleteFilesAfterCompletion("datallfukqurrtcfgq").withFileListPath("dataxyrsle")
            .withUseBinaryTransfer("dataozsmjjsvymozr").withDisableChunking("datayv");
        model = BinaryData.fromObject(model).toObject(FtpReadSettings.class);
    }
}
