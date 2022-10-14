// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devcenter.fluent.models.PoolUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The pool properties for partial update. Properties not provided in the update request will not be changed. */
@Fluent
public final class PoolUpdate extends TrackedResourceUpdate {
    /*
     * Properties of a pool to be updated.
     */
    @JsonProperty(value = "properties")
    private PoolUpdateProperties innerProperties;

    /** Creates an instance of PoolUpdate class. */
    public PoolUpdate() {
    }

    /**
     * Get the innerProperties property: Properties of a pool to be updated.
     *
     * @return the innerProperties value.
     */
    private PoolUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public PoolUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PoolUpdate withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * Get the devBoxDefinitionName property: Name of a Dev Box definition in parent Project of this Pool.
     *
     * @return the devBoxDefinitionName value.
     */
    public String devBoxDefinitionName() {
        return this.innerProperties() == null ? null : this.innerProperties().devBoxDefinitionName();
    }

    /**
     * Set the devBoxDefinitionName property: Name of a Dev Box definition in parent Project of this Pool.
     *
     * @param devBoxDefinitionName the devBoxDefinitionName value to set.
     * @return the PoolUpdate object itself.
     */
    public PoolUpdate withDevBoxDefinitionName(String devBoxDefinitionName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolUpdateProperties();
        }
        this.innerProperties().withDevBoxDefinitionName(devBoxDefinitionName);
        return this;
    }

    /**
     * Get the networkConnectionName property: Name of a Network Connection in parent Project of this Pool.
     *
     * @return the networkConnectionName value.
     */
    public String networkConnectionName() {
        return this.innerProperties() == null ? null : this.innerProperties().networkConnectionName();
    }

    /**
     * Set the networkConnectionName property: Name of a Network Connection in parent Project of this Pool.
     *
     * @param networkConnectionName the networkConnectionName value to set.
     * @return the PoolUpdate object itself.
     */
    public PoolUpdate withNetworkConnectionName(String networkConnectionName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolUpdateProperties();
        }
        this.innerProperties().withNetworkConnectionName(networkConnectionName);
        return this;
    }

    /**
     * Get the licenseType property: Specifies the license type indicating the caller has already acquired licenses for
     * the Dev Boxes that will be created.
     *
     * @return the licenseType value.
     */
    public LicenseType licenseType() {
        return this.innerProperties() == null ? null : this.innerProperties().licenseType();
    }

    /**
     * Set the licenseType property: Specifies the license type indicating the caller has already acquired licenses for
     * the Dev Boxes that will be created.
     *
     * @param licenseType the licenseType value to set.
     * @return the PoolUpdate object itself.
     */
    public PoolUpdate withLicenseType(LicenseType licenseType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolUpdateProperties();
        }
        this.innerProperties().withLicenseType(licenseType);
        return this;
    }

    /**
     * Get the localAdministrator property: Indicates whether owners of Dev Boxes in this pool are added as local
     * administrators on the Dev Box.
     *
     * @return the localAdministrator value.
     */
    public LocalAdminStatus localAdministrator() {
        return this.innerProperties() == null ? null : this.innerProperties().localAdministrator();
    }

    /**
     * Set the localAdministrator property: Indicates whether owners of Dev Boxes in this pool are added as local
     * administrators on the Dev Box.
     *
     * @param localAdministrator the localAdministrator value to set.
     * @return the PoolUpdate object itself.
     */
    public PoolUpdate withLocalAdministrator(LocalAdminStatus localAdministrator) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolUpdateProperties();
        }
        this.innerProperties().withLocalAdministrator(localAdministrator);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
