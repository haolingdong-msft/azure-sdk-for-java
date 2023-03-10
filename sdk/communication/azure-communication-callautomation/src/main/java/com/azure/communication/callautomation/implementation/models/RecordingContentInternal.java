// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RecordingContentInternal. */
public final class RecordingContentInternal extends ExpandableStringEnum<RecordingContentInternal> {
    /** Static value audio for RecordingContentInternal. */
    public static final RecordingContentInternal AUDIO = fromString("audio");

    /** Static value audioVideo for RecordingContentInternal. */
    public static final RecordingContentInternal AUDIO_VIDEO = fromString("audioVideo");

    /**
     * Creates or finds a RecordingContentInternal from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RecordingContentInternal.
     */
    @JsonCreator
    public static RecordingContentInternal fromString(String name) {
        return fromString(name, RecordingContentInternal.class);
    }

    /**
     * Gets known RecordingContentInternal values.
     *
     * @return known RecordingContentInternal values.
     */
    public static Collection<RecordingContentInternal> values() {
        return values(RecordingContentInternal.class);
    }
}
