// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Warning object used by layers that have access to localized content, and propagate that to user.
 */
@Fluent
public final class UserFacingWarningDetail {
    /*
     * Name of resource for which warning is raised.
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /*
     * Error details for the warning.
     */
    @JsonProperty(value = "warning", required = true)
    private UserFacingError warning;

    /**
     * Creates an instance of UserFacingWarningDetail class.
     */
    public UserFacingWarningDetail() {
    }

    /**
     * Get the resourceName property: Name of resource for which warning is raised.
     * 
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: Name of resource for which warning is raised.
     * 
     * @param resourceName the resourceName value to set.
     * @return the UserFacingWarningDetail object itself.
     */
    public UserFacingWarningDetail withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * Get the warning property: Error details for the warning.
     * 
     * @return the warning value.
     */
    public UserFacingError warning() {
        return this.warning;
    }

    /**
     * Set the warning property: Error details for the warning.
     * 
     * @param warning the warning value to set.
     * @return the UserFacingWarningDetail object itself.
     */
    public UserFacingWarningDetail withWarning(UserFacingError warning) {
        this.warning = warning;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (warning() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property warning in model UserFacingWarningDetail"));
        } else {
            warning().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UserFacingWarningDetail.class);
}
