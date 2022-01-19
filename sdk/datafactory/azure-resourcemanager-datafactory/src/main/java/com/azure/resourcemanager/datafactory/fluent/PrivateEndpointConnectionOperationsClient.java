// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.datafactory.fluent.models.PrivateEndpointConnectionResourceInner;
import com.azure.resourcemanager.datafactory.models.PrivateLinkConnectionApprovalRequestResource;

/**
 * An instance of this class provides access to all the operations defined in PrivateEndpointConnectionOperationsClient.
 */
public interface PrivateEndpointConnectionOperationsClient {
    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param privateEndpointWrapper Private Endpoint Connection Approval ARM resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private Endpoint Connection ARM resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionResourceInner createOrUpdate(
        String resourceGroupName,
        String factoryName,
        String privateEndpointConnectionName,
        PrivateLinkConnectionApprovalRequestResource privateEndpointWrapper);

    /**
     * Approves or rejects a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param privateEndpointWrapper Private Endpoint Connection Approval ARM resource.
     * @param ifMatch ETag of the private endpoint connection entity. Should only be specified for update, for which it
     *     should match existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private Endpoint Connection ARM resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionResourceInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String factoryName,
        String privateEndpointConnectionName,
        PrivateLinkConnectionApprovalRequestResource privateEndpointWrapper,
        String ifMatch,
        Context context);

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionResourceInner get(
        String resourceGroupName, String factoryName, String privateEndpointConnectionName);

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param ifNoneMatch ETag of the private endpoint connection entity. Should only be specified for get. If the ETag
     *     matches the existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionResourceInner> getWithResponse(
        String resourceGroupName,
        String factoryName,
        String privateEndpointConnectionName,
        String ifNoneMatch,
        Context context);

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String factoryName, String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param privateEndpointConnectionName The private endpoint connection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String factoryName, String privateEndpointConnectionName, Context context);
}
