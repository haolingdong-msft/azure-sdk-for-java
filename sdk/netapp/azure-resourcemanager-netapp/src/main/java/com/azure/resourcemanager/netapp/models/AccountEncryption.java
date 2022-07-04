// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Encryption settings. */
@Fluent
public final class AccountEncryption {
    /*
     * Encryption Key Source. Possible values are: 'Microsoft.NetApp'.
     */
    @JsonProperty(value = "keySource")
    private String keySource;

    /**
     * Get the keySource property: Encryption Key Source. Possible values are: 'Microsoft.NetApp'.
     *
     * @return the keySource value.
     */
    public String keySource() {
        return this.keySource;
    }

    /**
     * Set the keySource property: Encryption Key Source. Possible values are: 'Microsoft.NetApp'.
     *
     * @param keySource the keySource value to set.
     * @return the AccountEncryption object itself.
     */
    public AccountEncryption withKeySource(String keySource) {
        this.keySource = keySource;
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
