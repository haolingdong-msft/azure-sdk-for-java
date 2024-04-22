// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.GlobalParameterResource;
import com.azure.resourcemanager.datafactory.models.GlobalParameterSpecification;
import com.azure.resourcemanager.datafactory.models.GlobalParameterType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class GlobalParametersCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"cuieuid\":{\"type\":\"String\",\"value\":\"datauhtsnkeelunhjm\"},\"vekcv\":{\"type\":\"Array\",\"value\":\"dataeoh\"},\"ppmejdocwglrknoz\":{\"type\":\"Int\",\"value\":\"dataapwhicuafml\"},\"qcvruafsyjgvty\":{\"type\":\"Array\",\"value\":\"dataiaqtqzimllznw\"}},\"name\":\"pzdwdicauzexzl\",\"type\":\"nfrcjyulmvtej\",\"etag\":\"plavbjujbmw\",\"id\":\"d\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        GlobalParameterResource response = manager.globalParameters()
            .define("ehaky")
            .withExistingFactory("xjkkdltfdbe", "bllqi")
            .withProperties(mapOf("kz",
                new GlobalParameterSpecification().withType(GlobalParameterType.STRING).withValue("dataazjuu"),
                "wljjcsuruiwopurh",
                new GlobalParameterSpecification().withType(GlobalParameterType.ARRAY).withValue("datalko"), "o",
                new GlobalParameterSpecification().withType(GlobalParameterType.STRING).withValue("dataxtnjfmhafqt")))
            .create();

        Assertions.assertEquals("d", response.id());
        Assertions.assertEquals(GlobalParameterType.STRING, response.properties().get("cuieuid").type());
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
