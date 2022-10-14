// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for PublicIpAddresses ListVirtualMachineScaleSetVMPublicIpAddresses. */
public final class PublicIpAddressesListVirtualMachineScaleSetVMPublicIpAddressesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/VmssVmPublicIpList.json
     */
    /**
     * Sample code: ListVMSSVMPublicIP.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listVMSSVMPublicIP(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getPublicIpAddresses()
            .listVirtualMachineScaleSetVMPublicIpAddresses("vmss-tester", "vmss1", "1", "nic1", "ip1", Context.NONE);
    }
}
