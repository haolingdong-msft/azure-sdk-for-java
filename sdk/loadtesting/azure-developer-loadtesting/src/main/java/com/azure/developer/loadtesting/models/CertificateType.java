// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CertificateType. */
public final class CertificateType extends ExpandableStringEnum<CertificateType> {
    /** If the certificate is stored in an Azure Key Vault. */
    @Generated public static final CertificateType AKV_CERT_URI = fromString("AKV_CERT_URI");

    /**
     * Creates a new instance of CertificateType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public CertificateType() {}

    /**
     * Creates or finds a CertificateType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CertificateType.
     */
    @Generated
    @JsonCreator
    public static CertificateType fromString(String name) {
        return fromString(name, CertificateType.class);
    }

    /**
     * Gets known CertificateType values.
     *
     * @return known CertificateType values.
     */
    @Generated
    public static Collection<CertificateType> values() {
        return values(CertificateType.class);
    }
}
