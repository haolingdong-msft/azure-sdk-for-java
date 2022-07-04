// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.MsixPackagePatchProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MSIX Package properties that can be patched. */
@Fluent
public final class MsixPackagePatch extends ProxyResource {
    /*
     * Detailed properties for MSIX Package
     */
    @JsonProperty(value = "properties")
    private MsixPackagePatchProperties innerProperties;

    /**
     * Get the innerProperties property: Detailed properties for MSIX Package.
     *
     * @return the innerProperties value.
     */
    private MsixPackagePatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the isActive property: Set a version of the package to be active across hostpool.
     *
     * @return the isActive value.
     */
    public Boolean isActive() {
        return this.innerProperties() == null ? null : this.innerProperties().isActive();
    }

    /**
     * Set the isActive property: Set a version of the package to be active across hostpool.
     *
     * @param isActive the isActive value to set.
     * @return the MsixPackagePatch object itself.
     */
    public MsixPackagePatch withIsActive(Boolean isActive) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MsixPackagePatchProperties();
        }
        this.innerProperties().withIsActive(isActive);
        return this;
    }

    /**
     * Get the isRegularRegistration property: Set Registration mode. Regular or Delayed.
     *
     * @return the isRegularRegistration value.
     */
    public Boolean isRegularRegistration() {
        return this.innerProperties() == null ? null : this.innerProperties().isRegularRegistration();
    }

    /**
     * Set the isRegularRegistration property: Set Registration mode. Regular or Delayed.
     *
     * @param isRegularRegistration the isRegularRegistration value to set.
     * @return the MsixPackagePatch object itself.
     */
    public MsixPackagePatch withIsRegularRegistration(Boolean isRegularRegistration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MsixPackagePatchProperties();
        }
        this.innerProperties().withIsRegularRegistration(isRegularRegistration);
        return this;
    }

    /**
     * Get the displayName property: Display name for MSIX Package.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: Display name for MSIX Package.
     *
     * @param displayName the displayName value to set.
     * @return the MsixPackagePatch object itself.
     */
    public MsixPackagePatch withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MsixPackagePatchProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
