// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elasticsan.models.ElasticSanOperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Description of a ElasticSan RP Operation. */
@Fluent
public final class ElasticSanRPOperationInner {
    /*
     * The name of the operation being performed on this particular object
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Indicates whether the operation applies to data-plane.
     */
    @JsonProperty(value = "isDataAction", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDataAction;

    /*
     * Additional metadata about RP operation.
     */
    @JsonProperty(value = "display", access = JsonProperty.Access.WRITE_ONLY)
    private ElasticSanOperationDisplay display;

    /** Creates an instance of ElasticSanRPOperationInner class. */
    public ElasticSanRPOperationInner() {
    }

    /**
     * Get the name property: The name of the operation being performed on this particular object.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the operation being performed on this particular object.
     *
     * @param name the name value to set.
     * @return the ElasticSanRPOperationInner object itself.
     */
    public ElasticSanRPOperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isDataAction property: Indicates whether the operation applies to data-plane.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Get the display property: Additional metadata about RP operation.
     *
     * @return the display value.
     */
    public ElasticSanOperationDisplay display() {
        return this.display;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ElasticSanRPOperationInner"));
        }
        if (display() != null) {
            display().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ElasticSanRPOperationInner.class);
}
