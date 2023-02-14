// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for MongoDBResources DeleteMongoDBDatabase. */
public final class MongoDBResourcesDeleteMongoDBDatabaseSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-11-15/examples/CosmosDBMongoDBDatabaseDelete.json
     */
    /**
     * Sample code: CosmosDBMongoDBDatabaseDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBMongoDBDatabaseDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getMongoDBResources()
            .deleteMongoDBDatabase("rg1", "ddb1", "databaseName", com.azure.core.util.Context.NONE);
    }
}
