// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.iothub.fluent.models.PrivateEndpointConnectionInner;
import java.util.List;

/** Resource collection API of PrivateEndpointConnections. */
public interface PrivateEndpointConnections {
    /**
     * List private endpoint connections
     *
     * <p>List private endpoint connection properties.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of private endpoint connections for an IotHub along with {@link Response}.
     */
    Response<List<PrivateEndpointConnection>> listWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * List private endpoint connections
     *
     * <p>List private endpoint connection properties.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of private endpoint connections for an IotHub.
     */
    List<PrivateEndpointConnection> list(String resourceGroupName, String resourceName);

    /**
     * Get private endpoint connection
     *
     * <p>Get private endpoint connection properties.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection properties along with {@link Response}.
     */
    Response<PrivateEndpointConnection> getWithResponse(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName, Context context);

    /**
     * Get private endpoint connection
     *
     * <p>Get private endpoint connection properties.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private endpoint connection properties.
     */
    PrivateEndpointConnection get(String resourceGroupName, String resourceName, String privateEndpointConnectionName);

    /**
     * Update private endpoint connection
     *
     * <p>Update the status of a private endpoint connection with the specified name.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param privateEndpointConnection The private endpoint connection with updated properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection of an IotHub.
     */
    PrivateEndpointConnection update(
        String resourceGroupName,
        String resourceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection);

    /**
     * Update private endpoint connection
     *
     * <p>Update the status of a private endpoint connection with the specified name.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param privateEndpointConnection The private endpoint connection with updated properties.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection of an IotHub.
     */
    PrivateEndpointConnection update(
        String resourceGroupName,
        String resourceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection,
        Context context);

    /**
     * Delete private endpoint connection
     *
     * <p>Delete private endpoint connection with the specified name.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection of an IotHub.
     */
    PrivateEndpointConnection delete(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName);

    /**
     * Delete private endpoint connection
     *
     * <p>Delete private endpoint connection with the specified name.
     *
     * @param resourceGroupName The name of the resource group that contains the IoT hub.
     * @param resourceName The name of the IoT hub.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.iothub.models.ErrorDetailsException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private endpoint connection of an IotHub.
     */
    PrivateEndpointConnection delete(
        String resourceGroupName, String resourceName, String privateEndpointConnectionName, Context context);
}
