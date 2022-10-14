// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of an IP Configuration of the private endpoint. */
@Fluent
public final class PrivateEndpointIpConfigurationProperties {
    /*
     * The ID of a group obtained from the remote resource that this private endpoint should connect to.
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /*
     * The member name of a group obtained from the remote resource that this private endpoint should connect to.
     */
    @JsonProperty(value = "memberName")
    private String memberName;

    /*
     * A private ip address obtained from the private endpoint's subnet.
     */
    @JsonProperty(value = "privateIPAddress")
    private String privateIpAddress;

    /** Creates an instance of PrivateEndpointIpConfigurationProperties class. */
    public PrivateEndpointIpConfigurationProperties() {
    }

    /**
     * Get the groupId property: The ID of a group obtained from the remote resource that this private endpoint should
     * connect to.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The ID of a group obtained from the remote resource that this private endpoint should
     * connect to.
     *
     * @param groupId the groupId value to set.
     * @return the PrivateEndpointIpConfigurationProperties object itself.
     */
    public PrivateEndpointIpConfigurationProperties withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the memberName property: The member name of a group obtained from the remote resource that this private
     * endpoint should connect to.
     *
     * @return the memberName value.
     */
    public String memberName() {
        return this.memberName;
    }

    /**
     * Set the memberName property: The member name of a group obtained from the remote resource that this private
     * endpoint should connect to.
     *
     * @param memberName the memberName value to set.
     * @return the PrivateEndpointIpConfigurationProperties object itself.
     */
    public PrivateEndpointIpConfigurationProperties withMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }

    /**
     * Get the privateIpAddress property: A private ip address obtained from the private endpoint's subnet.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: A private ip address obtained from the private endpoint's subnet.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the PrivateEndpointIpConfigurationProperties object itself.
     */
    public PrivateEndpointIpConfigurationProperties withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
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
