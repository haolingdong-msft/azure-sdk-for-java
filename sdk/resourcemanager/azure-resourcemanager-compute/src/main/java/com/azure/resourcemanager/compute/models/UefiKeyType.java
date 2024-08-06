// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The type of key signature.
 */
public final class UefiKeyType extends ExpandableStringEnum<UefiKeyType> {
    /**
     * Static value sha256 for UefiKeyType.
     */
    public static final UefiKeyType SHA256 = fromString("sha256");

    /**
     * Static value x509 for UefiKeyType.
     */
    public static final UefiKeyType X509 = fromString("x509");

    /**
     * Creates a new instance of UefiKeyType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public UefiKeyType() {
    }

    /**
     * Creates or finds a UefiKeyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding UefiKeyType.
     */
    public static UefiKeyType fromString(String name) {
        return fromString(name, UefiKeyType.class);
    }

    /**
     * Gets known UefiKeyType values.
     * 
     * @return known UefiKeyType values.
     */
    public static Collection<UefiKeyType> values() {
        return values(UefiKeyType.class);
    }
}
