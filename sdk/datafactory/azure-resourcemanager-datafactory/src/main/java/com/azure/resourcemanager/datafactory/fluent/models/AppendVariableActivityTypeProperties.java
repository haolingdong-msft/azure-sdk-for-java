// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AppendVariable activity properties.
 */
@Fluent
public final class AppendVariableActivityTypeProperties {
    /*
     * Name of the variable whose value needs to be appended to.
     */
    @JsonProperty(value = "variableName")
    private String variableName;

    /*
     * Value to be appended. Type: could be a static value matching type of the variable item or Expression with resultType matching type of the variable item
     */
    @JsonProperty(value = "value")
    private Object value;

    /**
     * Creates an instance of AppendVariableActivityTypeProperties class.
     */
    public AppendVariableActivityTypeProperties() {
    }

    /**
     * Get the variableName property: Name of the variable whose value needs to be appended to.
     * 
     * @return the variableName value.
     */
    public String variableName() {
        return this.variableName;
    }

    /**
     * Set the variableName property: Name of the variable whose value needs to be appended to.
     * 
     * @param variableName the variableName value to set.
     * @return the AppendVariableActivityTypeProperties object itself.
     */
    public AppendVariableActivityTypeProperties withVariableName(String variableName) {
        this.variableName = variableName;
        return this;
    }

    /**
     * Get the value property: Value to be appended. Type: could be a static value matching type of the variable item or
     * Expression with resultType matching type of the variable item.
     * 
     * @return the value value.
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value property: Value to be appended. Type: could be a static value matching type of the variable item or
     * Expression with resultType matching type of the variable item.
     * 
     * @param value the value value to set.
     * @return the AppendVariableActivityTypeProperties object itself.
     */
    public AppendVariableActivityTypeProperties withValue(Object value) {
        this.value = value;
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
