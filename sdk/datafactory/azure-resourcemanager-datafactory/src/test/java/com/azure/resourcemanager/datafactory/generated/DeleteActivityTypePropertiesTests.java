// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.DeleteActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.LogStorageSettings;
import com.azure.resourcemanager.datafactory.models.StoreReadSettings;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class DeleteActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DeleteActivityTypeProperties model = BinaryData.fromString(
            "{\"recursive\":\"databxgkudioumgv\",\"maxConcurrentConnections\":2061944926,\"enableLogging\":\"datazheqvzwumm\",\"logStorageSettings\":{\"linkedServiceName\":{\"referenceName\":\"ax\",\"parameters\":{\"iwkqr\":\"dataihgcdujhz\",\"l\":\"datatrmi\"}},\"path\":\"datazdukamt\",\"logLevel\":\"dataufvabci\",\"enableReliableLogging\":\"databyfs\",\"\":{\"sfrajpyuw\":\"datawgkozl\",\"lsungzvytbq\":\"dataggfgl\",\"qhugjeaetgmmf\":\"datamxkuyyrcqs\",\"upkpyzaenarfy\":\"datafdqoepwyy\"}},\"dataset\":{\"referenceName\":\"lqiykhoygfgchlc\",\"parameters\":{\"kl\":\"datacsskgug\",\"fawfeeatvnmm\":\"datahmymkcccl\",\"wtcllzwaz\":\"datagowfqrykikhf\"}},\"storeSettings\":{\"type\":\"StoreReadSettings\",\"maxConcurrentConnections\":\"datah\",\"disableMetricsCollection\":\"datamkfy\",\"\":{\"znf\":\"dataavfsehbxbqionnq\",\"pvxcqj\":\"dataiboyexjcrwwdtey\",\"mv\":\"datawtiasfbp\"}}}")
            .toObject(DeleteActivityTypeProperties.class);
        Assertions.assertEquals(2061944926, model.maxConcurrentConnections());
        Assertions.assertEquals("ax", model.logStorageSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("lqiykhoygfgchlc", model.dataset().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DeleteActivityTypeProperties model = new DeleteActivityTypeProperties().withRecursive("databxgkudioumgv")
            .withMaxConcurrentConnections(2061944926).withEnableLogging("datazheqvzwumm")
            .withLogStorageSettings(new LogStorageSettings()
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ax")
                    .withParameters(mapOf("iwkqr", "dataihgcdujhz", "l", "datatrmi")))
                .withPath("datazdukamt").withLogLevel("dataufvabci").withEnableReliableLogging("databyfs")
                .withAdditionalProperties(mapOf()))
            .withDataset(new DatasetReference().withReferenceName("lqiykhoygfgchlc").withParameters(
                mapOf("kl", "datacsskgug", "fawfeeatvnmm", "datahmymkcccl", "wtcllzwaz", "datagowfqrykikhf")))
            .withStoreSettings(new StoreReadSettings().withMaxConcurrentConnections("datah")
                .withDisableMetricsCollection("datamkfy").withAdditionalProperties(mapOf("type", "StoreReadSettings")));
        model = BinaryData.fromObject(model).toObject(DeleteActivityTypeProperties.class);
        Assertions.assertEquals(2061944926, model.maxConcurrentConnections());
        Assertions.assertEquals("ax", model.logStorageSettings().linkedServiceName().referenceName());
        Assertions.assertEquals("lqiykhoygfgchlc", model.dataset().referenceName());
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
