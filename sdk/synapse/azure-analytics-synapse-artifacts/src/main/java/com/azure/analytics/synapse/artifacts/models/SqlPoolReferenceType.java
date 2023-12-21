// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * SQL pool reference type.
 */
public final class SqlPoolReferenceType extends ExpandableStringEnum<SqlPoolReferenceType> {
    /**
     * Static value SqlPoolReference for SqlPoolReferenceType.
     */
    public static final SqlPoolReferenceType SQL_POOL_REFERENCE = fromString("SqlPoolReference");

    /**
     * Creates a new instance of SqlPoolReferenceType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SqlPoolReferenceType() {
    }

    /**
     * Creates or finds a SqlPoolReferenceType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding SqlPoolReferenceType.
     */
    @JsonCreator
    public static SqlPoolReferenceType fromString(String name) {
        return fromString(name, SqlPoolReferenceType.class);
    }

    /**
     * Gets known SqlPoolReferenceType values.
     * 
     * @return known SqlPoolReferenceType values.
     */
    public static Collection<SqlPoolReferenceType> values() {
        return values(SqlPoolReferenceType.class);
    }
}
