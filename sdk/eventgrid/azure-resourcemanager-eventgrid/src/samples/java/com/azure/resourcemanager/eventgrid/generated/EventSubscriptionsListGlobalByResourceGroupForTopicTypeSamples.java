// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/**
 * Samples for EventSubscriptions ListGlobalByResourceGroupForTopicType.
 */
public final class EventSubscriptionsListGlobalByResourceGroupForTopicTypeSamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-12-15-preview/examples/
     * EventSubscriptions_ListGlobalByResourceGroupForTopicType.json
     */
    /**
     * Sample code: EventSubscriptions_ListGlobalByResourceGroupForTopicType.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void eventSubscriptionsListGlobalByResourceGroupForTopicType(
        com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.eventSubscriptions().listGlobalByResourceGroupForTopicType("examplerg",
            "Microsoft.Resources.ResourceGroups", null, null, com.azure.core.util.Context.NONE);
    }
}
