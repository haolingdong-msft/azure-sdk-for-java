// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Aggregation functions for pass/fail criteria.
 */
public final class PFAgFunc extends ExpandableStringEnum<PFAgFunc> {
    /**
     * Criteria applies for count value.
     */
    @Generated
    public static final PFAgFunc COUNT = fromString("count");

    /**
     * Criteria applies for given percentage value.
     */
    @Generated
    public static final PFAgFunc PERCENTAGE = fromString("percentage");

    /**
     * Criteria applies for avg value.
     */
    @Generated
    public static final PFAgFunc AVG = fromString("avg");

    /**
     * Criteria applies for 50th percentile value.
     */
    @Generated
    public static final PFAgFunc P50 = fromString("p50");

    /**
     * Criteria applies for 90th percentile value.
     */
    @Generated
    public static final PFAgFunc P90 = fromString("p90");

    /**
     * Criteria applies for 95th percentile value.
     */
    @Generated
    public static final PFAgFunc P95 = fromString("p95");

    /**
     * Criteria applies for 99th percentile value.
     */
    @Generated
    public static final PFAgFunc P99 = fromString("p99");

    /**
     * Criteria applies for minimum value.
     */
    @Generated
    public static final PFAgFunc MIN = fromString("min");

    /**
     * Criteria applies for maximum value.
     */
    @Generated
    public static final PFAgFunc MAX = fromString("max");

    /**
     * Creates a new instance of PFAgFunc value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public PFAgFunc() {
    }

    /**
     * Creates or finds a PFAgFunc from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PFAgFunc.
     */
    @Generated
    public static PFAgFunc fromString(String name) {
        return fromString(name, PFAgFunc.class);
    }

    /**
     * Gets known PFAgFunc values.
     * 
     * @return known PFAgFunc values.
     */
    @Generated
    public static Collection<PFAgFunc> values() {
        return values(PFAgFunc.class);
    }
}
