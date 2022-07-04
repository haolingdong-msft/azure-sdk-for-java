// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FirewallPolicyIntrusionDetectionStateType. */
public final class FirewallPolicyIntrusionDetectionStateType
    extends ExpandableStringEnum<FirewallPolicyIntrusionDetectionStateType> {
    /** Static value Off for FirewallPolicyIntrusionDetectionStateType. */
    public static final FirewallPolicyIntrusionDetectionStateType OFF = fromString("Off");

    /** Static value Alert for FirewallPolicyIntrusionDetectionStateType. */
    public static final FirewallPolicyIntrusionDetectionStateType ALERT = fromString("Alert");

    /** Static value Deny for FirewallPolicyIntrusionDetectionStateType. */
    public static final FirewallPolicyIntrusionDetectionStateType DENY = fromString("Deny");

    /**
     * Creates or finds a FirewallPolicyIntrusionDetectionStateType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FirewallPolicyIntrusionDetectionStateType.
     */
    @JsonCreator
    public static FirewallPolicyIntrusionDetectionStateType fromString(String name) {
        return fromString(name, FirewallPolicyIntrusionDetectionStateType.class);
    }

    /**
     * Gets known FirewallPolicyIntrusionDetectionStateType values.
     *
     * @return known FirewallPolicyIntrusionDetectionStateType values.
     */
    public static Collection<FirewallPolicyIntrusionDetectionStateType> values() {
        return values(FirewallPolicyIntrusionDetectionStateType.class);
    }
}
