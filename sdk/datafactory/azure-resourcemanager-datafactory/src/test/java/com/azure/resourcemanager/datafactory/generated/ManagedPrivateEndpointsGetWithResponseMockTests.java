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
import com.azure.resourcemanager.datafactory.models.ManagedPrivateEndpointResource;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ManagedPrivateEndpointsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"connectionState\":{\"actionsRequired\":\"dy\",\"description\":\"lbwpbieeqaozoo\",\"status\":\"ouifsrjpijz\"},\"fqdns\":[\"fqb\"],\"groupId\":\"ngbqpjswucsjp\",\"isReserved\":false,\"privateLinkResourceId\":\"yoiwmvmnahgknon\",\"provisioningState\":\"msocmxfkwfpoemzb\",\"\":{\"gwp\":\"datapysopmahdsq\",\"izxqbaznrqgloe\":\"datampklawc\",\"voawisxik\":\"dataqrolkfihfairpstg\"}},\"name\":\"vrffftr\",\"type\":\"ljscmofhisdloar\",\"etag\":\"zggwuthoqn\",\"id\":\"rveyrqtdl\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ManagedPrivateEndpointResource response = manager.managedPrivateEndpoints()
            .getWithResponse("kkn", "ba", "eiclxuijmzg", "nvavpyge", "zsnixtwpkngiy", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("rveyrqtdl", response.id());
        Assertions.assertEquals("fqb", response.properties().fqdns().get(0));
        Assertions.assertEquals("ngbqpjswucsjp", response.properties().groupId());
        Assertions.assertEquals("yoiwmvmnahgknon", response.properties().privateLinkResourceId());
    }
}
