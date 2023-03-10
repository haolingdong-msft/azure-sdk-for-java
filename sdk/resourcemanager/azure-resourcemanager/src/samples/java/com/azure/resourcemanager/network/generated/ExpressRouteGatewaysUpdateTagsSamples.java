// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.resourcemanager.network.models.TagsObject;
import java.util.HashMap;
import java.util.Map;

/** Samples for ExpressRouteGateways UpdateTags. */
public final class ExpressRouteGatewaysUpdateTagsSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-09-01/examples/ExpressRouteGatewayUpdateTags.json
     */
    /**
     * Sample code: ExpressRouteGatewayUpdate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void expressRouteGatewayUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getExpressRouteGateways()
            .updateTags(
                "resourceGroupName",
                "expressRouteGatewayName",
                new TagsObject().withTags(mapOf("tag1", "value1", "tag2", "value2")),
                com.azure.core.util.Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
