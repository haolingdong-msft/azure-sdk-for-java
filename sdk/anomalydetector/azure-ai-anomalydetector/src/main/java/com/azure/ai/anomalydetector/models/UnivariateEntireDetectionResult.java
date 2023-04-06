// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response of the entire anomaly detection. */
@Immutable
public final class UnivariateEntireDetectionResult {
    /*
     * Frequency extracted from the series. Zero means no recurrent pattern has been
     * found.
     */
    @JsonProperty(value = "period", required = true)
    private int period;

    /*
     * Expected value for each input point. The index of the
     * array is consistent with the input series.
     */
    @JsonProperty(value = "expectedValues", required = true)
    private List<Double> expectedValues;

    /*
     * Upper margin of each input point. UpperMargin is used to
     * calculate upperBoundary, which is equal to expectedValue + (100 -
     * marginScale)*upperMargin. Anomalies in the response can be filtered by
     * upperBoundary and lowerBoundary. Adjusting the marginScale value can help filter less
     * significant anomalies on the client side. The index of the array is
     * consistent with the input series.
     */
    @JsonProperty(value = "upperMargins", required = true)
    private List<Double> upperMargins;

    /*
     * Lower margin of each input point. LowerMargin is used to
     * calculate lowerBoundary, which is equal to expectedValue - (100 -
     * marginScale)*lowerMargin. Points between the boundary can be marked as normal
     * ones on the client side. The index of the array is consistent with the input
     * series.
     */
    @JsonProperty(value = "lowerMargins", required = true)
    private List<Double> lowerMargins;

    /*
     * Anomaly properties for each input point. True means an
     * anomaly (either negative or positive) has been detected. The index of the array
     * is consistent with the input series.
     */
    @JsonProperty(value = "isAnomaly", required = true)
    private List<Boolean> isAnomaly;

    /*
     * Anomaly status in a negative direction for each input
     * point. True means a negative anomaly has been detected. A negative anomaly
     * means the point is detected as an anomaly and its real value is smaller than
     * the expected one. The index of the array is consistent with the input series.
     */
    @JsonProperty(value = "isNegativeAnomaly", required = true)
    private List<Boolean> isNegativeAnomaly;

    /*
     * Anomaly status in a positive direction for each input
     * point. True means a positive anomaly has been detected. A positive anomaly
     * means the point is detected as an anomaly and its real value is larger than the
     * expected one. The index of the array is consistent with the input series.
     */
    @JsonProperty(value = "isPositiveAnomaly", required = true)
    private List<Boolean> isPositiveAnomaly;

    /*
     * Severity score for each input point. The larger the value is, the more
     * severe the anomaly is. For normal points, the severity is always 0.
     */
    @JsonProperty(value = "severity")
    private List<Double> severity;

    /**
     * Creates an instance of UnivariateEntireDetectionResult class.
     *
     * @param period the period value to set.
     * @param expectedValues the expectedValues value to set.
     * @param upperMargins the upperMargins value to set.
     * @param lowerMargins the lowerMargins value to set.
     * @param isAnomaly the isAnomaly value to set.
     * @param isNegativeAnomaly the isNegativeAnomaly value to set.
     * @param isPositiveAnomaly the isPositiveAnomaly value to set.
     */
    @JsonCreator
    private UnivariateEntireDetectionResult(
            @JsonProperty(value = "period", required = true) int period,
            @JsonProperty(value = "expectedValues", required = true) List<Double> expectedValues,
            @JsonProperty(value = "upperMargins", required = true) List<Double> upperMargins,
            @JsonProperty(value = "lowerMargins", required = true) List<Double> lowerMargins,
            @JsonProperty(value = "isAnomaly", required = true) List<Boolean> isAnomaly,
            @JsonProperty(value = "isNegativeAnomaly", required = true) List<Boolean> isNegativeAnomaly,
            @JsonProperty(value = "isPositiveAnomaly", required = true) List<Boolean> isPositiveAnomaly) {
        this.period = period;
        this.expectedValues = expectedValues;
        this.upperMargins = upperMargins;
        this.lowerMargins = lowerMargins;
        this.isAnomaly = isAnomaly;
        this.isNegativeAnomaly = isNegativeAnomaly;
        this.isPositiveAnomaly = isPositiveAnomaly;
    }

    /**
     * Get the period property: Frequency extracted from the series. Zero means no recurrent pattern has been found.
     *
     * @return the period value.
     */
    public int getPeriod() {
        return this.period;
    }

    /**
     * Get the expectedValues property: Expected value for each input point. The index of the array is consistent with
     * the input series.
     *
     * @return the expectedValues value.
     */
    public List<Double> getExpectedValues() {
        return this.expectedValues;
    }

    /**
     * Get the upperMargins property: Upper margin of each input point. UpperMargin is used to calculate upperBoundary,
     * which is equal to expectedValue + (100 - marginScale)*upperMargin. Anomalies in the response can be filtered by
     * upperBoundary and lowerBoundary. Adjusting the marginScale value can help filter less significant anomalies on
     * the client side. The index of the array is consistent with the input series.
     *
     * @return the upperMargins value.
     */
    public List<Double> getUpperMargins() {
        return this.upperMargins;
    }

    /**
     * Get the lowerMargins property: Lower margin of each input point. LowerMargin is used to calculate lowerBoundary,
     * which is equal to expectedValue - (100 - marginScale)*lowerMargin. Points between the boundary can be marked as
     * normal ones on the client side. The index of the array is consistent with the input series.
     *
     * @return the lowerMargins value.
     */
    public List<Double> getLowerMargins() {
        return this.lowerMargins;
    }

    /**
     * Get the isAnomaly property: Anomaly properties for each input point. True means an anomaly (either negative or
     * positive) has been detected. The index of the array is consistent with the input series.
     *
     * @return the isAnomaly value.
     */
    public List<Boolean> getIsAnomaly() {
        return this.isAnomaly;
    }

    /**
     * Get the isNegativeAnomaly property: Anomaly status in a negative direction for each input point. True means a
     * negative anomaly has been detected. A negative anomaly means the point is detected as an anomaly and its real
     * value is smaller than the expected one. The index of the array is consistent with the input series.
     *
     * @return the isNegativeAnomaly value.
     */
    public List<Boolean> getIsNegativeAnomaly() {
        return this.isNegativeAnomaly;
    }

    /**
     * Get the isPositiveAnomaly property: Anomaly status in a positive direction for each input point. True means a
     * positive anomaly has been detected. A positive anomaly means the point is detected as an anomaly and its real
     * value is larger than the expected one. The index of the array is consistent with the input series.
     *
     * @return the isPositiveAnomaly value.
     */
    public List<Boolean> getIsPositiveAnomaly() {
        return this.isPositiveAnomaly;
    }

    /**
     * Get the severity property: Severity score for each input point. The larger the value is, the more severe the
     * anomaly is. For normal points, the severity is always 0.
     *
     * @return the severity value.
     */
    public List<Double> getSeverity() {
        return this.severity;
    }
}
