// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CheckNameResourceTypes. */
public final class CheckNameResourceTypes extends ExpandableStringEnum<CheckNameResourceTypes> {
    /** Static value Microsoft.NetApp/netAppAccounts for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_NET_APP_NET_APP_ACCOUNTS =
        fromString("Microsoft.NetApp/netAppAccounts");

    /** Static value Microsoft.NetApp/netAppAccounts/capacityPools for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_NET_APP_NET_APP_ACCOUNTS_CAPACITY_POOLS =
        fromString("Microsoft.NetApp/netAppAccounts/capacityPools");

    /** Static value Microsoft.NetApp/netAppAccounts/capacityPools/volumes for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_NET_APP_NET_APP_ACCOUNTS_CAPACITY_POOLS_VOLUMES =
        fromString("Microsoft.NetApp/netAppAccounts/capacityPools/volumes");

    /** Static value Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots for CheckNameResourceTypes. */
    public static final CheckNameResourceTypes MICROSOFT_NET_APP_NET_APP_ACCOUNTS_CAPACITY_POOLS_VOLUMES_SNAPSHOTS =
        fromString("Microsoft.NetApp/netAppAccounts/capacityPools/volumes/snapshots");

    /**
     * Creates or finds a CheckNameResourceTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CheckNameResourceTypes.
     */
    @JsonCreator
    public static CheckNameResourceTypes fromString(String name) {
        return fromString(name, CheckNameResourceTypes.class);
    }

    /**
     * Gets known CheckNameResourceTypes values.
     *
     * @return known CheckNameResourceTypes values.
     */
    public static Collection<CheckNameResourceTypes> values() {
        return values(CheckNameResourceTypes.class);
    }
}
