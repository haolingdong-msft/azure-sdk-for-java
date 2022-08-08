// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties to configure Encryption. */
@Fluent
public final class Encryption {
    /*
     * Properties of KeyVault
     */
    @JsonProperty(value = "keyVaultProperties")
    private List<KeyVaultProperties> keyVaultProperties;

    /*
     * Enumerates the possible value of keySource for Encryption
     */
    @JsonProperty(value = "keySource")
    private KeySource keySource;

    /*
     * Enable Infrastructure Encryption (Double Encryption)
     */
    @JsonProperty(value = "requireInfrastructureEncryption")
    private Boolean requireInfrastructureEncryption;

    /**
     * Get the keyVaultProperties property: Properties of KeyVault.
     *
     * @return the keyVaultProperties value.
     */
    public List<KeyVaultProperties> keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: Properties of KeyVault.
     *
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the Encryption object itself.
     */
    public Encryption withKeyVaultProperties(List<KeyVaultProperties> keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Get the keySource property: Enumerates the possible value of keySource for Encryption.
     *
     * @return the keySource value.
     */
    public KeySource keySource() {
        return this.keySource;
    }

    /**
     * Set the keySource property: Enumerates the possible value of keySource for Encryption.
     *
     * @param keySource the keySource value to set.
     * @return the Encryption object itself.
     */
    public Encryption withKeySource(KeySource keySource) {
        this.keySource = keySource;
        return this;
    }

    /**
     * Get the requireInfrastructureEncryption property: Enable Infrastructure Encryption (Double Encryption).
     *
     * @return the requireInfrastructureEncryption value.
     */
    public Boolean requireInfrastructureEncryption() {
        return this.requireInfrastructureEncryption;
    }

    /**
     * Set the requireInfrastructureEncryption property: Enable Infrastructure Encryption (Double Encryption).
     *
     * @param requireInfrastructureEncryption the requireInfrastructureEncryption value to set.
     * @return the Encryption object itself.
     */
    public Encryption withRequireInfrastructureEncryption(Boolean requireInfrastructureEncryption) {
        this.requireInfrastructureEncryption = requireInfrastructureEncryption;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultProperties() != null) {
            keyVaultProperties().forEach(e -> e.validate());
        }
    }
}
