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
 * Presto server linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Presto")
@JsonFlatten
@Fluent
public class PrestoLinkedService extends LinkedService {
    /*
     * The IP address or host name of the Presto server. (i.e. 192.168.222.160)
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /*
     * The version of the Presto server. (i.e. 0.148-t)
     */
    @JsonProperty(value = "typeProperties.serverVersion", required = true)
    private Object serverVersion;

    /*
     * The catalog context for all request against the server.
     */
    @JsonProperty(value = "typeProperties.catalog", required = true)
    private Object catalog;

    /*
     * The TCP port that the Presto server uses to listen for client connections. The default value is 8080.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /*
     * The authentication mechanism used to connect to the Presto server.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private PrestoAuthenticationType authenticationType;

    /*
     * The user name used to connect to the Presto server.
     */
    @JsonProperty(value = "typeProperties.username")
    private Object username;

    /*
     * The password corresponding to the user name.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * Specifies whether the connections to the server are encrypted using SSL. The default value is false.
     */
    @JsonProperty(value = "typeProperties.enableSsl")
    private Object enableSsl;

    /*
     * The full path of the .pem file containing trusted CA certificates for verifying the server when connecting over
     * SSL. This property can only be set when using SSL on self-hosted IR. The default value is the cacerts.pem file
     * installed with the IR.
     */
    @JsonProperty(value = "typeProperties.trustedCertPath")
    private Object trustedCertPath;

    /*
     * Specifies whether to use a CA certificate from the system trust store or from a specified PEM file. The default
     * value is false.
     */
    @JsonProperty(value = "typeProperties.useSystemTrustStore")
    private Object useSystemTrustStore;

    /*
     * Specifies whether to require a CA-issued SSL certificate name to match the host name of the server when
     * connecting over SSL. The default value is false.
     */
    @JsonProperty(value = "typeProperties.allowHostNameCNMismatch")
    private Object allowHostNameCNMismatch;

    /*
     * Specifies whether to allow self-signed certificates from the server. The default value is false.
     */
    @JsonProperty(value = "typeProperties.allowSelfSignedServerCert")
    private Object allowSelfSignedServerCert;

    /*
     * The local time zone used by the connection. Valid values for this option are specified in the IANA Time Zone
     * Database. The default value is the system time zone.
     */
    @JsonProperty(value = "typeProperties.timeZoneID")
    private Object timeZoneID;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Creates an instance of PrestoLinkedService class.
     */
    public PrestoLinkedService() {
    }

    /**
     * Get the host property: The IP address or host name of the Presto server. (i.e. 192.168.222.160).
     * 
     * @return the host value.
     */
    public Object getHost() {
        return this.host;
    }

    /**
     * Set the host property: The IP address or host name of the Presto server. (i.e. 192.168.222.160).
     * 
     * @param host the host value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService setHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the serverVersion property: The version of the Presto server. (i.e. 0.148-t).
     * 
     * @return the serverVersion value.
     */
    public Object getServerVersion() {
        return this.serverVersion;
    }

    /**
     * Set the serverVersion property: The version of the Presto server. (i.e. 0.148-t).
     * 
     * @param serverVersion the serverVersion value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService setServerVersion(Object serverVersion) {
        this.serverVersion = serverVersion;
        return this;
    }

    /**
     * Get the catalog property: The catalog context for all request against the server.
     * 
     * @return the catalog value.
     */
    public Object getCatalog() {
        return this.catalog;
    }

    /**
     * Set the catalog property: The catalog context for all request against the server.
     * 
     * @param catalog the catalog value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService setCatalog(Object catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * Get the port property: The TCP port that the Presto server uses to listen for client connections. The default
     * value is 8080.
     * 
     * @return the port value.
     */
    public Object getPort() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port that the Presto server uses to listen for client connections. The default
     * value is 8080.
     * 
     * @param port the port value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService setPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication mechanism used to connect to the Presto server.
     * 
     * @return the authenticationType value.
     */
    public PrestoAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication mechanism used to connect to the Presto server.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService setAuthenticationType(PrestoAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: The user name used to connect to the Presto server.
     * 
     * @return the username value.
     */
    public Object getUsername() {
        return this.username;
    }

    /**
     * Set the username property: The user name used to connect to the Presto server.
     * 
     * @param username the username value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService setUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name.
     * 
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password corresponding to the user name.
     * 
     * @param password the password value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     * 
     * @return the enableSsl value.
     */
    public Object getEnableSsl() {
        return this.enableSsl;
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     * 
     * @param enableSsl the enableSsl value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService setEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for
     * verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR.
     * The default value is the cacerts.pem file installed with the IR.
     * 
     * @return the trustedCertPath value.
     */
    public Object getTrustedCertPath() {
        return this.trustedCertPath;
    }

    /**
     * Set the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for
     * verifying the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR.
     * The default value is the cacerts.pem file installed with the IR.
     * 
     * @param trustedCertPath the trustedCertPath value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService setTrustedCertPath(Object trustedCertPath) {
        this.trustedCertPath = trustedCertPath;
        return this;
    }

    /**
     * Get the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     * 
     * @return the useSystemTrustStore value.
     */
    public Object getUseSystemTrustStore() {
        return this.useSystemTrustStore;
    }

    /**
     * Set the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     * 
     * @param useSystemTrustStore the useSystemTrustStore value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService setUseSystemTrustStore(Object useSystemTrustStore) {
        this.useSystemTrustStore = useSystemTrustStore;
        return this;
    }

    /**
     * Get the allowHostNameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     * 
     * @return the allowHostNameCNMismatch value.
     */
    public Object getAllowHostNameCNMismatch() {
        return this.allowHostNameCNMismatch;
    }

    /**
     * Set the allowHostNameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     * 
     * @param allowHostNameCNMismatch the allowHostNameCNMismatch value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService setAllowHostNameCNMismatch(Object allowHostNameCNMismatch) {
        this.allowHostNameCNMismatch = allowHostNameCNMismatch;
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     * 
     * @return the allowSelfSignedServerCert value.
     */
    public Object getAllowSelfSignedServerCert() {
        return this.allowSelfSignedServerCert;
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     * 
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService setAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        this.allowSelfSignedServerCert = allowSelfSignedServerCert;
        return this;
    }

    /**
     * Get the timeZoneID property: The local time zone used by the connection. Valid values for this option are
     * specified in the IANA Time Zone Database. The default value is the system time zone.
     * 
     * @return the timeZoneID value.
     */
    public Object getTimeZoneID() {
        return this.timeZoneID;
    }

    /**
     * Set the timeZoneID property: The local time zone used by the connection. Valid values for this option are
     * specified in the IANA Time Zone Database. The default value is the system time zone.
     * 
     * @param timeZoneID the timeZoneID value to set.
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService setTimeZoneID(Object timeZoneID) {
        this.timeZoneID = timeZoneID;
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
     * @return the PrestoLinkedService object itself.
     */
    public PrestoLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrestoLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrestoLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrestoLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrestoLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
