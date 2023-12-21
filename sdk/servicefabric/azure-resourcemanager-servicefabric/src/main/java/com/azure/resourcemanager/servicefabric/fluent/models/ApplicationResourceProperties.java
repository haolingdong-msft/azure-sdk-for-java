// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.servicefabric.models.ApplicationMetricDescription;
import com.azure.resourcemanager.servicefabric.models.ApplicationUpgradePolicy;
import com.azure.resourcemanager.servicefabric.models.ApplicationUserAssignedIdentity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The application resource properties.
 */
@Fluent
public final class ApplicationResourceProperties extends ApplicationResourceUpdateProperties {
    /*
     * The current deployment or provisioning state, which only appears in the response
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The application type name as defined in the application manifest.
     */
    @JsonProperty(value = "typeName")
    private String typeName;

    /**
     * Creates an instance of ApplicationResourceProperties class.
     */
    public ApplicationResourceProperties() {
    }

    /**
     * Get the provisioningState property: The current deployment or provisioning state, which only appears in the
     * response.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the typeName property: The application type name as defined in the application manifest.
     * 
     * @return the typeName value.
     */
    public String typeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: The application type name as defined in the application manifest.
     * 
     * @param typeName the typeName value to set.
     * @return the ApplicationResourceProperties object itself.
     */
    public ApplicationResourceProperties withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationResourceProperties withTypeVersion(String typeVersion) {
        super.withTypeVersion(typeVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationResourceProperties withParameters(Map<String, String> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationResourceProperties withUpgradePolicy(ApplicationUpgradePolicy upgradePolicy) {
        super.withUpgradePolicy(upgradePolicy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationResourceProperties withMinimumNodes(Long minimumNodes) {
        super.withMinimumNodes(minimumNodes);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationResourceProperties withMaximumNodes(Long maximumNodes) {
        super.withMaximumNodes(maximumNodes);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationResourceProperties withRemoveApplicationCapacity(Boolean removeApplicationCapacity) {
        super.withRemoveApplicationCapacity(removeApplicationCapacity);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationResourceProperties withMetrics(List<ApplicationMetricDescription> metrics) {
        super.withMetrics(metrics);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ApplicationResourceProperties
        withManagedIdentities(List<ApplicationUserAssignedIdentity> managedIdentities) {
        super.withManagedIdentities(managedIdentities);
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
    }
}
