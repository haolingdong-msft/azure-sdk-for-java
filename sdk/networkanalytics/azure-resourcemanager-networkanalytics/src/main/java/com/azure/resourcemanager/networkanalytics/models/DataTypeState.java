// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The data type state.
 */
public final class DataTypeState extends ExpandableStringEnum<DataTypeState> {
    /**
     * Static value Stopped for DataTypeState.
     */
    public static final DataTypeState STOPPED = fromString("Stopped");

    /**
     * Static value Running for DataTypeState.
     */
    public static final DataTypeState RUNNING = fromString("Running");

    /**
     * Creates a new instance of DataTypeState value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DataTypeState() {
    }

    /**
     * Creates or finds a DataTypeState from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DataTypeState.
     */
    @JsonCreator
    public static DataTypeState fromString(String name) {
        return fromString(name, DataTypeState.class);
    }

    /**
     * Gets known DataTypeState values.
     * 
     * @return known DataTypeState values.
     */
    public static Collection<DataTypeState> values() {
        return values(DataTypeState.class);
    }
}
