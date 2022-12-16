// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Optional section. Reference ids for use with the [Get Search
 * Polygon](https://docs.microsoft.com/rest/api/maps/search/getsearchpolygon) API.
 */
@Fluent
public final class DataSource {
    /*
     * Information about the geometric shape of the result. Only present if type == Geography.
     */
    @JsonProperty(value = "geometry")
    private GeometryIdentifier geometry;

    /** Creates an instance of DataSource class. */
    public DataSource() {}

    /** @param geometry this is geometry id */
    public DataSource(String geometry) {
        this.geometry = new GeometryIdentifier().setId(geometry);
    }

    /**
     * Get the geometry property: Information about the geometric shape of the result. Only present if type ==
     * Geography.
     *
     * @return the geometry value
     */
    public String getGeometry() {
        return this.geometry.toString();
    }

    /**
     * Set the geometry property: Information about the geometric shape of the result. Only present if type ==
     * Geography.
     *
     * @param geometry the geometry value to set
     * @return The DataSource object itself.
     */
    public DataSource setGeometry(String geometry) {
        this.geometry = new GeometryIdentifier().setId(geometry);
        return this;
    }
}
