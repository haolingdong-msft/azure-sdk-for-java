// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Name for the classification. */
@Immutable
public final class ClassificationName {
    /*
     * Name Locale property
     */
    @JsonProperty(value = "nameLocale", access = JsonProperty.Access.WRITE_ONLY)
    private String nameLocale;

    /*
     * Name property
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /** Creates an instance of ClassificationName class. */
    public ClassificationName() {}

    /**
     * Get the nameLocale property: Name Locale property.
     *
     * @return the nameLocale value.
     */
    public String getNameLocale() {
        return this.nameLocale;
    }

    /**
     * Get the name property: Name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }
}
