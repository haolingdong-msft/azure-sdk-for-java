// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.administration.generated;

import com.azure.analytics.purview.administration.MetadataPolicyClient;
import com.azure.analytics.purview.administration.PurviewMetadataClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class MetadataPolicyGet {
    public static void main(String[] args) {
        MetadataPolicyClient client =
                new PurviewMetadataClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildMetadataPolicyClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.getWithResponse("98ed42ff-b67f-44df-8c8c-7e6b43e77055", requestOptions);
    }
}
