// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Pass fail metric. */
@Fluent
public final class PassFailMetric {
    /*
     * The client metric on which the criteria should be applied.
     */
    @Generated
    @JsonProperty(value = "clientMetric")
    private PFMetrics clientMetric;

    /*
     * The aggregation function to be applied on the client metric. Allowed functions
     * - ‘percentage’ - for error metric , ‘avg’, ‘p50’, ‘p90’, ‘p95’, ‘p99’, ‘min’,
     * ‘max’ - for response_time_ms and latency metric, ‘avg’ - for requests_per_sec,
     * ‘count’ - for requests
     */
    @Generated
    @JsonProperty(value = "aggregate")
    private PFAgFunc aggregate;

    /*
     * The comparison operator. Supported types ‘>’, ‘<’
     */
    @Generated
    @JsonProperty(value = "condition")
    private String condition;

    /*
     * Request name for which the Pass fail criteria has to be applied
     */
    @Generated
    @JsonProperty(value = "requestName")
    private String requestName;

    /*
     * The value to compare with the client metric. Allowed values - ‘error : [0.0 ,
     * 100.0] unit- % ’, response_time_ms and latency : any integer value unit- ms.
     */
    @Generated
    @JsonProperty(value = "value")
    private Double value;

    /*
     * Action taken after the threshold is met. Default is ‘continue’.
     */
    @Generated
    @JsonProperty(value = "action")
    private PFAction action;

    /*
     * The actual value of the client metric for the test run.
     */
    @Generated
    @JsonProperty(value = "actualValue", access = JsonProperty.Access.WRITE_ONLY)
    private Double actualValue;

    /*
     * Outcome of the test run.
     */
    @Generated
    @JsonProperty(value = "result", access = JsonProperty.Access.WRITE_ONLY)
    private PFResult result;

    /** Creates an instance of PassFailMetric class. */
    @Generated
    public PassFailMetric() {}

    /**
     * Get the clientMetric property: The client metric on which the criteria should be applied.
     *
     * @return the clientMetric value.
     */
    @Generated
    public PFMetrics getClientMetric() {
        return this.clientMetric;
    }

    /**
     * Set the clientMetric property: The client metric on which the criteria should be applied.
     *
     * @param clientMetric the clientMetric value to set.
     * @return the PassFailMetric object itself.
     */
    @Generated
    public PassFailMetric setClientMetric(PFMetrics clientMetric) {
        this.clientMetric = clientMetric;
        return this;
    }

    /**
     * Get the aggregate property: The aggregation function to be applied on the client metric. Allowed functions -
     * ‘percentage’ - for error metric , ‘avg’, ‘p50’, ‘p90’, ‘p95’, ‘p99’, ‘min’, ‘max’ - for response_time_ms and
     * latency metric, ‘avg’ - for requests_per_sec, ‘count’ - for requests.
     *
     * @return the aggregate value.
     */
    @Generated
    public PFAgFunc getAggregate() {
        return this.aggregate;
    }

    /**
     * Set the aggregate property: The aggregation function to be applied on the client metric. Allowed functions -
     * ‘percentage’ - for error metric , ‘avg’, ‘p50’, ‘p90’, ‘p95’, ‘p99’, ‘min’, ‘max’ - for response_time_ms and
     * latency metric, ‘avg’ - for requests_per_sec, ‘count’ - for requests.
     *
     * @param aggregate the aggregate value to set.
     * @return the PassFailMetric object itself.
     */
    @Generated
    public PassFailMetric setAggregate(PFAgFunc aggregate) {
        this.aggregate = aggregate;
        return this;
    }

    /**
     * Get the condition property: The comparison operator. Supported types ‘&gt;’, ‘&lt;’.
     *
     * @return the condition value.
     */
    @Generated
    public String getCondition() {
        return this.condition;
    }

    /**
     * Set the condition property: The comparison operator. Supported types ‘&gt;’, ‘&lt;’.
     *
     * @param condition the condition value to set.
     * @return the PassFailMetric object itself.
     */
    @Generated
    public PassFailMetric setCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the requestName property: Request name for which the Pass fail criteria has to be applied.
     *
     * @return the requestName value.
     */
    @Generated
    public String getRequestName() {
        return this.requestName;
    }

    /**
     * Set the requestName property: Request name for which the Pass fail criteria has to be applied.
     *
     * @param requestName the requestName value to set.
     * @return the PassFailMetric object itself.
     */
    @Generated
    public PassFailMetric setRequestName(String requestName) {
        this.requestName = requestName;
        return this;
    }

    /**
     * Get the value property: The value to compare with the client metric. Allowed values - ‘error : [0.0 , 100.0]
     * unit- % ’, response_time_ms and latency : any integer value unit- ms.
     *
     * @return the value value.
     */
    @Generated
    public Double getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value to compare with the client metric. Allowed values - ‘error : [0.0 , 100.0]
     * unit- % ’, response_time_ms and latency : any integer value unit- ms.
     *
     * @param value the value value to set.
     * @return the PassFailMetric object itself.
     */
    @Generated
    public PassFailMetric setValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * Get the action property: Action taken after the threshold is met. Default is ‘continue’.
     *
     * @return the action value.
     */
    @Generated
    public PFAction getAction() {
        return this.action;
    }

    /**
     * Set the action property: Action taken after the threshold is met. Default is ‘continue’.
     *
     * @param action the action value to set.
     * @return the PassFailMetric object itself.
     */
    @Generated
    public PassFailMetric setAction(PFAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the actualValue property: The actual value of the client metric for the test run.
     *
     * @return the actualValue value.
     */
    @Generated
    public Double getActualValue() {
        return this.actualValue;
    }

    /**
     * Get the result property: Outcome of the test run.
     *
     * @return the result value.
     */
    @Generated
    public PFResult getResult() {
        return this.result;
    }
}
