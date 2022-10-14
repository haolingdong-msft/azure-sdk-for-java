// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ServiceAssociationLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for ServiceAssociationLinks_List operation. */
@Fluent
public final class ServiceAssociationLinksListResultInner {
    /*
     * The service association links in a subnet.
     */
    @JsonProperty(value = "value")
    private List<ServiceAssociationLink> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of ServiceAssociationLinksListResultInner class. */
    public ServiceAssociationLinksListResultInner() {
    }

    /**
     * Get the value property: The service association links in a subnet.
     *
     * @return the value value.
     */
    public List<ServiceAssociationLink> value() {
        return this.value;
    }

    /**
     * Set the value property: The service association links in a subnet.
     *
     * @param value the value value to set.
     * @return the ServiceAssociationLinksListResultInner object itself.
     */
    public ServiceAssociationLinksListResultInner withValue(List<ServiceAssociationLink> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
