// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information regarding Subscription Quota Item. */
@Fluent
public final class SubscriptionQuotaItemInner extends ProxyResource {
    /*
     * SubscriptionQuotaItem properties
     */
    @JsonProperty(value = "properties")
    private SubscriptionQuotaItemProperties innerProperties;

    /**
     * Get the innerProperties property: SubscriptionQuotaItem properties.
     *
     * @return the innerProperties value.
     */
    private SubscriptionQuotaItemProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the current property: The current quota value.
     *
     * @return the current value.
     */
    public Integer current() {
        return this.innerProperties() == null ? null : this.innerProperties().current();
    }

    /**
     * Get the defaultProperty property: The default quota value.
     *
     * @return the defaultProperty value.
     */
    public Integer defaultProperty() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultProperty();
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
