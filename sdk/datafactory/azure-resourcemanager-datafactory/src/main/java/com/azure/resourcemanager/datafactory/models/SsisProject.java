// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Ssis project.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = SsisProject.class, visible = true)
@JsonTypeName("Project")
@Fluent
public final class SsisProject extends SsisObjectMetadata {
    /*
     * Type of metadata.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private SsisObjectMetadataType type = SsisObjectMetadataType.PROJECT;

    /*
     * Folder id which contains project.
     */
    @JsonProperty(value = "folderId")
    private Long folderId;

    /*
     * Project version.
     */
    @JsonProperty(value = "version")
    private Long version;

    /*
     * Environment reference in project
     */
    @JsonProperty(value = "environmentRefs")
    private List<SsisEnvironmentReference> environmentRefs;

    /*
     * Parameters in project
     */
    @JsonProperty(value = "parameters")
    private List<SsisParameter> parameters;

    /**
     * Creates an instance of SsisProject class.
     */
    public SsisProject() {
    }

    /**
     * Get the type property: Type of metadata.
     * 
     * @return the type value.
     */
    @Override
    public SsisObjectMetadataType type() {
        return this.type;
    }

    /**
     * Get the folderId property: Folder id which contains project.
     * 
     * @return the folderId value.
     */
    public Long folderId() {
        return this.folderId;
    }

    /**
     * Set the folderId property: Folder id which contains project.
     * 
     * @param folderId the folderId value to set.
     * @return the SsisProject object itself.
     */
    public SsisProject withFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }

    /**
     * Get the version property: Project version.
     * 
     * @return the version value.
     */
    public Long version() {
        return this.version;
    }

    /**
     * Set the version property: Project version.
     * 
     * @param version the version value to set.
     * @return the SsisProject object itself.
     */
    public SsisProject withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * Get the environmentRefs property: Environment reference in project.
     * 
     * @return the environmentRefs value.
     */
    public List<SsisEnvironmentReference> environmentRefs() {
        return this.environmentRefs;
    }

    /**
     * Set the environmentRefs property: Environment reference in project.
     * 
     * @param environmentRefs the environmentRefs value to set.
     * @return the SsisProject object itself.
     */
    public SsisProject withEnvironmentRefs(List<SsisEnvironmentReference> environmentRefs) {
        this.environmentRefs = environmentRefs;
        return this;
    }

    /**
     * Get the parameters property: Parameters in project.
     * 
     * @return the parameters value.
     */
    public List<SsisParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Parameters in project.
     * 
     * @param parameters the parameters value to set.
     * @return the SsisProject object itself.
     */
    public SsisProject withParameters(List<SsisParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsisProject withId(Long id) {
        super.withId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsisProject withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SsisProject withDescription(String description) {
        super.withDescription(description);
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
        if (environmentRefs() != null) {
            environmentRefs().forEach(e -> e.validate());
        }
        if (parameters() != null) {
            parameters().forEach(e -> e.validate());
        }
    }
}
