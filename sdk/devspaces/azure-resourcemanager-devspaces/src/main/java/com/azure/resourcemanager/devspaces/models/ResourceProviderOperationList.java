// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devspaces.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devspaces.fluent.models.ResourceProviderOperationDefinitionInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResourceProviderOperationList model. */
@Fluent
public final class ResourceProviderOperationList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceProviderOperationList.class);

    /*
     * Resource provider operations list.
     */
    @JsonProperty(value = "value")
    private List<ResourceProviderOperationDefinitionInner> value;

    /*
     * The URI that can be used to request the next page for list of Azure
     * operations.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Resource provider operations list.
     *
     * @return the value value.
     */
    public List<ResourceProviderOperationDefinitionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Resource provider operations list.
     *
     * @param value the value value to set.
     * @return the ResourceProviderOperationList object itself.
     */
    public ResourceProviderOperationList withValue(List<ResourceProviderOperationDefinitionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next page for list of Azure operations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
