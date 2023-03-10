// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.Gen1EnvironmentMutableProperties;
import com.azure.resourcemanager.timeseriesinsights.models.StorageLimitExceededBehavior;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class Gen1EnvironmentMutablePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Gen1EnvironmentMutableProperties model =
            BinaryData
                .fromString(
                    "{\"dataRetentionTime\":\"PT227H21M53S\",\"storageLimitExceededBehavior\":\"PurgeOldData\"}")
                .toObject(Gen1EnvironmentMutableProperties.class);
        Assertions.assertEquals(Duration.parse("PT227H21M53S"), model.dataRetentionTime());
        Assertions.assertEquals(StorageLimitExceededBehavior.PURGE_OLD_DATA, model.storageLimitExceededBehavior());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Gen1EnvironmentMutableProperties model =
            new Gen1EnvironmentMutableProperties()
                .withDataRetentionTime(Duration.parse("PT227H21M53S"))
                .withStorageLimitExceededBehavior(StorageLimitExceededBehavior.PURGE_OLD_DATA);
        model = BinaryData.fromObject(model).toObject(Gen1EnvironmentMutableProperties.class);
        Assertions.assertEquals(Duration.parse("PT227H21M53S"), model.dataRetentionTime());
        Assertions.assertEquals(StorageLimitExceededBehavior.PURGE_OLD_DATA, model.storageLimitExceededBehavior());
    }
}
