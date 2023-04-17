// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for SqlResources GetSqlTrigger. */
public final class SqlResourcesGetSqlTriggerSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-03-15/examples/CosmosDBSqlTriggerGet.json
     */
    /**
     * Sample code: CosmosDBSqlTriggerGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBSqlTriggerGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getSqlResources()
            .getSqlTriggerWithResponse(
                "rgName", "ddb1", "databaseName", "containerName", "triggerName", com.azure.core.util.Context.NONE);
    }
}
