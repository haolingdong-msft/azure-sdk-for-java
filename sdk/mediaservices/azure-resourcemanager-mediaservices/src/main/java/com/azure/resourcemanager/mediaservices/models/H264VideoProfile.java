// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for H264VideoProfile. */
public final class H264VideoProfile extends ExpandableStringEnum<H264VideoProfile> {
    /** Static value Auto for H264VideoProfile. */
    public static final H264VideoProfile AUTO = fromString("Auto");

    /** Static value Baseline for H264VideoProfile. */
    public static final H264VideoProfile BASELINE = fromString("Baseline");

    /** Static value Main for H264VideoProfile. */
    public static final H264VideoProfile MAIN = fromString("Main");

    /** Static value High for H264VideoProfile. */
    public static final H264VideoProfile HIGH = fromString("High");

    /** Static value High422 for H264VideoProfile. */
    public static final H264VideoProfile HIGH422 = fromString("High422");

    /** Static value High444 for H264VideoProfile. */
    public static final H264VideoProfile HIGH444 = fromString("High444");

    /**
     * Creates or finds a H264VideoProfile from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding H264VideoProfile.
     */
    @JsonCreator
    public static H264VideoProfile fromString(String name) {
        return fromString(name, H264VideoProfile.class);
    }

    /**
     * Gets known H264VideoProfile values.
     *
     * @return known H264VideoProfile values.
     */
    public static Collection<H264VideoProfile> values() {
        return values(H264VideoProfile.class);
    }
}
