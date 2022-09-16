// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Azure Databricks Delta Lake source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDatabricksDeltaLakeSource")
@Fluent
public final class AzureDatabricksDeltaLakeSource extends CopySource {
    /*
     * Azure Databricks Delta Lake Sql query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * Azure Databricks Delta Lake export settings.
     */
    @JsonProperty(value = "exportSettings")
    private AzureDatabricksDeltaLakeExportCommand exportSettings;

    /**
     * Get the query property: Azure Databricks Delta Lake Sql query. Type: string (or Expression with resultType
     * string).
     *
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: Azure Databricks Delta Lake Sql query. Type: string (or Expression with resultType
     * string).
     *
     * @param query the query value to set.
     * @return the AzureDatabricksDeltaLakeSource object itself.
     */
    public AzureDatabricksDeltaLakeSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the exportSettings property: Azure Databricks Delta Lake export settings.
     *
     * @return the exportSettings value.
     */
    public AzureDatabricksDeltaLakeExportCommand getExportSettings() {
        return this.exportSettings;
    }

    /**
     * Set the exportSettings property: Azure Databricks Delta Lake export settings.
     *
     * @param exportSettings the exportSettings value to set.
     * @return the AzureDatabricksDeltaLakeSource object itself.
     */
    public AzureDatabricksDeltaLakeSource setExportSettings(AzureDatabricksDeltaLakeExportCommand exportSettings) {
        this.exportSettings = exportSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDatabricksDeltaLakeSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
