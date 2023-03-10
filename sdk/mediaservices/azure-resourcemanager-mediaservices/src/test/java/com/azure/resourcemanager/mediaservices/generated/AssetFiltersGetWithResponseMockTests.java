// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.mediaservices.MediaServicesManager;
import com.azure.resourcemanager.mediaservices.models.AssetFilter;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AssetFiltersGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"presentationTimeRange\":{\"startTimestamp\":1626825738124329365,\"endTimestamp\":8900017577448032306,\"presentationWindowDuration\":4093804744063752419,\"liveBackoffDuration\":1861437557151707755,\"timescale\":5757660492867019477,\"forceEndTimestamp\":true},\"firstQuality\":{\"bitrate\":568275135},\"tracks\":[]},\"id\":\"aylp\",\"name\":\"rsqqwztcm\",\"type\":\"qkc\"}";

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

        MediaServicesManager manager =
            MediaServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        AssetFilter response =
            manager
                .assetFilters()
                .getWithResponse("ostbzbkiwb", "qnyophzfyls", "crpfbcunez", "cez", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals(1626825738124329365L, response.presentationTimeRange().startTimestamp());
        Assertions.assertEquals(8900017577448032306L, response.presentationTimeRange().endTimestamp());
        Assertions.assertEquals(4093804744063752419L, response.presentationTimeRange().presentationWindowDuration());
        Assertions.assertEquals(1861437557151707755L, response.presentationTimeRange().liveBackoffDuration());
        Assertions.assertEquals(5757660492867019477L, response.presentationTimeRange().timescale());
        Assertions.assertEquals(true, response.presentationTimeRange().forceEndTimestamp());
        Assertions.assertEquals(568275135, response.firstQuality().bitrate());
    }
}
