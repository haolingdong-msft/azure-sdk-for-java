// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Gets or sets the file share configuration where the transport directory fileshare already exists, and user wishes to
 * mount the fileshare as a part of the create infra flow.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "configurationType")
@JsonTypeName("Mount")
@Fluent
public final class MountFileShareConfiguration extends FileShareConfiguration {
    /*
     * The fileshare resource ID
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * The private endpoint resource ID
     */
    @JsonProperty(value = "privateEndpointId", required = true)
    private String privateEndpointId;

    /** Creates an instance of MountFileShareConfiguration class. */
    public MountFileShareConfiguration() {
    }

    /**
     * Get the id property: The fileshare resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The fileshare resource ID.
     *
     * @param id the id value to set.
     * @return the MountFileShareConfiguration object itself.
     */
    public MountFileShareConfiguration withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the privateEndpointId property: The private endpoint resource ID.
     *
     * @return the privateEndpointId value.
     */
    public String privateEndpointId() {
        return this.privateEndpointId;
    }

    /**
     * Set the privateEndpointId property: The private endpoint resource ID.
     *
     * @param privateEndpointId the privateEndpointId value to set.
     * @return the MountFileShareConfiguration object itself.
     */
    public MountFileShareConfiguration withPrivateEndpointId(String privateEndpointId) {
        this.privateEndpointId = privateEndpointId;
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
        if (id() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property id in model MountFileShareConfiguration"));
        }
        if (privateEndpointId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property privateEndpointId in model MountFileShareConfiguration"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MountFileShareConfiguration.class);
}
