// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Ingest fragment dropped event data. Schema of the data property of an EventGridEvent for a
 * Microsoft.Media.LiveEventIncomingDataChunkDropped event.
 */
@Immutable
public final class MediaLiveEventIncomingDataChunkDroppedEventData {
    /*
     * Gets the timestamp of the data chunk dropped.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String timestamp;

    /*
     * Gets the type of the track (Audio / Video).
     */
    @JsonProperty(value = "trackType", access = JsonProperty.Access.WRITE_ONLY)
    private String trackType;

    /*
     * Gets the bitrate of the track.
     */
    @JsonProperty(value = "bitrate", access = JsonProperty.Access.WRITE_ONLY)
    private Long bitrate;

    /*
     * Gets the timescale of the Timestamp.
     */
    @JsonProperty(value = "timescale", access = JsonProperty.Access.WRITE_ONLY)
    private String timescale;

    /*
     * Gets the result code for fragment drop operation.
     */
    @JsonProperty(value = "resultCode", access = JsonProperty.Access.WRITE_ONLY)
    private String resultCode;

    /*
     * Gets the name of the track for which fragment is dropped.
     */
    @JsonProperty(value = "trackName", access = JsonProperty.Access.WRITE_ONLY)
    private String trackName;

    /**
     * Get the timestamp property: Gets the timestamp of the data chunk dropped.
     *
     * @return the timestamp value.
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * Get the trackType property: Gets the type of the track (Audio / Video).
     *
     * @return the trackType value.
     */
    public String getTrackType() {
        return this.trackType;
    }

    /**
     * Get the bitrate property: Gets the bitrate of the track.
     *
     * @return the bitrate value.
     */
    public Long getBitrate() {
        return this.bitrate;
    }

    /**
     * Get the timescale property: Gets the timescale of the Timestamp.
     *
     * @return the timescale value.
     */
    public String getTimescale() {
        return this.timescale;
    }

    /**
     * Get the resultCode property: Gets the result code for fragment drop operation.
     *
     * @return the resultCode value.
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * Get the trackName property: Gets the name of the track for which fragment is dropped.
     *
     * @return the trackName value.
     */
    public String getTrackName() {
        return this.trackName;
    }
}
