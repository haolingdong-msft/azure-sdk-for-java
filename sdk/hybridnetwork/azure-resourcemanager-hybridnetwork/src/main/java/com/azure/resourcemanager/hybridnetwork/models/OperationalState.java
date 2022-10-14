// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The operational state of the role instance. */
public final class OperationalState extends ExpandableStringEnum<OperationalState> {
    /** Static value Unknown for OperationalState. */
    public static final OperationalState UNKNOWN = fromString("Unknown");

    /** Static value Stopped for OperationalState. */
    public static final OperationalState STOPPED = fromString("Stopped");

    /** Static value Running for OperationalState. */
    public static final OperationalState RUNNING = fromString("Running");

    /** Static value Stopping for OperationalState. */
    public static final OperationalState STOPPING = fromString("Stopping");

    /** Static value Starting for OperationalState. */
    public static final OperationalState STARTING = fromString("Starting");

    /**
     * Creates or finds a OperationalState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OperationalState.
     */
    @JsonCreator
    public static OperationalState fromString(String name) {
        return fromString(name, OperationalState.class);
    }

    /**
     * Gets known OperationalState values.
     *
     * @return known OperationalState values.
     */
    public static Collection<OperationalState> values() {
        return values(OperationalState.class);
    }
}
