// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Available expression languages that can be configured.
 */
public final class ExpressionRouterRuleLanguage extends ExpandableStringEnum<ExpressionRouterRuleLanguage> {

    /**
     * PowerFx.
     */
    @Generated
    public static final ExpressionRouterRuleLanguage POWER_FX = fromString("powerFx");

    /**
     * Creates a new instance of ExpressionRouterRuleLanguage value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ExpressionRouterRuleLanguage() {
    }

    /**
     * Creates or finds a ExpressionRouterRuleLanguage from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExpressionRouterRuleLanguage.
     */
    @Generated
    @JsonCreator
    public static ExpressionRouterRuleLanguage fromString(String name) {
        return fromString(name, ExpressionRouterRuleLanguage.class);
    }

    /**
     * Gets known ExpressionRouterRuleLanguage values.
     *
     * @return known ExpressionRouterRuleLanguage values.
     */
    @Generated
    public static Collection<ExpressionRouterRuleLanguage> values() {
        return values(ExpressionRouterRuleLanguage.class);
    }
}
