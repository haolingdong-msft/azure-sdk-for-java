// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.models.RestorableSqlContainerPropertiesResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of an Azure Cosmos DB SQL container event.
 */
@Fluent
public final class RestorableSqlContainerProperties {
    /*
     * The resource of an Azure Cosmos DB SQL container event
     */
    @JsonProperty(value = "resource")
    private RestorableSqlContainerPropertiesResource resource;

    /**
     * Creates an instance of RestorableSqlContainerProperties class.
     */
    public RestorableSqlContainerProperties() {
    }

    /**
     * Get the resource property: The resource of an Azure Cosmos DB SQL container event.
     * 
     * @return the resource value.
     */
    public RestorableSqlContainerPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource of an Azure Cosmos DB SQL container event.
     * 
     * @param resource the resource value to set.
     * @return the RestorableSqlContainerProperties object itself.
     */
    public RestorableSqlContainerProperties withResource(RestorableSqlContainerPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resource() != null) {
            resource().validate();
        }
    }
}
