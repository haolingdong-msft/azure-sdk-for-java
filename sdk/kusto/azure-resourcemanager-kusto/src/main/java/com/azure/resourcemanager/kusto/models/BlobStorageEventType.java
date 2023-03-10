// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The name of blob storage event type to process. */
public final class BlobStorageEventType extends ExpandableStringEnum<BlobStorageEventType> {
    /** Static value Microsoft.Storage.BlobCreated for BlobStorageEventType. */
    public static final BlobStorageEventType MICROSOFT_STORAGE_BLOB_CREATED =
        fromString("Microsoft.Storage.BlobCreated");

    /** Static value Microsoft.Storage.BlobRenamed for BlobStorageEventType. */
    public static final BlobStorageEventType MICROSOFT_STORAGE_BLOB_RENAMED =
        fromString("Microsoft.Storage.BlobRenamed");

    /**
     * Creates a new instance of BlobStorageEventType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BlobStorageEventType() {
    }

    /**
     * Creates or finds a BlobStorageEventType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BlobStorageEventType.
     */
    @JsonCreator
    public static BlobStorageEventType fromString(String name) {
        return fromString(name, BlobStorageEventType.class);
    }

    /**
     * Gets known BlobStorageEventType values.
     *
     * @return known BlobStorageEventType values.
     */
    public static Collection<BlobStorageEventType> values() {
        return values(BlobStorageEventType.class);
    }
}
