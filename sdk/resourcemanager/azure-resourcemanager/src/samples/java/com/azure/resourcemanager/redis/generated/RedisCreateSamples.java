// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redis.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.redis.models.RedisConfiguration;
import com.azure.resourcemanager.redis.models.RedisCreateParameters;
import com.azure.resourcemanager.redis.models.Sku;
import com.azure.resourcemanager.redis.models.SkuFamily;
import com.azure.resourcemanager.redis.models.SkuName;
import com.azure.resourcemanager.redis.models.TlsVersion;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for Redis Create. */
public final class RedisCreateSamples {
    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2022-05-01/examples/RedisCacheCreate.json
     */
    /**
     * Sample code: RedisCacheCreate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void redisCacheCreate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .redisCaches()
            .manager()
            .serviceClient()
            .getRedis()
            .create(
                "rg1",
                "cache1",
                new RedisCreateParameters()
                    .withZones(Arrays.asList("1"))
                    .withLocation("West US")
                    .withSku(new Sku().withName(SkuName.PREMIUM).withFamily(SkuFamily.P).withCapacity(1))
                    .withSubnetId(
                        "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Network/virtualNetworks/network1/subnets/subnet1")
                    .withStaticIp("192.168.0.5")
                    .withRedisConfiguration(
                        new RedisConfiguration().withMaxmemoryPolicy("allkeys-lru").withAdditionalProperties(mapOf()))
                    .withRedisVersion("4")
                    .withEnableNonSslPort(true)
                    .withReplicasPerPrimary(2)
                    .withShardCount(2)
                    .withMinimumTlsVersion(TlsVersion.ONE_TWO),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2022-05-01/examples/RedisCacheCreateDefaultVersion.json
     */
    /**
     * Sample code: RedisCacheCreateDefaultVersion.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void redisCacheCreateDefaultVersion(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .redisCaches()
            .manager()
            .serviceClient()
            .getRedis()
            .create(
                "rg1",
                "cache1",
                new RedisCreateParameters()
                    .withZones(Arrays.asList("1"))
                    .withLocation("West US")
                    .withSku(new Sku().withName(SkuName.PREMIUM).withFamily(SkuFamily.P).withCapacity(1))
                    .withSubnetId(
                        "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Network/virtualNetworks/network1/subnets/subnet1")
                    .withStaticIp("192.168.0.5")
                    .withRedisConfiguration(
                        new RedisConfiguration().withMaxmemoryPolicy("allkeys-lru").withAdditionalProperties(mapOf()))
                    .withEnableNonSslPort(true)
                    .withReplicasPerPrimary(2)
                    .withShardCount(2)
                    .withMinimumTlsVersion(TlsVersion.ONE_TWO),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/redis/resource-manager/Microsoft.Cache/stable/2022-05-01/examples/RedisCacheCreateLatestVersion.json
     */
    /**
     * Sample code: RedisCacheCreateLatestVersion.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void redisCacheCreateLatestVersion(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .redisCaches()
            .manager()
            .serviceClient()
            .getRedis()
            .create(
                "rg1",
                "cache1",
                new RedisCreateParameters()
                    .withZones(Arrays.asList("1"))
                    .withLocation("West US")
                    .withSku(new Sku().withName(SkuName.PREMIUM).withFamily(SkuFamily.P).withCapacity(1))
                    .withSubnetId(
                        "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Network/virtualNetworks/network1/subnets/subnet1")
                    .withStaticIp("192.168.0.5")
                    .withRedisConfiguration(
                        new RedisConfiguration().withMaxmemoryPolicy("allkeys-lru").withAdditionalProperties(mapOf()))
                    .withRedisVersion("Latest")
                    .withEnableNonSslPort(true)
                    .withReplicasPerPrimary(2)
                    .withShardCount(2)
                    .withMinimumTlsVersion(TlsVersion.ONE_TWO),
                Context.NONE);
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
