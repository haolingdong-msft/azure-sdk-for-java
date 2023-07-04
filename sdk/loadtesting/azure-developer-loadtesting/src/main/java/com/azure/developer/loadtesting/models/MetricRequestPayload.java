// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Filters to fetch the set of metric. */
@Fluent
public final class MetricRequestPayload {
    /*
     * Get metrics for specific dimension values. Example: Metric contains dimension
     * like SamplerName, Error. To retrieve all the time series data where SamplerName
     * is equals to HTTPRequest1 or HTTPRequest2, the DimensionFilter value will be
     * {"SamplerName", ["HTTPRequest1", "HTTPRequest2"}
     */
    @Generated
    @JsonProperty(value = "filters")
    private List<DimensionFilter> filters;

    /** Creates an instance of MetricRequestPayload class. */
    @Generated
    public MetricRequestPayload() {}

    /**
     * Get the filters property: Get metrics for specific dimension values. Example: Metric contains dimension like
     * SamplerName, Error. To retrieve all the time series data where SamplerName is equals to HTTPRequest1 or
     * HTTPRequest2, the DimensionFilter value will be {"SamplerName", ["HTTPRequest1", "HTTPRequest2"}.
     *
     * @return the filters value.
     */
    @Generated
    public List<DimensionFilter> getFilters() {
        return this.filters;
    }

    /**
     * Set the filters property: Get metrics for specific dimension values. Example: Metric contains dimension like
     * SamplerName, Error. To retrieve all the time series data where SamplerName is equals to HTTPRequest1 or
     * HTTPRequest2, the DimensionFilter value will be {"SamplerName", ["HTTPRequest1", "HTTPRequest2"}.
     *
     * @param filters the filters value to set.
     * @return the MetricRequestPayload object itself.
     */
    @Generated
    public MetricRequestPayload setFilters(List<DimensionFilter> filters) {
        this.filters = filters;
        return this;
    }
}
