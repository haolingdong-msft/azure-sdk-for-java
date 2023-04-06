// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error information that the API returned. */
@Immutable
public final class ErrorResponse {
    /*
     * Error code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /*
     * Message that explains the error that the service reported.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /**
     * Creates an instance of ErrorResponse class.
     *
     * @param code the code value to set.
     * @param message the message value to set.
     */
    @JsonCreator
    public ErrorResponse(
            @JsonProperty(value = "code", required = true) String code,
            @JsonProperty(value = "message", required = true) String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Get the code property: Error code.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: Message that explains the error that the service reported.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }
}
