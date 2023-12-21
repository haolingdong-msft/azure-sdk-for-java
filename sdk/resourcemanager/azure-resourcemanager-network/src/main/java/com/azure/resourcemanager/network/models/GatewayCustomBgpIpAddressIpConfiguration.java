// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GatewayCustomBgpIpAddressIpConfiguration for a virtual network gateway connection.
 */
@Fluent
public final class GatewayCustomBgpIpAddressIpConfiguration {
    /*
     * The IpconfigurationId of ipconfiguration which belongs to gateway.
     */
    @JsonProperty(value = "ipConfigurationId", required = true)
    private String ipConfigurationId;

    /*
     * The custom BgpPeeringAddress which belongs to IpconfigurationId.
     */
    @JsonProperty(value = "customBgpIpAddress", required = true)
    private String customBgpIpAddress;

    /**
     * Creates an instance of GatewayCustomBgpIpAddressIpConfiguration class.
     */
    public GatewayCustomBgpIpAddressIpConfiguration() {
    }

    /**
     * Get the ipConfigurationId property: The IpconfigurationId of ipconfiguration which belongs to gateway.
     * 
     * @return the ipConfigurationId value.
     */
    public String ipConfigurationId() {
        return this.ipConfigurationId;
    }

    /**
     * Set the ipConfigurationId property: The IpconfigurationId of ipconfiguration which belongs to gateway.
     * 
     * @param ipConfigurationId the ipConfigurationId value to set.
     * @return the GatewayCustomBgpIpAddressIpConfiguration object itself.
     */
    public GatewayCustomBgpIpAddressIpConfiguration withIpConfigurationId(String ipConfigurationId) {
        this.ipConfigurationId = ipConfigurationId;
        return this;
    }

    /**
     * Get the customBgpIpAddress property: The custom BgpPeeringAddress which belongs to IpconfigurationId.
     * 
     * @return the customBgpIpAddress value.
     */
    public String customBgpIpAddress() {
        return this.customBgpIpAddress;
    }

    /**
     * Set the customBgpIpAddress property: The custom BgpPeeringAddress which belongs to IpconfigurationId.
     * 
     * @param customBgpIpAddress the customBgpIpAddress value to set.
     * @return the GatewayCustomBgpIpAddressIpConfiguration object itself.
     */
    public GatewayCustomBgpIpAddressIpConfiguration withCustomBgpIpAddress(String customBgpIpAddress) {
        this.customBgpIpAddress = customBgpIpAddress;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipConfigurationId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property ipConfigurationId in model GatewayCustomBgpIpAddressIpConfiguration"));
        }
        if (customBgpIpAddress() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property customBgpIpAddress in model GatewayCustomBgpIpAddressIpConfiguration"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GatewayCustomBgpIpAddressIpConfiguration.class);
}
