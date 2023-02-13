// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.costmanagement.models.IncludedQuantityUtilizationSummary;
import com.azure.resourcemanager.costmanagement.models.SavingsPlanUtilizationSummary;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Benefit utilization summary resource. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "kind",
    defaultImpl = BenefitUtilizationSummaryInner.class)
@JsonTypeName("BenefitUtilizationSummary")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "IncludedQuantity", value = IncludedQuantityUtilizationSummary.class),
    @JsonSubTypes.Type(name = "SavingsPlan", value = SavingsPlanUtilizationSummary.class)
})
@Immutable
public class BenefitUtilizationSummaryInner extends ProxyResource {
    /** Creates an instance of BenefitUtilizationSummaryInner class. */
    public BenefitUtilizationSummaryInner() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
