// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specific Databases to restore. */
@Fluent
public final class RestorableSqlResourcesGetResultInner {
    /*
     * The unique resource identifier of the ARM resource.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of the ARM resource.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The type of Azure resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The name of the database available for restore.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /*
     * The names of the collections available for restore.
     */
    @JsonProperty(value = "collectionNames")
    private List<String> collectionNames;

    /** Creates an instance of RestorableSqlResourcesGetResultInner class. */
    public RestorableSqlResourcesGetResultInner() {
    }

    /**
     * Get the id property: The unique resource identifier of the ARM resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the ARM resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of Azure resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the databaseName property: The name of the database available for restore.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The name of the database available for restore.
     *
     * @param databaseName the databaseName value to set.
     * @return the RestorableSqlResourcesGetResultInner object itself.
     */
    public RestorableSqlResourcesGetResultInner withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the collectionNames property: The names of the collections available for restore.
     *
     * @return the collectionNames value.
     */
    public List<String> collectionNames() {
        return this.collectionNames;
    }

    /**
     * Set the collectionNames property: The names of the collections available for restore.
     *
     * @param collectionNames the collectionNames value to set.
     * @return the RestorableSqlResourcesGetResultInner object itself.
     */
    public RestorableSqlResourcesGetResultInner withCollectionNames(List<String> collectionNames) {
        this.collectionNames = collectionNames;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
