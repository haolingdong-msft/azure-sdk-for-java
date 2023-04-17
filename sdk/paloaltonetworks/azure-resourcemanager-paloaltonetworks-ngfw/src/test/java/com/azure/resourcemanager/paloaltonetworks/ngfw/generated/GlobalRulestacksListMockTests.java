// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.paloaltonetworks.ngfw.NgfwManager;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DefaultMode;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.GlobalRulestackResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ManagedIdentityType;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ScopeType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class GlobalRulestacksListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"panEtag\":\"bjoxs\",\"panLocation\":\"vnh\",\"scope\":\"GLOBAL\",\"associatedSubscriptions\":[\"nk\"],\"description\":\"jcjbt\",\"defaultMode\":\"NONE\",\"minAppIdVersion\":\"hvv\",\"provisioningState\":\"Creating\",\"securityServices\":{\"vulnerabilityProfile\":\"jsto\",\"antiSpywareProfile\":\"eitpkxztmo\",\"antiVirusProfile\":\"klf\",\"urlFilteringProfile\":\"dgfcwqmp\",\"fileBlockingProfile\":\"aqxzhemjyho\",\"dnsSubscription\":\"jswtwkozzwc\",\"outboundUnTrustCertificate\":\"kb\",\"outboundTrustCertificate\":\"pfajnjwltlwtjj\"}},\"location\":\"uktalhsnvkcdmxz\",\"identity\":{\"tenantId\":\"aimlnwiaaom\",\"principalId\":\"weazul\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{}},\"id\":\"wwnpj\",\"name\":\"l\",\"type\":\"zswpchwa\"}]}";

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

        NgfwManager manager =
            NgfwManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<GlobalRulestackResource> response =
            manager.globalRulestacks().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("uktalhsnvkcdmxz", response.iterator().next().location());
        Assertions.assertEquals(ManagedIdentityType.SYSTEM_ASSIGNED, response.iterator().next().identity().type());
        Assertions.assertEquals("bjoxs", response.iterator().next().panEtag());
        Assertions.assertEquals("vnh", response.iterator().next().panLocation());
        Assertions.assertEquals(ScopeType.GLOBAL, response.iterator().next().scope());
        Assertions.assertEquals("nk", response.iterator().next().associatedSubscriptions().get(0));
        Assertions.assertEquals("jcjbt", response.iterator().next().description());
        Assertions.assertEquals(DefaultMode.NONE, response.iterator().next().defaultMode());
        Assertions.assertEquals("hvv", response.iterator().next().minAppIdVersion());
        Assertions.assertEquals("jsto", response.iterator().next().securityServices().vulnerabilityProfile());
        Assertions.assertEquals("eitpkxztmo", response.iterator().next().securityServices().antiSpywareProfile());
        Assertions.assertEquals("klf", response.iterator().next().securityServices().antiVirusProfile());
        Assertions.assertEquals("dgfcwqmp", response.iterator().next().securityServices().urlFilteringProfile());
        Assertions.assertEquals("aqxzhemjyho", response.iterator().next().securityServices().fileBlockingProfile());
        Assertions.assertEquals("jswtwkozzwc", response.iterator().next().securityServices().dnsSubscription());
        Assertions.assertEquals("kb", response.iterator().next().securityServices().outboundUnTrustCertificate());
        Assertions
            .assertEquals("pfajnjwltlwtjj", response.iterator().next().securityServices().outboundTrustCertificate());
    }
}
