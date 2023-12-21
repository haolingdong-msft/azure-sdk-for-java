// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * All available compressionCodec values.
 */
public final class CompressionCodec extends ExpandableStringEnum<CompressionCodec> {
    /**
     * Static value none for CompressionCodec.
     */
    public static final CompressionCodec NONE = fromString("none");

    /**
     * Static value lzo for CompressionCodec.
     */
    public static final CompressionCodec LZO = fromString("lzo");

    /**
     * Static value bzip2 for CompressionCodec.
     */
    public static final CompressionCodec BZIP2 = fromString("bzip2");

    /**
     * Static value gzip for CompressionCodec.
     */
    public static final CompressionCodec GZIP = fromString("gzip");

    /**
     * Static value deflate for CompressionCodec.
     */
    public static final CompressionCodec DEFLATE = fromString("deflate");

    /**
     * Static value zipDeflate for CompressionCodec.
     */
    public static final CompressionCodec ZIP_DEFLATE = fromString("zipDeflate");

    /**
     * Static value snappy for CompressionCodec.
     */
    public static final CompressionCodec SNAPPY = fromString("snappy");

    /**
     * Static value lz4 for CompressionCodec.
     */
    public static final CompressionCodec LZ4 = fromString("lz4");

    /**
     * Static value tar for CompressionCodec.
     */
    public static final CompressionCodec TAR = fromString("tar");

    /**
     * Static value tarGZip for CompressionCodec.
     */
    public static final CompressionCodec TAR_GZIP = fromString("tarGZip");

    /**
     * Creates a new instance of CompressionCodec value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CompressionCodec() {
    }

    /**
     * Creates or finds a CompressionCodec from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CompressionCodec.
     */
    @JsonCreator
    public static CompressionCodec fromString(String name) {
        return fromString(name, CompressionCodec.class);
    }

    /**
     * Gets known CompressionCodec values.
     * 
     * @return known CompressionCodec values.
     */
    public static Collection<CompressionCodec> values() {
        return values(CompressionCodec.class);
    }
}
