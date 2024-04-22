// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.standbypool.fluent.models.StandbyVirtualMachineResourceInner;

/**
 * An instance of this class provides access to all the operations defined in StandbyVirtualMachinesClient.
 */
public interface StandbyVirtualMachinesClient {
    /**
     * Get a StandbyVirtualMachineResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @param standbyVirtualMachineName Name of the standby virtual machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyVirtualMachineResource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<StandbyVirtualMachineResourceInner> getWithResponse(String resourceGroupName,
        String standbyVirtualMachinePoolName, String standbyVirtualMachineName, Context context);

    /**
     * Get a StandbyVirtualMachineResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @param standbyVirtualMachineName Name of the standby virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a StandbyVirtualMachineResource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    StandbyVirtualMachineResourceInner get(String resourceGroupName, String standbyVirtualMachinePoolName,
        String standbyVirtualMachineName);

    /**
     * List StandbyVirtualMachineResource resources by StandbyVirtualMachinePoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyVirtualMachineResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StandbyVirtualMachineResourceInner> listByStandbyVirtualMachinePoolResource(String resourceGroupName,
        String standbyVirtualMachinePoolName);

    /**
     * List StandbyVirtualMachineResource resources by StandbyVirtualMachinePoolResource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param standbyVirtualMachinePoolName Name of the standby virtual machine pool.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a StandbyVirtualMachineResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<StandbyVirtualMachineResourceInner> listByStandbyVirtualMachinePoolResource(String resourceGroupName,
        String standbyVirtualMachinePoolName, Context context);
}
