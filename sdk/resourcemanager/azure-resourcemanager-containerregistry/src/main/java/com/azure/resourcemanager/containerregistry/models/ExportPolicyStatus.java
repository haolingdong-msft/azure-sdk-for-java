// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExportPolicyStatus. */
public final class ExportPolicyStatus extends ExpandableStringEnum<ExportPolicyStatus> {
    /** Static value enabled for ExportPolicyStatus. */
    public static final ExportPolicyStatus ENABLED = fromString("enabled");

    /** Static value disabled for ExportPolicyStatus. */
    public static final ExportPolicyStatus DISABLED = fromString("disabled");

    /**
     * Creates or finds a ExportPolicyStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExportPolicyStatus.
     */
    @JsonCreator
    public static ExportPolicyStatus fromString(String name) {
        return fromString(name, ExportPolicyStatus.class);
    }

    /** @return known ExportPolicyStatus values. */
    public static Collection<ExportPolicyStatus> values() {
        return values(ExportPolicyStatus.class);
    }
}
