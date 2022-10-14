// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The alert rule template status. */
public final class TemplateStatus extends ExpandableStringEnum<TemplateStatus> {
    /** Static value Installed for TemplateStatus. */
    public static final TemplateStatus INSTALLED = fromString("Installed");

    /** Static value Available for TemplateStatus. */
    public static final TemplateStatus AVAILABLE = fromString("Available");

    /** Static value NotAvailable for TemplateStatus. */
    public static final TemplateStatus NOT_AVAILABLE = fromString("NotAvailable");

    /**
     * Creates or finds a TemplateStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TemplateStatus.
     */
    @JsonCreator
    public static TemplateStatus fromString(String name) {
        return fromString(name, TemplateStatus.class);
    }

    /**
     * Gets known TemplateStatus values.
     *
     * @return known TemplateStatus values.
     */
    public static Collection<TemplateStatus> values() {
        return values(TemplateStatus.class);
    }
}
