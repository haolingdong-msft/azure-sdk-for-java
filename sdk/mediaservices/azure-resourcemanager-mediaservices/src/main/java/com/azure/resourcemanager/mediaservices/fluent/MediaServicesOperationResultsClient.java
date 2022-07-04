// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.MediaServiceInner;
import com.azure.resourcemanager.mediaservices.models.MediaServicesOperationResultsGetResponse;

/** An instance of this class provides access to all the operations defined in MediaServicesOperationResultsClient. */
public interface MediaServicesOperationResultsClient {
    /**
     * Get media service operation result.
     *
     * @param locationName Location name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return media service operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MediaServiceInner get(String locationName, String operationId);

    /**
     * Get media service operation result.
     *
     * @param locationName Location name.
     * @param operationId Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return media service operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MediaServicesOperationResultsGetResponse getWithResponse(String locationName, String operationId, Context context);
}
