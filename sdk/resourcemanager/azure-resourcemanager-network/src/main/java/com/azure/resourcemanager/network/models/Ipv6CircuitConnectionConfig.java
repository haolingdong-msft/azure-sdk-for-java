// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IPv6 Circuit Connection properties for global reach. */
@Fluent
public final class Ipv6CircuitConnectionConfig {
    /*
     * /125 IP address space to carve out customer addresses for global reach.
     */
    @JsonProperty(value = "addressPrefix")
    private String addressPrefix;

    /*
     * Express Route Circuit connection state.
     */
    @JsonProperty(value = "circuitConnectionStatus", access = JsonProperty.Access.WRITE_ONLY)
    private CircuitConnectionStatus circuitConnectionStatus;

    /** Creates an instance of Ipv6CircuitConnectionConfig class. */
    public Ipv6CircuitConnectionConfig() {
    }

    /**
     * Get the addressPrefix property: /125 IP address space to carve out customer addresses for global reach.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: /125 IP address space to carve out customer addresses for global reach.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the Ipv6CircuitConnectionConfig object itself.
     */
    public Ipv6CircuitConnectionConfig withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the circuitConnectionStatus property: Express Route Circuit connection state.
     *
     * @return the circuitConnectionStatus value.
     */
    public CircuitConnectionStatus circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
