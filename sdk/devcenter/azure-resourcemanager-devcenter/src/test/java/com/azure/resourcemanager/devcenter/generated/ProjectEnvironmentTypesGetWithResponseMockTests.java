// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.DevCenterManager;
import com.azure.resourcemanager.devcenter.models.EnableStatus;
import com.azure.resourcemanager.devcenter.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.devcenter.models.ProjectEnvironmentType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ProjectEnvironmentTypesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"TransientFailure\",\"deploymentTargetId\":\"ivsiy\",\"status\":\"Enabled\",\"creatorRoleAssignment\":{\"roles\":{}},\"userRoleAssignments\":{}},\"tags\":{\"pgogtqxepny\":\"onbzoggculapzwy\",\"uajlyj\":\"b\",\"uxrkjp\":\"lvofqzhvfcibyfmo\",\"wiivwzjbhyzsx\":\"dwxf\"},\"identity\":{\"principalId\":\"8cec7fc8-c140-4e15-9062-d24414a21a1d\",\"tenantId\":\"51c2ecdb-dea7-4b44-9e3e-dbd54ff928a3\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"negvmnvuqe\",\"id\":\"lds\",\"name\":\"astjbkkdmflvestm\",\"type\":\"lx\"}";

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

        ProjectEnvironmentType response =
            manager.projectEnvironmentTypes().getWithResponse("ewda", "mdjvlpj", "xkzb", Context.NONE).getValue();

        Assertions.assertEquals("onbzoggculapzwy", response.tags().get("pgogtqxepny"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("negvmnvuqe", response.location());
        Assertions.assertEquals("ivsiy", response.deploymentTargetId());
        Assertions.assertEquals(EnableStatus.ENABLED, response.status());
    }
}
