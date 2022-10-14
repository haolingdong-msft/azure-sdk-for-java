// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.util.Context;

/** Samples for ServiceEndpointPolicies GetByResourceGroup. */
public final class ServiceEndpointPoliciesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-05-01/examples/ServiceEndpointPolicyGet.json
     */
    /**
     * Sample code: Get service endPoint Policy.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getServiceEndPointPolicy(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getServiceEndpointPolicies()
            .getByResourceGroupWithResponse("rg1", "testServiceEndpointPolicy", null, Context.NONE);
    }
}
