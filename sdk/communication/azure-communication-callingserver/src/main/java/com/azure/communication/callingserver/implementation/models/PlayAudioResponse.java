// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callingserver.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The response payload for play audio operation. */
@Fluent
public final class PlayAudioResponse {
    /*
     * Gets or sets the identifier.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Gets or sets the status of the operation
     */
    @JsonProperty(value = "status")
    private OperationStatus status;

    /*
     * Gets or sets the operation context
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /*
     * Gets or sets the result info
     */
    @JsonProperty(value = "resultInfo")
    private ResultInfoInternal resultInfo;

    /**
     * Get the id property: Gets or sets the identifier.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Gets or sets the identifier.
     *
     * @param id the id value to set.
     * @return the PlayAudioResponse object itself.
     */
    public PlayAudioResponse setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the status property: Gets or sets the status of the operation.
     *
     * @return the status value.
     */
    public OperationStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Gets or sets the status of the operation.
     *
     * @param status the status value to set.
     * @return the PlayAudioResponse object itself.
     */
    public PlayAudioResponse setStatus(OperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the operationContext property: Gets or sets the operation context.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: Gets or sets the operation context.
     *
     * @param operationContext the operationContext value to set.
     * @return the PlayAudioResponse object itself.
     */
    public PlayAudioResponse setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }

    /**
     * Get the resultInfo property: Gets or sets the result info.
     *
     * @return the resultInfo value.
     */
    public ResultInfoInternal getResultInfo() {
        return this.resultInfo;
    }

    /**
     * Set the resultInfo property: Gets or sets the result info.
     *
     * @param resultInfo the resultInfo value to set.
     * @return the PlayAudioResponse object itself.
     */
    public PlayAudioResponse setResultInfo(ResultInfoInternal resultInfo) {
        this.resultInfo = resultInfo;
        return this;
    }
}
