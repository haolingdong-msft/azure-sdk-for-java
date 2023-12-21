// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.CredentialReference;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Data Explorer (Kusto) linked service properties.
 */
@Fluent
public final class AzureDataExplorerLinkedServiceTypeProperties {
    /*
     * The endpoint of Azure Data Explorer (the engine's endpoint). URL will be in the format
     * https://<clusterName>.<regionName>.kusto.windows.net. Type: string (or Expression with resultType string)
     */
    @JsonProperty(value = "endpoint", required = true)
    private Object endpoint;

    /*
     * The ID of the service principal used to authenticate against Azure Data Explorer. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The key of the service principal used to authenticate against Kusto.
     */
    @JsonProperty(value = "servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * Database name for connection. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "database", required = true)
    private Object database;

    /*
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "tenant")
    private Object tenant;

    /*
     * The credential reference containing authentication information.
     */
    @JsonProperty(value = "credential")
    private CredentialReference credential;

    /**
     * Creates an instance of AzureDataExplorerLinkedServiceTypeProperties class.
     */
    public AzureDataExplorerLinkedServiceTypeProperties() {
    }

    /**
     * Get the endpoint property: The endpoint of Azure Data Explorer (the engine's endpoint). URL will be in the
     * format https://&lt;clusterName&gt;.&lt;regionName&gt;.kusto.windows.net. Type: string (or Expression with
     * resultType string).
     * 
     * @return the endpoint value.
     */
    public Object endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint of Azure Data Explorer (the engine's endpoint). URL will be in the
     * format https://&lt;clusterName&gt;.&lt;regionName&gt;.kusto.windows.net. Type: string (or Expression with
     * resultType string).
     * 
     * @param endpoint the endpoint value to set.
     * @return the AzureDataExplorerLinkedServiceTypeProperties object itself.
     */
    public AzureDataExplorerLinkedServiceTypeProperties withEndpoint(Object endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the service principal used to authenticate against Azure Data
     * Explorer. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the service principal used to authenticate against Azure Data
     * Explorer. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureDataExplorerLinkedServiceTypeProperties object itself.
     */
    public AzureDataExplorerLinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The key of the service principal used to authenticate against Kusto.
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The key of the service principal used to authenticate against Kusto.
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureDataExplorerLinkedServiceTypeProperties object itself.
     */
    public AzureDataExplorerLinkedServiceTypeProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the database property: Database name for connection. Type: string (or Expression with resultType string).
     * 
     * @return the database value.
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database property: Database name for connection. Type: string (or Expression with resultType string).
     * 
     * @param database the database value to set.
     * @return the AzureDataExplorerLinkedServiceTypeProperties object itself.
     */
    public AzureDataExplorerLinkedServiceTypeProperties withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @return the tenant value.
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @param tenant the tenant value to set.
     * @return the AzureDataExplorerLinkedServiceTypeProperties object itself.
     */
    public AzureDataExplorerLinkedServiceTypeProperties withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     * 
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.credential;
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     * 
     * @param credential the credential value to set.
     * @return the AzureDataExplorerLinkedServiceTypeProperties object itself.
     */
    public AzureDataExplorerLinkedServiceTypeProperties withCredential(CredentialReference credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoint() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property endpoint in model AzureDataExplorerLinkedServiceTypeProperties"));
        }
        if (servicePrincipalKey() != null) {
            servicePrincipalKey().validate();
        }
        if (database() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property database in model AzureDataExplorerLinkedServiceTypeProperties"));
        }
        if (credential() != null) {
            credential().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureDataExplorerLinkedServiceTypeProperties.class);
}
