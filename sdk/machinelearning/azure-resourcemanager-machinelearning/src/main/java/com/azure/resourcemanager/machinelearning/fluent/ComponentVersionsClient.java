// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.ComponentVersionInner;
import com.azure.resourcemanager.machinelearning.models.ListViewType;

/** An instance of this class provides access to all the operations defined in ComponentVersionsClient. */
public interface ComponentVersionsClient {
    /**
     * List component versions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Component name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of ComponentVersion entities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ComponentVersionInner> list(String resourceGroupName, String workspaceName, String name);

    /**
     * List component versions.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Component name.
     * @param orderBy Ordering of list.
     * @param top Maximum number of records to return.
     * @param skip Continuation token for pagination.
     * @param listViewType View type for including/excluding (for example) archived entities.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of ComponentVersion entities as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ComponentVersionInner> list(
        String resourceGroupName,
        String workspaceName,
        String name,
        String orderBy,
        Integer top,
        String skip,
        ListViewType listViewType,
        Context context);

    /**
     * Delete version.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name.
     * @param version Version identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String workspaceName, String name, String version, Context context);

    /**
     * Delete version.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name.
     * @param version Version identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String workspaceName, String name, String version);

    /**
     * Get version.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name.
     * @param version Version identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return version along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ComponentVersionInner> getWithResponse(
        String resourceGroupName, String workspaceName, String name, String version, Context context);

    /**
     * Get version.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name.
     * @param version Version identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return version.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ComponentVersionInner get(String resourceGroupName, String workspaceName, String name, String version);

    /**
     * Create or update version.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name.
     * @param version Version identifier.
     * @param body Version entity to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Resource Manager resource envelope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ComponentVersionInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String workspaceName,
        String name,
        String version,
        ComponentVersionInner body,
        Context context);

    /**
     * Create or update version.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param name Container name.
     * @param version Version identifier.
     * @param body Version entity to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Resource Manager resource envelope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ComponentVersionInner createOrUpdate(
        String resourceGroupName, String workspaceName, String name, String version, ComponentVersionInner body);
}
