// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The array of capabilities of a lab services SKU. */
@Immutable
public final class LabServicesSkuCapabilities {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LabServicesSkuCapabilities.class);

    /*
     * The name of the capability for a SKU.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The value of the capability for a SKU.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Get the name property: The name of the capability for a SKU.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the value property: The value of the capability for a SKU.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
