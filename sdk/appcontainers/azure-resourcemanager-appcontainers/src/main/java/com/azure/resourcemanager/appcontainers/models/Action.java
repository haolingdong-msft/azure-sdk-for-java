// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Allow or Deny rules to determine for incoming IP. Note: Rules can only consist of ALL Allow or ALL Deny. */
public final class Action extends ExpandableStringEnum<Action> {
    /** Static value Allow for Action. */
    public static final Action ALLOW = fromString("Allow");

    /** Static value Deny for Action. */
    public static final Action DENY = fromString("Deny");

    /**
     * Creates or finds a Action from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Action.
     */
    @JsonCreator
    public static Action fromString(String name) {
        return fromString(name, Action.class);
    }

    /**
     * Gets known Action values.
     *
     * @return known Action values.
     */
    public static Collection<Action> values() {
        return values(Action.class);
    }
}
