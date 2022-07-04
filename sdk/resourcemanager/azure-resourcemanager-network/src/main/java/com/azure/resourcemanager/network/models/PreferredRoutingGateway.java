// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PreferredRoutingGateway. */
public final class PreferredRoutingGateway extends ExpandableStringEnum<PreferredRoutingGateway> {
    /** Static value ExpressRoute for PreferredRoutingGateway. */
    public static final PreferredRoutingGateway EXPRESS_ROUTE = fromString("ExpressRoute");

    /** Static value VpnGateway for PreferredRoutingGateway. */
    public static final PreferredRoutingGateway VPN_GATEWAY = fromString("VpnGateway");

    /** Static value None for PreferredRoutingGateway. */
    public static final PreferredRoutingGateway NONE = fromString("None");

    /**
     * Creates or finds a PreferredRoutingGateway from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PreferredRoutingGateway.
     */
    @JsonCreator
    public static PreferredRoutingGateway fromString(String name) {
        return fromString(name, PreferredRoutingGateway.class);
    }

    /**
     * Gets known PreferredRoutingGateway values.
     *
     * @return known PreferredRoutingGateway values.
     */
    public static Collection<PreferredRoutingGateway> values() {
        return values(PreferredRoutingGateway.class);
    }
}
