// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.fluent.models.VngClientConnectionConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A vpn client connection configuration for client connection configuration. */
@Fluent
public final class VngClientConnectionConfiguration extends SubResource {
    /*
     * Properties of the vpn client root certificate.
     */
    @JsonProperty(value = "properties")
    private VngClientConnectionConfigurationProperties innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /** Creates an instance of VngClientConnectionConfiguration class. */
    public VngClientConnectionConfiguration() {
    }

    /**
     * Get the innerProperties property: Properties of the vpn client root certificate.
     *
     * @return the innerProperties value.
     */
    private VngClientConnectionConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the VngClientConnectionConfiguration object itself.
     */
    public VngClientConnectionConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /** {@inheritDoc} */
    @Override
    public VngClientConnectionConfiguration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the vpnClientAddressPool property: The reference to the address space resource which represents Address space
     * for P2S VpnClient.
     *
     * @return the vpnClientAddressPool value.
     */
    public AddressSpace vpnClientAddressPool() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnClientAddressPool();
    }

    /**
     * Set the vpnClientAddressPool property: The reference to the address space resource which represents Address space
     * for P2S VpnClient.
     *
     * @param vpnClientAddressPool the vpnClientAddressPool value to set.
     * @return the VngClientConnectionConfiguration object itself.
     */
    public VngClientConnectionConfiguration withVpnClientAddressPool(AddressSpace vpnClientAddressPool) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VngClientConnectionConfigurationProperties();
        }
        this.innerProperties().withVpnClientAddressPool(vpnClientAddressPool);
        return this;
    }

    /**
     * Get the virtualNetworkGatewayPolicyGroups property: List of references to virtualNetworkGatewayPolicyGroups.
     *
     * @return the virtualNetworkGatewayPolicyGroups value.
     */
    public List<SubResource> virtualNetworkGatewayPolicyGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkGatewayPolicyGroups();
    }

    /**
     * Set the virtualNetworkGatewayPolicyGroups property: List of references to virtualNetworkGatewayPolicyGroups.
     *
     * @param virtualNetworkGatewayPolicyGroups the virtualNetworkGatewayPolicyGroups value to set.
     * @return the VngClientConnectionConfiguration object itself.
     */
    public VngClientConnectionConfiguration withVirtualNetworkGatewayPolicyGroups(
        List<SubResource> virtualNetworkGatewayPolicyGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VngClientConnectionConfigurationProperties();
        }
        this.innerProperties().withVirtualNetworkGatewayPolicyGroups(virtualNetworkGatewayPolicyGroups);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VngClientConnectionConfiguration resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
