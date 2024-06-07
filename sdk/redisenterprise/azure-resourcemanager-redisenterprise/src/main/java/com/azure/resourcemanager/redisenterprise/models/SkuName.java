// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of RedisEnterprise cluster to deploy. Possible values: (Enterprise_E10, EnterpriseFlash_F300 etc.).
 */
public final class SkuName extends ExpandableStringEnum<SkuName> {
    /**
     * Static value Enterprise_E5 for SkuName.
     */
    public static final SkuName ENTERPRISE_E5 = fromString("Enterprise_E5");

    /**
     * Static value Enterprise_E10 for SkuName.
     */
    public static final SkuName ENTERPRISE_E10 = fromString("Enterprise_E10");

    /**
     * Static value Enterprise_E20 for SkuName.
     */
    public static final SkuName ENTERPRISE_E20 = fromString("Enterprise_E20");

    /**
     * Static value Enterprise_E50 for SkuName.
     */
    public static final SkuName ENTERPRISE_E50 = fromString("Enterprise_E50");

    /**
     * Static value Enterprise_E100 for SkuName.
     */
    public static final SkuName ENTERPRISE_E100 = fromString("Enterprise_E100");

    /**
     * Static value EnterpriseFlash_F300 for SkuName.
     */
    public static final SkuName ENTERPRISE_FLASH_F300 = fromString("EnterpriseFlash_F300");

    /**
     * Static value EnterpriseFlash_F700 for SkuName.
     */
    public static final SkuName ENTERPRISE_FLASH_F700 = fromString("EnterpriseFlash_F700");

    /**
     * Static value EnterpriseFlash_F1500 for SkuName.
     */
    public static final SkuName ENTERPRISE_FLASH_F1500 = fromString("EnterpriseFlash_F1500");

    /**
     * Creates a new instance of SkuName value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SkuName() {
    }

    /**
     * Creates or finds a SkuName from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SkuName.
     */
    @JsonCreator
    public static SkuName fromString(String name) {
        return fromString(name, SkuName.class);
    }

    /**
     * Gets known SkuName values.
     * 
     * @return known SkuName values.
     */
    public static Collection<SkuName> values() {
        return values(SkuName.class);
    }
}
