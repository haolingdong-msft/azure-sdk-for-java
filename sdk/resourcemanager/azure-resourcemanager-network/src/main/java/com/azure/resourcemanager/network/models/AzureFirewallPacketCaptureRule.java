// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Group of src/dest ips and ports to be captured.
 */
@Fluent
public final class AzureFirewallPacketCaptureRule {
    /*
     * List of source IP addresses/subnets to be captured.
     */
    @JsonProperty(value = "sources")
    private List<String> sources;

    /*
     * List of destination IP addresses/subnets to be captured.
     */
    @JsonProperty(value = "destinations")
    private List<String> destinations;

    /*
     * List of ports to be captured.
     */
    @JsonProperty(value = "destinationPorts")
    private List<String> destinationPorts;

    /**
     * Creates an instance of AzureFirewallPacketCaptureRule class.
     */
    public AzureFirewallPacketCaptureRule() {
    }

    /**
     * Get the sources property: List of source IP addresses/subnets to be captured.
     * 
     * @return the sources value.
     */
    public List<String> sources() {
        return this.sources;
    }

    /**
     * Set the sources property: List of source IP addresses/subnets to be captured.
     * 
     * @param sources the sources value to set.
     * @return the AzureFirewallPacketCaptureRule object itself.
     */
    public AzureFirewallPacketCaptureRule withSources(List<String> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * Get the destinations property: List of destination IP addresses/subnets to be captured.
     * 
     * @return the destinations value.
     */
    public List<String> destinations() {
        return this.destinations;
    }

    /**
     * Set the destinations property: List of destination IP addresses/subnets to be captured.
     * 
     * @param destinations the destinations value to set.
     * @return the AzureFirewallPacketCaptureRule object itself.
     */
    public AzureFirewallPacketCaptureRule withDestinations(List<String> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Get the destinationPorts property: List of ports to be captured.
     * 
     * @return the destinationPorts value.
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }

    /**
     * Set the destinationPorts property: List of ports to be captured.
     * 
     * @param destinationPorts the destinationPorts value to set.
     * @return the AzureFirewallPacketCaptureRule object itself.
     */
    public AzureFirewallPacketCaptureRule withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
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
