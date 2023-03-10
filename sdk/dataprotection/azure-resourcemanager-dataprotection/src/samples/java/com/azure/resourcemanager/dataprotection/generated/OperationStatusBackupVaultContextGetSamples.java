// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

/** Samples for OperationStatusBackupVaultContext Get. */
public final class OperationStatusBackupVaultContextGetSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2023-01-01/examples/GetOperationStatusVaultContext.json
     */
    /**
     * Sample code: Get OperationStatus.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void getOperationStatus(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager
            .operationStatusBackupVaultContexts()
            .getWithResponse(
                "SampleResourceGroup",
                "swaggerExample",
                "MjkxOTMyODMtYTE3My00YzJjLTg5NjctN2E4MDIxNDA3NjA2OzdjNGE2ZWRjLWJjMmItNDRkYi1hYzMzLWY1YzEwNzk5Y2EyOA==",
                com.azure.core.util.Context.NONE);
    }
}
