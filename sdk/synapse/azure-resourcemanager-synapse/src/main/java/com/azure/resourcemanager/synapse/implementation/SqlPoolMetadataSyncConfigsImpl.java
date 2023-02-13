// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.synapse.fluent.SqlPoolMetadataSyncConfigsClient;
import com.azure.resourcemanager.synapse.fluent.models.MetadataSyncConfigInner;
import com.azure.resourcemanager.synapse.models.MetadataSyncConfig;
import com.azure.resourcemanager.synapse.models.SqlPoolMetadataSyncConfigs;

public final class SqlPoolMetadataSyncConfigsImpl implements SqlPoolMetadataSyncConfigs {
    private static final ClientLogger LOGGER = new ClientLogger(SqlPoolMetadataSyncConfigsImpl.class);

    private final SqlPoolMetadataSyncConfigsClient innerClient;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public SqlPoolMetadataSyncConfigsImpl(
        SqlPoolMetadataSyncConfigsClient innerClient, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<MetadataSyncConfig> getWithResponse(
        String resourceGroupName, String workspaceName, String sqlPoolName, Context context) {
        Response<MetadataSyncConfigInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, sqlPoolName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MetadataSyncConfigImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MetadataSyncConfig get(String resourceGroupName, String workspaceName, String sqlPoolName) {
        MetadataSyncConfigInner inner = this.serviceClient().get(resourceGroupName, workspaceName, sqlPoolName);
        if (inner != null) {
            return new MetadataSyncConfigImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MetadataSyncConfig> createWithResponse(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        MetadataSyncConfigInner metadataSyncConfiguration,
        Context context) {
        Response<MetadataSyncConfigInner> inner =
            this
                .serviceClient()
                .createWithResponse(resourceGroupName, workspaceName, sqlPoolName, metadataSyncConfiguration, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MetadataSyncConfigImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public MetadataSyncConfig create(
        String resourceGroupName,
        String workspaceName,
        String sqlPoolName,
        MetadataSyncConfigInner metadataSyncConfiguration) {
        MetadataSyncConfigInner inner =
            this.serviceClient().create(resourceGroupName, workspaceName, sqlPoolName, metadataSyncConfiguration);
        if (inner != null) {
            return new MetadataSyncConfigImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private SqlPoolMetadataSyncConfigsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}
