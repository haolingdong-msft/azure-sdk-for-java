/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Client performance information.
 */
public class EventsClientPerformanceInfo {
    /**
     * The name of the client performance.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name of the client performance.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the client performance.
     *
     * @param name the name value to set
     * @return the EventsClientPerformanceInfo object itself.
     */
    public EventsClientPerformanceInfo withName(String name) {
        this.name = name;
        return this;
    }

}
