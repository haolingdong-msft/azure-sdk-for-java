// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Flag if need to remove current existing peerings. */
public final class DeleteExistingPeering extends ExpandableStringEnum<DeleteExistingPeering> {
    /** Static value False for DeleteExistingPeering. */
    public static final DeleteExistingPeering FALSE = fromString("False");

    /** Static value True for DeleteExistingPeering. */
    public static final DeleteExistingPeering TRUE = fromString("True");

    /**
     * Creates or finds a DeleteExistingPeering from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeleteExistingPeering.
     */
    @JsonCreator
    public static DeleteExistingPeering fromString(String name) {
        return fromString(name, DeleteExistingPeering.class);
    }

    /**
     * Gets known DeleteExistingPeering values.
     *
     * @return known DeleteExistingPeering values.
     */
    public static Collection<DeleteExistingPeering> values() {
        return values(DeleteExistingPeering.class);
    }
}
