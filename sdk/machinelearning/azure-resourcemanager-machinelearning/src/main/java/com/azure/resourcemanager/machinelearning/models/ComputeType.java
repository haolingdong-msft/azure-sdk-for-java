// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of compute. */
public final class ComputeType extends ExpandableStringEnum<ComputeType> {
    /** Static value AKS for ComputeType. */
    public static final ComputeType AKS = fromString("AKS");

    /** Static value Kubernetes for ComputeType. */
    public static final ComputeType KUBERNETES = fromString("Kubernetes");

    /** Static value AmlCompute for ComputeType. */
    public static final ComputeType AML_COMPUTE = fromString("AmlCompute");

    /** Static value ComputeInstance for ComputeType. */
    public static final ComputeType COMPUTE_INSTANCE = fromString("ComputeInstance");

    /** Static value DataFactory for ComputeType. */
    public static final ComputeType DATA_FACTORY = fromString("DataFactory");

    /** Static value VirtualMachine for ComputeType. */
    public static final ComputeType VIRTUAL_MACHINE = fromString("VirtualMachine");

    /** Static value HDInsight for ComputeType. */
    public static final ComputeType HDINSIGHT = fromString("HDInsight");

    /** Static value Databricks for ComputeType. */
    public static final ComputeType DATABRICKS = fromString("Databricks");

    /** Static value DataLakeAnalytics for ComputeType. */
    public static final ComputeType DATA_LAKE_ANALYTICS = fromString("DataLakeAnalytics");

    /** Static value SynapseSpark for ComputeType. */
    public static final ComputeType SYNAPSE_SPARK = fromString("SynapseSpark");

    /**
     * Creates or finds a ComputeType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ComputeType.
     */
    @JsonCreator
    public static ComputeType fromString(String name) {
        return fromString(name, ComputeType.class);
    }

    /**
     * Gets known ComputeType values.
     *
     * @return known ComputeType values.
     */
    public static Collection<ComputeType> values() {
        return values(ComputeType.class);
    }
}
