// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.standbypool.fluent.StandbyContainerGroupPoolsClient;
import com.azure.resourcemanager.standbypool.fluent.models.StandbyContainerGroupPoolResourceInner;
import com.azure.resourcemanager.standbypool.models.StandbyContainerGroupPoolResource;
import com.azure.resourcemanager.standbypool.models.StandbyContainerGroupPools;

public final class StandbyContainerGroupPoolsImpl implements StandbyContainerGroupPools {
    private static final ClientLogger LOGGER = new ClientLogger(StandbyContainerGroupPoolsImpl.class);

    private final StandbyContainerGroupPoolsClient innerClient;

    private final com.azure.resourcemanager.standbypool.StandbyPoolManager serviceManager;

    public StandbyContainerGroupPoolsImpl(StandbyContainerGroupPoolsClient innerClient,
        com.azure.resourcemanager.standbypool.StandbyPoolManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<StandbyContainerGroupPoolResource> getByResourceGroupWithResponse(String resourceGroupName,
        String standbyContainerGroupPoolName, Context context) {
        Response<StandbyContainerGroupPoolResourceInner> inner = this.serviceClient()
            .getByResourceGroupWithResponse(resourceGroupName, standbyContainerGroupPoolName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new StandbyContainerGroupPoolResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public StandbyContainerGroupPoolResource getByResourceGroup(String resourceGroupName,
        String standbyContainerGroupPoolName) {
        StandbyContainerGroupPoolResourceInner inner
            = this.serviceClient().getByResourceGroup(resourceGroupName, standbyContainerGroupPoolName);
        if (inner != null) {
            return new StandbyContainerGroupPoolResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String standbyContainerGroupPoolName) {
        this.serviceClient().delete(resourceGroupName, standbyContainerGroupPoolName);
    }

    public void delete(String resourceGroupName, String standbyContainerGroupPoolName, Context context) {
        this.serviceClient().delete(resourceGroupName, standbyContainerGroupPoolName, context);
    }

    public PagedIterable<StandbyContainerGroupPoolResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<StandbyContainerGroupPoolResourceInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new StandbyContainerGroupPoolResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<StandbyContainerGroupPoolResource> listByResourceGroup(String resourceGroupName,
        Context context) {
        PagedIterable<StandbyContainerGroupPoolResourceInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new StandbyContainerGroupPoolResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<StandbyContainerGroupPoolResource> list() {
        PagedIterable<StandbyContainerGroupPoolResourceInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new StandbyContainerGroupPoolResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<StandbyContainerGroupPoolResource> list(Context context) {
        PagedIterable<StandbyContainerGroupPoolResourceInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new StandbyContainerGroupPoolResourceImpl(inner1, this.manager()));
    }

    public StandbyContainerGroupPoolResource getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String standbyContainerGroupPoolName
            = ResourceManagerUtils.getValueFromIdByName(id, "standbyContainerGroupPools");
        if (standbyContainerGroupPoolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'standbyContainerGroupPools'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, standbyContainerGroupPoolName, Context.NONE)
            .getValue();
    }

    public Response<StandbyContainerGroupPoolResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String standbyContainerGroupPoolName
            = ResourceManagerUtils.getValueFromIdByName(id, "standbyContainerGroupPools");
        if (standbyContainerGroupPoolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'standbyContainerGroupPools'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, standbyContainerGroupPoolName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String standbyContainerGroupPoolName
            = ResourceManagerUtils.getValueFromIdByName(id, "standbyContainerGroupPools");
        if (standbyContainerGroupPoolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'standbyContainerGroupPools'.", id)));
        }
        this.delete(resourceGroupName, standbyContainerGroupPoolName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String standbyContainerGroupPoolName
            = ResourceManagerUtils.getValueFromIdByName(id, "standbyContainerGroupPools");
        if (standbyContainerGroupPoolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String
                .format("The resource ID '%s' is not valid. Missing path segment 'standbyContainerGroupPools'.", id)));
        }
        this.delete(resourceGroupName, standbyContainerGroupPoolName, context);
    }

    private StandbyContainerGroupPoolsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.standbypool.StandbyPoolManager manager() {
        return this.serviceManager;
    }

    public StandbyContainerGroupPoolResourceImpl define(String name) {
        return new StandbyContainerGroupPoolResourceImpl(name, this.manager());
    }
}
