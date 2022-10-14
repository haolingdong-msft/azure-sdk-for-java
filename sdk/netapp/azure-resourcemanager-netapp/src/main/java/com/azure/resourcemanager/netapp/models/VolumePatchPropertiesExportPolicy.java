// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * exportPolicy
 *
 * <p>Set of export policy rules.
 */
@Fluent
public final class VolumePatchPropertiesExportPolicy {
    /*
     * Export policy rule
     */
    @JsonProperty(value = "rules")
    private List<ExportPolicyRule> rules;

    /**
     * Get the rules property: Export policy rule.
     *
     * @return the rules value.
     */
    public List<ExportPolicyRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: Export policy rule.
     *
     * @param rules the rules value to set.
     * @return the VolumePatchPropertiesExportPolicy object itself.
     */
    public VolumePatchPropertiesExportPolicy withRules(List<ExportPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }
}
