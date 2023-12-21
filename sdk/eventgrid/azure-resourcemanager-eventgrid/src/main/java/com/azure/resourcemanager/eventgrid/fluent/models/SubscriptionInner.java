// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.eventgrid.models.DeliveryConfiguration;
import com.azure.resourcemanager.eventgrid.models.DeliverySchema;
import com.azure.resourcemanager.eventgrid.models.FiltersConfiguration;
import com.azure.resourcemanager.eventgrid.models.SubscriptionProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Event Subscription.
 */
@Fluent
public final class SubscriptionInner extends ProxyResource {
    /*
     * Properties of the event subscription.
     */
    @JsonProperty(value = "properties")
    private SubscriptionProperties innerProperties;

    /*
     * The system metadata relating to Event Subscription resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of SubscriptionInner class.
     */
    public SubscriptionInner() {
    }

    /**
     * Get the innerProperties property: Properties of the event subscription.
     * 
     * @return the innerProperties value.
     */
    private SubscriptionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system metadata relating to Event Subscription resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: Provisioning state of the event subscription.
     * 
     * @return the provisioningState value.
     */
    public SubscriptionProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the deliveryConfiguration property: Information about the delivery configuration of the event subscription.
     * 
     * @return the deliveryConfiguration value.
     */
    public DeliveryConfiguration deliveryConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().deliveryConfiguration();
    }

    /**
     * Set the deliveryConfiguration property: Information about the delivery configuration of the event subscription.
     * 
     * @param deliveryConfiguration the deliveryConfiguration value to set.
     * @return the SubscriptionInner object itself.
     */
    public SubscriptionInner withDeliveryConfiguration(DeliveryConfiguration deliveryConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionProperties();
        }
        this.innerProperties().withDeliveryConfiguration(deliveryConfiguration);
        return this;
    }

    /**
     * Get the eventDeliverySchema property: The event delivery schema for the event subscription.
     * 
     * @return the eventDeliverySchema value.
     */
    public DeliverySchema eventDeliverySchema() {
        return this.innerProperties() == null ? null : this.innerProperties().eventDeliverySchema();
    }

    /**
     * Set the eventDeliverySchema property: The event delivery schema for the event subscription.
     * 
     * @param eventDeliverySchema the eventDeliverySchema value to set.
     * @return the SubscriptionInner object itself.
     */
    public SubscriptionInner withEventDeliverySchema(DeliverySchema eventDeliverySchema) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionProperties();
        }
        this.innerProperties().withEventDeliverySchema(eventDeliverySchema);
        return this;
    }

    /**
     * Get the filtersConfiguration property: Information about the filter for the event subscription.
     * 
     * @return the filtersConfiguration value.
     */
    public FiltersConfiguration filtersConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().filtersConfiguration();
    }

    /**
     * Set the filtersConfiguration property: Information about the filter for the event subscription.
     * 
     * @param filtersConfiguration the filtersConfiguration value to set.
     * @return the SubscriptionInner object itself.
     */
    public SubscriptionInner withFiltersConfiguration(FiltersConfiguration filtersConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionProperties();
        }
        this.innerProperties().withFiltersConfiguration(filtersConfiguration);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
