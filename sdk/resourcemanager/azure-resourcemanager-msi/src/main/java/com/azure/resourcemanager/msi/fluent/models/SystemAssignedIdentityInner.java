// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.UUID;

/** Describes a system assigned identity resource. */
@Fluent
public final class SystemAssignedIdentityInner extends ProxyResource {
    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * System Assigned Identity properties. The properties associated with the
     * identity.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private SystemAssignedIdentityProperties innerProperties;

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The geo-location where the resource lives.
     *
     * @param location the location value to set.
     * @return the SystemAssignedIdentityInner object itself.
     */
    public SystemAssignedIdentityInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the SystemAssignedIdentityInner object itself.
     */
    public SystemAssignedIdentityInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: System Assigned Identity properties. The properties associated with the
     * identity.
     *
     * @return the innerProperties value.
     */
    private SystemAssignedIdentityProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tenantId property: The id of the tenant which the identity belongs to.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Get the principalId property: The id of the service principal object associated with the created identity.
     *
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Get the clientId property: The id of the app associated with the identity. This is a random generated UUID by
     * MSI.
     *
     * @return the clientId value.
     */
    public UUID clientId() {
        return this.innerProperties() == null ? null : this.innerProperties().clientId();
    }

    /**
     * Get the clientSecretUrl property: The ManagedServiceIdentity DataPlane URL that can be queried to obtain the
     * identity credentials.
     *
     * @return the clientSecretUrl value.
     */
    public String clientSecretUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().clientSecretUrl();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property location in model SystemAssignedIdentityInner"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SystemAssignedIdentityInner.class);
}
