// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Volume mount for the Container App. */
@Fluent
public final class VolumeMount {
    /*
     * This must match the Name of a Volume.
     */
    @JsonProperty(value = "volumeName")
    private String volumeName;

    /*
     * Path within the container at which the volume should be mounted.Must not contain ':'.
     */
    @JsonProperty(value = "mountPath")
    private String mountPath;

    /** Creates an instance of VolumeMount class. */
    public VolumeMount() {
    }

    /**
     * Get the volumeName property: This must match the Name of a Volume.
     *
     * @return the volumeName value.
     */
    public String volumeName() {
        return this.volumeName;
    }

    /**
     * Set the volumeName property: This must match the Name of a Volume.
     *
     * @param volumeName the volumeName value to set.
     * @return the VolumeMount object itself.
     */
    public VolumeMount withVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

    /**
     * Get the mountPath property: Path within the container at which the volume should be mounted.Must not contain ':'.
     *
     * @return the mountPath value.
     */
    public String mountPath() {
        return this.mountPath;
    }

    /**
     * Set the mountPath property: Path within the container at which the volume should be mounted.Must not contain ':'.
     *
     * @param mountPath the mountPath value to set.
     * @return the VolumeMount object itself.
     */
    public VolumeMount withMountPath(String mountPath) {
        this.mountPath = mountPath;
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
