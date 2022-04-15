// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Export operation configuration information. */
@Fluent
public final class FhirServiceExportConfiguration {
    /*
     * The name of the default export storage account.
     */
    @JsonProperty(value = "storageAccountName")
    private String storageAccountName;

    /**
     * Get the storageAccountName property: The name of the default export storage account.
     *
     * @return the storageAccountName value.
     */
    public String storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Set the storageAccountName property: The name of the default export storage account.
     *
     * @param storageAccountName the storageAccountName value to set.
     * @return the FhirServiceExportConfiguration object itself.
     */
    public FhirServiceExportConfiguration withStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
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
