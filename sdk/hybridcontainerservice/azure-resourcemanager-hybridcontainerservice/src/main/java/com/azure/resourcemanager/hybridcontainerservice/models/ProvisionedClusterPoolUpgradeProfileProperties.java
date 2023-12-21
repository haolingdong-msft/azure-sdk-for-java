// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The upgrade properties.
 */
@Immutable
public final class ProvisionedClusterPoolUpgradeProfileProperties {
    /*
     * The Kubernetes version (major.minor.patch).
     */
    @JsonProperty(value = "kubernetesVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String kubernetesVersion;

    /*
     * Whether the Kubernetes version is currently in preview.
     */
    @JsonProperty(value = "isPreview", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isPreview;

    /**
     * Creates an instance of ProvisionedClusterPoolUpgradeProfileProperties class.
     */
    public ProvisionedClusterPoolUpgradeProfileProperties() {
    }

    /**
     * Get the kubernetesVersion property: The Kubernetes version (major.minor.patch).
     * 
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Get the isPreview property: Whether the Kubernetes version is currently in preview.
     * 
     * @return the isPreview value.
     */
    public Boolean isPreview() {
        return this.isPreview;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
