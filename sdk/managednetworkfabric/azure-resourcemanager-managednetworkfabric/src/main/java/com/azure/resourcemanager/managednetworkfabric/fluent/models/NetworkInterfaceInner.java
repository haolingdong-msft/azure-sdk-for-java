// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.AdministrativeState;
import com.azure.resourcemanager.managednetworkfabric.models.InterfaceType;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the NetworkInterface resource. */
@Fluent
public final class NetworkInterfaceInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private NetworkInterfaceProperties innerProperties = new NetworkInterfaceProperties();

    /** Creates an instance of NetworkInterfaceInner class. */
    public NetworkInterfaceInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private NetworkInterfaceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the physicalIdentifier property: Physical Identifier of the network interface.
     *
     * @return the physicalIdentifier value.
     */
    public String physicalIdentifier() {
        return this.innerProperties() == null ? null : this.innerProperties().physicalIdentifier();
    }

    /**
     * Get the connectedTo property: The ARM resource id of the interface or compute server its connected to.
     *
     * @return the connectedTo value.
     */
    public String connectedTo() {
        return this.innerProperties() == null ? null : this.innerProperties().connectedTo();
    }

    /**
     * Get the interfaceType property: The Interface Type. Example: Management/Data.
     *
     * @return the interfaceType value.
     */
    public InterfaceType interfaceType() {
        return this.innerProperties() == null ? null : this.innerProperties().interfaceType();
    }

    /**
     * Get the ipv4Address property: IPv4Address of the interface.
     *
     * @return the ipv4Address value.
     */
    public String ipv4Address() {
        return this.innerProperties() == null ? null : this.innerProperties().ipv4Address();
    }

    /**
     * Get the ipv6Address property: IPv6Address of the interface.
     *
     * @return the ipv6Address value.
     */
    public String ipv6Address() {
        return this.innerProperties() == null ? null : this.innerProperties().ipv6Address();
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the administrativeState property: Administrative state of the resource.
     *
     * @return the administrativeState value.
     */
    public AdministrativeState administrativeState() {
        return this.innerProperties() == null ? null : this.innerProperties().administrativeState();
    }

    /**
     * Get the annotation property: Switch configuration description.
     *
     * @return the annotation value.
     */
    public String annotation() {
        return this.innerProperties() == null ? null : this.innerProperties().annotation();
    }

    /**
     * Set the annotation property: Switch configuration description.
     *
     * @param annotation the annotation value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withAnnotation(String annotation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceProperties();
        }
        this.innerProperties().withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model NetworkInterfaceInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkInterfaceInner.class);
}
