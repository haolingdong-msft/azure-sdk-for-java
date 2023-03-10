// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/** Samples for Service Delete. */
public final class ServiceDeleteSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-11-15/examples/CosmosDBSqlDedicatedGatewayServiceDelete.json
     */
    /**
     * Sample code: SqlDedicatedGatewayServiceDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void sqlDedicatedGatewayServiceDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getServices()
            .delete("rg1", "ddb1", "SqlDedicatedGateway", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-11-15/examples/CosmosDBMaterializedViewsBuilderServiceDelete.json
     */
    /**
     * Sample code: MaterializedViewsBuilderServiceDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void materializedViewsBuilderServiceDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getServices()
            .delete("rg1", "ddb1", "MaterializedViewsBuilder", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-11-15/examples/CosmosDBDataTransferServiceDelete.json
     */
    /**
     * Sample code: DataTransferServiceDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void dataTransferServiceDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getServices()
            .delete("rg1", "ddb1", "DataTransfer", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2022-11-15/examples/CosmosDBGraphAPIComputeServiceDelete.json
     */
    /**
     * Sample code: GraphAPIComputeServiceDelete.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void graphAPIComputeServiceDelete(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cosmosDBAccounts()
            .manager()
            .serviceClient()
            .getServices()
            .delete("rg1", "ddb1", "GraphAPICompute", com.azure.core.util.Context.NONE);
    }
}
