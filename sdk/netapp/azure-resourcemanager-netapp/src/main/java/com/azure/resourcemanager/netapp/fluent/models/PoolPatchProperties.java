// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.netapp.models.QosType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Patchable pool properties. */
@Fluent
public final class PoolPatchProperties {
    /*
     * size Provisioned size of the pool (in bytes). Allowed values are in 1TiB
     * chunks (value must be multiply of 4398046511104).
     */
    @JsonProperty(value = "size")
    private Long size;

    /*
     * The qos type of the pool
     */
    @JsonProperty(value = "qosType")
    private QosType qosType;

    /**
     * Get the size property: size Provisioned size of the pool (in bytes). Allowed values are in 1TiB chunks (value
     * must be multiply of 4398046511104).
     *
     * @return the size value.
     */
    public Long size() {
        return this.size;
    }

    /**
     * Set the size property: size Provisioned size of the pool (in bytes). Allowed values are in 1TiB chunks (value
     * must be multiply of 4398046511104).
     *
     * @param size the size value to set.
     * @return the PoolPatchProperties object itself.
     */
    public PoolPatchProperties withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the qosType property: The qos type of the pool.
     *
     * @return the qosType value.
     */
    public QosType qosType() {
        return this.qosType;
    }

    /**
     * Set the qosType property: The qos type of the pool.
     *
     * @param qosType the qosType value to set.
     * @return the PoolPatchProperties object itself.
     */
    public PoolPatchProperties withQosType(QosType qosType) {
        this.qosType = qosType;
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
