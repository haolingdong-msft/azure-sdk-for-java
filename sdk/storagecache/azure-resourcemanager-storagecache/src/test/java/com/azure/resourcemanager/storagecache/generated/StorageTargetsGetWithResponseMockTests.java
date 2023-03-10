// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.storagecache.StorageCacheManager;
import com.azure.resourcemanager.storagecache.models.OperationalStateType;
import com.azure.resourcemanager.storagecache.models.StorageTarget;
import com.azure.resourcemanager.storagecache.models.StorageTargetType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class StorageTargetsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"junctions\":[],\"targetType\":\"blobNfs\",\"provisioningState\":\"Deleting\",\"state\":\"Ready\",\"nfs3\":{\"target\":\"mqg\",\"usageModel\":\"queziky\",\"verificationTimer\":566556548,\"writeBackTimer\":33393175},\"clfs\":{\"target\":\"la\"},\"unknown\":{\"attributes\":{}},\"blobNfs\":{\"target\":\"uipiccjzk\",\"usageModel\":\"v\",\"verificationTimer\":422897894,\"writeBackTimer\":1892001157},\"allocationPercentage\":192957128},\"location\":\"hyrnxxmu\",\"id\":\"dndrdvstkwqqtche\",\"name\":\"lmfmtdaay\",\"type\":\"dvwvgpio\"}";

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

        StorageCacheManager manager =
            StorageCacheManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        StorageTarget response =
            manager
                .storageTargets()
                .getWithResponse("xdy", "gsyocogj", "tdtbnnhadooc", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals(StorageTargetType.BLOB_NFS, response.targetType());
        Assertions.assertEquals(OperationalStateType.READY, response.state());
        Assertions.assertEquals("mqg", response.nfs3().target());
        Assertions.assertEquals("queziky", response.nfs3().usageModel());
        Assertions.assertEquals(566556548, response.nfs3().verificationTimer());
        Assertions.assertEquals(33393175, response.nfs3().writeBackTimer());
        Assertions.assertEquals("la", response.clfs().target());
        Assertions.assertEquals("uipiccjzk", response.blobNfs().target());
        Assertions.assertEquals("v", response.blobNfs().usageModel());
        Assertions.assertEquals(422897894, response.blobNfs().verificationTimer());
        Assertions.assertEquals(1892001157, response.blobNfs().writeBackTimer());
    }
}
