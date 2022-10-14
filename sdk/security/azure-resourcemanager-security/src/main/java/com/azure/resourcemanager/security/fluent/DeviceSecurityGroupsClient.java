// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.DeviceSecurityGroupInner;

/** An instance of this class provides access to all the operations defined in DeviceSecurityGroupsClient. */
public interface DeviceSecurityGroupsClient {
    /**
     * Use this method get the list of device security groups for the specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of device security groups as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeviceSecurityGroupInner> list(String resourceId);

    /**
     * Use this method get the list of device security groups for the specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of device security groups as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DeviceSecurityGroupInner> list(String resourceId, Context context);

    /**
     * Use this method to get the device security group for the specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @param deviceSecurityGroupName The name of the device security group. Note that the name of the device security
     *     group is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device security group resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeviceSecurityGroupInner get(String resourceId, String deviceSecurityGroupName);

    /**
     * Use this method to get the device security group for the specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @param deviceSecurityGroupName The name of the device security group. Note that the name of the device security
     *     group is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device security group resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeviceSecurityGroupInner> getWithResponse(
        String resourceId, String deviceSecurityGroupName, Context context);

    /**
     * Use this method to creates or updates the device security group on a specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @param deviceSecurityGroupName The name of the device security group. Note that the name of the device security
     *     group is case insensitive.
     * @param deviceSecurityGroup Security group object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device security group resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeviceSecurityGroupInner createOrUpdate(
        String resourceId, String deviceSecurityGroupName, DeviceSecurityGroupInner deviceSecurityGroup);

    /**
     * Use this method to creates or updates the device security group on a specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @param deviceSecurityGroupName The name of the device security group. Note that the name of the device security
     *     group is case insensitive.
     * @param deviceSecurityGroup Security group object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the device security group resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeviceSecurityGroupInner> createOrUpdateWithResponse(
        String resourceId,
        String deviceSecurityGroupName,
        DeviceSecurityGroupInner deviceSecurityGroup,
        Context context);

    /**
     * User this method to deletes the device security group.
     *
     * @param resourceId The identifier of the resource.
     * @param deviceSecurityGroupName The name of the device security group. Note that the name of the device security
     *     group is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceId, String deviceSecurityGroupName);

    /**
     * User this method to deletes the device security group.
     *
     * @param resourceId The identifier of the resource.
     * @param deviceSecurityGroupName The name of the device security group. Note that the name of the device security
     *     group is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceId, String deviceSecurityGroupName, Context context);
}
