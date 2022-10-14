// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.kusto.models.LanguageExtensionName;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The language extension object. */
@Fluent
public final class LanguageExtensionInner {
    /*
     * The language extension name.
     */
    @JsonProperty(value = "languageExtensionName")
    private LanguageExtensionName languageExtensionName;

    /**
     * Get the languageExtensionName property: The language extension name.
     *
     * @return the languageExtensionName value.
     */
    public LanguageExtensionName languageExtensionName() {
        return this.languageExtensionName;
    }

    /**
     * Set the languageExtensionName property: The language extension name.
     *
     * @param languageExtensionName the languageExtensionName value to set.
     * @return the LanguageExtensionInner object itself.
     */
    public LanguageExtensionInner withLanguageExtensionName(LanguageExtensionName languageExtensionName) {
        this.languageExtensionName = languageExtensionName;
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
