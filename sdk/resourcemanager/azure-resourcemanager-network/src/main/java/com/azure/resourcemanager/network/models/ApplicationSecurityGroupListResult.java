// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.ApplicationSecurityGroupInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of application security groups.
 */
@Fluent
public final class ApplicationSecurityGroupListResult {
    /*
     * A list of application security groups.
     */
    @JsonProperty(value = "value")
    private List<ApplicationSecurityGroupInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ApplicationSecurityGroupListResult class.
     */
    public ApplicationSecurityGroupListResult() {
    }

    /**
     * Get the value property: A list of application security groups.
     * 
     * @return the value value.
     */
    public List<ApplicationSecurityGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of application security groups.
     * 
     * @param value the value value to set.
     * @return the ApplicationSecurityGroupListResult object itself.
     */
    public ApplicationSecurityGroupListResult withValue(List<ApplicationSecurityGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
