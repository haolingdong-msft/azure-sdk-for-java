// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Library response details.
 */
@Fluent
public final class LibraryResource extends SubResource {
    /*
     * Library/package properties.
     */
    @JsonProperty(value = "properties", required = true)
    private LibraryResourceProperties properties;

    /**
     * Creates an instance of LibraryResource class.
     */
    public LibraryResource() {
    }

    /**
     * Get the properties property: Library/package properties.
     * 
     * @return the properties value.
     */
    public LibraryResourceProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Library/package properties.
     * 
     * @param properties the properties value to set.
     * @return the LibraryResource object itself.
     */
    public LibraryResource setProperties(LibraryResourceProperties properties) {
        this.properties = properties;
        return this;
    }
}
