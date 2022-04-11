// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The logs. */
@Fluent
public final class LogsInner {
    /*
     * The content of the log.
     */
    @JsonProperty(value = "content")
    private String content;

    /**
     * Get the content property: The content of the log.
     *
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: The content of the log.
     *
     * @param content the content value to set.
     * @return the LogsInner object itself.
     */
    public LogsInner withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
