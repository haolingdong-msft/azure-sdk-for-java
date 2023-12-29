// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Test result based on pass/fail criteria.
 */
public final class PFTestResult extends ExpandableStringEnum<PFTestResult> {
    /**
     * Pass/fail criteria has passed.
     */
    @Generated
    public static final PFTestResult PASSED = fromString("PASSED");

    /**
     * Pass/fail criteria is not applicable.
     */
    @Generated
    public static final PFTestResult NOT_APPLICABLE = fromString("NOT_APPLICABLE");

    /**
     * Pass/fail criteria has failed.
     */
    @Generated
    public static final PFTestResult FAILED = fromString("FAILED");

    /**
     * Creates a new instance of PFTestResult value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public PFTestResult() {
    }

    /**
     * Creates or finds a PFTestResult from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PFTestResult.
     */
    @Generated
    public static PFTestResult fromString(String name) {
        return fromString(name, PFTestResult.class);
    }

    /**
     * Gets known PFTestResult values.
     * 
     * @return known PFTestResult values.
     */
    @Generated
    public static Collection<PFTestResult> values() {
        return values(PFTestResult.class);
    }
}
