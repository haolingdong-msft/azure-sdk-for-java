// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error details if there is any failure in load test run. */
@Immutable
public final class ErrorDetails {
    /*
     * Error details in case test run was not successfully run.
     */
    @Generated
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /** Creates an instance of ErrorDetails class. */
    @Generated
    private ErrorDetails() {}

    /**
     * Get the message property: Error details in case test run was not successfully run.
     *
     * @return the message value.
     */
    @Generated
    public String getMessage() {
        return this.message;
    }
}
