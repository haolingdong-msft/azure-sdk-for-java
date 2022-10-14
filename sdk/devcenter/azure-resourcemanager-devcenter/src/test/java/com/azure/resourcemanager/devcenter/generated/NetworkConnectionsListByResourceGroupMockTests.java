// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.DevCenterManager;
import com.azure.resourcemanager.devcenter.models.DomainJoinType;
import com.azure.resourcemanager.devcenter.models.NetworkConnection;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class NetworkConnectionsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"pdvjdhttzaefedx\",\"healthCheckStatus\":\"Failed\",\"networkingResourceGroupName\":\"rphkmcrjdqnsdfz\",\"domainJoinType\":\"HybridAzureADJoin\",\"subnetId\":\"tg\",\"domainName\":\"lkdghr\",\"organizationUnit\":\"uutlwxezwzhok\",\"domainUsername\":\"wnhhtqlgehgppip\",\"domainPassword\":\"hpfeoajvgcxtxjc\"},\"location\":\"eafidltugsresm\",\"tags\":{\"rhptilluc\":\"jhoiftxfkfweg\",\"cwsldri\":\"iqtgdqoh\",\"bphbqzmizakakank\":\"etpwbralll\",\"n\":\"p\"},\"id\":\"zhajoylhjlmuo\",\"name\":\"xprimrsop\",\"type\":\"eecjmeis\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        DevCenterManager manager =
            DevCenterManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<NetworkConnection> response =
            manager.networkConnections().listByResourceGroup("nwm", 729391291, Context.NONE);

        Assertions.assertEquals("eafidltugsresm", response.iterator().next().location());
        Assertions.assertEquals("jhoiftxfkfweg", response.iterator().next().tags().get("rhptilluc"));
        Assertions.assertEquals("rphkmcrjdqnsdfz", response.iterator().next().networkingResourceGroupName());
        Assertions.assertEquals(DomainJoinType.HYBRID_AZURE_ADJOIN, response.iterator().next().domainJoinType());
        Assertions.assertEquals("tg", response.iterator().next().subnetId());
        Assertions.assertEquals("lkdghr", response.iterator().next().domainName());
        Assertions.assertEquals("uutlwxezwzhok", response.iterator().next().organizationUnit());
        Assertions.assertEquals("wnhhtqlgehgppip", response.iterator().next().domainUsername());
        Assertions.assertEquals("hpfeoajvgcxtxjc", response.iterator().next().domainPassword());
    }
}
