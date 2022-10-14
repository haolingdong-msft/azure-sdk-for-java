// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.AdaptiveApplicationControlIssueSummary;
import com.azure.resourcemanager.security.models.ConfigurationStatus;
import com.azure.resourcemanager.security.models.EnforcementMode;
import com.azure.resourcemanager.security.models.PathRecommendation;
import com.azure.resourcemanager.security.models.ProtectionMode;
import com.azure.resourcemanager.security.models.RecommendationStatus;
import com.azure.resourcemanager.security.models.SourceSystem;
import com.azure.resourcemanager.security.models.VmRecommendation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AdaptiveApplicationControlGroup model. */
@Fluent
public final class AdaptiveApplicationControlGroupInner extends ProxyResource {
    /*
     * Represents a machines group and set of rules to be allowed running on a machine
     */
    @JsonProperty(value = "properties", required = true)
    private AdaptiveApplicationControlGroupData innerProperties = new AdaptiveApplicationControlGroupData();

    /*
     * Location where the resource is stored
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Get the innerProperties property: Represents a machines group and set of rules to be allowed running on a
     * machine.
     *
     * @return the innerProperties value.
     */
    private AdaptiveApplicationControlGroupData innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the location property: Location where the resource is stored.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the enforcementMode property: The application control policy enforcement/protection mode of the machine
     * group.
     *
     * @return the enforcementMode value.
     */
    public EnforcementMode enforcementMode() {
        return this.innerProperties() == null ? null : this.innerProperties().enforcementMode();
    }

    /**
     * Set the enforcementMode property: The application control policy enforcement/protection mode of the machine
     * group.
     *
     * @param enforcementMode the enforcementMode value to set.
     * @return the AdaptiveApplicationControlGroupInner object itself.
     */
    public AdaptiveApplicationControlGroupInner withEnforcementMode(EnforcementMode enforcementMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdaptiveApplicationControlGroupData();
        }
        this.innerProperties().withEnforcementMode(enforcementMode);
        return this;
    }

    /**
     * Get the protectionMode property: The protection mode of the collection/file types. Exe/Msi/Script are used for
     * Windows, Executable is used for Linux.
     *
     * @return the protectionMode value.
     */
    public ProtectionMode protectionMode() {
        return this.innerProperties() == null ? null : this.innerProperties().protectionMode();
    }

    /**
     * Set the protectionMode property: The protection mode of the collection/file types. Exe/Msi/Script are used for
     * Windows, Executable is used for Linux.
     *
     * @param protectionMode the protectionMode value to set.
     * @return the AdaptiveApplicationControlGroupInner object itself.
     */
    public AdaptiveApplicationControlGroupInner withProtectionMode(ProtectionMode protectionMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdaptiveApplicationControlGroupData();
        }
        this.innerProperties().withProtectionMode(protectionMode);
        return this;
    }

    /**
     * Get the configurationStatus property: The configuration status of the machines group or machine or rule.
     *
     * @return the configurationStatus value.
     */
    public ConfigurationStatus configurationStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().configurationStatus();
    }

    /**
     * Get the recommendationStatus property: The initial recommendation status of the machine group or machine.
     *
     * @return the recommendationStatus value.
     */
    public RecommendationStatus recommendationStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendationStatus();
    }

    /**
     * Get the issues property: The issues property.
     *
     * @return the issues value.
     */
    public List<AdaptiveApplicationControlIssueSummary> issues() {
        return this.innerProperties() == null ? null : this.innerProperties().issues();
    }

    /**
     * Get the sourceSystem property: The source type of the machine group.
     *
     * @return the sourceSystem value.
     */
    public SourceSystem sourceSystem() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceSystem();
    }

    /**
     * Get the vmRecommendations property: The vmRecommendations property.
     *
     * @return the vmRecommendations value.
     */
    public List<VmRecommendation> vmRecommendations() {
        return this.innerProperties() == null ? null : this.innerProperties().vmRecommendations();
    }

    /**
     * Set the vmRecommendations property: The vmRecommendations property.
     *
     * @param vmRecommendations the vmRecommendations value to set.
     * @return the AdaptiveApplicationControlGroupInner object itself.
     */
    public AdaptiveApplicationControlGroupInner withVmRecommendations(List<VmRecommendation> vmRecommendations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdaptiveApplicationControlGroupData();
        }
        this.innerProperties().withVmRecommendations(vmRecommendations);
        return this;
    }

    /**
     * Get the pathRecommendations property: The pathRecommendations property.
     *
     * @return the pathRecommendations value.
     */
    public List<PathRecommendation> pathRecommendations() {
        return this.innerProperties() == null ? null : this.innerProperties().pathRecommendations();
    }

    /**
     * Set the pathRecommendations property: The pathRecommendations property.
     *
     * @param pathRecommendations the pathRecommendations value to set.
     * @return the AdaptiveApplicationControlGroupInner object itself.
     */
    public AdaptiveApplicationControlGroupInner withPathRecommendations(List<PathRecommendation> pathRecommendations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AdaptiveApplicationControlGroupData();
        }
        this.innerProperties().withPathRecommendations(pathRecommendations);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model AdaptiveApplicationControlGroupInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AdaptiveApplicationControlGroupInner.class);
}
