// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The specification of the service. */
@Fluent
public final class ServiceSpecification {
    /*
     * The metric specifications.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<MetricSpecifications> metricSpecifications;

    /** Creates an instance of ServiceSpecification class. */
    public ServiceSpecification() {
    }

    /**
     * Get the metricSpecifications property: The metric specifications.
     *
     * @return the metricSpecifications value.
     */
    public List<MetricSpecifications> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications property: The metric specifications.
     *
     * @param metricSpecifications the metricSpecifications value to set.
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withMetricSpecifications(List<MetricSpecifications> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricSpecifications() != null) {
            metricSpecifications().forEach(e -> e.validate());
        }
    }
}
