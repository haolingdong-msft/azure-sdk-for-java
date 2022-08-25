// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The current provisioning state of the pod identity. */
public final class ManagedClusterPodIdentityProvisioningState
    extends ExpandableStringEnum<ManagedClusterPodIdentityProvisioningState> {
    /** Static value Assigned for ManagedClusterPodIdentityProvisioningState. */
    public static final ManagedClusterPodIdentityProvisioningState ASSIGNED = fromString("Assigned");

    /** Static value Updating for ManagedClusterPodIdentityProvisioningState. */
    public static final ManagedClusterPodIdentityProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for ManagedClusterPodIdentityProvisioningState. */
    public static final ManagedClusterPodIdentityProvisioningState DELETING = fromString("Deleting");

    /** Static value Failed for ManagedClusterPodIdentityProvisioningState. */
    public static final ManagedClusterPodIdentityProvisioningState FAILED = fromString("Failed");

    /**
     * Creates or finds a ManagedClusterPodIdentityProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ManagedClusterPodIdentityProvisioningState.
     */
    @JsonCreator
    public static ManagedClusterPodIdentityProvisioningState fromString(String name) {
        return fromString(name, ManagedClusterPodIdentityProvisioningState.class);
    }

    /**
     * Gets known ManagedClusterPodIdentityProvisioningState values.
     *
     * @return known ManagedClusterPodIdentityProvisioningState values.
     */
    public static Collection<ManagedClusterPodIdentityProvisioningState> values() {
        return values(ManagedClusterPodIdentityProvisioningState.class);
    }
}
