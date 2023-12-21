// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

/**
 * Samples for VirtualMachines RetrieveBootDiagnosticsData.
 */
public final class VirtualMachinesRetrieveBootDiagnosticsDataSamples {
    /*
     * x-ms-original-file:
     * specification/compute/resource-manager/Microsoft.Compute/ComputeRP/stable/2023-09-01/examples/
     * virtualMachineExamples/VirtualMachine_RetrieveBootDiagnosticsData.json
     */
    /**
     * Sample code: RetrieveBootDiagnosticsData of a virtual machine.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        retrieveBootDiagnosticsDataOfAVirtualMachine(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.virtualMachines().manager().serviceClient().getVirtualMachines()
            .retrieveBootDiagnosticsDataWithResponse("ResourceGroup", "VMName", 60, com.azure.core.util.Context.NONE);
    }
}
