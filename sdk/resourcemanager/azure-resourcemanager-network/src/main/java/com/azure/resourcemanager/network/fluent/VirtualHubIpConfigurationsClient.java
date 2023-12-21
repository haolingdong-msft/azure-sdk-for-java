// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.HubIpConfigurationInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in VirtualHubIpConfigurationsClient.
 */
public interface VirtualHubIpConfigurationsClient {
    /**
     * Retrieves the details of a Virtual Hub Ip configuration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipConfigurations along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<HubIpConfigurationInner>> getWithResponseAsync(String resourceGroupName, String virtualHubName,
        String ipConfigName);

    /**
     * Retrieves the details of a Virtual Hub Ip configuration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipConfigurations on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<HubIpConfigurationInner> getAsync(String resourceGroupName, String virtualHubName, String ipConfigName);

    /**
     * Retrieves the details of a Virtual Hub Ip configuration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipConfigurations along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HubIpConfigurationInner> getWithResponse(String resourceGroupName, String virtualHubName,
        String ipConfigName, Context context);

    /**
     * Retrieves the details of a Virtual Hub Ip configuration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipConfigurations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HubIpConfigurationInner get(String resourceGroupName, String virtualHubName, String ipConfigName);

    /**
     * Creates a VirtualHubIpConfiguration resource if it doesn't exist else updates the existing
     * VirtualHubIpConfiguration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @param parameters Hub Ip Configuration parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipConfigurations along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String virtualHubName,
        String ipConfigName, HubIpConfigurationInner parameters);

    /**
     * Creates a VirtualHubIpConfiguration resource if it doesn't exist else updates the existing
     * VirtualHubIpConfiguration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @param parameters Hub Ip Configuration parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of ipConfigurations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<HubIpConfigurationInner>, HubIpConfigurationInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String virtualHubName, String ipConfigName, HubIpConfigurationInner parameters);

    /**
     * Creates a VirtualHubIpConfiguration resource if it doesn't exist else updates the existing
     * VirtualHubIpConfiguration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @param parameters Hub Ip Configuration parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of ipConfigurations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<HubIpConfigurationInner>, HubIpConfigurationInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualHubName, String ipConfigName, HubIpConfigurationInner parameters);

    /**
     * Creates a VirtualHubIpConfiguration resource if it doesn't exist else updates the existing
     * VirtualHubIpConfiguration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @param parameters Hub Ip Configuration parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of ipConfigurations.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<HubIpConfigurationInner>, HubIpConfigurationInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualHubName, String ipConfigName, HubIpConfigurationInner parameters,
        Context context);

    /**
     * Creates a VirtualHubIpConfiguration resource if it doesn't exist else updates the existing
     * VirtualHubIpConfiguration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @param parameters Hub Ip Configuration parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipConfigurations on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<HubIpConfigurationInner> createOrUpdateAsync(String resourceGroupName, String virtualHubName,
        String ipConfigName, HubIpConfigurationInner parameters);

    /**
     * Creates a VirtualHubIpConfiguration resource if it doesn't exist else updates the existing
     * VirtualHubIpConfiguration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @param parameters Hub Ip Configuration parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipConfigurations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HubIpConfigurationInner createOrUpdate(String resourceGroupName, String virtualHubName, String ipConfigName,
        HubIpConfigurationInner parameters);

    /**
     * Creates a VirtualHubIpConfiguration resource if it doesn't exist else updates the existing
     * VirtualHubIpConfiguration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @param parameters Hub Ip Configuration parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return ipConfigurations.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HubIpConfigurationInner createOrUpdate(String resourceGroupName, String virtualHubName, String ipConfigName,
        HubIpConfigurationInner parameters, Context context);

    /**
     * Deletes a VirtualHubIpConfiguration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHubBgpConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String virtualHubName,
        String ipConfigName);

    /**
     * Deletes a VirtualHubIpConfiguration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHubBgpConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String virtualHubName,
        String ipConfigName);

    /**
     * Deletes a VirtualHubIpConfiguration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHubBgpConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualHubName,
        String ipConfigName);

    /**
     * Deletes a VirtualHubIpConfiguration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHubBgpConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualHubName, String ipConfigName,
        Context context);

    /**
     * Deletes a VirtualHubIpConfiguration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHubBgpConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String virtualHubName, String ipConfigName);

    /**
     * Deletes a VirtualHubIpConfiguration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHubBgpConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualHubName, String ipConfigName);

    /**
     * Deletes a VirtualHubIpConfiguration.
     * 
     * @param resourceGroupName The resource group name of the VirtualHubBgpConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param ipConfigName The name of the ipconfig.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualHubName, String ipConfigName, Context context);

    /**
     * Retrieves the details of all VirtualHubIpConfigurations.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHubIpConfigurations list as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<HubIpConfigurationInner> listAsync(String resourceGroupName, String virtualHubName);

    /**
     * Retrieves the details of all VirtualHubIpConfigurations.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHubIpConfigurations list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HubIpConfigurationInner> list(String resourceGroupName, String virtualHubName);

    /**
     * Retrieves the details of all VirtualHubIpConfigurations.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHubIpConfigurations list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HubIpConfigurationInner> list(String resourceGroupName, String virtualHubName, Context context);
}
