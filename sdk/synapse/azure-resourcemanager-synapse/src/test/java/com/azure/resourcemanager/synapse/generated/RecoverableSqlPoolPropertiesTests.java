// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.RecoverableSqlPoolProperties;

public final class RecoverableSqlPoolPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RecoverableSqlPoolProperties model =
            BinaryData
                .fromString(
                    "{\"edition\":\"kb\",\"serviceLevelObjective\":\"pfajnjwltlwtjj\",\"elasticPoolName\":\"ktalhsnvkcdmxz\",\"lastAvailableBackupDate\":\"2021-05-04T00:50:01Z\"}")
                .toObject(RecoverableSqlPoolProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RecoverableSqlPoolProperties model = new RecoverableSqlPoolProperties();
        model = BinaryData.fromObject(model).toObject(RecoverableSqlPoolProperties.class);
    }
}
