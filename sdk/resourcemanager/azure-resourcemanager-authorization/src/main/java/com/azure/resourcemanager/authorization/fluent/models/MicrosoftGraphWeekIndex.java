// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** weekIndex. */
public final class MicrosoftGraphWeekIndex extends ExpandableStringEnum<MicrosoftGraphWeekIndex> {
    /** Static value first for MicrosoftGraphWeekIndex. */
    public static final MicrosoftGraphWeekIndex FIRST = fromString("first");

    /** Static value second for MicrosoftGraphWeekIndex. */
    public static final MicrosoftGraphWeekIndex SECOND = fromString("second");

    /** Static value third for MicrosoftGraphWeekIndex. */
    public static final MicrosoftGraphWeekIndex THIRD = fromString("third");

    /** Static value fourth for MicrosoftGraphWeekIndex. */
    public static final MicrosoftGraphWeekIndex FOURTH = fromString("fourth");

    /** Static value last for MicrosoftGraphWeekIndex. */
    public static final MicrosoftGraphWeekIndex LAST = fromString("last");

    /**
     * Creates or finds a MicrosoftGraphWeekIndex from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphWeekIndex.
     */
    @JsonCreator
    public static MicrosoftGraphWeekIndex fromString(String name) {
        return fromString(name, MicrosoftGraphWeekIndex.class);
    }

    /**
     * Gets known MicrosoftGraphWeekIndex values.
     *
     * @return known MicrosoftGraphWeekIndex values.
     */
    public static Collection<MicrosoftGraphWeekIndex> values() {
        return values(MicrosoftGraphWeekIndex.class);
    }
}
