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

/** Azure ML Studio Web Service linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureML")
@JsonFlatten
@Fluent
public class AzureMLLinkedService extends LinkedService {
    /*
     * The Batch Execution REST URL for an Azure ML Studio Web Service
     * endpoint. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.mlEndpoint", required = true)
    private Object mlEndpoint;

    /*
     * The API key for accessing the Azure ML model endpoint.
     */
    @JsonProperty(value = "typeProperties.apiKey", required = true)
    private SecretBase apiKey;

    /*
     * The Update Resource REST URL for an Azure ML Studio Web Service
     * endpoint. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.updateResourceEndpoint")
    private Object updateResourceEndpoint;

    /*
     * The ID of the service principal used to authenticate against the
     * ARM-based updateResourceEndpoint of an Azure ML Studio web service.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The key of the service principal used to authenticate against the
     * ARM-based updateResourceEndpoint of an Azure ML Studio web service.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tenant")
    private Object tenant;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the mlEndpoint property: The Batch Execution REST URL for an Azure ML Studio Web Service endpoint. Type:
     * string (or Expression with resultType string).
     *
     * @return the mlEndpoint value.
     */
    public Object getMlEndpoint() {
        return this.mlEndpoint;
    }

    /**
     * Set the mlEndpoint property: The Batch Execution REST URL for an Azure ML Studio Web Service endpoint. Type:
     * string (or Expression with resultType string).
     *
     * @param mlEndpoint the mlEndpoint value to set.
     * @return the AzureMLLinkedService object itself.
     */
    public AzureMLLinkedService setMlEndpoint(Object mlEndpoint) {
        this.mlEndpoint = mlEndpoint;
        return this;
    }

    /**
     * Get the apiKey property: The API key for accessing the Azure ML model endpoint.
     *
     * @return the apiKey value.
     */
    public SecretBase getApiKey() {
        return this.apiKey;
    }

    /**
     * Set the apiKey property: The API key for accessing the Azure ML model endpoint.
     *
     * @param apiKey the apiKey value to set.
     * @return the AzureMLLinkedService object itself.
     */
    public AzureMLLinkedService setApiKey(SecretBase apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Get the updateResourceEndpoint property: The Update Resource REST URL for an Azure ML Studio Web Service
     * endpoint. Type: string (or Expression with resultType string).
     *
     * @return the updateResourceEndpoint value.
     */
    public Object getUpdateResourceEndpoint() {
        return this.updateResourceEndpoint;
    }

    /**
     * Set the updateResourceEndpoint property: The Update Resource REST URL for an Azure ML Studio Web Service
     * endpoint. Type: string (or Expression with resultType string).
     *
     * @param updateResourceEndpoint the updateResourceEndpoint value to set.
     * @return the AzureMLLinkedService object itself.
     */
    public AzureMLLinkedService setUpdateResourceEndpoint(Object updateResourceEndpoint) {
        this.updateResourceEndpoint = updateResourceEndpoint;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the service principal used to authenticate against the ARM-based
     * updateResourceEndpoint of an Azure ML Studio web service. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object getServicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the service principal used to authenticate against the ARM-based
     * updateResourceEndpoint of an Azure ML Studio web service. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureMLLinkedService object itself.
     */
    public AzureMLLinkedService setServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The key of the service principal used to authenticate against the ARM-based
     * updateResourceEndpoint of an Azure ML Studio web service.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase getServicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The key of the service principal used to authenticate against the ARM-based
     * updateResourceEndpoint of an Azure ML Studio web service.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureMLLinkedService object itself.
     */
    public AzureMLLinkedService setServicePrincipalKey(SecretBase servicePrincipalKey) {
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
     * @return the AzureMLLinkedService object itself.
     */
    public AzureMLLinkedService setTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureMLLinkedService object itself.
     */
    public AzureMLLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureMLLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureMLLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureMLLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureMLLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
