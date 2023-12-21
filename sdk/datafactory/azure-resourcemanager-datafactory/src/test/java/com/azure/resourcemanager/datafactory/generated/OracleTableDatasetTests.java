// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.OracleTableDataset;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class OracleTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OracleTableDataset model = BinaryData.fromString(
            "{\"type\":\"OracleTable\",\"typeProperties\":{\"tableName\":\"datanaphifkfrpmpl\",\"schema\":\"datap\",\"table\":\"datarmj\"},\"description\":\"fpghtbttpkim\",\"structure\":\"datahnkkhbykrs\",\"schema\":\"datarcmelycpgokut\",\"linkedServiceName\":{\"referenceName\":\"rvybnz\",\"parameters\":{\"ixlvzcgul\":\"datamshfuzzlap\",\"wjt\":\"dataebxiauqsuptessj\",\"skxgxqaygas\":\"datatpvb\",\"wpvlcjbvyezjwjkq\":\"datakvc\"}},\"parameters\":{\"fpucwn\":{\"type\":\"Bool\",\"defaultValue\":\"dataiieyozvrc\"}},\"annotations\":[\"dataqefgzjvbx\",\"datacbgoarxtuuciagv\",\"datadlhuduklbjo\",\"datafmjfexulv\"],\"folder\":{\"name\":\"kna\"},\"\":{\"leqfgkxenvszg\":\"dataiancsqoacbuqdgsa\",\"eszsuuv\":\"datavya\",\"brveci\":\"datalaqcwggchxvlqg\"}}")
            .toObject(OracleTableDataset.class);
        Assertions.assertEquals("fpghtbttpkim", model.description());
        Assertions.assertEquals("rvybnz", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("fpucwn").type());
        Assertions.assertEquals("kna", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OracleTableDataset model = new OracleTableDataset().withDescription("fpghtbttpkim")
            .withStructure("datahnkkhbykrs").withSchema("datarcmelycpgokut")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("rvybnz")
                .withParameters(mapOf("ixlvzcgul", "datamshfuzzlap", "wjt", "dataebxiauqsuptessj", "skxgxqaygas",
                    "datatpvb", "wpvlcjbvyezjwjkq", "datakvc")))
            .withParameters(mapOf("fpucwn",
                new ParameterSpecification().withType(ParameterType.BOOL).withDefaultValue("dataiieyozvrc")))
            .withAnnotations(Arrays.asList("dataqefgzjvbx", "datacbgoarxtuuciagv", "datadlhuduklbjo", "datafmjfexulv"))
            .withFolder(new DatasetFolder().withName("kna")).withTableName("datanaphifkfrpmpl")
            .withSchemaTypePropertiesSchema("datap").withTable("datarmj");
        model = BinaryData.fromObject(model).toObject(OracleTableDataset.class);
        Assertions.assertEquals("fpghtbttpkim", model.description());
        Assertions.assertEquals("rvybnz", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("fpucwn").type());
        Assertions.assertEquals("kna", model.folder().name());
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
