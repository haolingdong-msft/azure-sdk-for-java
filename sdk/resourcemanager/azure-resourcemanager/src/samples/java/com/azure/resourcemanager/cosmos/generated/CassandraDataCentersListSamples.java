// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for CassandraDataCenters List. */
public final class CassandraDataCentersListSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-11-15/examples/CosmosDBManagedCassandraDataCenterList.json
     */
    /**
     * Sample code: CosmosDBManagedCassandraDataCenterList.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBManagedCassandraDataCenterList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getCassandraDataCenters()
            .list("cassandra-prod-rg", "cassandra-prod", com.azure.core.util.Context.NONE);
    }
}
