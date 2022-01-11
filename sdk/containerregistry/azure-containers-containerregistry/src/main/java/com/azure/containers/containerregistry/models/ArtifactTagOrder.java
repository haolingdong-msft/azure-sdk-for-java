// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ArtifactTagOrder. */
public final class ArtifactTagOrder extends ExpandableStringEnum<ArtifactTagOrder> {
    /** Static value none for ArtifactTagOrder. */
    public static final ArtifactTagOrder NONE = fromString("none");

    /** Static value timedesc for ArtifactTagOrder. */
    public static final ArtifactTagOrder LAST_UPDATED_ON_DESCENDING = fromString("timedesc");

    /** Static value timeasc for ArtifactTagOrder. */
    public static final ArtifactTagOrder LAST_UPDATED_ON_ASCENDING = fromString("timeasc");

    /**
     * Creates or finds a ArtifactTagOrder from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ArtifactTagOrder.
     */
    @JsonCreator
    public static ArtifactTagOrder fromString(String name) {
        return fromString(name, ArtifactTagOrder.class);
    }

    /** @return known ArtifactTagOrder values. */
    public static Collection<ArtifactTagOrder> values() {
        return values(ArtifactTagOrder.class);
    }
}
