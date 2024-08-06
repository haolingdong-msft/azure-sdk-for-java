// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for VMGuestPatchClassificationLinux.
 */
public final class VMGuestPatchClassificationLinux extends ExpandableStringEnum<VMGuestPatchClassificationLinux> {
    /**
     * Static value Critical for VMGuestPatchClassificationLinux.
     */
    public static final VMGuestPatchClassificationLinux CRITICAL = fromString("Critical");

    /**
     * Static value Security for VMGuestPatchClassificationLinux.
     */
    public static final VMGuestPatchClassificationLinux SECURITY = fromString("Security");

    /**
     * Static value Other for VMGuestPatchClassificationLinux.
     */
    public static final VMGuestPatchClassificationLinux OTHER = fromString("Other");

    /**
     * Creates a new instance of VMGuestPatchClassificationLinux value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public VMGuestPatchClassificationLinux() {
    }

    /**
     * Creates or finds a VMGuestPatchClassificationLinux from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding VMGuestPatchClassificationLinux.
     */
    public static VMGuestPatchClassificationLinux fromString(String name) {
        return fromString(name, VMGuestPatchClassificationLinux.class);
    }

    /**
     * Gets known VMGuestPatchClassificationLinux values.
     * 
     * @return known VMGuestPatchClassificationLinux values.
     */
    public static Collection<VMGuestPatchClassificationLinux> values() {
        return values(VMGuestPatchClassificationLinux.class);
    }
}
