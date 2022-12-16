// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The private link service connection state of the private endpoint connection. */
@Fluent
public final class PrivateLinkServiceConnectionState {
    /*
     * The status of the Batch private endpoint connection
     */
    @JsonProperty(value = "status", required = true)
    private PrivateLinkServiceConnectionStatus status;

    /*
     * Description of the private Connection state
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Action required on the private connection state
     */
    @JsonProperty(value = "actionsRequired", access = JsonProperty.Access.WRITE_ONLY)
    private String actionsRequired;

    /** Creates an instance of PrivateLinkServiceConnectionState class. */
    public PrivateLinkServiceConnectionState() {
    }

    /**
     * Get the status property: The status of the Batch private endpoint connection.
     *
     * @return the status value.
     */
    public PrivateLinkServiceConnectionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the Batch private endpoint connection.
     *
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withStatus(PrivateLinkServiceConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: Description of the private Connection state.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the private Connection state.
     *
     * @param description the description value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionsRequired property: Action required on the private connection state.
     *
     * @return the actionsRequired value.
     */
    public String actionsRequired() {
        return this.actionsRequired;
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
                    new IllegalArgumentException(
                        "Missing required property status in model PrivateLinkServiceConnectionState"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkServiceConnectionState.class);
}
