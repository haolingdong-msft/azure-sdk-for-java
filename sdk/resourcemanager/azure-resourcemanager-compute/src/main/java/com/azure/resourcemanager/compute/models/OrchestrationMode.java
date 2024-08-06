// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the orchestration mode for the virtual machine scale set.
 */
public final class OrchestrationMode extends ExpandableStringEnum<OrchestrationMode> {
    /**
     * Static value Uniform for OrchestrationMode.
     */
    public static final OrchestrationMode UNIFORM = fromString("Uniform");

    /**
     * Static value Flexible for OrchestrationMode.
     */
    public static final OrchestrationMode FLEXIBLE = fromString("Flexible");

    /**
     * Creates a new instance of OrchestrationMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OrchestrationMode() {
    }

    /**
     * Creates or finds a OrchestrationMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OrchestrationMode.
     */
    public static OrchestrationMode fromString(String name) {
        return fromString(name, OrchestrationMode.class);
    }

    /**
     * Gets known OrchestrationMode values.
     * 
     * @return known OrchestrationMode values.
     */
    public static Collection<OrchestrationMode> values() {
        return values(OrchestrationMode.class);
    }
}
