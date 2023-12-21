// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity source for an Office 365 service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Office365Source")
@Fluent
public final class Office365Source extends CopySource {
    /*
     * The groups containing all the users. Type: array of strings (or Expression with resultType array of strings).
     */
    @JsonProperty(value = "allowedGroups")
    private Object allowedGroups;

    /*
     * The user scope uri. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "userScopeFilterUri")
    private Object userScopeFilterUri;

    /*
     * The Column to apply the <paramref name="StartTime"/> and <paramref name="EndTime"/>. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "dateFilterColumn")
    private Object dateFilterColumn;

    /*
     * Start time of the requested range for this dataset. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "startTime")
    private Object startTime;

    /*
     * End time of the requested range for this dataset. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "endTime")
    private Object endTime;

    /*
     * The columns to be read out from the Office 365 table. Type: array of objects (or Expression with resultType
     * array of objects). itemType: OutputColumn. Example: [ { "name": "Id" }, { "name": "CreatedDateTime" } ]
     */
    @JsonProperty(value = "outputColumns")
    private Object outputColumns;

    /**
     * Creates an instance of Office365Source class.
     */
    public Office365Source() {
    }

    /**
     * Get the allowedGroups property: The groups containing all the users. Type: array of strings (or Expression with
     * resultType array of strings).
     * 
     * @return the allowedGroups value.
     */
    public Object getAllowedGroups() {
        return this.allowedGroups;
    }

    /**
     * Set the allowedGroups property: The groups containing all the users. Type: array of strings (or Expression with
     * resultType array of strings).
     * 
     * @param allowedGroups the allowedGroups value to set.
     * @return the Office365Source object itself.
     */
    public Office365Source setAllowedGroups(Object allowedGroups) {
        this.allowedGroups = allowedGroups;
        return this;
    }

    /**
     * Get the userScopeFilterUri property: The user scope uri. Type: string (or Expression with resultType string).
     * 
     * @return the userScopeFilterUri value.
     */
    public Object getUserScopeFilterUri() {
        return this.userScopeFilterUri;
    }

    /**
     * Set the userScopeFilterUri property: The user scope uri. Type: string (or Expression with resultType string).
     * 
     * @param userScopeFilterUri the userScopeFilterUri value to set.
     * @return the Office365Source object itself.
     */
    public Office365Source setUserScopeFilterUri(Object userScopeFilterUri) {
        this.userScopeFilterUri = userScopeFilterUri;
        return this;
    }

    /**
     * Get the dateFilterColumn property: The Column to apply the &lt;paramref name="StartTime"/&gt; and &lt;paramref
     * name="EndTime"/&gt;. Type: string (or Expression with resultType string).
     * 
     * @return the dateFilterColumn value.
     */
    public Object getDateFilterColumn() {
        return this.dateFilterColumn;
    }

    /**
     * Set the dateFilterColumn property: The Column to apply the &lt;paramref name="StartTime"/&gt; and &lt;paramref
     * name="EndTime"/&gt;. Type: string (or Expression with resultType string).
     * 
     * @param dateFilterColumn the dateFilterColumn value to set.
     * @return the Office365Source object itself.
     */
    public Office365Source setDateFilterColumn(Object dateFilterColumn) {
        this.dateFilterColumn = dateFilterColumn;
        return this;
    }

    /**
     * Get the startTime property: Start time of the requested range for this dataset. Type: string (or Expression with
     * resultType string).
     * 
     * @return the startTime value.
     */
    public Object getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of the requested range for this dataset. Type: string (or Expression with
     * resultType string).
     * 
     * @param startTime the startTime value to set.
     * @return the Office365Source object itself.
     */
    public Office365Source setStartTime(Object startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: End time of the requested range for this dataset. Type: string (or Expression with
     * resultType string).
     * 
     * @return the endTime value.
     */
    public Object getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time of the requested range for this dataset. Type: string (or Expression with
     * resultType string).
     * 
     * @param endTime the endTime value to set.
     * @return the Office365Source object itself.
     */
    public Office365Source setEndTime(Object endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the outputColumns property: The columns to be read out from the Office 365 table. Type: array of objects (or
     * Expression with resultType array of objects). itemType: OutputColumn. Example: [ { "name": "Id" }, { "name":
     * "CreatedDateTime" } ].
     * 
     * @return the outputColumns value.
     */
    public Object getOutputColumns() {
        return this.outputColumns;
    }

    /**
     * Set the outputColumns property: The columns to be read out from the Office 365 table. Type: array of objects (or
     * Expression with resultType array of objects). itemType: OutputColumn. Example: [ { "name": "Id" }, { "name":
     * "CreatedDateTime" } ].
     * 
     * @param outputColumns the outputColumns value to set.
     * @return the Office365Source object itself.
     */
    public Office365Source setOutputColumns(Object outputColumns) {
        this.outputColumns = outputColumns;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Office365Source setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Office365Source setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Office365Source setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
