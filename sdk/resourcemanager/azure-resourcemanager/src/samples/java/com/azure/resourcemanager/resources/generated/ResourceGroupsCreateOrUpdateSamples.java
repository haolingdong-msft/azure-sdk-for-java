// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.fluent.models.ResourceGroupInner;

/** Samples for ResourceGroups CreateOrUpdate. */
public final class ResourceGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2021-01-01/examples/CreateResourceGroup.json
     */
    /**
     * Sample code: Create or update a resource group.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createOrUpdateAResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .serviceClient()
            .getResourceGroups()
            .createOrUpdateWithResponse(
                "my-resource-group", new ResourceGroupInner().withLocation("eastus"), Context.NONE);
    }
}
