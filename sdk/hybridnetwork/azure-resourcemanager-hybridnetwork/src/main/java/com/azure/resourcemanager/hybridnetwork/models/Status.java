// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Status. */
public final class Status extends ExpandableStringEnum<Status> {
    /** Static value Unknown for Status. */
    public static final Status UNKNOWN = fromString("Unknown");

    /** Static value NotRegistered for Status. */
    public static final Status NOT_REGISTERED = fromString("NotRegistered");

    /** Static value Registered for Status. */
    public static final Status REGISTERED = fromString("Registered");

    /** Static value Deleted for Status. */
    public static final Status DELETED = fromString("Deleted");

    /**
     * Creates or finds a Status from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Status.
     */
    @JsonCreator
    public static Status fromString(String name) {
        return fromString(name, Status.class);
    }

    /** @return known Status values. */
    public static Collection<Status> values() {
        return values(Status.class);
    }
}
