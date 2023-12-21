// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Azure File Storage write settings.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureFileStorageWriteSettings")
@Fluent
public final class AzureFileStorageWriteSettings extends StoreWriteSettings {
    /**
     * Creates an instance of AzureFileStorageWriteSettings class.
     */
    public AzureFileStorageWriteSettings() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFileStorageWriteSettings setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureFileStorageWriteSettings setCopyBehavior(Object copyBehavior) {
        super.setCopyBehavior(copyBehavior);
        return this;
    }
}
