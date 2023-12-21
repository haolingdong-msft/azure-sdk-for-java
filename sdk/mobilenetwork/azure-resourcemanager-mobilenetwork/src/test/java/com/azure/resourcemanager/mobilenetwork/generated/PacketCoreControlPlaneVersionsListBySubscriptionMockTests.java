// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mobilenetwork.MobileNetworkManager;
import com.azure.resourcemanager.mobilenetwork.models.ObsoleteVersion;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlaneVersion;
import com.azure.resourcemanager.mobilenetwork.models.PlatformType;
import com.azure.resourcemanager.mobilenetwork.models.RecommendedVersion;
import com.azure.resourcemanager.mobilenetwork.models.VersionState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PacketCoreControlPlaneVersionsListBySubscriptionMockTests {
    @Test
    public void testListBySubscription() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Unknown\",\"platforms\":[{\"platformType\":\"AKS-HCI\",\"versionState\":\"ValidationFailed\",\"minimumPlatformSoftwareVersion\":\"nqbpi\",\"maximumPlatformSoftwareVersion\":\"qltgrd\",\"recommendedVersion\":\"Recommended\",\"obsoleteVersion\":\"Obsolete\"},{\"platformType\":\"AKS-HCI\",\"versionState\":\"Preview\",\"minimumPlatformSoftwareVersion\":\"ihwuhvctafsrbxrb\",\"maximumPlatformSoftwareVersion\":\"li\",\"recommendedVersion\":\"NotRecommended\",\"obsoleteVersion\":\"NotObsolete\"},{\"platformType\":\"AKS-HCI\",\"versionState\":\"Preview\",\"minimumPlatformSoftwareVersion\":\"qagnepzwakl\",\"maximumPlatformSoftwareVersion\":\"sbq\",\"recommendedVersion\":\"NotRecommended\",\"obsoleteVersion\":\"NotObsolete\"}]},\"id\":\"rxaomzisglrrcze\",\"name\":\"k\",\"type\":\"hltnjadhqoawjq\"}]}";

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

        MobileNetworkManager manager =
            MobileNetworkManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PacketCoreControlPlaneVersion> response =
            manager.packetCoreControlPlaneVersions().listBySubscription(com.azure.core.util.Context.NONE);

        Assertions.assertEquals(PlatformType.AKS_HCI, response.iterator().next().platforms().get(0).platformType());
        Assertions
            .assertEquals(VersionState.VALIDATION_FAILED, response.iterator().next().platforms().get(0).versionState());
        Assertions
            .assertEquals("nqbpi", response.iterator().next().platforms().get(0).minimumPlatformSoftwareVersion());
        Assertions
            .assertEquals("qltgrd", response.iterator().next().platforms().get(0).maximumPlatformSoftwareVersion());
        Assertions
            .assertEquals(
                RecommendedVersion.RECOMMENDED, response.iterator().next().platforms().get(0).recommendedVersion());
        Assertions
            .assertEquals(ObsoleteVersion.OBSOLETE, response.iterator().next().platforms().get(0).obsoleteVersion());
    }
}
