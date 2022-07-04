// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** revert a volume to the snapshot. */
@Fluent
public final class VolumeRevert {
    /*
     * Resource id of the snapshot
     */
    @JsonProperty(value = "snapshotId")
    private String snapshotId;

    /**
     * Get the snapshotId property: Resource id of the snapshot.
     *
     * @return the snapshotId value.
     */
    public String snapshotId() {
        return this.snapshotId;
    }

    /**
     * Set the snapshotId property: Resource id of the snapshot.
     *
     * @param snapshotId the snapshotId value to set.
     * @return the VolumeRevert object itself.
     */
    public VolumeRevert withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
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
