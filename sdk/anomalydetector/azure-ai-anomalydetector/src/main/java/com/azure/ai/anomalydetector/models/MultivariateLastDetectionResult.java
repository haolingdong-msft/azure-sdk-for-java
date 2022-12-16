// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Results of last detection. */
@Immutable
public final class MultivariateLastDetectionResult {
    /*
     * Variable Status.
     */
    @JsonProperty(value = "variableStates")
    private List<VariableState> variableStates;

    /*
     * Anomaly status and information.
     */
    @JsonProperty(value = "results")
    private List<AnomalyState> results;

    /** Creates an instance of MultivariateLastDetectionResult class. */
    private MultivariateLastDetectionResult() {}

    /**
     * Get the variableStates property: Variable Status.
     *
     * @return the variableStates value.
     */
    public List<VariableState> getVariableStates() {
        return this.variableStates;
    }

    /**
     * Get the results property: Anomaly status and information.
     *
     * @return the results value.
     */
    public List<AnomalyState> getResults() {
        return this.results;
    }
}
