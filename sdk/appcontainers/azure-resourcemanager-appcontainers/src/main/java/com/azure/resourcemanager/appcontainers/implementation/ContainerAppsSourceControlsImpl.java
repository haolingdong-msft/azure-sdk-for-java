// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.ContainerAppsSourceControlsClient;
import com.azure.resourcemanager.appcontainers.fluent.models.SourceControlInner;
import com.azure.resourcemanager.appcontainers.models.ContainerAppsSourceControls;
import com.azure.resourcemanager.appcontainers.models.SourceControl;

public final class ContainerAppsSourceControlsImpl implements ContainerAppsSourceControls {
    private static final ClientLogger LOGGER = new ClientLogger(ContainerAppsSourceControlsImpl.class);

    private final ContainerAppsSourceControlsClient innerClient;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public ContainerAppsSourceControlsImpl(
        ContainerAppsSourceControlsClient innerClient,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SourceControl> listByContainerApp(String resourceGroupName, String containerAppName) {
        PagedIterable<SourceControlInner> inner =
            this.serviceClient().listByContainerApp(resourceGroupName, containerAppName);
        return Utils.mapPage(inner, inner1 -> new SourceControlImpl(inner1, this.manager()));
    }

    public PagedIterable<SourceControl> listByContainerApp(
        String resourceGroupName, String containerAppName, Context context) {
        PagedIterable<SourceControlInner> inner =
            this.serviceClient().listByContainerApp(resourceGroupName, containerAppName, context);
        return Utils.mapPage(inner, inner1 -> new SourceControlImpl(inner1, this.manager()));
    }

    public Response<SourceControl> getWithResponse(
        String resourceGroupName, String containerAppName, String sourceControlName, Context context) {
        Response<SourceControlInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, containerAppName, sourceControlName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SourceControlImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SourceControl get(String resourceGroupName, String containerAppName, String sourceControlName) {
        SourceControlInner inner = this.serviceClient().get(resourceGroupName, containerAppName, sourceControlName);
        if (inner != null) {
            return new SourceControlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String containerAppName, String sourceControlName) {
        this.serviceClient().delete(resourceGroupName, containerAppName, sourceControlName);
    }

    public void delete(String resourceGroupName, String containerAppName, String sourceControlName, Context context) {
        this.serviceClient().delete(resourceGroupName, containerAppName, sourceControlName, context);
    }

    public SourceControl getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String containerAppName = Utils.getValueFromIdByName(id, "containerApps");
        if (containerAppName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'containerApps'.", id)));
        }
        String sourceControlName = Utils.getValueFromIdByName(id, "sourcecontrols");
        if (sourceControlName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'sourcecontrols'.", id)));
        }
        return this.getWithResponse(resourceGroupName, containerAppName, sourceControlName, Context.NONE).getValue();
    }

    public Response<SourceControl> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String containerAppName = Utils.getValueFromIdByName(id, "containerApps");
        if (containerAppName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'containerApps'.", id)));
        }
        String sourceControlName = Utils.getValueFromIdByName(id, "sourcecontrols");
        if (sourceControlName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'sourcecontrols'.", id)));
        }
        return this.getWithResponse(resourceGroupName, containerAppName, sourceControlName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String containerAppName = Utils.getValueFromIdByName(id, "containerApps");
        if (containerAppName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'containerApps'.", id)));
        }
        String sourceControlName = Utils.getValueFromIdByName(id, "sourcecontrols");
        if (sourceControlName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'sourcecontrols'.", id)));
        }
        this.delete(resourceGroupName, containerAppName, sourceControlName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String containerAppName = Utils.getValueFromIdByName(id, "containerApps");
        if (containerAppName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'containerApps'.", id)));
        }
        String sourceControlName = Utils.getValueFromIdByName(id, "sourcecontrols");
        if (sourceControlName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'sourcecontrols'.", id)));
        }
        this.delete(resourceGroupName, containerAppName, sourceControlName, context);
    }

    private ContainerAppsSourceControlsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    public SourceControlImpl define(String name) {
        return new SourceControlImpl(name, this.manager());
    }
}
