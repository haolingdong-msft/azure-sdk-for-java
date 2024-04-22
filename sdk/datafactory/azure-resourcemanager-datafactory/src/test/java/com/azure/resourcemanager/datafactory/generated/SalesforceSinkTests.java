// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SalesforceSink;
import com.azure.resourcemanager.datafactory.models.SalesforceSinkWriteBehavior;
import org.junit.jupiter.api.Assertions;

public final class SalesforceSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceSink model = BinaryData.fromString(
            "{\"type\":\"qhcps\",\"writeBehavior\":\"Upsert\",\"externalIdFieldName\":\"datajohx\",\"ignoreNullValues\":\"datahvjo\",\"writeBatchSize\":\"datacdgcvf\",\"writeBatchTimeout\":\"datavxkcyhkhw\",\"sinkRetryCount\":\"datavwfo\",\"sinkRetryWait\":\"datacgrwl\",\"maxConcurrentConnections\":\"datarcovqtydf\",\"disableMetricsCollection\":\"datatkrgagxzmr\",\"\":{\"wrhoma\":\"datagzslnnc\",\"up\":\"datavni\"}}")
            .toObject(SalesforceSink.class);
        Assertions.assertEquals(SalesforceSinkWriteBehavior.UPSERT, model.writeBehavior());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceSink model = new SalesforceSink().withWriteBatchSize("datacdgcvf")
            .withWriteBatchTimeout("datavxkcyhkhw")
            .withSinkRetryCount("datavwfo")
            .withSinkRetryWait("datacgrwl")
            .withMaxConcurrentConnections("datarcovqtydf")
            .withDisableMetricsCollection("datatkrgagxzmr")
            .withWriteBehavior(SalesforceSinkWriteBehavior.UPSERT)
            .withExternalIdFieldName("datajohx")
            .withIgnoreNullValues("datahvjo");
        model = BinaryData.fromObject(model).toObject(SalesforceSink.class);
        Assertions.assertEquals(SalesforceSinkWriteBehavior.UPSERT, model.writeBehavior());
    }
}
