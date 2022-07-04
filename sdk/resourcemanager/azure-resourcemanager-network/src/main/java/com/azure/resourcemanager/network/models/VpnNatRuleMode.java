// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for VpnNatRuleMode. */
public final class VpnNatRuleMode extends ExpandableStringEnum<VpnNatRuleMode> {
    /** Static value EgressSnat for VpnNatRuleMode. */
    public static final VpnNatRuleMode EGRESS_SNAT = fromString("EgressSnat");

    /** Static value IngressSnat for VpnNatRuleMode. */
    public static final VpnNatRuleMode INGRESS_SNAT = fromString("IngressSnat");

    /**
     * Creates or finds a VpnNatRuleMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VpnNatRuleMode.
     */
    @JsonCreator
    public static VpnNatRuleMode fromString(String name) {
        return fromString(name, VpnNatRuleMode.class);
    }

    /**
     * Gets known VpnNatRuleMode values.
     *
     * @return known VpnNatRuleMode values.
     */
    public static Collection<VpnNatRuleMode> values() {
        return values(VpnNatRuleMode.class);
    }
}
