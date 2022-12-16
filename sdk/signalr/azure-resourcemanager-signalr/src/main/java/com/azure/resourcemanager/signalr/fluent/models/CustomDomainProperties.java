// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.signalr.models.ProvisioningState;
import com.azure.resourcemanager.signalr.models.ResourceReference;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a custom domain. */
@Fluent
public final class CustomDomainProperties {
    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The custom domain name.
     */
    @JsonProperty(value = "domainName", required = true)
    private String domainName;

    /*
     * Reference to a resource.
     */
    @JsonProperty(value = "customCertificate", required = true)
    private ResourceReference customCertificate;

    /** Creates an instance of CustomDomainProperties class. */
    public CustomDomainProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the domainName property: The custom domain name.
     *
     * @return the domainName value.
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Set the domainName property: The custom domain name.
     *
     * @param domainName the domainName value to set.
     * @return the CustomDomainProperties object itself.
     */
    public CustomDomainProperties withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Get the customCertificate property: Reference to a resource.
     *
     * @return the customCertificate value.
     */
    public ResourceReference customCertificate() {
        return this.customCertificate;
    }

    /**
     * Set the customCertificate property: Reference to a resource.
     *
     * @param customCertificate the customCertificate value to set.
     * @return the CustomDomainProperties object itself.
     */
    public CustomDomainProperties withCustomCertificate(ResourceReference customCertificate) {
        this.customCertificate = customCertificate;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (domainName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property domainName in model CustomDomainProperties"));
        }
        if (customCertificate() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property customCertificate in model CustomDomainProperties"));
        } else {
            customCertificate().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CustomDomainProperties.class);
}
