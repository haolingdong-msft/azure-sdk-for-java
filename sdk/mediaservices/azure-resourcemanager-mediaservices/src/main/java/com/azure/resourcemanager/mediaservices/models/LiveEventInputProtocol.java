// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LiveEventInputProtocol. */
public final class LiveEventInputProtocol extends ExpandableStringEnum<LiveEventInputProtocol> {
    /** Static value FragmentedMP4 for LiveEventInputProtocol. */
    public static final LiveEventInputProtocol FRAGMENTED_MP4 = fromString("FragmentedMP4");

    /** Static value RTMP for LiveEventInputProtocol. */
    public static final LiveEventInputProtocol RTMP = fromString("RTMP");

    /**
     * Creates or finds a LiveEventInputProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LiveEventInputProtocol.
     */
    @JsonCreator
    public static LiveEventInputProtocol fromString(String name) {
        return fromString(name, LiveEventInputProtocol.class);
    }

    /**
     * Gets known LiveEventInputProtocol values.
     *
     * @return known LiveEventInputProtocol values.
     */
    public static Collection<LiveEventInputProtocol> values() {
        return values(LiveEventInputProtocol.class);
    }
}
