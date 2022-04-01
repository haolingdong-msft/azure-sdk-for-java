// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Object to define snapshot and version action conditions. */
@Fluent
public final class DateAfterCreation {
    /*
     * Value indicating the age in days after creation
     */
    @JsonProperty(value = "daysAfterCreationGreaterThan", required = true)
    private float daysAfterCreationGreaterThan;

    /*
     * Value indicating the age in days after last blob tier change time. This
     * property is only applicable for tierToArchive actions and requires
     * daysAfterCreationGreaterThan to be set for snapshots and blob version
     * based actions. The blob will be archived if both the conditions are
     * satisfied.
     */
    @JsonProperty(value = "daysAfterLastTierChangeGreaterThan")
    private Float daysAfterLastTierChangeGreaterThan;

    /**
     * Get the daysAfterCreationGreaterThan property: Value indicating the age in days after creation.
     *
     * @return the daysAfterCreationGreaterThan value.
     */
    public float daysAfterCreationGreaterThan() {
        return this.daysAfterCreationGreaterThan;
    }

    /**
     * Set the daysAfterCreationGreaterThan property: Value indicating the age in days after creation.
     *
     * @param daysAfterCreationGreaterThan the daysAfterCreationGreaterThan value to set.
     * @return the DateAfterCreation object itself.
     */
    public DateAfterCreation withDaysAfterCreationGreaterThan(float daysAfterCreationGreaterThan) {
        this.daysAfterCreationGreaterThan = daysAfterCreationGreaterThan;
        return this;
    }

    /**
     * Get the daysAfterLastTierChangeGreaterThan property: Value indicating the age in days after last blob tier change
     * time. This property is only applicable for tierToArchive actions and requires daysAfterCreationGreaterThan to be
     * set for snapshots and blob version based actions. The blob will be archived if both the conditions are satisfied.
     *
     * @return the daysAfterLastTierChangeGreaterThan value.
     */
    public Float daysAfterLastTierChangeGreaterThan() {
        return this.daysAfterLastTierChangeGreaterThan;
    }

    /**
     * Set the daysAfterLastTierChangeGreaterThan property: Value indicating the age in days after last blob tier change
     * time. This property is only applicable for tierToArchive actions and requires daysAfterCreationGreaterThan to be
     * set for snapshots and blob version based actions. The blob will be archived if both the conditions are satisfied.
     *
     * @param daysAfterLastTierChangeGreaterThan the daysAfterLastTierChangeGreaterThan value to set.
     * @return the DateAfterCreation object itself.
     */
    public DateAfterCreation withDaysAfterLastTierChangeGreaterThan(Float daysAfterLastTierChangeGreaterThan) {
        this.daysAfterLastTierChangeGreaterThan = daysAfterLastTierChangeGreaterThan;
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
