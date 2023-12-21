// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * prefix entry.
 */
@Fluent
public final class PrefixObject {
    /*
     * prefix description
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * prefix list
     */
    @JsonProperty(value = "prefixList", required = true)
    private List<String> prefixList;

    /*
     * etag info
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * comment for this object
     */
    @JsonProperty(value = "auditComment")
    private String auditComment;

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of PrefixObject class.
     */
    public PrefixObject() {
    }

    /**
     * Get the description property: prefix description.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: prefix description.
     * 
     * @param description the description value to set.
     * @return the PrefixObject object itself.
     */
    public PrefixObject withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the prefixList property: prefix list.
     * 
     * @return the prefixList value.
     */
    public List<String> prefixList() {
        return this.prefixList;
    }

    /**
     * Set the prefixList property: prefix list.
     * 
     * @param prefixList the prefixList value to set.
     * @return the PrefixObject object itself.
     */
    public PrefixObject withPrefixList(List<String> prefixList) {
        this.prefixList = prefixList;
        return this;
    }

    /**
     * Get the etag property: etag info.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: etag info.
     * 
     * @param etag the etag value to set.
     * @return the PrefixObject object itself.
     */
    public PrefixObject withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the auditComment property: comment for this object.
     * 
     * @return the auditComment value.
     */
    public String auditComment() {
        return this.auditComment;
    }

    /**
     * Set the auditComment property: comment for this object.
     * 
     * @param auditComment the auditComment value to set.
     * @return the PrefixObject object itself.
     */
    public PrefixObject withAuditComment(String auditComment) {
        this.auditComment = auditComment;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (prefixList() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property prefixList in model PrefixObject"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrefixObject.class);
}
