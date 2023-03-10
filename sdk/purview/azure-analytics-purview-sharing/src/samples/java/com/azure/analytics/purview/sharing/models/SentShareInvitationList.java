// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of the sent share invitations. */
@Fluent
public final class SentShareInvitationList {
    /*
     * The Url of next result page.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Collection of items of type DataTransferObjects.
     */
    @JsonProperty(value = "value", required = true)
    private List<SentShareInvitation> value;

    /** Creates an instance of SentShareInvitationList class. */
    public SentShareInvitationList() {}

    /**
     * Get the nextLink property: The Url of next result page.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The Url of next result page.
     *
     * @param nextLink the nextLink value to set.
     * @return the SentShareInvitationList object itself.
     */
    public SentShareInvitationList setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Collection of items of type DataTransferObjects.
     *
     * @return the value value.
     */
    public List<SentShareInvitation> getValue() {
        return this.value;
    }

    /**
     * Set the value property: Collection of items of type DataTransferObjects.
     *
     * @param value the value value to set.
     * @return the SentShareInvitationList object itself.
     */
    public SentShareInvitationList setValue(List<SentShareInvitation> value) {
        this.value = value;
        return this;
    }
}
