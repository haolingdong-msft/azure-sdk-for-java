// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.RelationshipClient;
import com.azure.analytics.purview.catalog.RelationshipClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class RelationshipGet {
    public static void main(String[] args) {
        RelationshipClient relationshipClient =
                new RelationshipClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.catalog.generated.relationshipget.relationshipget
        RequestOptions requestOptions = new RequestOptions().addQueryParam("extendedInfo", "false");
        Response<BinaryData> response =
                relationshipClient.getWithResponse("5cf8a9e5-c9fd-abe0-2e8c-d40024263dcb", requestOptions);
        // END:com.azure.analytics.purview.catalog.generated.relationshipget.relationshipget
    }
}
