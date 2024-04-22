// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.messaging.eventgrid.namespaces;

import com.azure.core.util.ServiceVersion;

/**
 * Service version of EventGridClient.
 */
public enum EventGridServiceVersion implements ServiceVersion {

    /**
     * Enum value 2023-11-01.
     */
    V2023_11_01("2023-11-01"),
    /**
     * Enum value 2023-06-01-preview.
     */
    V2023_06_01_PREVIEW("2023-06-01-preview"),
    /**
     * Enum value 2023-10-01-preview.
     */
    V2023_10_01_PREVIEW("2023-10-01-preview");

    private final String version;

    EventGridServiceVersion(String version) {
        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link EventGridServiceVersion}.
     */
    public static EventGridServiceVersion getLatest() {
        return V2023_10_01_PREVIEW;
    }
}
