// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Load Balancer Type. */
public final class LoadBalancerType extends ExpandableStringEnum<LoadBalancerType> {
    /** Static value PublicIp for LoadBalancerType. */
    public static final LoadBalancerType PUBLIC_IP = fromString("PublicIp");

    /** Static value InternalLoadBalancer for LoadBalancerType. */
    public static final LoadBalancerType INTERNAL_LOAD_BALANCER = fromString("InternalLoadBalancer");

    /**
     * Creates or finds a LoadBalancerType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LoadBalancerType.
     */
    @JsonCreator
    public static LoadBalancerType fromString(String name) {
        return fromString(name, LoadBalancerType.class);
    }

    /**
     * Gets known LoadBalancerType values.
     *
     * @return known LoadBalancerType values.
     */
    public static Collection<LoadBalancerType> values() {
        return values(LoadBalancerType.class);
    }
}
