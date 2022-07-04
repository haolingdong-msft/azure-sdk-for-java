// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ScalingHostPoolType. */
public final class ScalingHostPoolType extends ExpandableStringEnum<ScalingHostPoolType> {
    /** Static value Pooled for ScalingHostPoolType. */
    public static final ScalingHostPoolType POOLED = fromString("Pooled");

    /**
     * Creates or finds a ScalingHostPoolType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScalingHostPoolType.
     */
    @JsonCreator
    public static ScalingHostPoolType fromString(String name) {
        return fromString(name, ScalingHostPoolType.class);
    }

    /**
     * Gets known ScalingHostPoolType values.
     *
     * @return known ScalingHostPoolType values.
     */
    public static Collection<ScalingHostPoolType> values() {
        return values(ScalingHostPoolType.class);
    }
}
