// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Metric namespace class specifies the metadata for a metric namespace. */
@Immutable
public final class MetricNamespace {
    /*
     * The namespace description.
     */
    @Generated
    @JsonProperty(value = "description")
    private String description;

    /*
     * The metric namespace name.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /** Creates an instance of MetricNamespace class. */
    @Generated
    private MetricNamespace() {}

    /**
     * Get the description property: The namespace description.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the name property: The metric namespace name.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }
}
