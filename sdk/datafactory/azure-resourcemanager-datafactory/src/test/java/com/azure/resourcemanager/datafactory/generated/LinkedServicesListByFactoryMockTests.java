// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.LinkedServiceResource;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LinkedServicesListByFactoryMockTests {
    @Test
    public void testListByFactory() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"type\":\"LinkedService\",\"connectVia\":{\"referenceName\":\"sqbyubswzafqrmwd\",\"parameters\":{\"uxwvjcdjvlwczw\":\"datafspzwad\",\"fckrmrbaoidt\":\"datakkscooqnvht\",\"cbvkoughjsxp\":\"datam\"}},\"description\":\"svppfdnih\",\"parameters\":{\"z\":{\"type\":\"Bool\",\"defaultValue\":\"datatsbpvyvsc\"},\"ohfvbgjn\":{\"type\":\"SecureString\",\"defaultValue\":\"dataddaqqklvyib\"},\"j\":{\"type\":\"Bool\",\"defaultValue\":\"datalsanglwnkkz\"},\"ajyrhrywucpdzbnt\":{\"type\":\"Int\",\"defaultValue\":\"datarhjj\"}},\"annotations\":[\"datawnpuyhqayls\",\"dataehlzplzrrhab\",\"datadqnefofujzwqpkhg\",\"datadgyilo\"],\"\":{\"etrglp\":\"datakvufnphbzssa\"}},\"name\":\"cqxdvleo\",\"type\":\"vuhagoqxfxje\",\"etag\":\"oqua\",\"id\":\"dnmhrymeynbi\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        DataFactoryManager manager = DataFactoryManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<LinkedServiceResource> response
            = manager.linkedServices().listByFactory("lcalyvcxvcpxdeq", "tblt", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("dnmhrymeynbi", response.iterator().next().id());
        Assertions.assertEquals("sqbyubswzafqrmwd",
            response.iterator().next().properties().connectVia().referenceName());
        Assertions.assertEquals("svppfdnih", response.iterator().next().properties().description());
        Assertions.assertEquals(ParameterType.BOOL,
            response.iterator().next().properties().parameters().get("z").type());
    }
}
