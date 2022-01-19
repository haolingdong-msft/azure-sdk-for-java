// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.EntityClient;
import com.azure.analytics.purview.catalog.PurviewCatalogClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class EntityAddClassificationToEntityByGuids {
    public static void main(String[] args) {
        EntityClient client =
                new PurviewCatalogClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildEntityClient();
        BinaryData request =
                BinaryData.fromString(
                        "{\"classification\":{\"attributes\":{},\"typeName\":\"MICROSOFT.FINANCIAL.US.ABA_ROUTING_NUMBER\",\"validityPeriods\":[]},\"entityGuids\":[\"784c0f2f-afd2-e26b-f9cb-984f6c2c5021\",\"b4ebc8be-cef4-860a-bee9-28cc34cb5caa\"]}");
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response = client.addClassificationWithResponse(request, requestOptions);
    }
}
