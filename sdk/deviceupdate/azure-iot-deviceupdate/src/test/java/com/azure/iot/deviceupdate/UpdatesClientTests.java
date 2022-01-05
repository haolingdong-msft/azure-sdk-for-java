// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.iot.deviceupdate;

import com.azure.core.credential.TokenCredential;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.ContentType;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class UpdatesClientTests extends TestBase {
    private static final String FILE_NAME = "setup.exe";
    private static final String DEFAULT_SCOPE = "https://api.adu.microsoft.com/.default";

    private UpdatesAsyncClient createClient() {
        TokenCredential credentials;
        HttpClient httpClient;
        HttpPipelinePolicy recordingPolicy = null;
        HttpPipeline httpPipeline;

        HttpHeaders headers = new HttpHeaders().put("Accept", ContentType.APPLICATION_JSON);
        AddHeadersPolicy addHeadersPolicy = new AddHeadersPolicy(headers);

        if (getTestMode() != TestMode.PLAYBACK) {
            // Record & Live
            credentials = new DefaultAzureCredentialBuilder().build();
            httpClient = HttpClient.createDefault();
            if (getTestMode() == TestMode.RECORD) {
                recordingPolicy = interceptorManager.getRecordPolicy();
            }
            BearerTokenAuthenticationPolicy bearerTokenAuthenticationPolicy =
                new BearerTokenAuthenticationPolicy(credentials, DEFAULT_SCOPE);
            httpPipeline = new HttpPipelineBuilder()
                .httpClient(httpClient)
                .policies(bearerTokenAuthenticationPolicy, addHeadersPolicy, recordingPolicy)
                .build();
        }
        else {
            // Playback
            httpClient = interceptorManager.getPlaybackClient();
            httpPipeline = new HttpPipelineBuilder()
                .httpClient(httpClient)
                .policies(addHeadersPolicy)
                .build();
        }

        return new DeviceUpdateClientBuilder()
            .endpoint(TestData.ACCOUNT_ENDPOINT)
            .instanceId(TestData.INSTANCE_ID)
            .pipeline(httpPipeline)
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .buildUpdatesAsyncClient();
    }

    @Test
    public void testGetUpdateNotFound() {
        UpdatesAsyncClient client = createClient();
        try {
            client.getUpdateWithResponse("foo", "bar", "0.0.0.1", null).block();
            fail("Expected NotFound response");
        } catch (HttpResponseException e) {
            assertEquals(404, e.getResponse().getStatusCode());
        }
    }

    @Test
    public void testGetProviders() {
        UpdatesAsyncClient client = createClient();
        PagedFlux<BinaryData> response = client.listProviders(null);

        assertNotNull(response);
        assertEquals(1, response.toStream().count());
    }

}
