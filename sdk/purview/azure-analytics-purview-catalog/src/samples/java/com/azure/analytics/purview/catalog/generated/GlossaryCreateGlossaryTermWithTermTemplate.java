// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.GlossaryClient;
import com.azure.analytics.purview.catalog.PurviewCatalogClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GlossaryCreateGlossaryTermWithTermTemplate {
    public static void main(String[] args) {
        GlossaryClient client =
                new PurviewCatalogClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildGlossaryClient();
        BinaryData glossaryTerm =
                BinaryData.fromString(
                        "{\"name\":\"ExampleTerm\",\"anchor\":{\"glossaryGuid\":\"c018ddaf-7c21-4b37-a838-dae5f110c3d8\"},\"attributes\":{\"ExampleTermTemplateAttribute\":{\"date\":1606233600000,\"multi choice\":[\"Example Multi Choice A\",\"Example Multi Choice B\"],\"plain string\":\"Example String\",\"single choice\":\"Example Single Choice A\"}}}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.createGlossaryTermWithResponse(glossaryTerm, requestOptions);
    }
}
