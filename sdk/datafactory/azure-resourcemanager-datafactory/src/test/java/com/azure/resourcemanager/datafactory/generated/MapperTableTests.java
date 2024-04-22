// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.MapperDslConnectorProperties;
import com.azure.resourcemanager.datafactory.models.MapperTable;
import com.azure.resourcemanager.datafactory.models.MapperTableSchema;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MapperTableTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MapperTable model = BinaryData.fromString(
            "{\"name\":\"yqvgxia\",\"properties\":{\"schema\":[{\"name\":\"ohkxdxuw\",\"dataType\":\"ifmcwnosbzlehg\"}],\"dslConnectorProperties\":[{\"name\":\"cknjolgj\",\"value\":\"dataxpvelszerqzevxo\"}]}}")
            .toObject(MapperTable.class);
        Assertions.assertEquals("yqvgxia", model.name());
        Assertions.assertEquals("ohkxdxuw", model.schema().get(0).name());
        Assertions.assertEquals("ifmcwnosbzlehg", model.schema().get(0).dataType());
        Assertions.assertEquals("cknjolgj", model.dslConnectorProperties().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MapperTable model = new MapperTable().withName("yqvgxia")
            .withSchema(Arrays.asList(new MapperTableSchema().withName("ohkxdxuw").withDataType("ifmcwnosbzlehg")))
            .withDslConnectorProperties(Arrays
                .asList(new MapperDslConnectorProperties().withName("cknjolgj").withValue("dataxpvelszerqzevxo")));
        model = BinaryData.fromObject(model).toObject(MapperTable.class);
        Assertions.assertEquals("yqvgxia", model.name());
        Assertions.assertEquals("ohkxdxuw", model.schema().get(0).name());
        Assertions.assertEquals("ifmcwnosbzlehg", model.schema().get(0).dataType());
        Assertions.assertEquals("cknjolgj", model.dslConnectorProperties().get(0).name());
    }
}
