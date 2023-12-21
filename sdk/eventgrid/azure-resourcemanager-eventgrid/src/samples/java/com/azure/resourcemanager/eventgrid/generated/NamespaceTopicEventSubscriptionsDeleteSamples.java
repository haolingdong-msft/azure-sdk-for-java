// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/**
 * Samples for NamespaceTopicEventSubscriptions Delete.
 */
public final class NamespaceTopicEventSubscriptionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-12-15-preview/examples/
     * NamespaceTopicEventSubscriptions_Delete.json
     */
    /**
     * Sample code: NamespaceTopicEventSubscriptions_Delete.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void
        namespaceTopicEventSubscriptionsDelete(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.namespaceTopicEventSubscriptions().delete("examplerg", "examplenamespace2", "examplenamespacetopic2",
            "examplenamespacetopicEventSub2", com.azure.core.util.Context.NONE);
    }
}
