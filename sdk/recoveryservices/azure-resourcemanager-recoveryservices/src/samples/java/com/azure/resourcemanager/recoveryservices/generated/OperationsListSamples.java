// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/recoveryservices/resource-manager/Microsoft.RecoveryServices/stable/2023-04-01/examples/ListOperations.json
     */
    /**
     * Sample code: ListOperations.
     *
     * @param manager Entry point to RecoveryServicesManager.
     */
    public static void listOperations(com.azure.resourcemanager.recoveryservices.RecoveryServicesManager manager) {
        manager.operations().list(com.azure.core.util.Context.NONE);
    }
}
