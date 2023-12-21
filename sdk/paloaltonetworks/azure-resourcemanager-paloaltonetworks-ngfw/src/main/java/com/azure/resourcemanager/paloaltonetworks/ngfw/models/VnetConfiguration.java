// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VnetInfo for Firewall Networking.
 */
@Fluent
public final class VnetConfiguration {
    /*
     * Azure Virtual Network
     */
    @JsonProperty(value = "vnet", required = true)
    private IpAddressSpace vnet;

    /*
     * Trust Subnet
     */
    @JsonProperty(value = "trustSubnet", required = true)
    private IpAddressSpace trustSubnet;

    /*
     * Untrust Subnet
     */
    @JsonProperty(value = "unTrustSubnet", required = true)
    private IpAddressSpace unTrustSubnet;

    /*
     * IP of trust subnet for UDR
     */
    @JsonProperty(value = "ipOfTrustSubnetForUdr")
    private IpAddress ipOfTrustSubnetForUdr;

    /**
     * Creates an instance of VnetConfiguration class.
     */
    public VnetConfiguration() {
    }

    /**
     * Get the vnet property: Azure Virtual Network.
     * 
     * @return the vnet value.
     */
    public IpAddressSpace vnet() {
        return this.vnet;
    }

    /**
     * Set the vnet property: Azure Virtual Network.
     * 
     * @param vnet the vnet value to set.
     * @return the VnetConfiguration object itself.
     */
    public VnetConfiguration withVnet(IpAddressSpace vnet) {
        this.vnet = vnet;
        return this;
    }

    /**
     * Get the trustSubnet property: Trust Subnet.
     * 
     * @return the trustSubnet value.
     */
    public IpAddressSpace trustSubnet() {
        return this.trustSubnet;
    }

    /**
     * Set the trustSubnet property: Trust Subnet.
     * 
     * @param trustSubnet the trustSubnet value to set.
     * @return the VnetConfiguration object itself.
     */
    public VnetConfiguration withTrustSubnet(IpAddressSpace trustSubnet) {
        this.trustSubnet = trustSubnet;
        return this;
    }

    /**
     * Get the unTrustSubnet property: Untrust Subnet.
     * 
     * @return the unTrustSubnet value.
     */
    public IpAddressSpace unTrustSubnet() {
        return this.unTrustSubnet;
    }

    /**
     * Set the unTrustSubnet property: Untrust Subnet.
     * 
     * @param unTrustSubnet the unTrustSubnet value to set.
     * @return the VnetConfiguration object itself.
     */
    public VnetConfiguration withUnTrustSubnet(IpAddressSpace unTrustSubnet) {
        this.unTrustSubnet = unTrustSubnet;
        return this;
    }

    /**
     * Get the ipOfTrustSubnetForUdr property: IP of trust subnet for UDR.
     * 
     * @return the ipOfTrustSubnetForUdr value.
     */
    public IpAddress ipOfTrustSubnetForUdr() {
        return this.ipOfTrustSubnetForUdr;
    }

    /**
     * Set the ipOfTrustSubnetForUdr property: IP of trust subnet for UDR.
     * 
     * @param ipOfTrustSubnetForUdr the ipOfTrustSubnetForUdr value to set.
     * @return the VnetConfiguration object itself.
     */
    public VnetConfiguration withIpOfTrustSubnetForUdr(IpAddress ipOfTrustSubnetForUdr) {
        this.ipOfTrustSubnetForUdr = ipOfTrustSubnetForUdr;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vnet() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property vnet in model VnetConfiguration"));
        } else {
            vnet().validate();
        }
        if (trustSubnet() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property trustSubnet in model VnetConfiguration"));
        } else {
            trustSubnet().validate();
        }
        if (unTrustSubnet() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property unTrustSubnet in model VnetConfiguration"));
        } else {
            unTrustSubnet().validate();
        }
        if (ipOfTrustSubnetForUdr() != null) {
            ipOfTrustSubnetForUdr().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VnetConfiguration.class);
}
