// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the outcome of a detection operation performed by content filtering.
 */
@Immutable
public final class ContentFilterDetectionResult {

    /*
     * A value indicating whether or not the content has been filtered.
     */
    @Generated
    @JsonProperty(value = "filtered")
    private final boolean filtered;

    /*
     * A value indicating whether detection occurred, irrespective of severity or whether the content was filtered.
     */
    @Generated
    @JsonProperty(value = "detected")
    private final boolean detected;

    /**
     * Creates an instance of ContentFilterDetectionResult class.
     *
     * @param filtered the filtered value to set.
     * @param detected the detected value to set.
     */
    @Generated
    @JsonCreator
    private ContentFilterDetectionResult(@JsonProperty(value = "filtered") boolean filtered,
        @JsonProperty(value = "detected") boolean detected) {
        this.filtered = filtered;
        this.detected = detected;
    }

    /**
     * Get the filtered property: A value indicating whether or not the content has been filtered.
     *
     * @return the filtered value.
     */
    @Generated
    public boolean isFiltered() {
        return this.filtered;
    }

    /**
     * Get the detected property: A value indicating whether detection occurred, irrespective of severity or whether the
     * content was filtered.
     *
     * @return the detected value.
     */
    @Generated
    public boolean isDetected() {
        return this.detected;
    }
}
