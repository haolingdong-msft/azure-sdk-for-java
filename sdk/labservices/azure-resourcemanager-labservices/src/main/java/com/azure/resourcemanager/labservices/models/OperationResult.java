// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.resourcemanager.labservices.fluent.models.OperationResultInner;

/** An immutable client-side representation of OperationResult. */
public interface OperationResult {
    /**
     * Gets the status property: The operation status.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the error property: Error details for the operation in case of a failure.
     *
     * @return the error value.
     */
    OperationError error();

    /**
     * Gets the inner com.azure.resourcemanager.labservices.fluent.models.OperationResultInner object.
     *
     * @return the inner object.
     */
    OperationResultInner innerModel();
}
