// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Snowflake import command settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SnowflakeImportCopyCommand")
@Fluent
public final class SnowflakeImportCopyCommand extends ImportSettings {
    /*
     * Additional copy options directly passed to snowflake Copy Command. Type: key value pairs (value should be string
     * type) (or Expression with resultType object). Example: "additionalCopyOptions": { "DATE_FORMAT": "MM/DD/YYYY",
     * "TIME_FORMAT": "'HH24:MI:SS.FF'" }
     */
    @JsonProperty(value = "additionalCopyOptions")
    private Map<String, Object> additionalCopyOptions;

    /*
     * Additional format options directly passed to snowflake Copy Command. Type: key value pairs (value should be
     * string type) (or Expression with resultType object). Example: "additionalFormatOptions": { "FORCE": "TRUE",
     * "LOAD_UNCERTAIN_FILES": "'FALSE'" }
     */
    @JsonProperty(value = "additionalFormatOptions")
    private Map<String, Object> additionalFormatOptions;

    /**
     * Get the additionalCopyOptions property: Additional copy options directly passed to snowflake Copy Command. Type:
     * key value pairs (value should be string type) (or Expression with resultType object). Example:
     * "additionalCopyOptions": { "DATE_FORMAT": "MM/DD/YYYY", "TIME_FORMAT": "'HH24:MI:SS.FF'" }.
     *
     * @return the additionalCopyOptions value.
     */
    public Map<String, Object> getAdditionalCopyOptions() {
        return this.additionalCopyOptions;
    }

    /**
     * Set the additionalCopyOptions property: Additional copy options directly passed to snowflake Copy Command. Type:
     * key value pairs (value should be string type) (or Expression with resultType object). Example:
     * "additionalCopyOptions": { "DATE_FORMAT": "MM/DD/YYYY", "TIME_FORMAT": "'HH24:MI:SS.FF'" }.
     *
     * @param additionalCopyOptions the additionalCopyOptions value to set.
     * @return the SnowflakeImportCopyCommand object itself.
     */
    public SnowflakeImportCopyCommand setAdditionalCopyOptions(Map<String, Object> additionalCopyOptions) {
        this.additionalCopyOptions = additionalCopyOptions;
        return this;
    }

    /**
     * Get the additionalFormatOptions property: Additional format options directly passed to snowflake Copy Command.
     * Type: key value pairs (value should be string type) (or Expression with resultType object). Example:
     * "additionalFormatOptions": { "FORCE": "TRUE", "LOAD_UNCERTAIN_FILES": "'FALSE'" }.
     *
     * @return the additionalFormatOptions value.
     */
    public Map<String, Object> getAdditionalFormatOptions() {
        return this.additionalFormatOptions;
    }

    /**
     * Set the additionalFormatOptions property: Additional format options directly passed to snowflake Copy Command.
     * Type: key value pairs (value should be string type) (or Expression with resultType object). Example:
     * "additionalFormatOptions": { "FORCE": "TRUE", "LOAD_UNCERTAIN_FILES": "'FALSE'" }.
     *
     * @param additionalFormatOptions the additionalFormatOptions value to set.
     * @return the SnowflakeImportCopyCommand object itself.
     */
    public SnowflakeImportCopyCommand setAdditionalFormatOptions(Map<String, Object> additionalFormatOptions) {
        this.additionalFormatOptions = additionalFormatOptions;
        return this;
    }
}
