// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.resourcemanager.devcenter.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.devcenter.models.OperationStatus;
import com.azure.resourcemanager.devcenter.models.OperationStatusError;
import java.time.OffsetDateTime;

public final class OperationStatusImpl implements OperationStatus {
    private OperationStatusInner innerObject;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    OperationStatusImpl(
        OperationStatusInner innerObject, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String status() {
        return this.innerModel().status();
    }

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public Float percentComplete() {
        return this.innerModel().percentComplete();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public OperationStatusError error() {
        return this.innerModel().error();
    }

    public OperationStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }
}
