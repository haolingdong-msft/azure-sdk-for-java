// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** action. Example: allow | deny. */
public final class ConditionActionType extends ExpandableStringEnum<ConditionActionType> {
    /** Static value allow for ConditionActionType. */
    public static final ConditionActionType ALLOW = fromString("allow");

    /** Static value deny for ConditionActionType. */
    public static final ConditionActionType DENY = fromString("deny");

    /**
     * Creates a new instance of ConditionActionType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ConditionActionType() {
    }

    /**
     * Creates or finds a ConditionActionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ConditionActionType.
     */
    @JsonCreator
    public static ConditionActionType fromString(String name) {
        return fromString(name, ConditionActionType.class);
    }

    /**
     * Gets known ConditionActionType values.
     *
     * @return known ConditionActionType values.
     */
    public static Collection<ConditionActionType> values() {
        return values(ConditionActionType.class);
    }
}
