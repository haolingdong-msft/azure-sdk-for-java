// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.analytics.purview.catalog;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestBase;
import com.azure.core.test.TestMode;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.Objects;

public class PurviewCatalogClientTestBase extends TestBase {
    protected String getEndpoint() {
        String endpoint = interceptorManager.isPlaybackMode()
            ? "https://localhost:8080"
            : Configuration.getGlobalConfiguration().get("ATLAS_ENDPOINT");
        Objects.requireNonNull(endpoint);
        return endpoint;
    }

    PurviewCatalogClientBuilder builderSetUp() {
        PurviewCatalogClientBuilder builder =
            new PurviewCatalogClientBuilder()
                .httpClient(HttpClient.createDefault())
                .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS));
        if (getTestMode() == TestMode.PLAYBACK) {
            builder.httpClient(interceptorManager.getPlaybackClient())
                .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            builder.addPolicy(interceptorManager.getRecordPolicy())
                .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            builder.credential(new DefaultAzureCredentialBuilder().build());
        }
        return Objects.requireNonNull(builder);
    }
}
