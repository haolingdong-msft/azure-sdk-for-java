// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appcontainers.fluent.models.ConnectedEnvironmentInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Collection of connectedEnvironments. */
@Fluent
public final class ConnectedEnvironmentCollection {
    /*
     * Collection of resources.
     */
    @JsonProperty(value = "value")
    private List<ConnectedEnvironmentInner> value;

    /*
     * Link to next page of resources.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of ConnectedEnvironmentCollection class. */
    public ConnectedEnvironmentCollection() {
    }

    /**
     * Get the value property: Collection of resources.
     *
     * @return the value value.
     */
    public List<ConnectedEnvironmentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     *
     * @param value the value value to set.
     * @return the ConnectedEnvironmentCollection object itself.
     */
    public ConnectedEnvironmentCollection withValue(List<ConnectedEnvironmentInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
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
