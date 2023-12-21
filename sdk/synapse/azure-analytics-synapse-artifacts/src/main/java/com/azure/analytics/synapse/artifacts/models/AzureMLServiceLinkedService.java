// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Azure ML Service linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureMLService")
@JsonFlatten
@Fluent
public class AzureMLServiceLinkedService extends LinkedService {
    /*
     * Azure ML Service workspace subscription ID. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.subscriptionId", required = true)
    private Object subscriptionId;

    /*
     * Azure ML Service workspace resource group name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.resourceGroupName", required = true)
    private Object resourceGroupName;

    /*
     * Azure ML Service workspace name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.mlWorkspaceName", required = true)
    private Object mlWorkspaceName;

    /*
     * Type of authentication (Required to specify MSI) used to connect to AzureML. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.authentication")
    private Object authentication;

    /*
     * The ID of the service principal used to authenticate against the endpoint of a published Azure ML Service
     * pipeline. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The key of the service principal used to authenticate against the endpoint of a published Azure ML Service
     * pipeline.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.tenant")
    private Object tenant;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Creates an instance of AzureMLServiceLinkedService class.
     */
    public AzureMLServiceLinkedService() {
    }

    /**
     * Get the subscriptionId property: Azure ML Service workspace subscription ID. Type: string (or Expression with
     * resultType string).
     * 
     * @return the subscriptionId value.
     */
    public Object getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Azure ML Service workspace subscription ID. Type: string (or Expression with
     * resultType string).
     * 
     * @param subscriptionId the subscriptionId value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService setSubscriptionId(Object subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: Azure ML Service workspace resource group name. Type: string (or Expression
     * with resultType string).
     * 
     * @return the resourceGroupName value.
     */
    public Object getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: Azure ML Service workspace resource group name. Type: string (or Expression
     * with resultType string).
     * 
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService setResourceGroupName(Object resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the mlWorkspaceName property: Azure ML Service workspace name. Type: string (or Expression with resultType
     * string).
     * 
     * @return the mlWorkspaceName value.
     */
    public Object getMlWorkspaceName() {
        return this.mlWorkspaceName;
    }

    /**
     * Set the mlWorkspaceName property: Azure ML Service workspace name. Type: string (or Expression with resultType
     * string).
     * 
     * @param mlWorkspaceName the mlWorkspaceName value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService setMlWorkspaceName(Object mlWorkspaceName) {
        this.mlWorkspaceName = mlWorkspaceName;
        return this;
    }

    /**
     * Get the authentication property: Type of authentication (Required to specify MSI) used to connect to AzureML.
     * Type: string (or Expression with resultType string).
     * 
     * @return the authentication value.
     */
    public Object getAuthentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: Type of authentication (Required to specify MSI) used to connect to AzureML.
     * Type: string (or Expression with resultType string).
     * 
     * @param authentication the authentication value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService setAuthentication(Object authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the service principal used to authenticate against the endpoint
     * of a published Azure ML Service pipeline. Type: string (or Expression with resultType string).
     * 
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the service principal used to authenticate against the endpoint
     * of a published Azure ML Service pipeline. Type: string (or Expression with resultType string).
     * 
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The key of the service principal used to authenticate against the endpoint
     * of a published Azure ML Service pipeline.
     * 
     * @return the servicePrincipalKey value.
     */
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The key of the service principal used to authenticate against the endpoint
     * of a published Azure ML Service pipeline.
     * 
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService setServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @return the tenant value.
     */
    public Object getTenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     * 
     * @param tenant the tenant value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService setTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureMLServiceLinkedService object itself.
     */
    public AzureMLServiceLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLServiceLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLServiceLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLServiceLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLServiceLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
