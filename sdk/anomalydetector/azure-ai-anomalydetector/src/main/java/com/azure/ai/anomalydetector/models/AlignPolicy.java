// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Manner of aligning multiple variables. */
@Fluent
public final class AlignPolicy {
    /*
     * Field that indicates how to align different variables to the same
     * time range.
     */
    @JsonProperty(value = "alignMode")
    private AlignMode alignMode;

    /*
     * Field that indicates how missing values will be filled.
     */
    @JsonProperty(value = "fillNAMethod")
    private FillNAMethod fillNAMethod;

    /*
     * Field that's required when fillNAMethod is Fixed.
     */
    @JsonProperty(value = "paddingValue")
    private Double paddingValue;

    /** Creates an instance of AlignPolicy class. */
    public AlignPolicy() {}

    /**
     * Get the alignMode property: Field that indicates how to align different variables to the same time range.
     *
     * @return the alignMode value.
     */
    public AlignMode getAlignMode() {
        return this.alignMode;
    }

    /**
     * Set the alignMode property: Field that indicates how to align different variables to the same time range.
     *
     * @param alignMode the alignMode value to set.
     * @return the AlignPolicy object itself.
     */
    public AlignPolicy setAlignMode(AlignMode alignMode) {
        this.alignMode = alignMode;
        return this;
    }

    /**
     * Get the fillNAMethod property: Field that indicates how missing values will be filled.
     *
     * @return the fillNAMethod value.
     */
    public FillNAMethod getFillNAMethod() {
        return this.fillNAMethod;
    }

    /**
     * Set the fillNAMethod property: Field that indicates how missing values will be filled.
     *
     * @param fillNAMethod the fillNAMethod value to set.
     * @return the AlignPolicy object itself.
     */
    public AlignPolicy setFillNAMethod(FillNAMethod fillNAMethod) {
        this.fillNAMethod = fillNAMethod;
        return this;
    }

    /**
     * Get the paddingValue property: Field that's required when fillNAMethod is Fixed.
     *
     * @return the paddingValue value.
     */
    public Double getPaddingValue() {
        return this.paddingValue;
    }

    /**
     * Set the paddingValue property: Field that's required when fillNAMethod is Fixed.
     *
     * @param paddingValue the paddingValue value to set.
     * @return the AlignPolicy object itself.
     */
    public AlignPolicy setPaddingValue(Double paddingValue) {
        this.paddingValue = paddingValue;
        return this;
    }
}
