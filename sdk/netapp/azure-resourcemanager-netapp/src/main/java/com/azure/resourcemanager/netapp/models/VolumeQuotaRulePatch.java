// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.netapp.fluent.models.VolumeQuotaRulesProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Patchable Quota Rule of a Volume. */
@Fluent
public final class VolumeQuotaRulePatch {
    /*
     * Volume Quota Rule Properties
     */
    @JsonProperty(value = "properties")
    private VolumeQuotaRulesProperties innerProperties;

    /**
     * Get the innerProperties property: Volume Quota Rule Properties.
     *
     * @return the innerProperties value.
     */
    private VolumeQuotaRulesProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: Gets the status of the VolumeQuotaRule at the time the operation was called.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the quotaSizeInKiBs property: Size of quota.
     *
     * @return the quotaSizeInKiBs value.
     */
    public Long quotaSizeInKiBs() {
        return this.innerProperties() == null ? null : this.innerProperties().quotaSizeInKiBs();
    }

    /**
     * Set the quotaSizeInKiBs property: Size of quota.
     *
     * @param quotaSizeInKiBs the quotaSizeInKiBs value to set.
     * @return the VolumeQuotaRulePatch object itself.
     */
    public VolumeQuotaRulePatch withQuotaSizeInKiBs(Long quotaSizeInKiBs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeQuotaRulesProperties();
        }
        this.innerProperties().withQuotaSizeInKiBs(quotaSizeInKiBs);
        return this;
    }

    /**
     * Get the quotaType property: quotaType
     *
     * <p>Type of quota.
     *
     * @return the quotaType value.
     */
    public Type quotaType() {
        return this.innerProperties() == null ? null : this.innerProperties().quotaType();
    }

    /**
     * Set the quotaType property: quotaType
     *
     * <p>Type of quota.
     *
     * @param quotaType the quotaType value to set.
     * @return the VolumeQuotaRulePatch object itself.
     */
    public VolumeQuotaRulePatch withQuotaType(Type quotaType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeQuotaRulesProperties();
        }
        this.innerProperties().withQuotaType(quotaType);
        return this;
    }

    /**
     * Get the quotaTarget property: UserID/GroupID/SID based on the quota target type. UserID and groupID can be found
     * by running ‘id’ or ‘getent’ command for the user or group and SID can be found by running &lt;wmic useraccount
     * where name='user-name' get sid&gt;.
     *
     * @return the quotaTarget value.
     */
    public String quotaTarget() {
        return this.innerProperties() == null ? null : this.innerProperties().quotaTarget();
    }

    /**
     * Set the quotaTarget property: UserID/GroupID/SID based on the quota target type. UserID and groupID can be found
     * by running ‘id’ or ‘getent’ command for the user or group and SID can be found by running &lt;wmic useraccount
     * where name='user-name' get sid&gt;.
     *
     * @param quotaTarget the quotaTarget value to set.
     * @return the VolumeQuotaRulePatch object itself.
     */
    public VolumeQuotaRulePatch withQuotaTarget(String quotaTarget) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeQuotaRulesProperties();
        }
        this.innerProperties().withQuotaTarget(quotaTarget);
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
