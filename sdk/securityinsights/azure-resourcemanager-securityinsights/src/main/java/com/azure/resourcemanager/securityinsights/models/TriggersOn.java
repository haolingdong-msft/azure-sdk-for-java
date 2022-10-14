// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TriggersOn. */
public final class TriggersOn extends ExpandableStringEnum<TriggersOn> {
    /** Static value Incidents for TriggersOn. */
    public static final TriggersOn INCIDENTS = fromString("Incidents");

    /** Static value Alerts for TriggersOn. */
    public static final TriggersOn ALERTS = fromString("Alerts");

    /**
     * Creates or finds a TriggersOn from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TriggersOn.
     */
    @JsonCreator
    public static TriggersOn fromString(String name) {
        return fromString(name, TriggersOn.class);
    }

    /**
     * Gets known TriggersOn values.
     *
     * @return known TriggersOn values.
     */
    public static Collection<TriggersOn> values() {
        return values(TriggersOn.class);
    }
}
