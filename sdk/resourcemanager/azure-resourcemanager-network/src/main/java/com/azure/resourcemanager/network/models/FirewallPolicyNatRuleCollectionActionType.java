// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The action type of a rule. */
public final class FirewallPolicyNatRuleCollectionActionType
    extends ExpandableStringEnum<FirewallPolicyNatRuleCollectionActionType> {
    /** Static value DNAT for FirewallPolicyNatRuleCollectionActionType. */
    public static final FirewallPolicyNatRuleCollectionActionType DNAT = fromString("DNAT");

    /**
     * Creates a new instance of FirewallPolicyNatRuleCollectionActionType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FirewallPolicyNatRuleCollectionActionType() {
    }

    /**
     * Creates or finds a FirewallPolicyNatRuleCollectionActionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FirewallPolicyNatRuleCollectionActionType.
     */
    @JsonCreator
    public static FirewallPolicyNatRuleCollectionActionType fromString(String name) {
        return fromString(name, FirewallPolicyNatRuleCollectionActionType.class);
    }

    /**
     * Gets known FirewallPolicyNatRuleCollectionActionType values.
     *
     * @return known FirewallPolicyNatRuleCollectionActionType values.
     */
    public static Collection<FirewallPolicyNatRuleCollectionActionType> values() {
        return values(FirewallPolicyNatRuleCollectionActionType.class);
    }
}
