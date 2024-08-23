// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for StandbyPoolClient class.
 */
public interface StandbyPoolClient {
    /**
     * Gets Service host.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Version parameter.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The ID of the target subscription. The value must be an UUID.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the StandbyVirtualMachinePoolsClient object to access its operations.
     * 
     * @return the StandbyVirtualMachinePoolsClient object.
     */
    StandbyVirtualMachinePoolsClient getStandbyVirtualMachinePools();

    /**
     * Gets the StandbyVirtualMachinesClient object to access its operations.
     * 
     * @return the StandbyVirtualMachinesClient object.
     */
    StandbyVirtualMachinesClient getStandbyVirtualMachines();

    /**
     * Gets the StandbyVirtualMachinePoolRuntimeViewsClient object to access its operations.
     * 
     * @return the StandbyVirtualMachinePoolRuntimeViewsClient object.
     */
    StandbyVirtualMachinePoolRuntimeViewsClient getStandbyVirtualMachinePoolRuntimeViews();

    /**
     * Gets the StandbyContainerGroupPoolsClient object to access its operations.
     * 
     * @return the StandbyContainerGroupPoolsClient object.
     */
    StandbyContainerGroupPoolsClient getStandbyContainerGroupPools();

    /**
     * Gets the StandbyContainerGroupPoolRuntimeViewsClient object to access its operations.
     * 
     * @return the StandbyContainerGroupPoolRuntimeViewsClient object.
     */
    StandbyContainerGroupPoolRuntimeViewsClient getStandbyContainerGroupPoolRuntimeViews();
}
