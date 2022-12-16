// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.signalr.fluent.models.PrivateEndpointConnectionInner;

/** Resource collection API of SignalRPrivateEndpointConnections. */
public interface SignalRPrivateEndpointConnections {
    /**
     * List private endpoint connections.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private endpoint connections as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateEndpointConnection> list(String resourceGroupName, String resourceName);

    /**
     * List private endpoint connections.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private endpoint connections as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateEndpointConnection> list(String resourceGroupName, String resourceName, Context context);

    /**
     * Get the specified private endpoint connection.
     *
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection along with {@link Response}.
     */
    Response<PrivateEndpointConnection> getWithResponse(
        String privateEndpointConnectionName, String resourceGroupName, String resourceName, Context context);

    /**
     * Get the specified private endpoint connection.
     *
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection.
     */
    PrivateEndpointConnection get(String privateEndpointConnectionName, String resourceGroupName, String resourceName);

    /**
     * Update the state of specified private endpoint connection.
     *
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters The resource of private endpoint and its properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection to an azure resource along with {@link Response}.
     */
    Response<PrivateEndpointConnection> updateWithResponse(
        String privateEndpointConnectionName,
        String resourceGroupName,
        String resourceName,
        PrivateEndpointConnectionInner parameters,
        Context context);

    /**
     * Update the state of specified private endpoint connection.
     *
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param parameters The resource of private endpoint and its properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection to an azure resource.
     */
    PrivateEndpointConnection update(
        String privateEndpointConnectionName,
        String resourceGroupName,
        String resourceName,
        PrivateEndpointConnectionInner parameters);

    /**
     * Delete the specified private endpoint connection.
     *
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String privateEndpointConnectionName, String resourceGroupName, String resourceName);

    /**
     * Delete the specified private endpoint connection.
     *
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String privateEndpointConnectionName, String resourceGroupName, String resourceName, Context context);
}
