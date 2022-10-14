// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.BastionShareableLinkInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Post request for all the Bastion Shareable Link endpoints. */
@Fluent
public final class BastionShareableLinkListRequest {
    /*
     * List of VM references.
     */
    @JsonProperty(value = "vms")
    private List<BastionShareableLinkInner> vms;

    /** Creates an instance of BastionShareableLinkListRequest class. */
    public BastionShareableLinkListRequest() {
    }

    /**
     * Get the vms property: List of VM references.
     *
     * @return the vms value.
     */
    public List<BastionShareableLinkInner> vms() {
        return this.vms;
    }

    /**
     * Set the vms property: List of VM references.
     *
     * @param vms the vms value to set.
     * @return the BastionShareableLinkListRequest object itself.
     */
    public BastionShareableLinkListRequest withVms(List<BastionShareableLinkInner> vms) {
        this.vms = vms;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vms() != null) {
            vms().forEach(e -> e.validate());
        }
    }
}
