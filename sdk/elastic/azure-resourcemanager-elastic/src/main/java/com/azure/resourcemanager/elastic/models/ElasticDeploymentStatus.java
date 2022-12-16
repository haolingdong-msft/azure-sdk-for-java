// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Flag specifying if the Elastic deployment status is healthy or not. */
public final class ElasticDeploymentStatus extends ExpandableStringEnum<ElasticDeploymentStatus> {
    /** Static value Healthy for ElasticDeploymentStatus. */
    public static final ElasticDeploymentStatus HEALTHY = fromString("Healthy");

    /** Static value Unhealthy for ElasticDeploymentStatus. */
    public static final ElasticDeploymentStatus UNHEALTHY = fromString("Unhealthy");

    /**
     * Creates or finds a ElasticDeploymentStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ElasticDeploymentStatus.
     */
    @JsonCreator
    public static ElasticDeploymentStatus fromString(String name) {
        return fromString(name, ElasticDeploymentStatus.class);
    }

    /**
     * Gets known ElasticDeploymentStatus values.
     *
     * @return known ElasticDeploymentStatus values.
     */
    public static Collection<ElasticDeploymentStatus> values() {
        return values(ElasticDeploymentStatus.class);
    }
}
