// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The name and description. */
@Immutable
public final class NameAndDesc {
    /*
     * The description
     */
    @Generated
    @JsonProperty(value = "description")
    private String description;

    /*
     * The name
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /** Creates an instance of NameAndDesc class. */
    @Generated
    private NameAndDesc() {}

    /**
     * Get the description property: The description.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the name property: The name.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }
}
