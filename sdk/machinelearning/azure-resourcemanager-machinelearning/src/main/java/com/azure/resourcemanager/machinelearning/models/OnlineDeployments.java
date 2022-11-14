// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of OnlineDeployments. */
public interface OnlineDeployments {
    /**
     * List Inference Endpoint Deployments.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of OnlineDeployment entities as paginated response with {@link PagedIterable}.
     */
    PagedIterable<OnlineDeployment> list(String resourceGroupName, String workspaceName, String endpointName);

    /**
     * List Inference Endpoint Deployments.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param orderBy Ordering of list.
     * @param top Top of list.
     * @param skip Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of OnlineDeployment entities as paginated response with {@link PagedIterable}.
     */
    PagedIterable<OnlineDeployment> list(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String orderBy,
        Integer top,
        String skip,
        Context context);

    /**
     * Delete Inference Endpoint Deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String workspaceName, String endpointName, String deploymentName);

    /**
     * Delete Inference Endpoint Deployment (asynchronous).
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName, Context context);

    /**
     * Get Inference Deployment Deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inference Deployment Deployment along with {@link Response}.
     */
    Response<OnlineDeployment> getWithResponse(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName, Context context);

    /**
     * Get Inference Deployment Deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inference Deployment Deployment.
     */
    OnlineDeployment get(String resourceGroupName, String workspaceName, String endpointName, String deploymentName);

    /**
     * Polls an Endpoint operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName The name and identifier for the endpoint.
     * @param body The request containing parameters for retrieving logs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    Response<DeploymentLogs> getLogsWithResponse(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        DeploymentLogsRequest body,
        Context context);

    /**
     * Polls an Endpoint operation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName The name and identifier for the endpoint.
     * @param body The request containing parameters for retrieving logs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    DeploymentLogs getLogs(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        DeploymentLogsRequest body);

    /**
     * List Inference Endpoint Deployment Skus.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of SkuResource entities as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SkuResource> listSkus(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName);

    /**
     * List Inference Endpoint Deployment Skus.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName Name of Azure Machine Learning workspace.
     * @param endpointName Inference endpoint name.
     * @param deploymentName Inference Endpoint Deployment name.
     * @param count Number of Skus to be retrieved in a page of results.
     * @param skip Continuation token for pagination.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a paginated list of SkuResource entities as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SkuResource> listSkus(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        Integer count,
        String skip,
        Context context);

    /**
     * Get Inference Deployment Deployment.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inference Deployment Deployment along with {@link Response}.
     */
    OnlineDeployment getById(String id);

    /**
     * Get Inference Deployment Deployment.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inference Deployment Deployment along with {@link Response}.
     */
    Response<OnlineDeployment> getByIdWithResponse(String id, Context context);

    /**
     * Delete Inference Endpoint Deployment (asynchronous).
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete Inference Endpoint Deployment (asynchronous).
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new OnlineDeployment resource.
     *
     * @param name resource name.
     * @return the first stage of the new OnlineDeployment definition.
     */
    OnlineDeployment.DefinitionStages.Blank define(String name);
}
