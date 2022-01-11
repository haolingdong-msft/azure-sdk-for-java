// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.util.Context;

/** Samples for PolicyAssignments Get. */
public final class PolicyAssignmentsGetSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2021-06-01/examples/getPolicyAssignmentWithUserAssignedIdentity.json
     */
    /**
     * Sample code: Retrieve a policy assignment with a user assigned identity.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void retrieveAPolicyAssignmentWithAUserAssignedIdentity(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .policyClient()
            .getPolicyAssignments()
            .getWithResponse("subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2", "EnforceNaming", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2021-06-01/examples/getPolicyAssignment.json
     */
    /**
     * Sample code: Retrieve a policy assignment.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void retrieveAPolicyAssignment(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .policyClient()
            .getPolicyAssignments()
            .getWithResponse("subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2", "EnforceNaming", Context.NONE);
    }

    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Authorization/stable/2021-06-01/examples/getPolicyAssignmentWithIdentity.json
     */
    /**
     * Sample code: Retrieve a policy assignment with a system assigned identity.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void retrieveAPolicyAssignmentWithASystemAssignedIdentity(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .genericResources()
            .manager()
            .policyClient()
            .getPolicyAssignments()
            .getWithResponse("subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2", "EnforceNaming", Context.NONE);
    }
}
