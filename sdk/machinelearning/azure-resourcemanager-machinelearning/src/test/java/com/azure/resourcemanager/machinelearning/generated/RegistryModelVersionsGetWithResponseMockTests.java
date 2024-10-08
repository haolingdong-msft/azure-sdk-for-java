// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.machinelearning.MachineLearningManager;
import com.azure.resourcemanager.machinelearning.models.ModelVersion;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class RegistryModelVersionsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"flavors\":{\"pmonxdwf\":{\"data\":{\"qtfkmvzr\":\"svsyltap\"}},\"subehztbejrdzwyk\":{\"data\":{\"zene\":\"bgftfvqukkm\",\"jylwqqsemjhhx\":\"pdq\"}}},\"modelType\":\"pfzwufifnj\",\"modelUri\":\"hmjkykqf\",\"jobName\":\"mcyk\",\"provisioningState\":\"Canceled\",\"stage\":\"mkbndnrihpjax\",\"isArchived\":false,\"isAnonymous\":true,\"description\":\"noignydlkrnpsb\",\"tags\":{\"pfgwdxmiaelnpbi\":\"mhkipjardv\"},\"properties\":{\"skjvaycxrwknsbg\":\"unddvjlpbjszqj\"}},\"id\":\"pbrzwi\",\"name\":\"pzcyhk\",\"type\":\"cebtpgvut\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MachineLearningManager manager = MachineLearningManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ModelVersion response = manager.registryModelVersions()
            .getWithResponse("gxzty", "c", "d", "lspgnndefyhsb", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("noignydlkrnpsb", response.properties().description());
        Assertions.assertEquals("mhkipjardv", response.properties().tags().get("pfgwdxmiaelnpbi"));
        Assertions.assertEquals("unddvjlpbjszqj", response.properties().properties().get("skjvaycxrwknsbg"));
        Assertions.assertEquals(false, response.properties().isArchived());
        Assertions.assertEquals(true, response.properties().isAnonymous());
        Assertions.assertEquals("svsyltap", response.properties().flavors().get("pmonxdwf").data().get("qtfkmvzr"));
        Assertions.assertEquals("pfzwufifnj", response.properties().modelType());
        Assertions.assertEquals("hmjkykqf", response.properties().modelUri());
        Assertions.assertEquals("mcyk", response.properties().jobName());
        Assertions.assertEquals("mkbndnrihpjax", response.properties().stage());
    }
}
