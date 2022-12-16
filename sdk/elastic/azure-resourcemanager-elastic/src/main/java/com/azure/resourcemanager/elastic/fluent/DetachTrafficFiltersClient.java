// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;

/** An instance of this class provides access to all the operations defined in DetachTrafficFiltersClient. */
public interface DetachTrafficFiltersClient {
    /**
     * Detach traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginUpdate(String resourceGroupName, String monitorName);

    /**
     * Detach traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param rulesetId Ruleset Id of the filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginUpdate(
        String resourceGroupName, String monitorName, String rulesetId, Context context);

    /**
     * Detach traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void update(String resourceGroupName, String monitorName);

    /**
     * Detach traffic filter for the given deployment.
     *
     * @param resourceGroupName The name of the resource group to which the Elastic resource belongs.
     * @param monitorName Monitor resource name.
     * @param rulesetId Ruleset Id of the filter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void update(String resourceGroupName, String monitorName, String rulesetId, Context context);
}
