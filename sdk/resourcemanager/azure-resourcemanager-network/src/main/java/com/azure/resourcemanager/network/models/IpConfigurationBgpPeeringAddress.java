// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of IPConfigurationBgpPeeringAddress. */
@Fluent
public final class IpConfigurationBgpPeeringAddress {
    /*
     * The ID of IP configuration which belongs to gateway.
     */
    @JsonProperty(value = "ipconfigurationId")
    private String ipconfigurationId;

    /*
     * The list of default BGP peering addresses which belong to IP configuration.
     */
    @JsonProperty(value = "defaultBgpIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> defaultBgpIpAddresses;

    /*
     * The list of custom BGP peering addresses which belong to IP configuration.
     */
    @JsonProperty(value = "customBgpIpAddresses")
    private List<String> customBgpIpAddresses;

    /*
     * The list of tunnel public IP addresses which belong to IP configuration.
     */
    @JsonProperty(value = "tunnelIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> tunnelIpAddresses;

    /** Creates an instance of IpConfigurationBgpPeeringAddress class. */
    public IpConfigurationBgpPeeringAddress() {
    }

    /**
     * Get the ipconfigurationId property: The ID of IP configuration which belongs to gateway.
     *
     * @return the ipconfigurationId value.
     */
    public String ipconfigurationId() {
        return this.ipconfigurationId;
    }

    /**
     * Set the ipconfigurationId property: The ID of IP configuration which belongs to gateway.
     *
     * @param ipconfigurationId the ipconfigurationId value to set.
     * @return the IpConfigurationBgpPeeringAddress object itself.
     */
    public IpConfigurationBgpPeeringAddress withIpconfigurationId(String ipconfigurationId) {
        this.ipconfigurationId = ipconfigurationId;
        return this;
    }

    /**
     * Get the defaultBgpIpAddresses property: The list of default BGP peering addresses which belong to IP
     * configuration.
     *
     * @return the defaultBgpIpAddresses value.
     */
    public List<String> defaultBgpIpAddresses() {
        return this.defaultBgpIpAddresses;
    }

    /**
     * Get the customBgpIpAddresses property: The list of custom BGP peering addresses which belong to IP configuration.
     *
     * @return the customBgpIpAddresses value.
     */
    public List<String> customBgpIpAddresses() {
        return this.customBgpIpAddresses;
    }

    /**
     * Set the customBgpIpAddresses property: The list of custom BGP peering addresses which belong to IP configuration.
     *
     * @param customBgpIpAddresses the customBgpIpAddresses value to set.
     * @return the IpConfigurationBgpPeeringAddress object itself.
     */
    public IpConfigurationBgpPeeringAddress withCustomBgpIpAddresses(List<String> customBgpIpAddresses) {
        this.customBgpIpAddresses = customBgpIpAddresses;
        return this;
    }

    /**
     * Get the tunnelIpAddresses property: The list of tunnel public IP addresses which belong to IP configuration.
     *
     * @return the tunnelIpAddresses value.
     */
    public List<String> tunnelIpAddresses() {
        return this.tunnelIpAddresses;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
