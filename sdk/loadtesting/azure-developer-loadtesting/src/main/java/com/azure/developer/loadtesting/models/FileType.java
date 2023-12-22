// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Types of file supported.
 */
public final class FileType extends ExpandableStringEnum<FileType> {

    /**
     * If the file is a JMX script.
     */
    @Generated
    public static final FileType JMX_FILE = fromString("JMX_FILE");

    /**
     * If the file is a user properties file.
     */
    @Generated
    public static final FileType USER_PROPERTIES = fromString("USER_PROPERTIES");

    /**
     * If the file is not among any of the other supported file types.
     */
    @Generated
    public static final FileType ADDITIONAL_ARTIFACTS = fromString("ADDITIONAL_ARTIFACTS");

    /**
     * If the file is a compressed archive containing a collection of various artifacts or resources.
     */
    @Generated
    public static final FileType ZIPPED_ARTIFACTS = fromString("ZIPPED_ARTIFACTS");

    /**
     * Creates a new instance of FileType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public FileType() {
    }

    /**
     * Creates or finds a FileType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FileType.
     */
    @Generated
    public static FileType fromString(String name) {
        return fromString(name, FileType.class);
    }

    /**
     * Gets known FileType values.
     *
     * @return known FileType values.
     */
    @Generated
    public static Collection<FileType> values() {
        return values(FileType.class);
    }

    /**
     * If the file is a JSON config file to define the requests for a URL test.
     */
    @Generated
    public static final FileType URL_TEST_CONFIG_JSON = fromString("URL_TEST_CONFIG_JSON");
}
