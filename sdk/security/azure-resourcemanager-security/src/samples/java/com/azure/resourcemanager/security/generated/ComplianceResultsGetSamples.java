// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for ComplianceResults Get. */
public final class ComplianceResultsGetSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2017-08-01/examples/ComplianceResults/GetComplianceResults_example.json
     */
    /**
     * Sample code: Get compliance results on subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getComplianceResultsOnSubscription(com.azure.resourcemanager.security.SecurityManager manager) {
        manager
            .complianceResults()
            .getWithResponse(
                "subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23", "DesignateMoreThanOneOwner", Context.NONE);
    }
}
