// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.TasksClient;
import com.azure.resourcemanager.security.fluent.models.SecurityTaskInner;
import com.azure.resourcemanager.security.models.SecurityTask;
import com.azure.resourcemanager.security.models.TaskUpdateActionType;
import com.azure.resourcemanager.security.models.Tasks;

public final class TasksImpl implements Tasks {
    private static final ClientLogger LOGGER = new ClientLogger(TasksImpl.class);

    private final TasksClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public TasksImpl(TasksClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SecurityTask> list() {
        PagedIterable<SecurityTaskInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SecurityTaskImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityTask> list(String filter, Context context) {
        PagedIterable<SecurityTaskInner> inner = this.serviceClient().list(filter, context);
        return Utils.mapPage(inner, inner1 -> new SecurityTaskImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityTask> listByHomeRegion(String ascLocation) {
        PagedIterable<SecurityTaskInner> inner = this.serviceClient().listByHomeRegion(ascLocation);
        return Utils.mapPage(inner, inner1 -> new SecurityTaskImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityTask> listByHomeRegion(String ascLocation, String filter, Context context) {
        PagedIterable<SecurityTaskInner> inner = this.serviceClient().listByHomeRegion(ascLocation, filter, context);
        return Utils.mapPage(inner, inner1 -> new SecurityTaskImpl(inner1, this.manager()));
    }

    public Response<SecurityTask> getSubscriptionLevelTaskWithResponse(
        String ascLocation, String taskName, Context context) {
        Response<SecurityTaskInner> inner =
            this.serviceClient().getSubscriptionLevelTaskWithResponse(ascLocation, taskName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SecurityTaskImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SecurityTask getSubscriptionLevelTask(String ascLocation, String taskName) {
        SecurityTaskInner inner = this.serviceClient().getSubscriptionLevelTask(ascLocation, taskName);
        if (inner != null) {
            return new SecurityTaskImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> updateSubscriptionLevelTaskStateWithResponse(
        String ascLocation, String taskName, TaskUpdateActionType taskUpdateActionType, Context context) {
        return this
            .serviceClient()
            .updateSubscriptionLevelTaskStateWithResponse(ascLocation, taskName, taskUpdateActionType, context);
    }

    public void updateSubscriptionLevelTaskState(
        String ascLocation, String taskName, TaskUpdateActionType taskUpdateActionType) {
        this.serviceClient().updateSubscriptionLevelTaskState(ascLocation, taskName, taskUpdateActionType);
    }

    public PagedIterable<SecurityTask> listByResourceGroup(String resourceGroupName, String ascLocation) {
        PagedIterable<SecurityTaskInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, ascLocation);
        return Utils.mapPage(inner, inner1 -> new SecurityTaskImpl(inner1, this.manager()));
    }

    public PagedIterable<SecurityTask> listByResourceGroup(
        String resourceGroupName, String ascLocation, String filter, Context context) {
        PagedIterable<SecurityTaskInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, ascLocation, filter, context);
        return Utils.mapPage(inner, inner1 -> new SecurityTaskImpl(inner1, this.manager()));
    }

    public Response<SecurityTask> getResourceGroupLevelTaskWithResponse(
        String resourceGroupName, String ascLocation, String taskName, Context context) {
        Response<SecurityTaskInner> inner =
            this
                .serviceClient()
                .getResourceGroupLevelTaskWithResponse(resourceGroupName, ascLocation, taskName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SecurityTaskImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SecurityTask getResourceGroupLevelTask(String resourceGroupName, String ascLocation, String taskName) {
        SecurityTaskInner inner =
            this.serviceClient().getResourceGroupLevelTask(resourceGroupName, ascLocation, taskName);
        if (inner != null) {
            return new SecurityTaskImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> updateResourceGroupLevelTaskStateWithResponse(
        String resourceGroupName,
        String ascLocation,
        String taskName,
        TaskUpdateActionType taskUpdateActionType,
        Context context) {
        return this
            .serviceClient()
            .updateResourceGroupLevelTaskStateWithResponse(
                resourceGroupName, ascLocation, taskName, taskUpdateActionType, context);
    }

    public void updateResourceGroupLevelTaskState(
        String resourceGroupName, String ascLocation, String taskName, TaskUpdateActionType taskUpdateActionType) {
        this
            .serviceClient()
            .updateResourceGroupLevelTaskState(resourceGroupName, ascLocation, taskName, taskUpdateActionType);
    }

    private TasksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
