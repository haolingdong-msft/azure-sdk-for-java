// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.TeradataPartitionSettings;
import com.azure.resourcemanager.datafactory.models.TeradataSource;

public final class TeradataSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TeradataSource model = BinaryData.fromString(
            "{\"type\":\"moyxdigkggzmyl\",\"query\":\"datakqiqsriubem\",\"partitionOption\":\"datauygmrenrbn\",\"partitionSettings\":{\"partitionColumnName\":\"datafmophtkyzsgayn\",\"partitionUpperBound\":\"dataowvcnvf\",\"partitionLowerBound\":\"dataxqhysuapdns\"},\"queryTimeout\":\"dataycjdnio\",\"additionalColumns\":\"datagyxmpmsacbamtoqs\",\"sourceRetryCount\":\"dataqeosx\",\"sourceRetryWait\":\"dataxilefiottdawgka\",\"maxConcurrentConnections\":\"datah\",\"disableMetricsCollection\":\"datatyhypi\",\"\":{\"nkkxoicb\":\"datajjfcysk\",\"pmvppvgrigjegrl\":\"datasmfvltbocqhv\"}}")
            .toObject(TeradataSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TeradataSource model = new TeradataSource().withSourceRetryCount("dataqeosx")
            .withSourceRetryWait("dataxilefiottdawgka")
            .withMaxConcurrentConnections("datah")
            .withDisableMetricsCollection("datatyhypi")
            .withQueryTimeout("dataycjdnio")
            .withAdditionalColumns("datagyxmpmsacbamtoqs")
            .withQuery("datakqiqsriubem")
            .withPartitionOption("datauygmrenrbn")
            .withPartitionSettings(new TeradataPartitionSettings().withPartitionColumnName("datafmophtkyzsgayn")
                .withPartitionUpperBound("dataowvcnvf")
                .withPartitionLowerBound("dataxqhysuapdns"));
        model = BinaryData.fromObject(model).toObject(TeradataSource.class);
    }
}
