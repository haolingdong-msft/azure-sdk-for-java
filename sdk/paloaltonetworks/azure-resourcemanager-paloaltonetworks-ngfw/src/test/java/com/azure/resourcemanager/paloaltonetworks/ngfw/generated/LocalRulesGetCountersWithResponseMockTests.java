// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.paloaltonetworks.ngfw.NgfwManager;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.RuleCounter;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LocalRulesGetCountersWithResponseMockTests {
    @Test
    public void testGetCountersWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"priority\":\"mrdixtreki\",\"ruleStackName\":\"wyskbruffgll\",\"ruleListName\":\"kutvlxhrpqhv\",\"firewallName\":\"lcouqehbhbcdszir\",\"ruleName\":\"randoypmb\",\"hitCount\":1798358498,\"appSeen\":{\"count\":1680012573,\"appSeenList\":[]},\"timestamp\":\"2021-02-21T01:52:50Z\",\"requestTimestamp\":\"2021-09-21T03:13:30Z\",\"lastUpdatedTimestamp\":\"2021-03-07T21:54:57Z\"}";

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

        RuleCounter response =
            manager
                .localRules()
                .getCountersWithResponse(
                    "in", "ofvfkakpoldtve", "boclzhzjknyuxgv", "txpnrupza", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("mrdixtreki", response.priority());
        Assertions.assertEquals("wyskbruffgll", response.ruleStackName());
        Assertions.assertEquals("kutvlxhrpqhv", response.ruleListName());
        Assertions.assertEquals("lcouqehbhbcdszir", response.firewallName());
        Assertions.assertEquals("randoypmb", response.ruleName());
        Assertions.assertEquals(1798358498, response.hitCount());
        Assertions.assertEquals(1680012573, response.appSeen().count());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-21T01:52:50Z"), response.timestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-21T03:13:30Z"), response.requestTimestamp());
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-07T21:54:57Z"), response.lastUpdatedTimestamp());
    }
}
