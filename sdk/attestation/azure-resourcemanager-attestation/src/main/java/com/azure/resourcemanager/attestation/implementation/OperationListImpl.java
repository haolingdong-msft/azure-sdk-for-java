// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.attestation.fluent.models.OperationListInner;
import com.azure.resourcemanager.attestation.models.OperationList;
import com.azure.resourcemanager.attestation.models.OperationsDefinition;
import java.util.Collections;
import java.util.List;

public final class OperationListImpl implements OperationList {
    private OperationListInner innerObject;

    private final com.azure.resourcemanager.attestation.AttestationManager serviceManager;

    OperationListImpl(
        OperationListInner innerObject, com.azure.resourcemanager.attestation.AttestationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<OperationsDefinition> value() {
        List<OperationsDefinition> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OperationListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.attestation.AttestationManager manager() {
        return this.serviceManager;
    }
}
