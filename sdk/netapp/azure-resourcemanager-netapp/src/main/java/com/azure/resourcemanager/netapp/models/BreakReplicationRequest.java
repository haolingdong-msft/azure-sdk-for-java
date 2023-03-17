// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Break replication request. */
@Fluent
public final class BreakReplicationRequest {
    /*
     * If replication is in status transferring and you want to force break the replication, set to true
     */
    @JsonProperty(value = "forceBreakReplication")
    private Boolean forceBreakReplication;

    /** Creates an instance of BreakReplicationRequest class. */
    public BreakReplicationRequest() {
    }

    /**
     * Get the forceBreakReplication property: If replication is in status transferring and you want to force break the
     * replication, set to true.
     *
     * @return the forceBreakReplication value.
     */
    public Boolean forceBreakReplication() {
        return this.forceBreakReplication;
    }

    /**
     * Set the forceBreakReplication property: If replication is in status transferring and you want to force break the
     * replication, set to true.
     *
     * @param forceBreakReplication the forceBreakReplication value to set.
     * @return the BreakReplicationRequest object itself.
     */
    public BreakReplicationRequest withForceBreakReplication(Boolean forceBreakReplication) {
        this.forceBreakReplication = forceBreakReplication;
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
