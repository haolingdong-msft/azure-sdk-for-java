// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector;

import com.azure.core.util.ServiceVersion;

/** Service version of AnomalyDetectorClient. */
public enum AnomalyDetectorServiceVersion implements ServiceVersion {
    /** Enum value v1.1. */
    V1_1("v1.1");

    private final String version;

    AnomalyDetectorServiceVersion(String version) {
        this.version = version;
    }

    /** {@inheritDoc} */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link AnomalyDetectorServiceVersion}.
     */
    public static AnomalyDetectorServiceVersion getLatest() {
        return V1_1;
    }
}
