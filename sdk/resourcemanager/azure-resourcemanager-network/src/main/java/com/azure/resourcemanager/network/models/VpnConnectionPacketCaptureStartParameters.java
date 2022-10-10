// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Vpn Connection packet capture parameters supplied to start packet capture on gateway connection. */
@Fluent
public final class VpnConnectionPacketCaptureStartParameters {
    /*
     * Start Packet capture parameters on vpn connection.
     */
    @JsonProperty(value = "filterData")
    private String filterData;

    /*
     * List of site link connection names.
     */
    @JsonProperty(value = "linkConnectionNames")
    private List<String> linkConnectionNames;

    /** Creates an instance of VpnConnectionPacketCaptureStartParameters class. */
    public VpnConnectionPacketCaptureStartParameters() {
    }

    /**
     * Get the filterData property: Start Packet capture parameters on vpn connection.
     *
     * @return the filterData value.
     */
    public String filterData() {
        return this.filterData;
    }

    /**
     * Set the filterData property: Start Packet capture parameters on vpn connection.
     *
     * @param filterData the filterData value to set.
     * @return the VpnConnectionPacketCaptureStartParameters object itself.
     */
    public VpnConnectionPacketCaptureStartParameters withFilterData(String filterData) {
        this.filterData = filterData;
        return this;
    }

    /**
     * Get the linkConnectionNames property: List of site link connection names.
     *
     * @return the linkConnectionNames value.
     */
    public List<String> linkConnectionNames() {
        return this.linkConnectionNames;
    }

    /**
     * Set the linkConnectionNames property: List of site link connection names.
     *
     * @param linkConnectionNames the linkConnectionNames value to set.
     * @return the VpnConnectionPacketCaptureStartParameters object itself.
     */
    public VpnConnectionPacketCaptureStartParameters withLinkConnectionNames(List<String> linkConnectionNames) {
        this.linkConnectionNames = linkConnectionNames;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
