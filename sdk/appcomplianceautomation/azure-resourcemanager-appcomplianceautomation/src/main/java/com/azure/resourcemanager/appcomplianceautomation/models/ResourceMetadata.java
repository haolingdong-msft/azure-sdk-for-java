// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Single resource Id's metadata. */
@Fluent
public final class ResourceMetadata {
    /*
     * Resource Id - e.g.
     * "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.Compute"
         + "/virtualMachines/vm1".
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /*
     * Resource type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * Resource kind.
     */
    @JsonProperty(value = "resourceKind")
    private String resourceKind;

    /*
     * Resource name.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /*
     * Resource's tag type.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of ResourceMetadata class. */
    public ResourceMetadata() {
    }

    /**
     * Get the resourceId property: Resource Id - e.g.
     * "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.Compute"
         + "/virtualMachines/vm1".
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: Resource Id - e.g.
     * "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg1/providers/Microsoft.Compute"
         + "/virtualMachines/vm1".
     *
     * @param resourceId the resourceId value to set.
     * @return the ResourceMetadata object itself.
     */
    public ResourceMetadata withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the resourceType property: Resource type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: Resource type.
     *
     * @param resourceType the resourceType value to set.
     * @return the ResourceMetadata object itself.
     */
    public ResourceMetadata withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the resourceKind property: Resource kind.
     *
     * @return the resourceKind value.
     */
    public String resourceKind() {
        return this.resourceKind;
    }

    /**
     * Set the resourceKind property: Resource kind.
     *
     * @param resourceKind the resourceKind value to set.
     * @return the ResourceMetadata object itself.
     */
    public ResourceMetadata withResourceKind(String resourceKind) {
        this.resourceKind = resourceKind;
        return this;
    }

    /**
     * Get the resourceName property: Resource name.
     *
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: Resource name.
     *
     * @param resourceName the resourceName value to set.
     * @return the ResourceMetadata object itself.
     */
    public ResourceMetadata withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get the tags property: Resource's tag type.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource's tag type.
     *
     * @param tags the tags value to set.
     * @return the ResourceMetadata object itself.
     */
    public ResourceMetadata withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property resourceId in model ResourceMetadata"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceMetadata.class);
}
