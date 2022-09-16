// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity source for SAP ODP source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapOdpSource")
@Fluent
public final class SapOdpSource extends TabularSource {
    /*
     * The extraction mode. Allowed value include: Full, Delta and Recovery. The default value is Full. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "extractionMode")
    private Object extractionMode;

    /*
     * The subscriber process to manage the delta process. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "subscriberProcess")
    private Object subscriberProcess;

    /*
     * Specifies the selection conditions from source data. Type: array of objects(selection) (or Expression with
     * resultType array of objects).
     */
    @JsonProperty(value = "selection")
    private Object selection;

    /*
     * Specifies the columns to be selected from source data. Type: array of objects(projection) (or Expression with
     * resultType array of objects).
     */
    @JsonProperty(value = "projection")
    private Object projection;

    /**
     * Get the extractionMode property: The extraction mode. Allowed value include: Full, Delta and Recovery. The
     * default value is Full. Type: string (or Expression with resultType string).
     *
     * @return the extractionMode value.
     */
    public Object getExtractionMode() {
        return this.extractionMode;
    }

    /**
     * Set the extractionMode property: The extraction mode. Allowed value include: Full, Delta and Recovery. The
     * default value is Full. Type: string (or Expression with resultType string).
     *
     * @param extractionMode the extractionMode value to set.
     * @return the SapOdpSource object itself.
     */
    public SapOdpSource setExtractionMode(Object extractionMode) {
        this.extractionMode = extractionMode;
        return this;
    }

    /**
     * Get the subscriberProcess property: The subscriber process to manage the delta process. Type: string (or
     * Expression with resultType string).
     *
     * @return the subscriberProcess value.
     */
    public Object getSubscriberProcess() {
        return this.subscriberProcess;
    }

    /**
     * Set the subscriberProcess property: The subscriber process to manage the delta process. Type: string (or
     * Expression with resultType string).
     *
     * @param subscriberProcess the subscriberProcess value to set.
     * @return the SapOdpSource object itself.
     */
    public SapOdpSource setSubscriberProcess(Object subscriberProcess) {
        this.subscriberProcess = subscriberProcess;
        return this;
    }

    /**
     * Get the selection property: Specifies the selection conditions from source data. Type: array of
     * objects(selection) (or Expression with resultType array of objects).
     *
     * @return the selection value.
     */
    public Object getSelection() {
        return this.selection;
    }

    /**
     * Set the selection property: Specifies the selection conditions from source data. Type: array of
     * objects(selection) (or Expression with resultType array of objects).
     *
     * @param selection the selection value to set.
     * @return the SapOdpSource object itself.
     */
    public SapOdpSource setSelection(Object selection) {
        this.selection = selection;
        return this;
    }

    /**
     * Get the projection property: Specifies the columns to be selected from source data. Type: array of
     * objects(projection) (or Expression with resultType array of objects).
     *
     * @return the projection value.
     */
    public Object getProjection() {
        return this.projection;
    }

    /**
     * Set the projection property: Specifies the columns to be selected from source data. Type: array of
     * objects(projection) (or Expression with resultType array of objects).
     *
     * @param projection the projection value to set.
     * @return the SapOdpSource object itself.
     */
    public SapOdpSource setProjection(Object projection) {
        this.projection = projection;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOdpSource setQueryTimeout(Object queryTimeout) {
        super.setQueryTimeout(queryTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOdpSource setAdditionalColumns(Object additionalColumns) {
        super.setAdditionalColumns(additionalColumns);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOdpSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOdpSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapOdpSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
