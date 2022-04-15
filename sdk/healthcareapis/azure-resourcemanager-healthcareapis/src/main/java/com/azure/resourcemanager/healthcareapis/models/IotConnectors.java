// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IotConnectors. */
public interface IotConnectors {
    /**
     * Lists all IoT Connectors for the given workspace.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of IoT Connectors as paginated response with {@link PagedIterable}.
     */
    PagedIterable<IotConnector> listByWorkspace(String resourceGroupName, String workspaceName);

    /**
     * Lists all IoT Connectors for the given workspace.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of IoT Connectors as paginated response with {@link PagedIterable}.
     */
    PagedIterable<IotConnector> listByWorkspace(String resourceGroupName, String workspaceName, Context context);

    /**
     * Gets the properties of the specified IoT Connector.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorName The name of IoT Connector resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified IoT Connector.
     */
    IotConnector get(String resourceGroupName, String workspaceName, String iotConnectorName);

    /**
     * Gets the properties of the specified IoT Connector.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param workspaceName The name of workspace resource.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified IoT Connector along with {@link Response}.
     */
    Response<IotConnector> getWithResponse(
        String resourceGroupName, String workspaceName, String iotConnectorName, Context context);

    /**
     * Deletes an IoT Connector.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param workspaceName The name of workspace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String iotConnectorName, String workspaceName);

    /**
     * Deletes an IoT Connector.
     *
     * @param resourceGroupName The name of the resource group that contains the service instance.
     * @param iotConnectorName The name of IoT Connector resource.
     * @param workspaceName The name of workspace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String iotConnectorName, String workspaceName, Context context);

    /**
     * Gets the properties of the specified IoT Connector.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified IoT Connector along with {@link Response}.
     */
    IotConnector getById(String id);

    /**
     * Gets the properties of the specified IoT Connector.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified IoT Connector along with {@link Response}.
     */
    Response<IotConnector> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an IoT Connector.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an IoT Connector.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new IotConnector resource.
     *
     * @param name resource name.
     * @return the first stage of the new IotConnector definition.
     */
    IotConnector.DefinitionStages.Blank define(String name);
}
