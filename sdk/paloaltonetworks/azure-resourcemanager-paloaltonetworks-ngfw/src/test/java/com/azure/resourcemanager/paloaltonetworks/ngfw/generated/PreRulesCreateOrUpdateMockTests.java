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
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.PreRulesResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ActionEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.BooleanEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.Category;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DecryptionRuleTypeEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DestinationAddr;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PreRulesResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SourceAddr;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.StateEnum;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PreRulesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"etag\":\"pzpofoiyjw\",\"ruleName\":\"filkmkkholv\",\"priority\":1953002350,\"description\":\"iauogphuartv\",\"ruleState\":\"ENABLED\",\"source\":{\"cidrs\":[],\"countries\":[],\"feeds\":[],\"prefixLists\":[]},\"negateSource\":\"TRUE\",\"destination\":{\"cidrs\":[],\"countries\":[],\"feeds\":[],\"prefixLists\":[],\"fqdnLists\":[]},\"negateDestination\":\"FALSE\",\"applications\":[\"jqirwrw\",\"ooxf\",\"i\"],\"category\":{\"urlCustom\":[],\"feeds\":[]},\"protocol\":\"wrsnewmozqvbu\",\"protocolPortList\":[\"amhsycxhxzgazt\"],\"inboundInspectionCertificate\":\"boi\",\"auditComment\":\"mfqhppubowse\",\"actionType\":\"DenyResetServer\",\"enableLogging\":\"DISABLED\",\"decryptionRuleType\":\"SSLOutboundInspection\",\"tags\":[],\"provisioningState\":\"Succeeded\"},\"id\":\"gb\",\"name\":\"c\",\"type\":\"uahokq\"}";

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

        PreRulesResource response =
            manager
                .preRules()
                .createOrUpdate(
                    "gmwohqfzizvu",
                    "mmkjsvthnwpztek",
                    new PreRulesResourceInner()
                        .withEtag("mribiat")
                        .withRuleName("gplucfotangcfhny")
                        .withDescription("gswvxwlmzqwm")
                        .withRuleState(StateEnum.DISABLED)
                        .withSource(
                            new SourceAddr()
                                .withCidrs(Arrays.asList())
                                .withCountries(Arrays.asList())
                                .withFeeds(Arrays.asList())
                                .withPrefixLists(Arrays.asList()))
                        .withNegateSource(BooleanEnum.FALSE)
                        .withDestination(
                            new DestinationAddr()
                                .withCidrs(Arrays.asList())
                                .withCountries(Arrays.asList())
                                .withFeeds(Arrays.asList())
                                .withPrefixLists(Arrays.asList())
                                .withFqdnLists(Arrays.asList()))
                        .withNegateDestination(BooleanEnum.FALSE)
                        .withApplications(Arrays.asList("npdkv", "fabuiyjibu", "phdu"))
                        .withCategory(new Category().withUrlCustom(Arrays.asList()).withFeeds(Arrays.asList()))
                        .withProtocol("iknp")
                        .withProtocolPortList(Arrays.asList("gjiuqhibto", "ipq"))
                        .withInboundInspectionCertificate("edmurrxxge")
                        .withAuditComment("ktvqylkmqpzoy")
                        .withActionType(ActionEnum.DENY_RESET_BOTH)
                        .withEnableLogging(StateEnum.ENABLED)
                        .withDecryptionRuleType(DecryptionRuleTypeEnum.SSLOUTBOUND_INSPECTION)
                        .withTags(Arrays.asList()),
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("pzpofoiyjw", response.etag());
        Assertions.assertEquals("filkmkkholv", response.ruleName());
        Assertions.assertEquals("iauogphuartv", response.description());
        Assertions.assertEquals(StateEnum.ENABLED, response.ruleState());
        Assertions.assertEquals(BooleanEnum.TRUE, response.negateSource());
        Assertions.assertEquals(BooleanEnum.FALSE, response.negateDestination());
        Assertions.assertEquals("jqirwrw", response.applications().get(0));
        Assertions.assertEquals("wrsnewmozqvbu", response.protocol());
        Assertions.assertEquals("amhsycxhxzgazt", response.protocolPortList().get(0));
        Assertions.assertEquals("boi", response.inboundInspectionCertificate());
        Assertions.assertEquals("mfqhppubowse", response.auditComment());
        Assertions.assertEquals(ActionEnum.DENY_RESET_SERVER, response.actionType());
        Assertions.assertEquals(StateEnum.DISABLED, response.enableLogging());
        Assertions.assertEquals(DecryptionRuleTypeEnum.SSLOUTBOUND_INSPECTION, response.decryptionRuleType());
    }
}
