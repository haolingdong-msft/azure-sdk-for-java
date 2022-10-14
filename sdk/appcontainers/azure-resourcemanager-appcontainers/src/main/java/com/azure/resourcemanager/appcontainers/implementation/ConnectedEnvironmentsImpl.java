// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.ConnectedEnvironmentsClient;
import com.azure.resourcemanager.appcontainers.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.appcontainers.fluent.models.ConnectedEnvironmentInner;
import com.azure.resourcemanager.appcontainers.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.appcontainers.models.CheckNameAvailabilityResponse;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironment;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironments;

public final class ConnectedEnvironmentsImpl implements ConnectedEnvironments {
    private static final ClientLogger LOGGER = new ClientLogger(ConnectedEnvironmentsImpl.class);

    private final ConnectedEnvironmentsClient innerClient;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public ConnectedEnvironmentsImpl(
        ConnectedEnvironmentsClient innerClient,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ConnectedEnvironment> list() {
        PagedIterable<ConnectedEnvironmentInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ConnectedEnvironmentImpl(inner1, this.manager()));
    }

    public PagedIterable<ConnectedEnvironment> list(Context context) {
        PagedIterable<ConnectedEnvironmentInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ConnectedEnvironmentImpl(inner1, this.manager()));
    }

    public PagedIterable<ConnectedEnvironment> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ConnectedEnvironmentInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ConnectedEnvironmentImpl(inner1, this.manager()));
    }

    public PagedIterable<ConnectedEnvironment> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ConnectedEnvironmentInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ConnectedEnvironmentImpl(inner1, this.manager()));
    }

    public Response<ConnectedEnvironment> getByResourceGroupWithResponse(
        String resourceGroupName, String connectedEnvironmentName, Context context) {
        Response<ConnectedEnvironmentInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, connectedEnvironmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConnectedEnvironmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConnectedEnvironment getByResourceGroup(String resourceGroupName, String connectedEnvironmentName) {
        ConnectedEnvironmentInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, connectedEnvironmentName);
        if (inner != null) {
            return new ConnectedEnvironmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String connectedEnvironmentName) {
        this.serviceClient().delete(resourceGroupName, connectedEnvironmentName);
    }

    public void delete(String resourceGroupName, String connectedEnvironmentName, Context context) {
        this.serviceClient().delete(resourceGroupName, connectedEnvironmentName, context);
    }

    public Response<ConnectedEnvironment> updateWithResponse(
        String resourceGroupName, String connectedEnvironmentName, Context context) {
        Response<ConnectedEnvironmentInner> inner =
            this.serviceClient().updateWithResponse(resourceGroupName, connectedEnvironmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConnectedEnvironmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConnectedEnvironment update(String resourceGroupName, String connectedEnvironmentName) {
        ConnectedEnvironmentInner inner = this.serviceClient().update(resourceGroupName, connectedEnvironmentName);
        if (inner != null) {
            return new ConnectedEnvironmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckNameAvailabilityResponse> checkNameAvailabilityWithResponse(
        String resourceGroupName,
        String connectedEnvironmentName,
        CheckNameAvailabilityRequest checkNameAvailabilityRequest,
        Context context) {
        Response<CheckNameAvailabilityResponseInner> inner =
            this
                .serviceClient()
                .checkNameAvailabilityWithResponse(
                    resourceGroupName, connectedEnvironmentName, checkNameAvailabilityRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckNameAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckNameAvailabilityResponse checkNameAvailability(
        String resourceGroupName,
        String connectedEnvironmentName,
        CheckNameAvailabilityRequest checkNameAvailabilityRequest) {
        CheckNameAvailabilityResponseInner inner =
            this
                .serviceClient()
                .checkNameAvailability(resourceGroupName, connectedEnvironmentName, checkNameAvailabilityRequest);
        if (inner != null) {
            return new CheckNameAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ConnectedEnvironment getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String connectedEnvironmentName = Utils.getValueFromIdByName(id, "connectedEnvironments");
        if (connectedEnvironmentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'connectedEnvironments'.",
                                id)));
        }
        return this
            .getByResourceGroupWithResponse(resourceGroupName, connectedEnvironmentName, Context.NONE)
            .getValue();
    }

    public Response<ConnectedEnvironment> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String connectedEnvironmentName = Utils.getValueFromIdByName(id, "connectedEnvironments");
        if (connectedEnvironmentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'connectedEnvironments'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, connectedEnvironmentName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String connectedEnvironmentName = Utils.getValueFromIdByName(id, "connectedEnvironments");
        if (connectedEnvironmentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'connectedEnvironments'.",
                                id)));
        }
        this.delete(resourceGroupName, connectedEnvironmentName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourcegroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourcegroups'.", id)));
        }
        String connectedEnvironmentName = Utils.getValueFromIdByName(id, "connectedEnvironments");
        if (connectedEnvironmentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'connectedEnvironments'.",
                                id)));
        }
        this.delete(resourceGroupName, connectedEnvironmentName, context);
    }

    private ConnectedEnvironmentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    public ConnectedEnvironmentImpl define(String name) {
        return new ConnectedEnvironmentImpl(name, this.manager());
    }
}
