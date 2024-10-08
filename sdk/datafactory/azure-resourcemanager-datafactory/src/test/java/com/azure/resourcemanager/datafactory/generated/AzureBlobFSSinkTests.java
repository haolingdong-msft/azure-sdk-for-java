// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobFSSink;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import java.util.Arrays;

public final class AzureBlobFSSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureBlobFSSink model = BinaryData.fromString(
            "{\"type\":\"AzureBlobFSSink\",\"copyBehavior\":\"datasa\",\"metadata\":[{\"name\":\"datamcaxgtwpzqtimq\",\"value\":\"datasfaqy\"}],\"writeBatchSize\":\"datacpdtktfpjkxk\",\"writeBatchTimeout\":\"datawntnfoqwufor\",\"sinkRetryCount\":\"databe\",\"sinkRetryWait\":\"dataipnsyedpyrpips\",\"maxConcurrentConnections\":\"datafwgrz\",\"disableMetricsCollection\":\"datafbodifgh\",\"\":{\"cxoqxtjzdpl\":\"datayh\",\"osoxxoqyikdjaog\":\"datagllvkor\",\"lg\":\"datattxqxvmybq\"}}")
            .toObject(AzureBlobFSSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureBlobFSSink model = new AzureBlobFSSink().withWriteBatchSize("datacpdtktfpjkxk")
            .withWriteBatchTimeout("datawntnfoqwufor")
            .withSinkRetryCount("databe")
            .withSinkRetryWait("dataipnsyedpyrpips")
            .withMaxConcurrentConnections("datafwgrz")
            .withDisableMetricsCollection("datafbodifgh")
            .withCopyBehavior("datasa")
            .withMetadata(Arrays.asList(new MetadataItem().withName("datamcaxgtwpzqtimq").withValue("datasfaqy")));
        model = BinaryData.fromObject(model).toObject(AzureBlobFSSink.class);
    }
}
