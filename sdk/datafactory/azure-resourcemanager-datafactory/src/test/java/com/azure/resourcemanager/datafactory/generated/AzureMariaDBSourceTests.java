// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureMariaDBSource;

public final class AzureMariaDBSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMariaDBSource model = BinaryData.fromString(
            "{\"type\":\"grtse\",\"query\":\"datarpjonmins\",\"queryTimeout\":\"datayigfdppgkk\",\"additionalColumns\":\"dataygjldljgd\",\"sourceRetryCount\":\"dataow\",\"sourceRetryWait\":\"dataxkofmtfwcu\",\"maxConcurrentConnections\":\"databnapzfdzmr\",\"disableMetricsCollection\":\"datarbclj\",\"\":{\"skjbasmrdpbmoq\":\"dataaawnzzlfve\",\"apmeomcpvmakdtg\":\"datasvukgfzby\",\"myewbfo\":\"datanyubnw\",\"etj\":\"datawv\"}}")
            .toObject(AzureMariaDBSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMariaDBSource model = new AzureMariaDBSource().withSourceRetryCount("dataow")
            .withSourceRetryWait("dataxkofmtfwcu")
            .withMaxConcurrentConnections("databnapzfdzmr")
            .withDisableMetricsCollection("datarbclj")
            .withQueryTimeout("datayigfdppgkk")
            .withAdditionalColumns("dataygjldljgd")
            .withQuery("datarpjonmins");
        model = BinaryData.fromObject(model).toObject(AzureMariaDBSource.class);
    }
}
