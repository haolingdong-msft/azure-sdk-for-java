// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DhGroup. */
public final class DhGroup extends ExpandableStringEnum<DhGroup> {
    /** Static value None for DhGroup. */
    public static final DhGroup NONE = fromString("None");

    /** Static value DHGroup1 for DhGroup. */
    public static final DhGroup DHGROUP1 = fromString("DHGroup1");

    /** Static value DHGroup2 for DhGroup. */
    public static final DhGroup DHGROUP2 = fromString("DHGroup2");

    /** Static value DHGroup14 for DhGroup. */
    public static final DhGroup DHGROUP14 = fromString("DHGroup14");

    /** Static value DHGroup2048 for DhGroup. */
    public static final DhGroup DHGROUP2048 = fromString("DHGroup2048");

    /** Static value ECP256 for DhGroup. */
    public static final DhGroup ECP256 = fromString("ECP256");

    /** Static value ECP384 for DhGroup. */
    public static final DhGroup ECP384 = fromString("ECP384");

    /** Static value DHGroup24 for DhGroup. */
    public static final DhGroup DHGROUP24 = fromString("DHGroup24");

    /**
     * Creates or finds a DhGroup from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DhGroup.
     */
    @JsonCreator
    public static DhGroup fromString(String name) {
        return fromString(name, DhGroup.class);
    }

    /**
     * Gets known DhGroup values.
     *
     * @return known DhGroup values.
     */
    public static Collection<DhGroup> values() {
        return values(DhGroup.class);
    }
}
