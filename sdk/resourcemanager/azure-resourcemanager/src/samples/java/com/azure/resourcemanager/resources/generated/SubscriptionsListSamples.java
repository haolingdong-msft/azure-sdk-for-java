// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated;

import com.azure.core.util.Context;

/** Samples for Subscriptions List. */
public final class SubscriptionsListSamples {
    /*
     * x-ms-original-file: specification/resources/resource-manager/Microsoft.Resources/stable/2021-01-01/examples/GetSubscriptions.json
     */
    /**
     * Sample code: GetAllSubscriptions.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAllSubscriptions(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.genericResources().manager().subscriptionClient().getSubscriptions().list(Context.NONE);
    }
}
