// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.opentelemetry.exporter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The abstract common base of all domains. */
@Fluent
public class MonitorDomain {
    /*
     * Schema version
     */
    @JsonProperty(value = "ver", required = true)
    private int version;

    /*
     * The abstract common base of all domains.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the version property: Schema version.
     *
     * @return the version value.
     */
    public int getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Schema version.
     *
     * @param version the version value to set.
     * @return the MonitorDomain object itself.
     */
    public MonitorDomain setVersion(int version) {
        this.version = version;
        return this;
    }

    /**
     * Get the additionalProperties property: The abstract common base of all domains.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The abstract common base of all domains.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MonitorDomain object itself.
     */
    public MonitorDomain setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
