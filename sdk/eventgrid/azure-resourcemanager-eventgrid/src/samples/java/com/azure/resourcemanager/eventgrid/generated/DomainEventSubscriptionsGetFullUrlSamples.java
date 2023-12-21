// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/**
 * Samples for DomainEventSubscriptions GetFullUrl.
 */
public final class DomainEventSubscriptionsGetFullUrlSamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-12-15-preview/examples/
     * DomainEventSubscriptions_GetFullUrl.json
     */
    /**
     * Sample code: DomainEventSubscriptions_GetFullUrl.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void
        domainEventSubscriptionsGetFullUrl(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.domainEventSubscriptions().getFullUrlWithResponse("examplerg", "exampleDomain1", "examplesubscription1",
            com.azure.core.util.Context.NONE);
    }
}
