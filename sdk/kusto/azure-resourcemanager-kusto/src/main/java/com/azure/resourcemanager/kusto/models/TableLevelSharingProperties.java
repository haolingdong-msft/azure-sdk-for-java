// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Tables that will be included and excluded in the follower database. */
@Fluent
public final class TableLevelSharingProperties {
    /*
     * List of tables to include in the follower database
     */
    @JsonProperty(value = "tablesToInclude")
    private List<String> tablesToInclude;

    /*
     * List of tables to exclude from the follower database
     */
    @JsonProperty(value = "tablesToExclude")
    private List<String> tablesToExclude;

    /*
     * List of external tables to include in the follower database
     */
    @JsonProperty(value = "externalTablesToInclude")
    private List<String> externalTablesToInclude;

    /*
     * List of external tables to exclude from the follower database
     */
    @JsonProperty(value = "externalTablesToExclude")
    private List<String> externalTablesToExclude;

    /*
     * List of materialized views to include in the follower database
     */
    @JsonProperty(value = "materializedViewsToInclude")
    private List<String> materializedViewsToInclude;

    /*
     * List of materialized views to exclude from the follower database
     */
    @JsonProperty(value = "materializedViewsToExclude")
    private List<String> materializedViewsToExclude;

    /*
     * List of functions to include in the follower database
     */
    @JsonProperty(value = "functionsToInclude")
    private List<String> functionsToInclude;

    /*
     * List of functions to exclude from the follower database
     */
    @JsonProperty(value = "functionsToExclude")
    private List<String> functionsToExclude;

    /** Creates an instance of TableLevelSharingProperties class. */
    public TableLevelSharingProperties() {
    }

    /**
     * Get the tablesToInclude property: List of tables to include in the follower database.
     *
     * @return the tablesToInclude value.
     */
    public List<String> tablesToInclude() {
        return this.tablesToInclude;
    }

    /**
     * Set the tablesToInclude property: List of tables to include in the follower database.
     *
     * @param tablesToInclude the tablesToInclude value to set.
     * @return the TableLevelSharingProperties object itself.
     */
    public TableLevelSharingProperties withTablesToInclude(List<String> tablesToInclude) {
        this.tablesToInclude = tablesToInclude;
        return this;
    }

    /**
     * Get the tablesToExclude property: List of tables to exclude from the follower database.
     *
     * @return the tablesToExclude value.
     */
    public List<String> tablesToExclude() {
        return this.tablesToExclude;
    }

    /**
     * Set the tablesToExclude property: List of tables to exclude from the follower database.
     *
     * @param tablesToExclude the tablesToExclude value to set.
     * @return the TableLevelSharingProperties object itself.
     */
    public TableLevelSharingProperties withTablesToExclude(List<String> tablesToExclude) {
        this.tablesToExclude = tablesToExclude;
        return this;
    }

    /**
     * Get the externalTablesToInclude property: List of external tables to include in the follower database.
     *
     * @return the externalTablesToInclude value.
     */
    public List<String> externalTablesToInclude() {
        return this.externalTablesToInclude;
    }

    /**
     * Set the externalTablesToInclude property: List of external tables to include in the follower database.
     *
     * @param externalTablesToInclude the externalTablesToInclude value to set.
     * @return the TableLevelSharingProperties object itself.
     */
    public TableLevelSharingProperties withExternalTablesToInclude(List<String> externalTablesToInclude) {
        this.externalTablesToInclude = externalTablesToInclude;
        return this;
    }

    /**
     * Get the externalTablesToExclude property: List of external tables to exclude from the follower database.
     *
     * @return the externalTablesToExclude value.
     */
    public List<String> externalTablesToExclude() {
        return this.externalTablesToExclude;
    }

    /**
     * Set the externalTablesToExclude property: List of external tables to exclude from the follower database.
     *
     * @param externalTablesToExclude the externalTablesToExclude value to set.
     * @return the TableLevelSharingProperties object itself.
     */
    public TableLevelSharingProperties withExternalTablesToExclude(List<String> externalTablesToExclude) {
        this.externalTablesToExclude = externalTablesToExclude;
        return this;
    }

    /**
     * Get the materializedViewsToInclude property: List of materialized views to include in the follower database.
     *
     * @return the materializedViewsToInclude value.
     */
    public List<String> materializedViewsToInclude() {
        return this.materializedViewsToInclude;
    }

    /**
     * Set the materializedViewsToInclude property: List of materialized views to include in the follower database.
     *
     * @param materializedViewsToInclude the materializedViewsToInclude value to set.
     * @return the TableLevelSharingProperties object itself.
     */
    public TableLevelSharingProperties withMaterializedViewsToInclude(List<String> materializedViewsToInclude) {
        this.materializedViewsToInclude = materializedViewsToInclude;
        return this;
    }

    /**
     * Get the materializedViewsToExclude property: List of materialized views to exclude from the follower database.
     *
     * @return the materializedViewsToExclude value.
     */
    public List<String> materializedViewsToExclude() {
        return this.materializedViewsToExclude;
    }

    /**
     * Set the materializedViewsToExclude property: List of materialized views to exclude from the follower database.
     *
     * @param materializedViewsToExclude the materializedViewsToExclude value to set.
     * @return the TableLevelSharingProperties object itself.
     */
    public TableLevelSharingProperties withMaterializedViewsToExclude(List<String> materializedViewsToExclude) {
        this.materializedViewsToExclude = materializedViewsToExclude;
        return this;
    }

    /**
     * Get the functionsToInclude property: List of functions to include in the follower database.
     *
     * @return the functionsToInclude value.
     */
    public List<String> functionsToInclude() {
        return this.functionsToInclude;
    }

    /**
     * Set the functionsToInclude property: List of functions to include in the follower database.
     *
     * @param functionsToInclude the functionsToInclude value to set.
     * @return the TableLevelSharingProperties object itself.
     */
    public TableLevelSharingProperties withFunctionsToInclude(List<String> functionsToInclude) {
        this.functionsToInclude = functionsToInclude;
        return this;
    }

    /**
     * Get the functionsToExclude property: List of functions to exclude from the follower database.
     *
     * @return the functionsToExclude value.
     */
    public List<String> functionsToExclude() {
        return this.functionsToExclude;
    }

    /**
     * Set the functionsToExclude property: List of functions to exclude from the follower database.
     *
     * @param functionsToExclude the functionsToExclude value to set.
     * @return the TableLevelSharingProperties object itself.
     */
    public TableLevelSharingProperties withFunctionsToExclude(List<String> functionsToExclude) {
        this.functionsToExclude = functionsToExclude;
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
