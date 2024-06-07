// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.resourcemanager.redisenterprise.models.ForceUnlinkParameters;
import java.util.Arrays;

/**
 * Samples for Databases ForceUnlink.
 */
public final class DatabasesForceUnlinkSamples {
    /*
     * x-ms-original-file: specification/redisenterprise/resource-manager/Microsoft.Cache/preview/2024-03-01-preview/examples/RedisEnterpriseDatabasesForceUnlink.json
     */
    /**
     * Sample code: How to unlink a database during a regional outage.
     * 
     * @param manager Entry point to RedisEnterpriseManager.
     */
    public static void howToUnlinkADatabaseDuringARegionalOutage(
        com.azure.resourcemanager.redisenterprise.RedisEnterpriseManager manager) {
        manager.databases()
            .forceUnlink("rg1", "cache1", "default", new ForceUnlinkParameters().withIds(Arrays.asList(
                "/subscriptions/subid2/resourceGroups/rg2/providers/Microsoft.Cache/redisEnterprise/cache2/databases/default")),
                com.azure.core.util.Context.NONE);
    }
}
