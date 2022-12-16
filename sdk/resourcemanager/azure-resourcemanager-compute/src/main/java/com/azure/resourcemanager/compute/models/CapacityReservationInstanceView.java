// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The instance view of a capacity reservation that provides as snapshot of the runtime properties of the capacity
 * reservation that is managed by the platform and can change outside of control plane operations.
 */
@Fluent
public class CapacityReservationInstanceView {
    /*
     * Unutilized capacity of the capacity reservation.
     */
    @JsonProperty(value = "utilizationInfo")
    private CapacityReservationUtilization utilizationInfo;

    /*
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /** Creates an instance of CapacityReservationInstanceView class. */
    public CapacityReservationInstanceView() {
    }

    /**
     * Get the utilizationInfo property: Unutilized capacity of the capacity reservation.
     *
     * @return the utilizationInfo value.
     */
    public CapacityReservationUtilization utilizationInfo() {
        return this.utilizationInfo;
    }

    /**
     * Set the utilizationInfo property: Unutilized capacity of the capacity reservation.
     *
     * @param utilizationInfo the utilizationInfo value to set.
     * @return the CapacityReservationInstanceView object itself.
     */
    public CapacityReservationInstanceView withUtilizationInfo(CapacityReservationUtilization utilizationInfo) {
        this.utilizationInfo = utilizationInfo;
        return this;
    }

    /**
     * Get the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the statuses property: The resource status information.
     *
     * @param statuses the statuses value to set.
     * @return the CapacityReservationInstanceView object itself.
     */
    public CapacityReservationInstanceView withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (utilizationInfo() != null) {
            utilizationInfo().validate();
        }
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
    }
}
