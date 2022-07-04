// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for EncoderNamedPreset. */
public final class EncoderNamedPreset extends ExpandableStringEnum<EncoderNamedPreset> {
    /** Static value H264SingleBitrateSD for EncoderNamedPreset. */
    public static final EncoderNamedPreset H264SINGLE_BITRATE_SD = fromString("H264SingleBitrateSD");

    /** Static value H264SingleBitrate720p for EncoderNamedPreset. */
    public static final EncoderNamedPreset H264SINGLE_BITRATE720P = fromString("H264SingleBitrate720p");

    /** Static value H264SingleBitrate1080p for EncoderNamedPreset. */
    public static final EncoderNamedPreset H264SINGLE_BITRATE1080P = fromString("H264SingleBitrate1080p");

    /** Static value AdaptiveStreaming for EncoderNamedPreset. */
    public static final EncoderNamedPreset ADAPTIVE_STREAMING = fromString("AdaptiveStreaming");

    /** Static value AACGoodQualityAudio for EncoderNamedPreset. */
    public static final EncoderNamedPreset AACGOOD_QUALITY_AUDIO = fromString("AACGoodQualityAudio");

    /** Static value ContentAwareEncodingExperimental for EncoderNamedPreset. */
    public static final EncoderNamedPreset CONTENT_AWARE_ENCODING_EXPERIMENTAL =
        fromString("ContentAwareEncodingExperimental");

    /** Static value ContentAwareEncoding for EncoderNamedPreset. */
    public static final EncoderNamedPreset CONTENT_AWARE_ENCODING = fromString("ContentAwareEncoding");

    /** Static value CopyAllBitrateNonInterleaved for EncoderNamedPreset. */
    public static final EncoderNamedPreset COPY_ALL_BITRATE_NON_INTERLEAVED =
        fromString("CopyAllBitrateNonInterleaved");

    /** Static value H264MultipleBitrate1080p for EncoderNamedPreset. */
    public static final EncoderNamedPreset H264MULTIPLE_BITRATE1080P = fromString("H264MultipleBitrate1080p");

    /** Static value H264MultipleBitrate720p for EncoderNamedPreset. */
    public static final EncoderNamedPreset H264MULTIPLE_BITRATE720P = fromString("H264MultipleBitrate720p");

    /** Static value H264MultipleBitrateSD for EncoderNamedPreset. */
    public static final EncoderNamedPreset H264MULTIPLE_BITRATE_SD = fromString("H264MultipleBitrateSD");

    /** Static value H265ContentAwareEncoding for EncoderNamedPreset. */
    public static final EncoderNamedPreset H265CONTENT_AWARE_ENCODING = fromString("H265ContentAwareEncoding");

    /** Static value H265AdaptiveStreaming for EncoderNamedPreset. */
    public static final EncoderNamedPreset H265ADAPTIVE_STREAMING = fromString("H265AdaptiveStreaming");

    /** Static value H265SingleBitrate720p for EncoderNamedPreset. */
    public static final EncoderNamedPreset H265SINGLE_BITRATE720P = fromString("H265SingleBitrate720p");

    /** Static value H265SingleBitrate1080p for EncoderNamedPreset. */
    public static final EncoderNamedPreset H265SINGLE_BITRATE1080P = fromString("H265SingleBitrate1080p");

    /** Static value H265SingleBitrate4K for EncoderNamedPreset. */
    public static final EncoderNamedPreset H265SINGLE_BITRATE4K = fromString("H265SingleBitrate4K");

    /**
     * Creates or finds a EncoderNamedPreset from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding EncoderNamedPreset.
     */
    @JsonCreator
    public static EncoderNamedPreset fromString(String name) {
        return fromString(name, EncoderNamedPreset.class);
    }

    /**
     * Gets known EncoderNamedPreset values.
     *
     * @return known EncoderNamedPreset values.
     */
    public static Collection<EncoderNamedPreset> values() {
        return values(EncoderNamedPreset.class);
    }
}
