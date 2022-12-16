// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Advanced Threat Protection settings. */
@Fluent
public final class AdvancedThreatProtectionProperties {
    /*
     * Indicates whether Advanced Threat Protection is enabled.
     */
    @JsonProperty(value = "isEnabled")
    private Boolean isEnabled;

    /** Creates an instance of AdvancedThreatProtectionProperties class. */
    public AdvancedThreatProtectionProperties() {
    }

    /**
     * Get the isEnabled property: Indicates whether Advanced Threat Protection is enabled.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Indicates whether Advanced Threat Protection is enabled.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the AdvancedThreatProtectionProperties object itself.
     */
    public AdvancedThreatProtectionProperties withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
