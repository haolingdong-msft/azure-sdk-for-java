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
 * Linked service for Cassandra data source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Cassandra")
@JsonFlatten
@Fluent
public class CassandraLinkedService extends LinkedService {
    /*
     * Host name for connection. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /*
     * AuthenticationType to be used for connection. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private Object authenticationType;

    /*
     * The port for the connection. Type: integer (or Expression with resultType integer).
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /*
     * Username for authentication. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * Password for authentication.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Creates an instance of CassandraLinkedService class.
     */
    public CassandraLinkedService() {
    }

    /**
     * Get the host property: Host name for connection. Type: string (or Expression with resultType string).
     * 
     * @return the host value.
     */
    public Object getHost() {
        return this.host;
    }

    /**
     * Set the host property: Host name for connection. Type: string (or Expression with resultType string).
     * 
     * @param host the host value to set.
     * @return the CassandraLinkedService object itself.
     */
    public CassandraLinkedService setHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the authenticationType property: AuthenticationType to be used for connection. Type: string (or Expression
     * with resultType string).
     * 
     * @return the authenticationType value.
     */
    public Object getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: AuthenticationType to be used for connection. Type: string (or Expression
     * with resultType string).
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the CassandraLinkedService object itself.
     */
    public CassandraLinkedService setAuthenticationType(Object authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the port property: The port for the connection. Type: integer (or Expression with resultType integer).
     * 
     * @return the port value.
     */
    public Object getPort() {
        return this.port;
    }

    /**
     * Set the port property: The port for the connection. Type: integer (or Expression with resultType integer).
     * 
     * @param port the port value to set.
     * @return the CassandraLinkedService object itself.
     */
    public CassandraLinkedService setPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the username property: Username for authentication. Type: string (or Expression with resultType string).
     * 
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: Username for authentication. Type: string (or Expression with resultType string).
     * 
     * @param username the username value to set.
     * @return the CassandraLinkedService object itself.
     */
    public CassandraLinkedService setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password for authentication.
     * 
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password for authentication.
     * 
     * @param password the password value to set.
     * @return the CassandraLinkedService object itself.
     */
    public CassandraLinkedService setPassword(SecretBase password) {
        this.password = password;
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
     * @return the CassandraLinkedService object itself.
     */
    public CassandraLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CassandraLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CassandraLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CassandraLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CassandraLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
