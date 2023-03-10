// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.kusto.fluent.models.AttachedDatabaseConfigurationInner;
import com.azure.resourcemanager.kusto.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.kusto.models.AttachedDatabaseConfigurationsCheckNameRequest;

/** An instance of this class provides access to all the operations defined in AttachedDatabaseConfigurationsClient. */
public interface AttachedDatabaseConfigurationsClient {
    /**
     * Checks that the attached database configuration resource name is valid and is not already in use.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameResultInner> checkNameAvailabilityWithResponse(
        String resourceGroupName,
        String clusterName,
        AttachedDatabaseConfigurationsCheckNameRequest resourceName,
        Context context);

    /**
     * Checks that the attached database configuration resource name is valid and is not already in use.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameResultInner checkNameAvailability(
        String resourceGroupName, String clusterName, AttachedDatabaseConfigurationsCheckNameRequest resourceName);

    /**
     * Returns the list of attached database configurations of the given Kusto cluster.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list attached database configurations operation response as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AttachedDatabaseConfigurationInner> listByCluster(String resourceGroupName, String clusterName);

    /**
     * Returns the list of attached database configurations of the given Kusto cluster.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list attached database configurations operation response as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AttachedDatabaseConfigurationInner> listByCluster(
        String resourceGroupName, String clusterName, Context context);

    /**
     * Returns an attached database configuration.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an attached database configuration along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AttachedDatabaseConfigurationInner> getWithResponse(
        String resourceGroupName, String clusterName, String attachedDatabaseConfigurationName, Context context);

    /**
     * Returns an attached database configuration.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an attached database configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttachedDatabaseConfigurationInner get(
        String resourceGroupName, String clusterName, String attachedDatabaseConfigurationName);

    /**
     * Creates or updates an attached database configuration.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param parameters The database parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing an attached database configuration.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AttachedDatabaseConfigurationInner>, AttachedDatabaseConfigurationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String clusterName,
        String attachedDatabaseConfigurationName,
        AttachedDatabaseConfigurationInner parameters);

    /**
     * Creates or updates an attached database configuration.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param parameters The database parameters supplied to the CreateOrUpdate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing an attached database configuration.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AttachedDatabaseConfigurationInner>, AttachedDatabaseConfigurationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String clusterName,
        String attachedDatabaseConfigurationName,
        AttachedDatabaseConfigurationInner parameters,
        Context context);

    /**
     * Creates or updates an attached database configuration.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param parameters The database parameters supplied to the CreateOrUpdate operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an attached database configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttachedDatabaseConfigurationInner createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String attachedDatabaseConfigurationName,
        AttachedDatabaseConfigurationInner parameters);

    /**
     * Creates or updates an attached database configuration.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param parameters The database parameters supplied to the CreateOrUpdate operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing an attached database configuration.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AttachedDatabaseConfigurationInner createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String attachedDatabaseConfigurationName,
        AttachedDatabaseConfigurationInner parameters,
        Context context);

    /**
     * Deletes the attached database configuration with the given name.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String attachedDatabaseConfigurationName);

    /**
     * Deletes the attached database configuration with the given name.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String attachedDatabaseConfigurationName, Context context);

    /**
     * Deletes the attached database configuration with the given name.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String attachedDatabaseConfigurationName);

    /**
     * Deletes the attached database configuration with the given name.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param attachedDatabaseConfigurationName The name of the attached database configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String clusterName, String attachedDatabaseConfigurationName, Context context);
}
