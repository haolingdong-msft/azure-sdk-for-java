// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of IntegrationRuntimeNodeIpAddressOperations. */
public interface IntegrationRuntimeNodeIpAddressOperations {
    /**
     * Get integration runtime node IP address
     *
     * <p>Get the IP address of an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param nodeName Integration runtime node name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IP address of an integration runtime node along with {@link Response}.
     */
    Response<IntegrationRuntimeNodeIpAddress> getWithResponse(
        String resourceGroupName,
        String workspaceName,
        String integrationRuntimeName,
        String nodeName,
        Context context);

    /**
     * Get integration runtime node IP address
     *
     * <p>Get the IP address of an integration runtime node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param integrationRuntimeName Integration runtime name.
     * @param nodeName Integration runtime node name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the IP address of an integration runtime node.
     */
    IntegrationRuntimeNodeIpAddress get(
        String resourceGroupName, String workspaceName, String integrationRuntimeName, String nodeName);
}
