// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The current state of a private endpoint connection. */
@Fluent
public class ConnectionState {
    /*
     * The status of a private endpoint connection.
     */
    @JsonProperty(value = "status", required = true)
    private PrivateLinkServiceConnectionStatus status;

    /*
     * The description for the current state of a private endpoint connection.
     */
    @JsonProperty(value = "description", required = true)
    private String description;

    /*
     * Actions required for a private endpoint connection.
     */
    @JsonProperty(value = "actionsRequired")
    private String actionsRequired;

    /**
     * Get the status property: The status of a private endpoint connection.
     *
     * @return the status value.
     */
    public PrivateLinkServiceConnectionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status of a private endpoint connection.
     *
     * @param status the status value to set.
     * @return the ConnectionState object itself.
     */
    public ConnectionState withStatus(PrivateLinkServiceConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: The description for the current state of a private endpoint connection.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description for the current state of a private endpoint connection.
     *
     * @param description the description value to set.
     * @return the ConnectionState object itself.
     */
    public ConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionsRequired property: Actions required for a private endpoint connection.
     *
     * @return the actionsRequired value.
     */
    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Set the actionsRequired property: Actions required for a private endpoint connection.
     *
     * @param actionsRequired the actionsRequired value to set.
     * @return the ConnectionState object itself.
     */
    public ConnectionState withActionsRequired(String actionsRequired) {
        this.actionsRequired = actionsRequired;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (status() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property status in model ConnectionState"));
        }
        if (description() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property description in model ConnectionState"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConnectionState.class);
}
