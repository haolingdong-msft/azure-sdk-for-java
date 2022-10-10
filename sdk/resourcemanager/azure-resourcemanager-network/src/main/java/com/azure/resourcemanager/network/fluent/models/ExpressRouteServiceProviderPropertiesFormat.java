// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ExpressRouteServiceProviderBandwidthsOffered;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of ExpressRouteServiceProvider. */
@Fluent
public final class ExpressRouteServiceProviderPropertiesFormat {
    /*
     * A list of peering locations.
     */
    @JsonProperty(value = "peeringLocations")
    private List<String> peeringLocations;

    /*
     * A list of bandwidths offered.
     */
    @JsonProperty(value = "bandwidthsOffered")
    private List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered;

    /*
     * The provisioning state of the express route service provider resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of ExpressRouteServiceProviderPropertiesFormat class. */
    public ExpressRouteServiceProviderPropertiesFormat() {
    }

    /**
     * Get the peeringLocations property: A list of peering locations.
     *
     * @return the peeringLocations value.
     */
    public List<String> peeringLocations() {
        return this.peeringLocations;
    }

    /**
     * Set the peeringLocations property: A list of peering locations.
     *
     * @param peeringLocations the peeringLocations value to set.
     * @return the ExpressRouteServiceProviderPropertiesFormat object itself.
     */
    public ExpressRouteServiceProviderPropertiesFormat withPeeringLocations(List<String> peeringLocations) {
        this.peeringLocations = peeringLocations;
        return this;
    }

    /**
     * Get the bandwidthsOffered property: A list of bandwidths offered.
     *
     * @return the bandwidthsOffered value.
     */
    public List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered() {
        return this.bandwidthsOffered;
    }

    /**
     * Set the bandwidthsOffered property: A list of bandwidths offered.
     *
     * @param bandwidthsOffered the bandwidthsOffered value to set.
     * @return the ExpressRouteServiceProviderPropertiesFormat object itself.
     */
    public ExpressRouteServiceProviderPropertiesFormat withBandwidthsOffered(
        List<ExpressRouteServiceProviderBandwidthsOffered> bandwidthsOffered) {
        this.bandwidthsOffered = bandwidthsOffered;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route service provider resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bandwidthsOffered() != null) {
            bandwidthsOffered().forEach(e -> e.validate());
        }
    }
}
