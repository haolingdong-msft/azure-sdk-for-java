// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Types of secrets supported.
 */
public final class SecretType extends ExpandableStringEnum<SecretType> {

    /**
     * If the secret is stored in an Azure Key Vault.
     */
    @Generated
    public static final SecretType AKV_SECRET_URI = fromString("AKV_SECRET_URI");

    /**
     * If the secret value provided as plain text.
     */
    @Generated
    public static final SecretType SECRET_VALUE = fromString("SECRET_VALUE");

    /**
     * Creates a new instance of SecretType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public SecretType() {
    }

    /**
     * Creates or finds a SecretType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecretType.
     */
    @Generated
    public static SecretType fromString(String name) {
        return fromString(name, SecretType.class);
    }

    /**
     * Gets known SecretType values.
     *
     * @return known SecretType values.
     */
    @Generated
    public static Collection<SecretType> values() {
        return values(SecretType.class);
    }
}
