// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.AdministrativeState;
import com.azure.resourcemanager.managednetworkfabric.models.AnnotationResource;
import com.azure.resourcemanager.managednetworkfabric.models.ConfigurationState;
import com.azure.resourcemanager.managednetworkfabric.models.IpExtendedCommunityRule;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** IP Extended Community Properties defines the resource properties. */
@Fluent
public final class IpExtendedCommunityProperties extends AnnotationResource {
    /*
     * Configuration state of the resource.
     */
    @JsonProperty(value = "configurationState", access = JsonProperty.Access.WRITE_ONLY)
    private ConfigurationState configurationState;

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Administrative state of the resource.
     */
    @JsonProperty(value = "administrativeState", access = JsonProperty.Access.WRITE_ONLY)
    private AdministrativeState administrativeState;

    /*
     * List of IP Extended Community Rules.
     */
    @JsonProperty(value = "ipExtendedCommunityRules", required = true)
    private List<IpExtendedCommunityRule> ipExtendedCommunityRules;

    /** Creates an instance of IpExtendedCommunityProperties class. */
    public IpExtendedCommunityProperties() {
    }

    /**
     * Get the configurationState property: Configuration state of the resource.
     *
     * @return the configurationState value.
     */
    public ConfigurationState configurationState() {
        return this.configurationState;
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
     * Get the administrativeState property: Administrative state of the resource.
     *
     * @return the administrativeState value.
     */
    public AdministrativeState administrativeState() {
        return this.administrativeState;
    }

    /**
     * Get the ipExtendedCommunityRules property: List of IP Extended Community Rules.
     *
     * @return the ipExtendedCommunityRules value.
     */
    public List<IpExtendedCommunityRule> ipExtendedCommunityRules() {
        return this.ipExtendedCommunityRules;
    }

    /**
     * Set the ipExtendedCommunityRules property: List of IP Extended Community Rules.
     *
     * @param ipExtendedCommunityRules the ipExtendedCommunityRules value to set.
     * @return the IpExtendedCommunityProperties object itself.
     */
    public IpExtendedCommunityProperties withIpExtendedCommunityRules(
        List<IpExtendedCommunityRule> ipExtendedCommunityRules) {
        this.ipExtendedCommunityRules = ipExtendedCommunityRules;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IpExtendedCommunityProperties withAnnotation(String annotation) {
        super.withAnnotation(annotation);
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
        if (ipExtendedCommunityRules() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ipExtendedCommunityRules in model IpExtendedCommunityProperties"));
        } else {
            ipExtendedCommunityRules().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IpExtendedCommunityProperties.class);
}
