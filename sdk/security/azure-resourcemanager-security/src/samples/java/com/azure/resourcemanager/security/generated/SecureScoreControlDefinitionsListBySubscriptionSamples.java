// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for SecureScoreControlDefinitions ListBySubscription. */
public final class SecureScoreControlDefinitionsListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2020-01-01/examples/secureScoreControlDefinitions/ListSecureScoreControlDefinitions_subscription_example.json
     */
    /**
     * Sample code: List security controls definition by subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void listSecurityControlsDefinitionBySubscription(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.secureScoreControlDefinitions().listBySubscription(Context.NONE);
    }
}
