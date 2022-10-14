// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.ContainerAppsRevisionsClient;
import com.azure.resourcemanager.appcontainers.fluent.models.RevisionInner;
import com.azure.resourcemanager.appcontainers.models.ContainerAppsRevisions;
import com.azure.resourcemanager.appcontainers.models.Revision;

public final class ContainerAppsRevisionsImpl implements ContainerAppsRevisions {
    private static final ClientLogger LOGGER = new ClientLogger(ContainerAppsRevisionsImpl.class);

    private final ContainerAppsRevisionsClient innerClient;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public ContainerAppsRevisionsImpl(
        ContainerAppsRevisionsClient innerClient,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Revision> listRevisions(String resourceGroupName, String containerAppName) {
        PagedIterable<RevisionInner> inner = this.serviceClient().listRevisions(resourceGroupName, containerAppName);
        return Utils.mapPage(inner, inner1 -> new RevisionImpl(inner1, this.manager()));
    }

    public PagedIterable<Revision> listRevisions(
        String resourceGroupName, String containerAppName, String filter, Context context) {
        PagedIterable<RevisionInner> inner =
            this.serviceClient().listRevisions(resourceGroupName, containerAppName, filter, context);
        return Utils.mapPage(inner, inner1 -> new RevisionImpl(inner1, this.manager()));
    }

    public Response<Revision> getRevisionWithResponse(
        String resourceGroupName, String containerAppName, String revisionName, Context context) {
        Response<RevisionInner> inner =
            this.serviceClient().getRevisionWithResponse(resourceGroupName, containerAppName, revisionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RevisionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Revision getRevision(String resourceGroupName, String containerAppName, String revisionName) {
        RevisionInner inner = this.serviceClient().getRevision(resourceGroupName, containerAppName, revisionName);
        if (inner != null) {
            return new RevisionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> activateRevisionWithResponse(
        String resourceGroupName, String containerAppName, String revisionName, Context context) {
        return this
            .serviceClient()
            .activateRevisionWithResponse(resourceGroupName, containerAppName, revisionName, context);
    }

    public void activateRevision(String resourceGroupName, String containerAppName, String revisionName) {
        this.serviceClient().activateRevision(resourceGroupName, containerAppName, revisionName);
    }

    public Response<Void> deactivateRevisionWithResponse(
        String resourceGroupName, String containerAppName, String revisionName, Context context) {
        return this
            .serviceClient()
            .deactivateRevisionWithResponse(resourceGroupName, containerAppName, revisionName, context);
    }

    public void deactivateRevision(String resourceGroupName, String containerAppName, String revisionName) {
        this.serviceClient().deactivateRevision(resourceGroupName, containerAppName, revisionName);
    }

    public Response<Void> restartRevisionWithResponse(
        String resourceGroupName, String containerAppName, String revisionName, Context context) {
        return this
            .serviceClient()
            .restartRevisionWithResponse(resourceGroupName, containerAppName, revisionName, context);
    }

    public void restartRevision(String resourceGroupName, String containerAppName, String revisionName) {
        this.serviceClient().restartRevision(resourceGroupName, containerAppName, revisionName);
    }

    private ContainerAppsRevisionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }
}
