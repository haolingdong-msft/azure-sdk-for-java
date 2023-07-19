// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkPacketBrokerInner;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkPacketBrokerPatch;

/** An instance of this class provides access to all the operations defined in NetworkPacketBrokersClient. */
public interface NetworkPacketBrokersClient {
    /**
     * Create Network Packet Broker.
     *
     * <p>Creates a Network Packet Broker.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkPacketBrokerName Name of the Network Packet Broker.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the NetworkPacketBroker resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkPacketBrokerInner>, NetworkPacketBrokerInner> beginCreate(
        String resourceGroupName, String networkPacketBrokerName, NetworkPacketBrokerInner body);

    /**
     * Create Network Packet Broker.
     *
     * <p>Creates a Network Packet Broker.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkPacketBrokerName Name of the Network Packet Broker.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the NetworkPacketBroker resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkPacketBrokerInner>, NetworkPacketBrokerInner> beginCreate(
        String resourceGroupName, String networkPacketBrokerName, NetworkPacketBrokerInner body, Context context);

    /**
     * Create Network Packet Broker.
     *
     * <p>Creates a Network Packet Broker.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkPacketBrokerName Name of the Network Packet Broker.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the NetworkPacketBroker resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkPacketBrokerInner create(
        String resourceGroupName, String networkPacketBrokerName, NetworkPacketBrokerInner body);

    /**
     * Create Network Packet Broker.
     *
     * <p>Creates a Network Packet Broker.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkPacketBrokerName Name of the Network Packet Broker.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the NetworkPacketBroker resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkPacketBrokerInner create(
        String resourceGroupName, String networkPacketBrokerName, NetworkPacketBrokerInner body, Context context);

    /**
     * Gets a Network Packet Broker.
     *
     * <p>Retrieves details of this Network Packet Broker.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkPacketBrokerName Name of the Network Packet Broker.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the NetworkPacketBroker resource definition along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkPacketBrokerInner> getByResourceGroupWithResponse(
        String resourceGroupName, String networkPacketBrokerName, Context context);

    /**
     * Gets a Network Packet Broker.
     *
     * <p>Retrieves details of this Network Packet Broker.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkPacketBrokerName Name of the Network Packet Broker.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the NetworkPacketBroker resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkPacketBrokerInner getByResourceGroup(String resourceGroupName, String networkPacketBrokerName);

    /**
     * Updates the Network Packet Broker.
     *
     * <p>API to update certain properties of the Network Packet Broker resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkPacketBrokerName Name of the Network Packet Broker.
     * @param body Network Packet Broker properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the NetworkPacketBroker resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkPacketBrokerInner>, NetworkPacketBrokerInner> beginUpdate(
        String resourceGroupName, String networkPacketBrokerName, NetworkPacketBrokerPatch body);

    /**
     * Updates the Network Packet Broker.
     *
     * <p>API to update certain properties of the Network Packet Broker resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkPacketBrokerName Name of the Network Packet Broker.
     * @param body Network Packet Broker properties to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the NetworkPacketBroker resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkPacketBrokerInner>, NetworkPacketBrokerInner> beginUpdate(
        String resourceGroupName, String networkPacketBrokerName, NetworkPacketBrokerPatch body, Context context);

    /**
     * Updates the Network Packet Broker.
     *
     * <p>API to update certain properties of the Network Packet Broker resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkPacketBrokerName Name of the Network Packet Broker.
     * @param body Network Packet Broker properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the NetworkPacketBroker resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkPacketBrokerInner update(
        String resourceGroupName, String networkPacketBrokerName, NetworkPacketBrokerPatch body);

    /**
     * Updates the Network Packet Broker.
     *
     * <p>API to update certain properties of the Network Packet Broker resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkPacketBrokerName Name of the Network Packet Broker.
     * @param body Network Packet Broker properties to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the NetworkPacketBroker resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkPacketBrokerInner update(
        String resourceGroupName, String networkPacketBrokerName, NetworkPacketBrokerPatch body, Context context);

    /**
     * Deletes a Network Packet Broker.
     *
     * <p>Deletes Network Packet Broker.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkPacketBrokerName Name of the Network Packet Broker.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkPacketBrokerName);

    /**
     * Deletes a Network Packet Broker.
     *
     * <p>Deletes Network Packet Broker.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkPacketBrokerName Name of the Network Packet Broker.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkPacketBrokerName, Context context);

    /**
     * Deletes a Network Packet Broker.
     *
     * <p>Deletes Network Packet Broker.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkPacketBrokerName Name of the Network Packet Broker.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkPacketBrokerName);

    /**
     * Deletes a Network Packet Broker.
     *
     * <p>Deletes Network Packet Broker.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkPacketBrokerName Name of the Network Packet Broker.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkPacketBrokerName, Context context);

    /**
     * List all Network Packet Brokers under resource group.
     *
     * <p>Displays NetworkPacketBrokers list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkPacketBrokers as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkPacketBrokerInner> listByResourceGroup(String resourceGroupName);

    /**
     * List all Network Packet Brokers under resource group.
     *
     * <p>Displays NetworkPacketBrokers list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkPacketBrokers as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkPacketBrokerInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List Network Packet Brokers by subscription.
     *
     * <p>Displays Network Packet Brokers list by subscription GET method.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkPacketBrokers as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkPacketBrokerInner> list();

    /**
     * List Network Packet Brokers by subscription.
     *
     * <p>Displays Network Packet Brokers list by subscription GET method.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of NetworkPacketBrokers as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkPacketBrokerInner> list(Context context);
}
