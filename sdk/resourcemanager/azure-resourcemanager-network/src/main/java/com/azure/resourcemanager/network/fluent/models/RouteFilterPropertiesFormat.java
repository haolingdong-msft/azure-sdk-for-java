// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Route Filter Resource. */
@Fluent
public final class RouteFilterPropertiesFormat {
    /*
     * Collection of RouteFilterRules contained within a route filter.
     */
    @JsonProperty(value = "rules")
    private List<RouteFilterRuleInner> rules;

    /*
     * A collection of references to express route circuit peerings.
     */
    @JsonProperty(value = "peerings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExpressRouteCircuitPeeringInner> peerings;

    /*
     * A collection of references to express route circuit ipv6 peerings.
     */
    @JsonProperty(value = "ipv6Peerings", access = JsonProperty.Access.WRITE_ONLY)
    private List<ExpressRouteCircuitPeeringInner> ipv6Peerings;

    /*
     * The provisioning state of the route filter resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of RouteFilterPropertiesFormat class. */
    public RouteFilterPropertiesFormat() {
    }

    /**
     * Get the rules property: Collection of RouteFilterRules contained within a route filter.
     *
     * @return the rules value.
     */
    public List<RouteFilterRuleInner> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: Collection of RouteFilterRules contained within a route filter.
     *
     * @param rules the rules value to set.
     * @return the RouteFilterPropertiesFormat object itself.
     */
    public RouteFilterPropertiesFormat withRules(List<RouteFilterRuleInner> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the peerings property: A collection of references to express route circuit peerings.
     *
     * @return the peerings value.
     */
    public List<ExpressRouteCircuitPeeringInner> peerings() {
        return this.peerings;
    }

    /**
     * Get the ipv6Peerings property: A collection of references to express route circuit ipv6 peerings.
     *
     * @return the ipv6Peerings value.
     */
    public List<ExpressRouteCircuitPeeringInner> ipv6Peerings() {
        return this.ipv6Peerings;
    }

    /**
     * Get the provisioningState property: The provisioning state of the route filter resource.
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
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
        if (peerings() != null) {
            peerings().forEach(e -> e.validate());
        }
        if (ipv6Peerings() != null) {
            ipv6Peerings().forEach(e -> e.validate());
        }
    }
}
