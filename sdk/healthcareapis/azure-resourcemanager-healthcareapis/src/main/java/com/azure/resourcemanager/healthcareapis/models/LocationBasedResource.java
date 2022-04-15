// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The common properties for any location based resource, tracked or proxy. */
@Fluent
public class LocationBasedResource extends ResourceCore {
    /*
     * The resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the location property: The resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The resource location.
     *
     * @param location the location value to set.
     * @return the LocationBasedResource object itself.
     */
    public LocationBasedResource withLocation(String location) {
        this.location = location;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LocationBasedResource withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
