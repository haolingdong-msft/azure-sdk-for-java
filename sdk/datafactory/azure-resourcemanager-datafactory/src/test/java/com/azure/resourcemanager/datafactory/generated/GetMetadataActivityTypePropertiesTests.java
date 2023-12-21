// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.GetMetadataActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.FormatReadSettings;
import com.azure.resourcemanager.datafactory.models.StoreReadSettings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class GetMetadataActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GetMetadataActivityTypeProperties model = BinaryData.fromString(
            "{\"dataset\":{\"referenceName\":\"xtpamwjbmrkcq\",\"parameters\":{\"tvovhuifbly\":\"datajj\",\"neusnncnnqifuhsj\":\"dataqycknqmbvssjb\",\"mplt\":\"datadu\"}},\"fieldList\":[\"datafndafrzi\",\"datajcyxzan\"],\"storeSettings\":{\"type\":\"StoreReadSettings\",\"maxConcurrentConnections\":\"dataeyvdrulhworh\",\"disableMetricsCollection\":\"datasqdvmxufrqpaw\",\"\":{\"wu\":\"datadohz\",\"hftlsfwpvflm\":\"datalae\",\"txbrj\":\"datajdu\",\"dmnymfvxfssh\":\"datapeypuq\"}},\"formatSettings\":{\"type\":\"FormatReadSettings\",\"\":{\"zdfjfnree\":\"dataeornzprdgmmgtq\",\"myuiq\":\"datapb\",\"rikdfacf\":\"datazfotfoif\"}}}")
            .toObject(GetMetadataActivityTypeProperties.class);
        Assertions.assertEquals("xtpamwjbmrkcq", model.dataset().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GetMetadataActivityTypeProperties model = new GetMetadataActivityTypeProperties()
            .withDataset(new DatasetReference().withReferenceName("xtpamwjbmrkcq").withParameters(
                mapOf("tvovhuifbly", "datajj", "neusnncnnqifuhsj", "dataqycknqmbvssjb", "mplt", "datadu")))
            .withFieldList(Arrays.asList("datafndafrzi", "datajcyxzan"))
            .withStoreSettings(new StoreReadSettings().withMaxConcurrentConnections("dataeyvdrulhworh")
                .withDisableMetricsCollection("datasqdvmxufrqpaw")
                .withAdditionalProperties(mapOf("type", "StoreReadSettings")))
            .withFormatSettings(new FormatReadSettings().withAdditionalProperties(mapOf("type", "FormatReadSettings")));
        model = BinaryData.fromObject(model).toObject(GetMetadataActivityTypeProperties.class);
        Assertions.assertEquals("xtpamwjbmrkcq", model.dataset().referenceName());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
