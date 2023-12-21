// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Couchbase server linked service properties.
 */
@Fluent
public final class CouchbaseLinkedServiceTypeProperties {
    /*
     * An ODBC connection string. Type: string, SecureString or AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "connectionString")
    private Object connectionString;

    /*
     * The Azure key vault secret reference of credString in connection string.
     */
    @JsonProperty(value = "credString")
    private AzureKeyVaultSecretReference credString;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /**
     * Creates an instance of CouchbaseLinkedServiceTypeProperties class.
     */
    public CouchbaseLinkedServiceTypeProperties() {
    }

    /**
     * Get the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     * 
     * @param connectionString the connectionString value to set.
     * @return the CouchbaseLinkedServiceTypeProperties object itself.
     */
    public CouchbaseLinkedServiceTypeProperties withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the credString property: The Azure key vault secret reference of credString in connection string.
     * 
     * @return the credString value.
     */
    public AzureKeyVaultSecretReference credString() {
        return this.credString;
    }

    /**
     * Set the credString property: The Azure key vault secret reference of credString in connection string.
     * 
     * @param credString the credString value to set.
     * @return the CouchbaseLinkedServiceTypeProperties object itself.
     */
    public CouchbaseLinkedServiceTypeProperties withCredString(AzureKeyVaultSecretReference credString) {
        this.credString = credString;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the CouchbaseLinkedServiceTypeProperties object itself.
     */
    public CouchbaseLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (credString() != null) {
            credString().validate();
        }
    }
}
