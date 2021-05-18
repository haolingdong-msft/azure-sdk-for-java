// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.implementation;

import com.azure.resourcemanager.imagebuilder.fluent.models.RunOutputInner;
import com.azure.resourcemanager.imagebuilder.models.ProvisioningState;
import com.azure.resourcemanager.imagebuilder.models.RunOutput;

public final class RunOutputImpl implements RunOutput {
    private RunOutputInner innerObject;

    private final com.azure.resourcemanager.imagebuilder.ImageBuilderManager serviceManager;

    RunOutputImpl(
        RunOutputInner innerObject, com.azure.resourcemanager.imagebuilder.ImageBuilderManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String artifactId() {
        return this.innerModel().artifactId();
    }

    public String artifactUri() {
        return this.innerModel().artifactUri();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public RunOutputInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager() {
        return this.serviceManager;
    }
}
