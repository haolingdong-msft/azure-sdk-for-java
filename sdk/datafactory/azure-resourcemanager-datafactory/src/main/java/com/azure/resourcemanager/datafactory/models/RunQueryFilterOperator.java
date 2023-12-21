// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Operator to be used for filter.
 */
public final class RunQueryFilterOperator extends ExpandableStringEnum<RunQueryFilterOperator> {
    /**
     * Static value Equals for RunQueryFilterOperator.
     */
    public static final RunQueryFilterOperator EQUALS = fromString("Equals");

    /**
     * Static value NotEquals for RunQueryFilterOperator.
     */
    public static final RunQueryFilterOperator NOT_EQUALS = fromString("NotEquals");

    /**
     * Static value In for RunQueryFilterOperator.
     */
    public static final RunQueryFilterOperator IN = fromString("In");

    /**
     * Static value NotIn for RunQueryFilterOperator.
     */
    public static final RunQueryFilterOperator NOT_IN = fromString("NotIn");

    /**
     * Creates a new instance of RunQueryFilterOperator value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RunQueryFilterOperator() {
    }

    /**
     * Creates or finds a RunQueryFilterOperator from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RunQueryFilterOperator.
     */
    @JsonCreator
    public static RunQueryFilterOperator fromString(String name) {
        return fromString(name, RunQueryFilterOperator.class);
    }

    /**
     * Gets known RunQueryFilterOperator values.
     * 
     * @return known RunQueryFilterOperator values.
     */
    public static Collection<RunQueryFilterOperator> values() {
        return values(RunQueryFilterOperator.class);
    }
}
