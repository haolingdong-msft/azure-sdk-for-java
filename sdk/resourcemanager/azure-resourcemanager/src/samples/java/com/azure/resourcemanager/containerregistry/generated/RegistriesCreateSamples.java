// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

import com.azure.resourcemanager.containerregistry.fluent.models.RegistryInner;
import com.azure.resourcemanager.containerregistry.models.Sku;
import com.azure.resourcemanager.containerregistry.models.SkuName;
import com.azure.resourcemanager.containerregistry.models.ZoneRedundancy;
import java.util.HashMap;
import java.util.Map;

/** Samples for Registries Create. */
public final class RegistriesCreateSamples {
    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryCreateZoneRedundant.json
     */
    /**
     * Sample code: RegistryCreateZoneRedundant.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void registryCreateZoneRedundant(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getRegistries()
            .create(
                "myResourceGroup",
                "myRegistry",
                new RegistryInner()
                    .withLocation("westus")
                    .withTags(mapOf("key", "value"))
                    .withSku(new Sku().withName(SkuName.STANDARD))
                    .withZoneRedundancy(ZoneRedundancy.ENABLED),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/stable/2022-12-01/examples/RegistryCreate.json
     */
    /**
     * Sample code: RegistryCreate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void registryCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .containerRegistries()
            .manager()
            .serviceClient()
            .getRegistries()
            .create(
                "myResourceGroup",
                "myRegistry",
                new RegistryInner()
                    .withLocation("westus")
                    .withTags(mapOf("key", "value"))
                    .withSku(new Sku().withName(SkuName.STANDARD))
                    .withAdminUserEnabled(true),
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
