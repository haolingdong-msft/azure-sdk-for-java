// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifications of the Logs for Azure Monitoring. */
@Fluent
public final class LogSpecification {
    /*
     * Name of the log.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Localized friendly display name of the log.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Get the name property: Name of the log.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the log.
     *
     * @param name the name value to set.
     * @return the LogSpecification object itself.
     */
    public LogSpecification withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Localized friendly display name of the log.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Localized friendly display name of the log.
     *
     * @param displayName the displayName value to set.
     * @return the LogSpecification object itself.
     */
    public LogSpecification withDisplayName(String displayName) {
        this.displayName = displayName;
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
