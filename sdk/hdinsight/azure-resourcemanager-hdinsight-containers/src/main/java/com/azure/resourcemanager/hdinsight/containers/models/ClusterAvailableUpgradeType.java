// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of upgrade.
 */
public final class ClusterAvailableUpgradeType extends ExpandableStringEnum<ClusterAvailableUpgradeType> {
    /**
     * Static value AKSPatchUpgrade for ClusterAvailableUpgradeType.
     */
    public static final ClusterAvailableUpgradeType AKSPATCH_UPGRADE = fromString("AKSPatchUpgrade");

    /**
     * Static value HotfixUpgrade for ClusterAvailableUpgradeType.
     */
    public static final ClusterAvailableUpgradeType HOTFIX_UPGRADE = fromString("HotfixUpgrade");

    /**
     * Static value PatchVersionUpgrade for ClusterAvailableUpgradeType.
     */
    public static final ClusterAvailableUpgradeType PATCH_VERSION_UPGRADE = fromString("PatchVersionUpgrade");

    /**
     * Creates a new instance of ClusterAvailableUpgradeType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClusterAvailableUpgradeType() {
    }

    /**
     * Creates or finds a ClusterAvailableUpgradeType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ClusterAvailableUpgradeType.
     */
    public static ClusterAvailableUpgradeType fromString(String name) {
        return fromString(name, ClusterAvailableUpgradeType.class);
    }

    /**
     * Gets known ClusterAvailableUpgradeType values.
     * 
     * @return known ClusterAvailableUpgradeType values.
     */
    public static Collection<ClusterAvailableUpgradeType> values() {
        return values(ClusterAvailableUpgradeType.class);
    }
}
