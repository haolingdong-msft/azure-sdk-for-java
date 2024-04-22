// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Microsoft Fabric Warehouse linked service properties.
 */
@Fluent
public final class WarehouseLinkedServiceTypeProperties {
    /*
     * The ID of Microsoft Fabric Warehouse artifact. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "artifactId", required = true)
    private Object artifactId;

    /*
     * The endpoint of Microsoft Fabric Warehouse server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "endpoint", required = true)
    private Object endpoint;

    /*
     * The ID of Microsoft Fabric workspace. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "workspaceId")
    private Object workspaceId;

    /*
     * The ID of the application used to authenticate against Microsoft Fabric Warehouse. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The Key of the application used to authenticate against Microsoft Fabric Warehouse.
     */
    @JsonProperty(value = "servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "tenant")
    private Object tenant;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string.
     */
    @JsonProperty(value = "encryptedCredential")
    private String encryptedCredential;

    /*
     * The service principal credential type to use in Server-To-Server authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "servicePrincipalCredentialType")
    private Object servicePrincipalCredentialType;

    /*
     * The credential of the service principal object in Azure Active Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert', servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "servicePrincipalCredential")
    private SecretBase servicePrincipalCredential;

    /**
     * Creates an instance of WarehouseLinkedServiceTypeProperties class.
     */
    public WarehouseLinkedServiceTypeProperties() {
    }

    /**
     * Get the artifactId property: The ID of Microsoft Fabric Warehouse artifact. Type: string (or Expression with
     * resultType string).
     * 
     * @return the artifactId value.
     */
    public Object artifactId() {
        return this.artifactId;
    }

    /**
     * Set the artifactId property: The ID of Microsoft Fabric Warehouse artifact. Type: string (or Expression with
     * resultType string).
     * 
     * @param artifactId the artifactId value to set.
     * @return the WarehouseLinkedServiceTypeProperties object itself.
     */
    public WarehouseLinkedServiceTypeProperties withArtifactId(Object artifactId) {
        this.artifactId = artifactId;
        return this;
    }

    /**
     * Get the endpoint property: The endpoint of Microsoft Fabric Warehouse server. Type: string (or Expression with
     * resultType string).
     * 
     * @return the endpoint value.
     */
    public Object endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: The endpoint of Microsoft Fabric Warehouse server. Type: string (or Expression with
     * resultType string).
     * 
     * @param endpoint the endpoint value to set.
     * @return the WarehouseLinkedServiceTypeProperties object itself.
     */
    public WarehouseLinkedServiceTypeProperties withEndpoint(Object endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the workspaceId property: The ID of Microsoft Fabric workspace. Type: string (or Expression with resultType
     * string).
     * 
     * @return the workspaceId value.
     */
    public Object workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: The ID of Microsoft Fabric workspace. Type: string (or Expression with resultType
     * string).
     * 
     * @param workspaceId the workspaceId value to set.
     * @return the WarehouseLinkedServiceTypeProperties object itself.
     */
    public WarehouseLinkedServiceTypeProperties withWorkspaceId(Object workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the application used to authenticate against Microsoft Fabric
     * Warehouse. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the application used to authenticate against Microsoft Fabric
     * Warehouse. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the WarehouseLinkedServiceTypeProperties object itself.
     */
    public WarehouseLinkedServiceTypeProperties withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The Key of the application used to authenticate against Microsoft Fabric
     * Warehouse.
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The Key of the application used to authenticate against Microsoft Fabric
     * Warehouse.
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the WarehouseLinkedServiceTypeProperties object itself.
     */
    public WarehouseLinkedServiceTypeProperties withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
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
     * @return the WarehouseLinkedServiceTypeProperties object itself.
     */
    public WarehouseLinkedServiceTypeProperties withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the WarehouseLinkedServiceTypeProperties object itself.
     */
    public WarehouseLinkedServiceTypeProperties withEncryptedCredential(String encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     * 
     * @return the servicePrincipalCredentialType value.
     */
    public Object servicePrincipalCredentialType() {
        return this.servicePrincipalCredentialType;
    }

    /**
     * Set the servicePrincipalCredentialType property: The service principal credential type to use in Server-To-Server
     * authentication. 'ServicePrincipalKey' for key/secret, 'ServicePrincipalCert' for certificate. Type: string (or
     * Expression with resultType string).
     * 
     * @param servicePrincipalCredentialType the servicePrincipalCredentialType value to set.
     * @return the WarehouseLinkedServiceTypeProperties object itself.
     */
    public WarehouseLinkedServiceTypeProperties
        withServicePrincipalCredentialType(Object servicePrincipalCredentialType) {
        this.servicePrincipalCredentialType = servicePrincipalCredentialType;
        return this;
    }

    /**
     * Get the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     * @return the servicePrincipalCredential value.
     */
    public SecretBase servicePrincipalCredential() {
        return this.servicePrincipalCredential;
    }

    /**
     * Set the servicePrincipalCredential property: The credential of the service principal object in Azure Active
     * Directory. If servicePrincipalCredentialType is 'ServicePrincipalKey', servicePrincipalCredential can be
     * SecureString or AzureKeyVaultSecretReference. If servicePrincipalCredentialType is 'ServicePrincipalCert',
     * servicePrincipalCredential can only be AzureKeyVaultSecretReference.
     * 
     * @param servicePrincipalCredential the servicePrincipalCredential value to set.
     * @return the WarehouseLinkedServiceTypeProperties object itself.
     */
    public WarehouseLinkedServiceTypeProperties withServicePrincipalCredential(SecretBase servicePrincipalCredential) {
        this.servicePrincipalCredential = servicePrincipalCredential;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (artifactId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property artifactId in model WarehouseLinkedServiceTypeProperties"));
        }
        if (endpoint() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property endpoint in model WarehouseLinkedServiceTypeProperties"));
        }
        if (servicePrincipalKey() != null) {
            servicePrincipalKey().validate();
        }
        if (servicePrincipalCredential() != null) {
            servicePrincipalCredential().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WarehouseLinkedServiceTypeProperties.class);
}
