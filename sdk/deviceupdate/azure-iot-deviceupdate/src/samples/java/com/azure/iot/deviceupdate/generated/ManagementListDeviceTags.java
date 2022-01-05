// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.iot.deviceupdate.generated;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.iot.deviceupdate.DeviceUpdateClientBuilder;
import com.azure.iot.deviceupdate.ManagementClient;

public class ManagementListDeviceTags {
    public static void main(String[] args) {
        ManagementClient client =
                new DeviceUpdateClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("contoso.api.adu.microsoft.com")
                        .instanceId("blue")
                        .buildManagementClient();
        RequestOptions requestOptions = new RequestOptions();
        PagedIterable<BinaryData> response = client.listDeviceTags(requestOptions);
    }
}
