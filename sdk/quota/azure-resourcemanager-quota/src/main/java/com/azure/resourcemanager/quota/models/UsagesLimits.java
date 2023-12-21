// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.quota.fluent.models.CurrentUsagesBaseInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Quota limits.
 */
@Fluent
public final class UsagesLimits {
    /*
     * List of quota limits.
     */
    @JsonProperty(value = "value")
    private List<CurrentUsagesBaseInner> value;

    /*
     * The URI used to fetch the next page of quota limits. When there are no more pages, this is null.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of UsagesLimits class.
     */
    public UsagesLimits() {
    }

    /**
     * Get the value property: List of quota limits.
     * 
     * @return the value value.
     */
    public List<CurrentUsagesBaseInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of quota limits.
     * 
     * @param value the value value to set.
     * @return the UsagesLimits object itself.
     */
    public UsagesLimits withValue(List<CurrentUsagesBaseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI used to fetch the next page of quota limits. When there are no more pages,
     * this is null.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI used to fetch the next page of quota limits. When there are no more pages,
     * this is null.
     * 
     * @param nextLink the nextLink value to set.
     * @return the UsagesLimits object itself.
     */
    public UsagesLimits withNextLink(String nextLink) {
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
