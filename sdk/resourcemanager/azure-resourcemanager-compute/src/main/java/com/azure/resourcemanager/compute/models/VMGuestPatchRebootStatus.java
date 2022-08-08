// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The reboot state of the VM following completion of the operation. */
public final class VMGuestPatchRebootStatus extends ExpandableStringEnum<VMGuestPatchRebootStatus> {
    /** Static value Unknown for VMGuestPatchRebootStatus. */
    public static final VMGuestPatchRebootStatus UNKNOWN = fromString("Unknown");

    /** Static value NotNeeded for VMGuestPatchRebootStatus. */
    public static final VMGuestPatchRebootStatus NOT_NEEDED = fromString("NotNeeded");

    /** Static value Required for VMGuestPatchRebootStatus. */
    public static final VMGuestPatchRebootStatus REQUIRED = fromString("Required");

    /** Static value Started for VMGuestPatchRebootStatus. */
    public static final VMGuestPatchRebootStatus STARTED = fromString("Started");

    /** Static value Failed for VMGuestPatchRebootStatus. */
    public static final VMGuestPatchRebootStatus FAILED = fromString("Failed");

    /** Static value Completed for VMGuestPatchRebootStatus. */
    public static final VMGuestPatchRebootStatus COMPLETED = fromString("Completed");

    /**
     * Creates or finds a VMGuestPatchRebootStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding VMGuestPatchRebootStatus.
     */
    @JsonCreator
    public static VMGuestPatchRebootStatus fromString(String name) {
        return fromString(name, VMGuestPatchRebootStatus.class);
    }

    /**
     * Gets known VMGuestPatchRebootStatus values.
     *
     * @return known VMGuestPatchRebootStatus values.
     */
    public static Collection<VMGuestPatchRebootStatus> values() {
        return values(VMGuestPatchRebootStatus.class);
    }
}
