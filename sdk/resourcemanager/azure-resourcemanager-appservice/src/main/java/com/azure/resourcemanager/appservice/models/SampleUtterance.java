// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Sample utterance.
 */
@Fluent
public final class SampleUtterance {
    /*
     * Text attribute of sample utterance.
     */
    @JsonProperty(value = "text")
    private String text;

    /*
     * Links attribute of sample utterance.
     */
    @JsonProperty(value = "links")
    private List<String> links;

    /*
     * Question id of sample utterance (for stackoverflow questions titles).
     */
    @JsonProperty(value = "qid")
    private String qid;

    /**
     * Creates an instance of SampleUtterance class.
     */
    public SampleUtterance() {
    }

    /**
     * Get the text property: Text attribute of sample utterance.
     * 
     * @return the text value.
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text property: Text attribute of sample utterance.
     * 
     * @param text the text value to set.
     * @return the SampleUtterance object itself.
     */
    public SampleUtterance withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the links property: Links attribute of sample utterance.
     * 
     * @return the links value.
     */
    public List<String> links() {
        return this.links;
    }

    /**
     * Set the links property: Links attribute of sample utterance.
     * 
     * @param links the links value to set.
     * @return the SampleUtterance object itself.
     */
    public SampleUtterance withLinks(List<String> links) {
        this.links = links;
        return this;
    }

    /**
     * Get the qid property: Question id of sample utterance (for stackoverflow questions titles).
     * 
     * @return the qid value.
     */
    public String qid() {
        return this.qid;
    }

    /**
     * Set the qid property: Question id of sample utterance (for stackoverflow questions titles).
     * 
     * @param qid the qid value to set.
     * @return the SampleUtterance object itself.
     */
    public SampleUtterance withQid(String qid) {
        this.qid = qid;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
