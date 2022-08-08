// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.models.GalleryIdentifier;
import com.azure.resourcemanager.compute.models.GalleryProvisioningState;
import com.azure.resourcemanager.compute.models.SharingProfile;
import com.azure.resourcemanager.compute.models.SharingStatus;
import com.azure.resourcemanager.compute.models.SoftDeletePolicy;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of a Shared Image Gallery. */
@Fluent
public final class GalleryProperties {
    /*
     * The description of this Shared Image Gallery resource. This property is updatable.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Describes the gallery unique name.
     */
    @JsonProperty(value = "identifier")
    private GalleryIdentifier identifier;

    /*
     * The current state of the gallery or gallery artifact.
     *
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private GalleryProvisioningState provisioningState;

    /*
     * Profile for gallery sharing to subscription or tenant
     */
    @JsonProperty(value = "sharingProfile")
    private SharingProfile sharingProfile;

    /*
     * Contains information about the soft deletion policy of the gallery.
     */
    @JsonProperty(value = "softDeletePolicy")
    private SoftDeletePolicy softDeletePolicy;

    /*
     * Sharing status of current gallery.
     */
    @JsonProperty(value = "sharingStatus", access = JsonProperty.Access.WRITE_ONLY)
    private SharingStatus sharingStatus;

    /**
     * Get the description property: The description of this Shared Image Gallery resource. This property is updatable.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of this Shared Image Gallery resource. This property is updatable.
     *
     * @param description the description value to set.
     * @return the GalleryProperties object itself.
     */
    public GalleryProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the identifier property: Describes the gallery unique name.
     *
     * @return the identifier value.
     */
    public GalleryIdentifier identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Describes the gallery unique name.
     *
     * @param identifier the identifier value to set.
     * @return the GalleryProperties object itself.
     */
    public GalleryProperties withIdentifier(GalleryIdentifier identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the provisioningState property: The current state of the gallery or gallery artifact.
     *
     * <p>The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public GalleryProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the sharingProfile property: Profile for gallery sharing to subscription or tenant.
     *
     * @return the sharingProfile value.
     */
    public SharingProfile sharingProfile() {
        return this.sharingProfile;
    }

    /**
     * Set the sharingProfile property: Profile for gallery sharing to subscription or tenant.
     *
     * @param sharingProfile the sharingProfile value to set.
     * @return the GalleryProperties object itself.
     */
    public GalleryProperties withSharingProfile(SharingProfile sharingProfile) {
        this.sharingProfile = sharingProfile;
        return this;
    }

    /**
     * Get the softDeletePolicy property: Contains information about the soft deletion policy of the gallery.
     *
     * @return the softDeletePolicy value.
     */
    public SoftDeletePolicy softDeletePolicy() {
        return this.softDeletePolicy;
    }

    /**
     * Set the softDeletePolicy property: Contains information about the soft deletion policy of the gallery.
     *
     * @param softDeletePolicy the softDeletePolicy value to set.
     * @return the GalleryProperties object itself.
     */
    public GalleryProperties withSoftDeletePolicy(SoftDeletePolicy softDeletePolicy) {
        this.softDeletePolicy = softDeletePolicy;
        return this;
    }

    /**
     * Get the sharingStatus property: Sharing status of current gallery.
     *
     * @return the sharingStatus value.
     */
    public SharingStatus sharingStatus() {
        return this.sharingStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identifier() != null) {
            identifier().validate();
        }
        if (sharingProfile() != null) {
            sharingProfile().validate();
        }
        if (softDeletePolicy() != null) {
            softDeletePolicy().validate();
        }
        if (sharingStatus() != null) {
            sharingStatus().validate();
        }
    }
}
