// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a service delegation. */
@Fluent
public final class ServiceDelegationPropertiesFormat {
    /*
     * The name of the service to whom the subnet should be delegated (e.g. Microsoft.Sql/servers).
     */
    @JsonProperty(value = "serviceName")
    private String serviceName;

    /*
     * The actions permitted to the service upon delegation.
     */
    @JsonProperty(value = "actions", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> actions;

    /*
     * The provisioning state of the service delegation resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of ServiceDelegationPropertiesFormat class. */
    public ServiceDelegationPropertiesFormat() {
    }

    /**
     * Get the serviceName property: The name of the service to whom the subnet should be delegated (e.g.
     * Microsoft.Sql/servers).
     *
     * @return the serviceName value.
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set the serviceName property: The name of the service to whom the subnet should be delegated (e.g.
     * Microsoft.Sql/servers).
     *
     * @param serviceName the serviceName value to set.
     * @return the ServiceDelegationPropertiesFormat object itself.
     */
    public ServiceDelegationPropertiesFormat withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get the actions property: The actions permitted to the service upon delegation.
     *
     * @return the actions value.
     */
    public List<String> actions() {
        return this.actions;
    }

    /**
     * Get the provisioningState property: The provisioning state of the service delegation resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
