// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.fluent.models.RestorePointCollectionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List restore point collection operation response. */
@Fluent
public final class RestorePointCollectionListResult {
    /*
     * Gets the list of restore point collections.
     */
    @JsonProperty(value = "value")
    private List<RestorePointCollectionInner> value;

    /*
     * The uri to fetch the next page of RestorePointCollections. Call ListNext() with this to fetch the next page of
     * RestorePointCollections
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Gets the list of restore point collections.
     *
     * @return the value value.
     */
    public List<RestorePointCollectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets the list of restore point collections.
     *
     * @param value the value value to set.
     * @return the RestorePointCollectionListResult object itself.
     */
    public RestorePointCollectionListResult withValue(List<RestorePointCollectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of RestorePointCollections. Call ListNext() with this
     * to fetch the next page of RestorePointCollections.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of RestorePointCollections. Call ListNext() with this
     * to fetch the next page of RestorePointCollections.
     *
     * @param nextLink the nextLink value to set.
     * @return the RestorePointCollectionListResult object itself.
     */
    public RestorePointCollectionListResult withNextLink(String nextLink) {
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
