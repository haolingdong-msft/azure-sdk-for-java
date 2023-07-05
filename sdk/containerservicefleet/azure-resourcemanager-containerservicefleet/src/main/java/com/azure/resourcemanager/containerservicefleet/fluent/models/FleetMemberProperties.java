// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservicefleet.models.FleetMemberProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A member of the Fleet. It contains a reference to an existing Kubernetes cluster on Azure. */
@Fluent
public final class FleetMemberProperties {
    /*
     * The ARM resource id of the cluster that joins the Fleet. Must be a valid Azure resource id. e.g.:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{clusterName}'.
     */
    @JsonProperty(value = "clusterResourceId", required = true)
    private String clusterResourceId;

    /*
     * The group this member belongs to for multi-cluster update management.
     */
    @JsonProperty(value = "group")
    private String group;

    /*
     * The status of the last operation.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private FleetMemberProvisioningState provisioningState;

    /** Creates an instance of FleetMemberProperties class. */
    public FleetMemberProperties() {
    }

    /**
     * Get the clusterResourceId property: The ARM resource id of the cluster that joins the Fleet. Must be a valid
     * Azure resource id. e.g.:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{clusterName}'.
     *
     * @return the clusterResourceId value.
     */
    public String clusterResourceId() {
        return this.clusterResourceId;
    }

    /**
     * Set the clusterResourceId property: The ARM resource id of the cluster that joins the Fleet. Must be a valid
     * Azure resource id. e.g.:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{clusterName}'.
     *
     * @param clusterResourceId the clusterResourceId value to set.
     * @return the FleetMemberProperties object itself.
     */
    public FleetMemberProperties withClusterResourceId(String clusterResourceId) {
        this.clusterResourceId = clusterResourceId;
        return this;
    }

    /**
     * Get the group property: The group this member belongs to for multi-cluster update management.
     *
     * @return the group value.
     */
    public String group() {
        return this.group;
    }

    /**
     * Set the group property: The group this member belongs to for multi-cluster update management.
     *
     * @param group the group value to set.
     * @return the FleetMemberProperties object itself.
     */
    public FleetMemberProperties withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Get the provisioningState property: The status of the last operation.
     *
     * @return the provisioningState value.
     */
    public FleetMemberProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clusterResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clusterResourceId in model FleetMemberProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FleetMemberProperties.class);
}
