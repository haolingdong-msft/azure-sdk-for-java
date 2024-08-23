// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Findings in a radiology report typically describe abnormalities, lesions, or other notable observations related to
 * the anatomy or pathology of the imaged area.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "kind", defaultImpl = FindingInference.class, visible = true)
@JsonTypeName("finding")
@Immutable
public final class FindingInference extends RadiologyInsightsInference {

    /*
     * Discriminator property for RadiologyInsightsInference.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "kind")
    private RadiologyInsightsInferenceType kind = RadiologyInsightsInferenceType.FINDING;

    /*
     * Finding data : contains extensions, fields and components linked with the finding.
     */
    @Generated
    @JsonProperty(value = "finding")
    private final FhirR4Observation finding;

    /**
     * Creates an instance of FindingInference class.
     *
     * @param finding the finding value to set.
     */
    @Generated
    @JsonCreator
    private FindingInference(@JsonProperty(value = "finding") FhirR4Observation finding) {
        this.finding = finding;
    }

    /**
     * Get the kind property: Discriminator property for RadiologyInsightsInference.
     *
     * @return the kind value.
     */
    @Generated
    public RadiologyInsightsInferenceType getKind() {
        return this.kind;
    }

    /**
     * Get the finding property: Finding data : contains extensions, fields and components linked with the finding.
     *
     * @return the finding value.
     */
    @Generated
    public FhirR4Observation getFinding() {
        return this.finding;
    }
}
