// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.util.Context;

/** Samples for AvailabilityStatuses ListBySubscriptionId. */
public final class AvailabilityStatusesListBySubscriptionIdSamples {
    /*
     * x-ms-original-file: specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/stable/2020-05-01/examples/AvailabilityStatuses_ListBySubscriptionId.json
     */
    /**
     * Sample code: ListHealthBySubscriptionId.
     *
     * @param manager Entry point to ResourceHealthManager.
     */
    public static void listHealthBySubscriptionId(
        com.azure.resourcemanager.resourcehealth.ResourceHealthManager manager) {
        manager.availabilityStatuses().listBySubscriptionId(null, "recommendedactions", Context.NONE);
    }
}
