// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The CustomSeasonality model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "mode")
@JsonTypeName("Custom")
@Fluent
public final class CustomSeasonality extends Seasonality {
    /*
     * [Required] Seasonality value.
     */
    @JsonProperty(value = "value", required = true)
    private int value;

    /** Creates an instance of CustomSeasonality class. */
    public CustomSeasonality() {
    }

    /**
     * Get the value property: [Required] Seasonality value.
     *
     * @return the value value.
     */
    public int value() {
        return this.value;
    }

    /**
     * Set the value property: [Required] Seasonality value.
     *
     * @param value the value value to set.
     * @return the CustomSeasonality object itself.
     */
    public CustomSeasonality withValue(int value) {
        this.value = value;
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
