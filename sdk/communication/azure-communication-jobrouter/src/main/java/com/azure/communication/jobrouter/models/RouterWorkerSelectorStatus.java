// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Describes the status of a worker selector.
 */
public final class RouterWorkerSelectorStatus extends ExpandableStringEnum<RouterWorkerSelectorStatus> {

    /**
     * Worker selector is valid.
     */
    @Generated
    public static final RouterWorkerSelectorStatus ACTIVE = fromString("active");

    /**
     * Worker selector is not valid.
     */
    @Generated
    public static final RouterWorkerSelectorStatus EXPIRED = fromString("expired");

    /**
     * Creates a new instance of RouterWorkerSelectorStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public RouterWorkerSelectorStatus() {
    }

    /**
     * Creates or finds a RouterWorkerSelectorStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RouterWorkerSelectorStatus.
     */
    @Generated
    @JsonCreator
    public static RouterWorkerSelectorStatus fromString(String name) {
        return fromString(name, RouterWorkerSelectorStatus.class);
    }

    /**
     * Gets known RouterWorkerSelectorStatus values.
     *
     * @return known RouterWorkerSelectorStatus values.
     */
    @Generated
    public static Collection<RouterWorkerSelectorStatus> values() {
        return values(RouterWorkerSelectorStatus.class);
    }
}
