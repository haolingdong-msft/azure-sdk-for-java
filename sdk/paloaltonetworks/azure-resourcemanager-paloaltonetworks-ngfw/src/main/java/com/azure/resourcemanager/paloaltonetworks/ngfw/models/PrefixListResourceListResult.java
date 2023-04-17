// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.PrefixListResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of a PrefixListResource list operation. */
@Fluent
public final class PrefixListResourceListResult {
    /*
     * The items on this page
     */
    @JsonProperty(value = "value", required = true)
    private List<PrefixListResourceInner> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of PrefixListResourceListResult class. */
    public PrefixListResourceListResult() {
    }

    /**
     * Get the value property: The items on this page.
     *
     * @return the value value.
     */
    public List<PrefixListResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The items on this page.
     *
     * @param value the value value to set.
     * @return the PrefixListResourceListResult object itself.
     */
    public PrefixListResourceListResult withValue(List<PrefixListResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of items.
     *
     * @param nextLink the nextLink value to set.
     * @return the PrefixListResourceListResult object itself.
     */
    public PrefixListResourceListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model PrefixListResourceListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrefixListResourceListResult.class);
}
