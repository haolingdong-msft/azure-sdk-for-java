// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The peering sync status of the virtual network peering.
 */
public final class VirtualNetworkPeeringLevel extends ExpandableStringEnum<VirtualNetworkPeeringLevel> {
    /**
     * Static value FullyInSync for VirtualNetworkPeeringLevel.
     */
    public static final VirtualNetworkPeeringLevel FULLY_IN_SYNC = fromString("FullyInSync");

    /**
     * Static value RemoteNotInSync for VirtualNetworkPeeringLevel.
     */
    public static final VirtualNetworkPeeringLevel REMOTE_NOT_IN_SYNC = fromString("RemoteNotInSync");

    /**
     * Static value LocalNotInSync for VirtualNetworkPeeringLevel.
     */
    public static final VirtualNetworkPeeringLevel LOCAL_NOT_IN_SYNC = fromString("LocalNotInSync");

    /**
     * Static value LocalAndRemoteNotInSync for VirtualNetworkPeeringLevel.
     */
    public static final VirtualNetworkPeeringLevel LOCAL_AND_REMOTE_NOT_IN_SYNC = fromString("LocalAndRemoteNotInSync");

    /**
     * Creates a new instance of VirtualNetworkPeeringLevel value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VirtualNetworkPeeringLevel() {
    }

    /**
     * Creates or finds a VirtualNetworkPeeringLevel from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VirtualNetworkPeeringLevel.
     */
    @JsonCreator
    public static VirtualNetworkPeeringLevel fromString(String name) {
        return fromString(name, VirtualNetworkPeeringLevel.class);
    }

    /**
     * Gets known VirtualNetworkPeeringLevel values.
     * 
     * @return known VirtualNetworkPeeringLevel values.
     */
    public static Collection<VirtualNetworkPeeringLevel> values() {
        return values(VirtualNetworkPeeringLevel.class);
    }
}
