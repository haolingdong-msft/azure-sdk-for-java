// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for MongoDBResources ListMongoDBCollections. */
public final class MongoDBResourcesListMongoDBCollectionsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-11-15/examples/CosmosDBMongoDBCollectionList.json
     */
    /**
     * Sample code: CosmosDBMongoDBCollectionList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBMongoDBCollectionList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getMongoDBResources()
            .listMongoDBCollections("rgName", "ddb1", "databaseName", com.azure.core.util.Context.NONE);
    }
}
