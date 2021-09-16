// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for EventSubscriptions ListByDomainTopic. */
public final class EventSubscriptionsListByDomainTopicSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2021-06-01-preview/examples/EventSubscriptions_ListByDomainTopic.json
     */
    /**
     * Sample code: EventSubscriptions_ListByDomainTopic.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void eventSubscriptionsListByDomainTopic(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.eventSubscriptions().listByDomainTopic("examplerg", "domain1", "topic1", null, null, Context.NONE);
    }
}
