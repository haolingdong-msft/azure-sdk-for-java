// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Network device properties / role for the Network Rack. */
@Fluent
public final class NetworkDeviceRoleProperties {
    /*
     * Name of the associated Network Device SKU.
     */
    @JsonProperty(value = "networkDeviceSkuName")
    private String networkDeviceSkuName;

    /*
     * Role for the network device.
     */
    @JsonProperty(value = "roleType")
    private NetworkDeviceRackRoleType roleType;

    /*
     * Rack slot for the network device.
     */
    @JsonProperty(value = "rackSlot")
    private Integer rackSlot;

    /** Creates an instance of NetworkDeviceRoleProperties class. */
    public NetworkDeviceRoleProperties() {
    }

    /**
     * Get the networkDeviceSkuName property: Name of the associated Network Device SKU.
     *
     * @return the networkDeviceSkuName value.
     */
    public String networkDeviceSkuName() {
        return this.networkDeviceSkuName;
    }

    /**
     * Set the networkDeviceSkuName property: Name of the associated Network Device SKU.
     *
     * @param networkDeviceSkuName the networkDeviceSkuName value to set.
     * @return the NetworkDeviceRoleProperties object itself.
     */
    public NetworkDeviceRoleProperties withNetworkDeviceSkuName(String networkDeviceSkuName) {
        this.networkDeviceSkuName = networkDeviceSkuName;
        return this;
    }

    /**
     * Get the roleType property: Role for the network device.
     *
     * @return the roleType value.
     */
    public NetworkDeviceRackRoleType roleType() {
        return this.roleType;
    }

    /**
     * Set the roleType property: Role for the network device.
     *
     * @param roleType the roleType value to set.
     * @return the NetworkDeviceRoleProperties object itself.
     */
    public NetworkDeviceRoleProperties withRoleType(NetworkDeviceRackRoleType roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * Get the rackSlot property: Rack slot for the network device.
     *
     * @return the rackSlot value.
     */
    public Integer rackSlot() {
        return this.rackSlot;
    }

    /**
     * Set the rackSlot property: Rack slot for the network device.
     *
     * @param rackSlot the rackSlot value to set.
     * @return the NetworkDeviceRoleProperties object itself.
     */
    public NetworkDeviceRoleProperties withRackSlot(Integer rackSlot) {
        this.rackSlot = rackSlot;
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
