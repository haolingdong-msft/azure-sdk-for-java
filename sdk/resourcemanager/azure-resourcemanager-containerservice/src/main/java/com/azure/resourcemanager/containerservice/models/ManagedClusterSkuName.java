// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The name of a managed cluster SKU. */
public final class ManagedClusterSkuName extends ExpandableStringEnum<ManagedClusterSkuName> {
    /** Static value Basic for ManagedClusterSkuName. */
    public static final ManagedClusterSkuName BASIC = fromString("Basic");

    /**
     * Creates or finds a ManagedClusterSkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ManagedClusterSkuName.
     */
    @JsonCreator
    public static ManagedClusterSkuName fromString(String name) {
        return fromString(name, ManagedClusterSkuName.class);
    }

    /**
     * Gets known ManagedClusterSkuName values.
     *
     * @return known ManagedClusterSkuName values.
     */
    public static Collection<ManagedClusterSkuName> values() {
        return values(ManagedClusterSkuName.class);
    }
}
