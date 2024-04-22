// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.SalesforceV2ObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SalesforceV2ObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SalesforceV2ObjectDataset model = BinaryData.fromString(
            "{\"type\":\"poid\",\"typeProperties\":{\"objectApiName\":\"databthutctcabc\",\"reportId\":\"dataabzfihsz\"},\"description\":\"wegvuojuwgweccvu\",\"structure\":\"dataqvfcfsssmyaemk\",\"schema\":\"databsdgktluifiqgp\",\"linkedServiceName\":{\"referenceName\":\"cpenobqysbees\",\"parameters\":{\"rszsu\":\"datavva\",\"intz\":\"datazsautbricvvofe\",\"xjpisrdnowinc\":\"datanhyyqxckd\",\"vijnubxfiiytqx\":\"dataes\"}},\"parameters\":{\"rxkivbkutogecyqo\":{\"type\":\"Bool\",\"defaultValue\":\"datautezlghkvoxdp\"},\"ya\":{\"type\":\"Object\",\"defaultValue\":\"datassbvqnpwdwdmu\"}},\"annotations\":[\"dataqpwxnb\",\"datazrmiukothyfjbpnh\"],\"folder\":{\"name\":\"r\"},\"\":{\"jioqwu\":\"datazfwgnpcjniaffwcg\",\"mwr\":\"dataogdkp\",\"yxqucnbg\":\"datauqjde\"}}")
            .toObject(SalesforceV2ObjectDataset.class);
        Assertions.assertEquals("wegvuojuwgweccvu", model.description());
        Assertions.assertEquals("cpenobqysbees", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("rxkivbkutogecyqo").type());
        Assertions.assertEquals("r", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SalesforceV2ObjectDataset model = new SalesforceV2ObjectDataset().withDescription("wegvuojuwgweccvu")
            .withStructure("dataqvfcfsssmyaemk")
            .withSchema("databsdgktluifiqgp")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("cpenobqysbees")
                .withParameters(mapOf("rszsu", "datavva", "intz", "datazsautbricvvofe", "xjpisrdnowinc",
                    "datanhyyqxckd", "vijnubxfiiytqx", "dataes")))
            .withParameters(mapOf("rxkivbkutogecyqo",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("datautezlghkvoxdp"), "ya",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datassbvqnpwdwdmu")))
            .withAnnotations(Arrays.asList("dataqpwxnb", "datazrmiukothyfjbpnh"))
            .withFolder(new DatasetFolder().withName("r"))
            .withObjectApiName("databthutctcabc")
            .withReportId("dataabzfihsz");
        model = BinaryData.fromObject(model).toObject(SalesforceV2ObjectDataset.class);
        Assertions.assertEquals("wegvuojuwgweccvu", model.description());
        Assertions.assertEquals("cpenobqysbees", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("rxkivbkutogecyqo").type());
        Assertions.assertEquals("r", model.folder().name());
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
