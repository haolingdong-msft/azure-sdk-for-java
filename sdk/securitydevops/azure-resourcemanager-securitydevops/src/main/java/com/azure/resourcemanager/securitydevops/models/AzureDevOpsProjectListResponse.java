// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.securitydevops.fluent.models.AzureDevOpsProjectInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AzureDevOpsProjectListResponse model. */
@Fluent
public final class AzureDevOpsProjectListResponse {
    /*
     * Gets or sets list of resources.
     */
    @JsonProperty(value = "value")
    private List<AzureDevOpsProjectInner> value;

    /*
     * Gets or sets next link to scroll over the results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of AzureDevOpsProjectListResponse class. */
    public AzureDevOpsProjectListResponse() {
    }

    /**
     * Get the value property: Gets or sets list of resources.
     *
     * @return the value value.
     */
    public List<AzureDevOpsProjectInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets list of resources.
     *
     * @param value the value value to set.
     * @return the AzureDevOpsProjectListResponse object itself.
     */
    public AzureDevOpsProjectListResponse withValue(List<AzureDevOpsProjectInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets or sets next link to scroll over the results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets or sets next link to scroll over the results.
     *
     * @param nextLink the nextLink value to set.
     * @return the AzureDevOpsProjectListResponse object itself.
     */
    public AzureDevOpsProjectListResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
