// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.BinaryDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Binary dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Binary")
@Fluent
public final class BinaryDataset extends Dataset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BinaryDataset.class);

    /*
     * Binary dataset properties.
     */
    @JsonProperty(value = "typeProperties")
    private BinaryDatasetTypeProperties innerTypeProperties;

    /**
     * Get the innerTypeProperties property: Binary dataset properties.
     *
     * @return the innerTypeProperties value.
     */
    private BinaryDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public BinaryDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinaryDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinaryDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinaryDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinaryDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinaryDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinaryDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the location property: The location of the Binary storage.
     *
     * @return the location value.
     */
    public DatasetLocation location() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().location();
    }

    /**
     * Set the location property: The location of the Binary storage.
     *
     * @param location the location value to set.
     * @return the BinaryDataset object itself.
     */
    public BinaryDataset withLocation(DatasetLocation location) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new BinaryDatasetTypeProperties();
        }
        this.innerTypeProperties().withLocation(location);
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the binary dataset.
     *
     * @return the compression value.
     */
    public DatasetCompression compression() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().compression();
    }

    /**
     * Set the compression property: The data compression method used for the binary dataset.
     *
     * @param compression the compression value to set.
     * @return the BinaryDataset object itself.
     */
    public BinaryDataset withCompression(DatasetCompression compression) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new BinaryDatasetTypeProperties();
        }
        this.innerTypeProperties().withCompression(compression);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
