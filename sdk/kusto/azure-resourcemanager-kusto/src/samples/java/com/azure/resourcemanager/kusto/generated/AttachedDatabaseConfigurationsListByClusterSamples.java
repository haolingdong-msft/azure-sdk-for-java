// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.Context;

/** Samples for AttachedDatabaseConfigurations ListByCluster. */
public final class AttachedDatabaseConfigurationsListByClusterSamples {
    /*
     * x-ms-original-file: specification/azure-kusto/resource-manager/Microsoft.Kusto/stable/2022-07-07/examples/KustoAttachedDatabaseConfigurationsListByCluster.json
     */
    /**
     * Sample code: KustoAttachedDatabaseConfigurationsListByCluster.
     *
     * @param manager Entry point to KustoManager.
     */
    public static void kustoAttachedDatabaseConfigurationsListByCluster(
        com.azure.resourcemanager.kusto.KustoManager manager) {
        manager.attachedDatabaseConfigurations().listByCluster("kustorptest", "kustoCluster2", Context.NONE);
    }
}
