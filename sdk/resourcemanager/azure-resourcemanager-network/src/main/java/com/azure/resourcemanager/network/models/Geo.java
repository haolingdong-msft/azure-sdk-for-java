// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The Geo for CIDR advertising. Should be an Geo code. */
public final class Geo extends ExpandableStringEnum<Geo> {
    /** Static value GLOBAL for Geo. */
    public static final Geo GLOBAL = fromString("GLOBAL");

    /** Static value AFRI for Geo. */
    public static final Geo AFRI = fromString("AFRI");

    /** Static value APAC for Geo. */
    public static final Geo APAC = fromString("APAC");

    /** Static value EURO for Geo. */
    public static final Geo EURO = fromString("EURO");

    /** Static value LATAM for Geo. */
    public static final Geo LATAM = fromString("LATAM");

    /** Static value NAM for Geo. */
    public static final Geo NAM = fromString("NAM");

    /** Static value ME for Geo. */
    public static final Geo ME = fromString("ME");

    /** Static value OCEANIA for Geo. */
    public static final Geo OCEANIA = fromString("OCEANIA");

    /** Static value AQ for Geo. */
    public static final Geo AQ = fromString("AQ");

    /**
     * Creates or finds a Geo from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Geo.
     */
    @JsonCreator
    public static Geo fromString(String name) {
        return fromString(name, Geo.class);
    }

    /**
     * Gets known Geo values.
     *
     * @return known Geo values.
     */
    public static Collection<Geo> values() {
        return values(Geo.class);
    }
}
