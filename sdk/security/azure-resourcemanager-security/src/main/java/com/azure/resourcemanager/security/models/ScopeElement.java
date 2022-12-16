// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** A more specific scope used to identify the alerts to suppress. */
@Fluent
public final class ScopeElement {
    /*
     * The alert entity type to suppress by.
     */
    @JsonProperty(value = "field")
    private String field;

    /*
     * A more specific scope used to identify the alerts to suppress.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of ScopeElement class. */
    public ScopeElement() {
    }

    /**
     * Get the field property: The alert entity type to suppress by.
     *
     * @return the field value.
     */
    public String field() {
        return this.field;
    }

    /**
     * Set the field property: The alert entity type to suppress by.
     *
     * @param field the field value to set.
     * @return the ScopeElement object itself.
     */
    public ScopeElement withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * Get the additionalProperties property: A more specific scope used to identify the alerts to suppress.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: A more specific scope used to identify the alerts to suppress.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ScopeElement object itself.
     */
    public ScopeElement withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
