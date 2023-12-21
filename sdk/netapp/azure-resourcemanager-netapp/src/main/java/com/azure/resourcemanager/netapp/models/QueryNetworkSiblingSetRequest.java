// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * QueryNetworkSiblingSetRequest
 * 
 * Network sibling set query.
 */
@Fluent
public final class QueryNetworkSiblingSetRequest {
    /*
     * Network Sibling Set ID
     * 
     * Network Sibling Set ID for a group of volumes sharing networking resources in a subnet.
     */
    @JsonProperty(value = "networkSiblingSetId", required = true)
    private String networkSiblingSetId;

    /*
     * Subnet resource Id
     * 
     * The Azure Resource URI for a delegated subnet. Must have the delegation Microsoft.NetApp/volumes. Example
     * /subscriptions/subscriptionId/resourceGroups/resourceGroup/providers/Microsoft.Network/virtualNetworks/testVnet/
     * subnets/{mySubnet}
     */
    @JsonProperty(value = "subnetId", required = true)
    private String subnetId;

    /**
     * Creates an instance of QueryNetworkSiblingSetRequest class.
     */
    public QueryNetworkSiblingSetRequest() {
    }

    /**
     * Get the networkSiblingSetId property: Network Sibling Set ID
     * 
     * Network Sibling Set ID for a group of volumes sharing networking resources in a subnet.
     * 
     * @return the networkSiblingSetId value.
     */
    public String networkSiblingSetId() {
        return this.networkSiblingSetId;
    }

    /**
     * Set the networkSiblingSetId property: Network Sibling Set ID
     * 
     * Network Sibling Set ID for a group of volumes sharing networking resources in a subnet.
     * 
     * @param networkSiblingSetId the networkSiblingSetId value to set.
     * @return the QueryNetworkSiblingSetRequest object itself.
     */
    public QueryNetworkSiblingSetRequest withNetworkSiblingSetId(String networkSiblingSetId) {
        this.networkSiblingSetId = networkSiblingSetId;
        return this;
    }

    /**
     * Get the subnetId property: Subnet resource Id
     * 
     * The Azure Resource URI for a delegated subnet. Must have the delegation Microsoft.NetApp/volumes. Example
     * /subscriptions/subscriptionId/resourceGroups/resourceGroup/providers/Microsoft.Network/virtualNetworks/testVnet/subnets/{mySubnet}.
     * 
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.subnetId;
    }

    /**
     * Set the subnetId property: Subnet resource Id
     * 
     * The Azure Resource URI for a delegated subnet. Must have the delegation Microsoft.NetApp/volumes. Example
     * /subscriptions/subscriptionId/resourceGroups/resourceGroup/providers/Microsoft.Network/virtualNetworks/testVnet/subnets/{mySubnet}.
     * 
     * @param subnetId the subnetId value to set.
     * @return the QueryNetworkSiblingSetRequest object itself.
     */
    public QueryNetworkSiblingSetRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkSiblingSetId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property networkSiblingSetId in model QueryNetworkSiblingSetRequest"));
        }
        if (subnetId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property subnetId in model QueryNetworkSiblingSetRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(QueryNetworkSiblingSetRequest.class);
}
