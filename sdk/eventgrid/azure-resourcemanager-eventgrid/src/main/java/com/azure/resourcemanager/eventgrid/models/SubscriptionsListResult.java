// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.SubscriptionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Result of the List event subscriptions operation.
 */
@Fluent
public final class SubscriptionsListResult {
    /*
     * A collection of Subscriptions.
     */
    @JsonProperty(value = "value")
    private List<SubscriptionInner> value;

    /*
     * A link for the next page of event subscriptions
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of SubscriptionsListResult class.
     */
    public SubscriptionsListResult() {
    }

    /**
     * Get the value property: A collection of Subscriptions.
     * 
     * @return the value value.
     */
    public List<SubscriptionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of Subscriptions.
     * 
     * @param value the value value to set.
     * @return the SubscriptionsListResult object itself.
     */
    public SubscriptionsListResult withValue(List<SubscriptionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of event subscriptions.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of event subscriptions.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SubscriptionsListResult object itself.
     */
    public SubscriptionsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
