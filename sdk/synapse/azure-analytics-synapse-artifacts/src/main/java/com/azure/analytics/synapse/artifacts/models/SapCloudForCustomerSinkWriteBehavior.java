// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The write behavior for the operation. Default is 'Insert'. */
public final class SapCloudForCustomerSinkWriteBehavior
        extends ExpandableStringEnum<SapCloudForCustomerSinkWriteBehavior> {
    /** Static value Insert for SapCloudForCustomerSinkWriteBehavior. */
    public static final SapCloudForCustomerSinkWriteBehavior INSERT = fromString("Insert");

    /** Static value Update for SapCloudForCustomerSinkWriteBehavior. */
    public static final SapCloudForCustomerSinkWriteBehavior UPDATE = fromString("Update");

    /**
     * Creates or finds a SapCloudForCustomerSinkWriteBehavior from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SapCloudForCustomerSinkWriteBehavior.
     */
    @JsonCreator
    public static SapCloudForCustomerSinkWriteBehavior fromString(String name) {
        return fromString(name, SapCloudForCustomerSinkWriteBehavior.class);
    }

    /**
     * Gets known SapCloudForCustomerSinkWriteBehavior values.
     *
     * @return known SapCloudForCustomerSinkWriteBehavior values.
     */
    public static Collection<SapCloudForCustomerSinkWriteBehavior> values() {
        return values(SapCloudForCustomerSinkWriteBehavior.class);
    }
}
