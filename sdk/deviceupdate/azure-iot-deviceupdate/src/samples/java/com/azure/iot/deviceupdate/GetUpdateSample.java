// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.iot.deviceupdate;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GetUpdateSample {
    public static void main(String[] args) {
        DeviceUpdateAsyncClient client = new DeviceUpdateClientBuilder()
            .endpoint(Configuration.getGlobalConfiguration().get("AZURE_ACCOUNT_ENDPOINT"))
            .instanceId(Configuration.getGlobalConfiguration().get("AZURE_INSTANCE_ID"))
            .credential(new DefaultAzureCredentialBuilder().build())
            .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BODY_AND_HEADERS))
            .buildAsyncClient();

        try {
            Response<BinaryData> response = client.getUpdateWithResponse(
                Configuration.getGlobalConfiguration().get("DEVICEUPDATE_UPDATE_PROVIDER"),
                Configuration.getGlobalConfiguration().get("DEVICEUPDATE_UPDATE_NAME"),
                Configuration.getGlobalConfiguration().get("DEVICEUPDATE_UPDATE_VERSION"),
                null).block();

            System.out.println(response.getValue());
        } catch (HttpResponseException e) {
            if (e.getResponse().getStatusCode() == 404) {
                // update does not exist
                System.out.println("update does not exist");
            }
        }
    }
}
