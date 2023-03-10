// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.generated;

import com.azure.resourcemanager.containerservice.fluent.models.PrivateLinkResourceInner;

/** Samples for ResolvePrivateLinkServiceId Post. */
public final class ResolvePrivateLinkServiceIdPostSamples {
    /*
     * x-ms-original-file: specification/containerservice/resource-manager/Microsoft.ContainerService/aks/stable/2023-01-01/examples/ResolvePrivateLinkServiceId.json
     */
    /**
     * Sample code: Resolve the Private Link Service ID for Managed Cluster.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void resolveThePrivateLinkServiceIDForManagedCluster(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .kubernetesClusters()
            .manager()
            .serviceClient()
            .getResolvePrivateLinkServiceIds()
            .postWithResponse(
                "rg1",
                "clustername1",
                new PrivateLinkResourceInner().withName("management"),
                com.azure.core.util.Context.NONE);
    }
}
