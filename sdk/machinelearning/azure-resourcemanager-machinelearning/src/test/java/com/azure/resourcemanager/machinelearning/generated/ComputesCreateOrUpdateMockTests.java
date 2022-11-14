// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.machinelearning.MachineLearningManager;
import com.azure.resourcemanager.machinelearning.models.Compute;
import com.azure.resourcemanager.machinelearning.models.ComputeResource;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.machinelearning.models.Sku;
import com.azure.resourcemanager.machinelearning.models.SkuTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ComputesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"identity\":{\"principalId\":\"c6744fb0-8cc2-40b4-bb89-86b4b9d4cd0a\",\"tenantId\":\"778e36b9-e91a-44e6-aafe-dd8fd9a73872\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"nii\",\"tags\":{\"sjtgirnbgmgmddo\":\"vqban\"},\"sku\":{\"name\":\"mynltwmpftmfoeaj\",\"tier\":\"Standard\",\"size\":\"xwet\",\"family\":\"fddrvlkpzwbhnrec\",\"capacity\":252329651},\"properties\":{\"computeType\":\"Compute\",\"computeLocation\":\"muhkahm\",\"provisioningState\":\"Succeeded\",\"description\":\"iuc\",\"createdOn\":\"2021-02-05T06:18:58Z\",\"modifiedOn\":\"2021-09-23T11:37:53Z\",\"resourceId\":\"jpjbweunxcqr\",\"provisioningErrors\":[],\"isAttachedCompute\":false,\"disableLocalAuth\":false},\"id\":\"hppiybx\",\"name\":\"gnzuzpbgkzcsc\",\"type\":\"iuzvkunhdimju\"}";

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

        MachineLearningManager manager =
            MachineLearningManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ComputeResource response =
            manager
                .computes()
                .define("ojxrjnbsconxavi")
                .withExistingWorkspace("mdafbgymqt", "apr")
                .withRegion("izqfsgnwdxz")
                .withTags(mapOf("rfbo", "q"))
                .withIdentity(
                    new ManagedServiceIdentity()
                        .withType(ManagedServiceIdentityType.NONE)
                        .withUserAssignedIdentities(mapOf()))
                .withSku(
                    new Sku()
                        .withName("ipmlnfyzavf")
                        .withTier(SkuTier.FREE)
                        .withSize("icdbkpdj")
                        .withFamily("qh")
                        .withCapacity(222903277))
                .withProperties(
                    new Compute()
                        .withComputeLocation("dgonjhxshthmgp")
                        .withDescription("lptkbvc")
                        .withResourceId("gqqbtimpk")
                        .withDisableLocalAuth(false))
                .create();

        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, response.identity().type());
        Assertions.assertEquals("nii", response.location());
        Assertions.assertEquals("vqban", response.tags().get("sjtgirnbgmgmddo"));
        Assertions.assertEquals("mynltwmpftmfoeaj", response.sku().name());
        Assertions.assertEquals(SkuTier.STANDARD, response.sku().tier());
        Assertions.assertEquals("xwet", response.sku().size());
        Assertions.assertEquals("fddrvlkpzwbhnrec", response.sku().family());
        Assertions.assertEquals(252329651, response.sku().capacity());
        Assertions.assertEquals("muhkahm", response.properties().computeLocation());
        Assertions.assertEquals("iuc", response.properties().description());
        Assertions.assertEquals("jpjbweunxcqr", response.properties().resourceId());
        Assertions.assertEquals(false, response.properties().disableLocalAuth());
    }

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
