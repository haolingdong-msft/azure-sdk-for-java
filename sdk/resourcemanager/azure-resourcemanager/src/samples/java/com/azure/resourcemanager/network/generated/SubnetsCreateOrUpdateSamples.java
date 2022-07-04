// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.models.ServiceEndpointPropertiesFormat;
import java.util.Arrays;

/** Samples for Subnets CreateOrUpdate. */
public final class SubnetsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/SubnetCreate.json
     */
    /**
     * Sample code: Create subnet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createSubnet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getSubnets()
            .createOrUpdate(
                "subnet-test", "vnetname", "subnet1", new SubnetInner().withAddressPrefix("10.0.0.0/16"), Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/SubnetCreateServiceEndpoint.json
     */
    /**
     * Sample code: Create subnet with service endpoints.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createSubnetWithServiceEndpoints(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getSubnets()
            .createOrUpdate(
                "subnet-test",
                "vnetname",
                "subnet1",
                new SubnetInner()
                    .withAddressPrefix("10.0.0.0/16")
                    .withServiceEndpoints(
                        Arrays.asList(new ServiceEndpointPropertiesFormat().withService("Microsoft.Storage"))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2021-08-01/examples/SubnetCreateWithDelegation.json
     */
    /**
     * Sample code: Create subnet with a delegation.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createSubnetWithADelegation(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getSubnets()
            .createOrUpdate(
                "subnet-test", "vnetname", "subnet1", new SubnetInner().withAddressPrefix("10.0.0.0/16"), Context.NONE);
    }
}
