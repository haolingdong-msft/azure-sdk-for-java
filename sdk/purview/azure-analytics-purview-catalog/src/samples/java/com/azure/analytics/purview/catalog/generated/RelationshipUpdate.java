// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.PurviewCatalogClientBuilder;
import com.azure.analytics.purview.catalog.RelationshipClient;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class RelationshipUpdate {
    public static void main(String[] args) {
        RelationshipClient client =
                new PurviewCatalogClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildRelationshipClient();
        BinaryData relationship =
                BinaryData.fromString(
                        "{\"attributes\":{\"description\":\"Example Description\",\"expression\":\"Example Expression\",\"source\":null,\"status\":null,\"steward\":\"Example Steward\"},\"createdBy\":\"ExampleCreator\",\"end1\":{\"guid\":\"77481037-2874-9bdc-9b9e-76bb94ee71aa\",\"typeName\":\"AtlasGlossaryTerm\"},\"end2\":{\"guid\":\"b0942506-2d7d-1f45-d286-c29ca9e7f2ef\",\"typeName\":\"AtlasGlossaryTerm\"},\"guid\":\"b2810301-293f-493f-88f1-7ac8784fb1fd\",\"label\":\"r:AtlasGlossarySynonym\",\"status\":\"ACTIVE\",\"typeName\":\"AtlasGlossarySynonym\",\"updatedBy\":\"ExampleUpdator\",\"version\":0}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = client.updateWithResponse(relationship, requestOptions);
    }
}
