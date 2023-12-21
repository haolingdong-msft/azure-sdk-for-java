// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SapCloudForCustomerLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Linked service for SAP Cloud for Customer.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapCloudForCustomer")
@Fluent
public final class SapCloudForCustomerLinkedService extends LinkedService {
    /*
     * SAP Cloud for Customer linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SapCloudForCustomerLinkedServiceTypeProperties innerTypeProperties
        = new SapCloudForCustomerLinkedServiceTypeProperties();

    /**
     * Creates an instance of SapCloudForCustomerLinkedService class.
     */
    public SapCloudForCustomerLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: SAP Cloud for Customer linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private SapCloudForCustomerLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapCloudForCustomerLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapCloudForCustomerLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapCloudForCustomerLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapCloudForCustomerLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the url property: The URL of SAP Cloud for Customer OData API. For example,
     * '[https://[tenantname].crm.ondemand.com/sap/c4c/odata/v1]'. Type: string (or Expression with resultType string).
     * 
     * @return the url value.
     */
    public Object url() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().url();
    }

    /**
     * Set the url property: The URL of SAP Cloud for Customer OData API. For example,
     * '[https://[tenantname].crm.ondemand.com/sap/c4c/odata/v1]'. Type: string (or Expression with resultType string).
     * 
     * @param url the url value to set.
     * @return the SapCloudForCustomerLinkedService object itself.
     */
    public SapCloudForCustomerLinkedService withUrl(Object url) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapCloudForCustomerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUrl(url);
        return this;
    }

    /**
     * Get the username property: The username for Basic authentication. Type: string (or Expression with resultType
     * string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: The username for Basic authentication. Type: string (or Expression with resultType
     * string).
     * 
     * @param username the username value to set.
     * @return the SapCloudForCustomerLinkedService object itself.
     */
    public SapCloudForCustomerLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapCloudForCustomerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: The password for Basic authentication.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: The password for Basic authentication.
     * 
     * @param password the password value to set.
     * @return the SapCloudForCustomerLinkedService object itself.
     */
    public SapCloudForCustomerLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapCloudForCustomerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Either encryptedCredential or username/password must
     * be provided. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Either encryptedCredential or username/password must
     * be provided. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SapCloudForCustomerLinkedService object itself.
     */
    public SapCloudForCustomerLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SapCloudForCustomerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerTypeProperties in model SapCloudForCustomerLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SapCloudForCustomerLinkedService.class);
}
