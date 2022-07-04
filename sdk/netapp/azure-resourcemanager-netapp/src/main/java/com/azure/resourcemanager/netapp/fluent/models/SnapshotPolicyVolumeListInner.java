// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Volumes associated with snapshot policy. */
@Fluent
public final class SnapshotPolicyVolumeListInner {
    /*
     * List of volumes
     */
    @JsonProperty(value = "value")
    private List<VolumeInner> value;

    /**
     * Get the value property: List of volumes.
     *
     * @return the value value.
     */
    public List<VolumeInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of volumes.
     *
     * @param value the value value to set.
     * @return the SnapshotPolicyVolumeListInner object itself.
     */
    public SnapshotPolicyVolumeListInner withValue(List<VolumeInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
