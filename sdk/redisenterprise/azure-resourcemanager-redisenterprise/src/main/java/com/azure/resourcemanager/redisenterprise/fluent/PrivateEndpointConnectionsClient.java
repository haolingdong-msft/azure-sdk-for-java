// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.redisenterprise.fluent.models.PrivateEndpointConnectionInner;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient. */
public interface PrivateEndpointConnectionsClient {
    /**
     * Lists all the private endpoint connections associated with the RedisEnterprise cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> list(String resourceGroupName, String clusterName);

    /**
     * Lists all the private endpoint connections associated with the RedisEnterprise cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of private endpoint connection associated with the specified storage account as paginated response
     *     with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> list(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets the specified private endpoint connection associated with the RedisEnterprise cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the RedisEnterprise cluster along with {@link
     *     Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> getWithResponse(
        String resourceGroupName, String clusterName, String privateEndpointConnectionName, Context context);

    /**
     * Gets the specified private endpoint connection associated with the RedisEnterprise cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection associated with the RedisEnterprise cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner get(
        String resourceGroupName, String clusterName, String privateEndpointConnectionName);

    /**
     * Updates the state of the specified private endpoint connection associated with the RedisEnterprise cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginPut(
        String resourceGroupName,
        String clusterName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties);

    /**
     * Updates the state of the specified private endpoint connection associated with the RedisEnterprise cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param properties The private endpoint connection properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginPut(
        String resourceGroupName,
        String clusterName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties,
        Context context);

    /**
     * Updates the state of the specified private endpoint connection associated with the RedisEnterprise cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner put(
        String resourceGroupName,
        String clusterName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties);

    /**
     * Updates the state of the specified private endpoint connection associated with the RedisEnterprise cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param properties The private endpoint connection properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Private Endpoint Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner put(
        String resourceGroupName,
        String clusterName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner properties,
        Context context);

    /**
     * Deletes the specified private endpoint connection associated with the RedisEnterprise cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String clusterName, String privateEndpointConnectionName, Context context);

    /**
     * Deletes the specified private endpoint connection associated with the RedisEnterprise cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the RedisEnterprise cluster.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Azure
     *     resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String privateEndpointConnectionName);
}
