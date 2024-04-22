// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ConnectionType;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.MapperConnection;
import com.azure.resourcemanager.datafactory.models.MapperDslConnectorProperties;
import com.azure.resourcemanager.datafactory.models.MapperSourceConnectionsInfo;
import com.azure.resourcemanager.datafactory.models.MapperTable;
import com.azure.resourcemanager.datafactory.models.MapperTableSchema;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MapperSourceConnectionsInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MapperSourceConnectionsInfo model = BinaryData.fromString(
            "{\"sourceEntities\":[{\"name\":\"dkadppyibn\",\"properties\":{\"schema\":[{\"name\":\"ywrxw\",\"dataType\":\"dtluvvadswzsn\"},{\"name\":\"emlowuowhl\",\"dataType\":\"nwyrmouv\"},{\"name\":\"gmokzkltrfowt\",\"dataType\":\"rfmvlihcvjdrqcrj\"}],\"dslConnectorProperties\":[{\"name\":\"tuk\",\"value\":\"datadxlwyojbfqz\"}]}},{\"name\":\"fnjyix\",\"properties\":{\"schema\":[{\"name\":\"tqxmbj\",\"dataType\":\"umzznvalqjrhuz\"},{\"name\":\"xonjtpusl\",\"dataType\":\"wpvtiotzbpdbol\"},{\"name\":\"ryf\",\"dataType\":\"uasigr\"}],\"dslConnectorProperties\":[{\"name\":\"c\",\"value\":\"dataquygdjboqgrmtq\"},{\"name\":\"qevadrmmw\",\"value\":\"dataawvcmjzkxiid\"},{\"name\":\"czskoswoqiqazu\",\"value\":\"datamxzkr\"},{\"name\":\"oiisbamnppcce\",\"value\":\"dataztdsbeza\"}]}},{\"name\":\"f\",\"properties\":{\"schema\":[{\"name\":\"izhyhnep\",\"dataType\":\"etiarxqiubxdukec\"},{\"name\":\"dazvdhctm\",\"dataType\":\"os\"},{\"name\":\"dblnsntrp\",\"dataType\":\"qkio\"},{\"name\":\"btfmhklbnldpvcbh\",\"dataType\":\"zyqu\"}],\"dslConnectorProperties\":[{\"name\":\"xut\",\"value\":\"databrruyuuatv\"},{\"name\":\"bjwcolbmx\",\"value\":\"datanwtpcpahprz\"}]}},{\"name\":\"xhmtfhocnxzc\",\"properties\":{\"schema\":[{\"name\":\"xnoqrxtdisn\",\"dataType\":\"vhdl\"},{\"name\":\"did\",\"dataType\":\"epfwwt\"}],\"dslConnectorProperties\":[{\"name\":\"esxxhmwcdbckyoi\",\"value\":\"datakxhnegknj\"},{\"name\":\"bhtmeplvuk\",\"value\":\"databrlbpgs\"},{\"name\":\"agnchjhgemuowaky\",\"value\":\"datalhjym\"}]}}],\"connection\":{\"linkedService\":{\"referenceName\":\"qt\",\"parameters\":{\"jomevtfycnlb\":\"datarclsso\",\"kk\":\"datagjco\",\"ytssikiz\":\"dataji\"}},\"linkedServiceType\":\"ufqbvntnr\",\"type\":\"linkedservicetype\",\"isInlineDataset\":false,\"commonDslConnectorProperties\":[{\"name\":\"cekxgnly\",\"value\":\"dataxcpwzvmdok\"},{\"name\":\"dt\",\"value\":\"datalwxlboncqbazq\"},{\"name\":\"qchygtv\",\"value\":\"datayjanepubdp\"}]}}")
            .toObject(MapperSourceConnectionsInfo.class);
        Assertions.assertEquals("dkadppyibn", model.sourceEntities().get(0).name());
        Assertions.assertEquals("ywrxw", model.sourceEntities().get(0).schema().get(0).name());
        Assertions.assertEquals("dtluvvadswzsn", model.sourceEntities().get(0).schema().get(0).dataType());
        Assertions.assertEquals("tuk", model.sourceEntities().get(0).dslConnectorProperties().get(0).name());
        Assertions.assertEquals("qt", model.connection().linkedService().referenceName());
        Assertions.assertEquals("ufqbvntnr", model.connection().linkedServiceType());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE, model.connection().type());
        Assertions.assertEquals(false, model.connection().isInlineDataset());
        Assertions.assertEquals("cekxgnly", model.connection().commonDslConnectorProperties().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MapperSourceConnectionsInfo model = new MapperSourceConnectionsInfo()
            .withSourceEntities(Arrays.asList(
                new MapperTable().withName("dkadppyibn")
                    .withSchema(Arrays.asList(new MapperTableSchema().withName("ywrxw").withDataType("dtluvvadswzsn"),
                        new MapperTableSchema().withName("emlowuowhl").withDataType("nwyrmouv"),
                        new MapperTableSchema().withName("gmokzkltrfowt").withDataType("rfmvlihcvjdrqcrj")))
                    .withDslConnectorProperties(
                        Arrays.asList(new MapperDslConnectorProperties().withName("tuk").withValue("datadxlwyojbfqz"))),
                new MapperTable().withName("fnjyix")
                    .withSchema(Arrays.asList(new MapperTableSchema().withName("tqxmbj").withDataType("umzznvalqjrhuz"),
                        new MapperTableSchema().withName("xonjtpusl").withDataType("wpvtiotzbpdbol"),
                        new MapperTableSchema().withName("ryf").withDataType("uasigr")))
                    .withDslConnectorProperties(Arrays.asList(
                        new MapperDslConnectorProperties().withName("c").withValue("dataquygdjboqgrmtq"),
                        new MapperDslConnectorProperties().withName("qevadrmmw").withValue("dataawvcmjzkxiid"),
                        new MapperDslConnectorProperties().withName("czskoswoqiqazu").withValue("datamxzkr"),
                        new MapperDslConnectorProperties().withName("oiisbamnppcce").withValue("dataztdsbeza"))),
                new MapperTable().withName("f")
                    .withSchema(
                        Arrays.asList(new MapperTableSchema().withName("izhyhnep").withDataType("etiarxqiubxdukec"),
                            new MapperTableSchema().withName("dazvdhctm").withDataType("os"),
                            new MapperTableSchema().withName("dblnsntrp").withDataType("qkio"),
                            new MapperTableSchema().withName("btfmhklbnldpvcbh").withDataType("zyqu")))
                    .withDslConnectorProperties(
                        Arrays.asList(new MapperDslConnectorProperties().withName("xut").withValue("databrruyuuatv"),
                            new MapperDslConnectorProperties().withName("bjwcolbmx").withValue("datanwtpcpahprz"))),
                new MapperTable().withName("xhmtfhocnxzc")
                    .withSchema(Arrays.asList(new MapperTableSchema().withName("xnoqrxtdisn").withDataType("vhdl"),
                        new MapperTableSchema().withName("did").withDataType("epfwwt")))
                    .withDslConnectorProperties(Arrays.asList(
                        new MapperDslConnectorProperties().withName("esxxhmwcdbckyoi").withValue("datakxhnegknj"),
                        new MapperDslConnectorProperties().withName("bhtmeplvuk").withValue("databrlbpgs"),
                        new MapperDslConnectorProperties().withName("agnchjhgemuowaky").withValue("datalhjym")))))
            .withConnection(
                new MapperConnection()
                    .withLinkedService(new LinkedServiceReference().withReferenceName("qt")
                        .withParameters(mapOf("jomevtfycnlb", "datarclsso", "kk", "datagjco", "ytssikiz", "dataji")))
                    .withLinkedServiceType("ufqbvntnr")
                    .withType(ConnectionType.LINKEDSERVICETYPE)
                    .withIsInlineDataset(false)
                    .withCommonDslConnectorProperties(Arrays.asList(
                        new MapperDslConnectorProperties().withName("cekxgnly").withValue("dataxcpwzvmdok"),
                        new MapperDslConnectorProperties().withName("dt").withValue("datalwxlboncqbazq"),
                        new MapperDslConnectorProperties().withName("qchygtv").withValue("datayjanepubdp"))));
        model = BinaryData.fromObject(model).toObject(MapperSourceConnectionsInfo.class);
        Assertions.assertEquals("dkadppyibn", model.sourceEntities().get(0).name());
        Assertions.assertEquals("ywrxw", model.sourceEntities().get(0).schema().get(0).name());
        Assertions.assertEquals("dtluvvadswzsn", model.sourceEntities().get(0).schema().get(0).dataType());
        Assertions.assertEquals("tuk", model.sourceEntities().get(0).dslConnectorProperties().get(0).name());
        Assertions.assertEquals("qt", model.connection().linkedService().referenceName());
        Assertions.assertEquals("ufqbvntnr", model.connection().linkedServiceType());
        Assertions.assertEquals(ConnectionType.LINKEDSERVICETYPE, model.connection().type());
        Assertions.assertEquals(false, model.connection().isInlineDataset());
        Assertions.assertEquals("cekxgnly", model.connection().commonDslConnectorProperties().get(0).name());
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
