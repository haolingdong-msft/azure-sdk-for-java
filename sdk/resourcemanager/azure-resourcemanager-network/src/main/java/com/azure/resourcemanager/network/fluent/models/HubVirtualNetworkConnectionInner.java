// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.RoutingConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HubVirtualNetworkConnection Resource. */
@Fluent
public final class HubVirtualNetworkConnectionInner extends SubResource {
    /*
     * Properties of the hub virtual network connection.
     */
    @JsonProperty(value = "properties")
    private HubVirtualNetworkConnectionProperties innerProperties;

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

    /**
     * Get the innerProperties property: Properties of the hub virtual network connection.
     *
     * @return the innerProperties value.
     */
    private HubVirtualNetworkConnectionProperties innerProperties() {
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
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withName(String name) {
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
    public HubVirtualNetworkConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the remoteVirtualNetwork property: Reference to the remote virtual network.
     *
     * @return the remoteVirtualNetwork value.
     */
    public SubResource remoteVirtualNetwork() {
        return this.innerProperties() == null ? null : this.innerProperties().remoteVirtualNetwork();
    }

    /**
     * Set the remoteVirtualNetwork property: Reference to the remote virtual network.
     *
     * @param remoteVirtualNetwork the remoteVirtualNetwork value to set.
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withRemoteVirtualNetwork(SubResource remoteVirtualNetwork) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HubVirtualNetworkConnectionProperties();
        }
        this.innerProperties().withRemoteVirtualNetwork(remoteVirtualNetwork);
        return this;
    }

    /**
     * Get the allowHubToRemoteVnetTransit property: Deprecated: VirtualHub to RemoteVnet transit to enabled or not.
     *
     * @return the allowHubToRemoteVnetTransit value.
     */
    public Boolean allowHubToRemoteVnetTransit() {
        return this.innerProperties() == null ? null : this.innerProperties().allowHubToRemoteVnetTransit();
    }

    /**
     * Set the allowHubToRemoteVnetTransit property: Deprecated: VirtualHub to RemoteVnet transit to enabled or not.
     *
     * @param allowHubToRemoteVnetTransit the allowHubToRemoteVnetTransit value to set.
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withAllowHubToRemoteVnetTransit(Boolean allowHubToRemoteVnetTransit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HubVirtualNetworkConnectionProperties();
        }
        this.innerProperties().withAllowHubToRemoteVnetTransit(allowHubToRemoteVnetTransit);
        return this;
    }

    /**
     * Get the allowRemoteVnetToUseHubVnetGateways property: Deprecated: Allow RemoteVnet to use Virtual Hub's gateways.
     *
     * @return the allowRemoteVnetToUseHubVnetGateways value.
     */
    public Boolean allowRemoteVnetToUseHubVnetGateways() {
        return this.innerProperties() == null ? null : this.innerProperties().allowRemoteVnetToUseHubVnetGateways();
    }

    /**
     * Set the allowRemoteVnetToUseHubVnetGateways property: Deprecated: Allow RemoteVnet to use Virtual Hub's gateways.
     *
     * @param allowRemoteVnetToUseHubVnetGateways the allowRemoteVnetToUseHubVnetGateways value to set.
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withAllowRemoteVnetToUseHubVnetGateways(
        Boolean allowRemoteVnetToUseHubVnetGateways) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HubVirtualNetworkConnectionProperties();
        }
        this.innerProperties().withAllowRemoteVnetToUseHubVnetGateways(allowRemoteVnetToUseHubVnetGateways);
        return this;
    }

    /**
     * Get the enableInternetSecurity property: Enable internet security.
     *
     * @return the enableInternetSecurity value.
     */
    public Boolean enableInternetSecurity() {
        return this.innerProperties() == null ? null : this.innerProperties().enableInternetSecurity();
    }

    /**
     * Set the enableInternetSecurity property: Enable internet security.
     *
     * @param enableInternetSecurity the enableInternetSecurity value to set.
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withEnableInternetSecurity(Boolean enableInternetSecurity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HubVirtualNetworkConnectionProperties();
        }
        this.innerProperties().withEnableInternetSecurity(enableInternetSecurity);
        return this;
    }

    /**
     * Get the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @return the routingConfiguration value.
     */
    public RoutingConfiguration routingConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().routingConfiguration();
    }

    /**
     * Set the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @param routingConfiguration the routingConfiguration value to set.
     * @return the HubVirtualNetworkConnectionInner object itself.
     */
    public HubVirtualNetworkConnectionInner withRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new HubVirtualNetworkConnectionProperties();
        }
        this.innerProperties().withRoutingConfiguration(routingConfiguration);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the hub virtual network connection resource.
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
