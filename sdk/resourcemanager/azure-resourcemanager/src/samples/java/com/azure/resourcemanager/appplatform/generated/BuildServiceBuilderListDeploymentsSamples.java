// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.core.util.Context;

/** Samples for BuildServiceBuilder ListDeployments. */
public final class BuildServiceBuilderListDeploymentsSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2022-12-01/examples/BuildServiceBuilder_ListDeployments.json
     */
    /**
     * Sample code: BuildServiceBuilder_ListDeployments.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void buildServiceBuilderListDeployments(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getBuildServiceBuilders()
            .listDeploymentsWithResponse("myResourceGroup", "myservice", "default", "default", Context.NONE);
    }
}
