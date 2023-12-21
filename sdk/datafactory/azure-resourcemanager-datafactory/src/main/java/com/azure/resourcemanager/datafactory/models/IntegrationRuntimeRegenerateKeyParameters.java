// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters to regenerate the authentication key.
 */
@Fluent
public final class IntegrationRuntimeRegenerateKeyParameters {
    /*
     * The name of the authentication key to regenerate.
     */
    @JsonProperty(value = "keyName")
    private IntegrationRuntimeAuthKeyName keyName;

    /**
     * Creates an instance of IntegrationRuntimeRegenerateKeyParameters class.
     */
    public IntegrationRuntimeRegenerateKeyParameters() {
    }

    /**
     * Get the keyName property: The name of the authentication key to regenerate.
     * 
     * @return the keyName value.
     */
    public IntegrationRuntimeAuthKeyName keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The name of the authentication key to regenerate.
     * 
     * @param keyName the keyName value to set.
     * @return the IntegrationRuntimeRegenerateKeyParameters object itself.
     */
    public IntegrationRuntimeRegenerateKeyParameters withKeyName(IntegrationRuntimeAuthKeyName keyName) {
        this.keyName = keyName;
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
