// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.DaprComponentInner;
import com.azure.resourcemanager.appcontainers.fluent.models.DaprSecretsCollectionInner;

/** An instance of this class provides access to all the operations defined in DaprComponentsClient. */
public interface DaprComponentsClient {
    /**
     * Get the Dapr Components for a managed environment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Dapr Components for a managed environment as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DaprComponentInner> list(String resourceGroupName, String environmentName);

    /**
     * Get the Dapr Components for a managed environment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Dapr Components for a managed environment as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DaprComponentInner> list(String resourceGroupName, String environmentName, Context context);

    /**
     * Get a dapr component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param componentName Name of the Dapr Component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dapr component along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DaprComponentInner> getWithResponse(
        String resourceGroupName, String environmentName, String componentName, Context context);

    /**
     * Get a dapr component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param componentName Name of the Dapr Component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a dapr component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DaprComponentInner get(String resourceGroupName, String environmentName, String componentName);

    /**
     * Creates or updates a Dapr Component.
     *
     * <p>Creates or updates a Dapr Component in a Managed Environment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param componentName Name of the Dapr Component.
     * @param daprComponentEnvelope Configuration details of the Dapr Component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dapr Component along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DaprComponentInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String environmentName,
        String componentName,
        DaprComponentInner daprComponentEnvelope,
        Context context);

    /**
     * Creates or updates a Dapr Component.
     *
     * <p>Creates or updates a Dapr Component in a Managed Environment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param componentName Name of the Dapr Component.
     * @param daprComponentEnvelope Configuration details of the Dapr Component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dapr Component.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DaprComponentInner createOrUpdate(
        String resourceGroupName,
        String environmentName,
        String componentName,
        DaprComponentInner daprComponentEnvelope);

    /**
     * Delete a Dapr Component.
     *
     * <p>Delete a Dapr Component from a Managed Environment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param componentName Name of the Dapr Component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String environmentName, String componentName, Context context);

    /**
     * Delete a Dapr Component.
     *
     * <p>Delete a Dapr Component from a Managed Environment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param componentName Name of the Dapr Component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String environmentName, String componentName);

    /**
     * List secrets for a dapr component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param componentName Name of the Dapr Component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dapr component Secrets Collection for ListSecrets Action along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DaprSecretsCollectionInner> listSecretsWithResponse(
        String resourceGroupName, String environmentName, String componentName, Context context);

    /**
     * List secrets for a dapr component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param environmentName Name of the Managed Environment.
     * @param componentName Name of the Dapr Component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     *     is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return dapr component Secrets Collection for ListSecrets Action.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DaprSecretsCollectionInner listSecrets(String resourceGroupName, String environmentName, String componentName);
}
