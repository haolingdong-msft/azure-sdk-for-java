// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.networkfunction.fluent.models.AzureTrafficCollectorInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for the ListTrafficCollectors API service call. */
@Fluent
public final class AzureTrafficCollectorListResult {
    /*
     * A list of Traffic Collector resources.
     */
    @JsonProperty(value = "value")
    private List<AzureTrafficCollectorInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of AzureTrafficCollectorListResult class. */
    public AzureTrafficCollectorListResult() {
    }

    /**
     * Get the value property: A list of Traffic Collector resources.
     *
     * @return the value value.
     */
    public List<AzureTrafficCollectorInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of Traffic Collector resources.
     *
     * @param value the value value to set.
     * @return the AzureTrafficCollectorListResult object itself.
     */
    public AzureTrafficCollectorListResult withValue(List<AzureTrafficCollectorInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
