// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Complexity. */
public final class Complexity extends ExpandableStringEnum<Complexity> {
    /** Static value Speed for Complexity. */
    public static final Complexity SPEED = fromString("Speed");

    /** Static value Balanced for Complexity. */
    public static final Complexity BALANCED = fromString("Balanced");

    /** Static value Quality for Complexity. */
    public static final Complexity QUALITY = fromString("Quality");

    /**
     * Creates or finds a Complexity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Complexity.
     */
    @JsonCreator
    public static Complexity fromString(String name) {
        return fromString(name, Complexity.class);
    }

    /**
     * Gets known Complexity values.
     *
     * @return known Complexity values.
     */
    public static Collection<Complexity> values() {
        return values(Complexity.class);
    }
}
