// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of integration runtime resources.
 */
@Fluent
public final class IntegrationRuntimeListResponse {
    /*
     * List of integration runtimes.
     */
    @JsonProperty(value = "value", required = true)
    private List<IntegrationRuntimeResourceInner> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of IntegrationRuntimeListResponse class.
     */
    public IntegrationRuntimeListResponse() {
    }

    /**
     * Get the value property: List of integration runtimes.
     * 
     * @return the value value.
     */
    public List<IntegrationRuntimeResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of integration runtimes.
     * 
     * @param value the value value to set.
     * @return the IntegrationRuntimeListResponse object itself.
     */
    public IntegrationRuntimeListResponse withValue(List<IntegrationRuntimeResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of results, if any remaining results exist.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of results, if any remaining results exist.
     * 
     * @param nextLink the nextLink value to set.
     * @return the IntegrationRuntimeListResponse object itself.
     */
    public IntegrationRuntimeListResponse withNextLink(String nextLink) {
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
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property value in model IntegrationRuntimeListResponse"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IntegrationRuntimeListResponse.class);
}
