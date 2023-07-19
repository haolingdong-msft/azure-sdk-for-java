// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Specify prefix-list bounds. */
public final class Condition extends ExpandableStringEnum<Condition> {
    /** Static value EqualTo for Condition. */
    public static final Condition EQUAL_TO = fromString("EqualTo");

    /** Static value GreaterThanOrEqualTo for Condition. */
    public static final Condition GREATER_THAN_OR_EQUAL_TO = fromString("GreaterThanOrEqualTo");

    /** Static value LesserThanOrEqualTo for Condition. */
    public static final Condition LESSER_THAN_OR_EQUAL_TO = fromString("LesserThanOrEqualTo");

    /** Static value Range for Condition. */
    public static final Condition RANGE = fromString("Range");

    /**
     * Creates a new instance of Condition value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Condition() {
    }

    /**
     * Creates or finds a Condition from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Condition.
     */
    @JsonCreator
    public static Condition fromString(String name) {
        return fromString(name, Condition.class);
    }

    /**
     * Gets known Condition values.
     *
     * @return known Condition values.
     */
    public static Collection<Condition> values() {
        return values(Condition.class);
    }
}
