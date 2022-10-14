// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The Azure Blob storage. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureBlob")
@JsonFlatten
@Fluent
public class AzureBlobDataset extends Dataset {
    /*
     * The path of the Azure Blob storage. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.folderPath")
    private Object folderPath;

    /*
     * The root of blob path. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tableRootLocation")
    private Object tableRootLocation;

    /*
     * The name of the Azure Blob. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.fileName")
    private Object fileName;

    /*
     * The start of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.modifiedDatetimeStart")
    private Object modifiedDatetimeStart;

    /*
     * The end of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.modifiedDatetimeEnd")
    private Object modifiedDatetimeEnd;

    /*
     * The format of the Azure Blob storage.
     */
    @JsonProperty(value = "typeProperties.format")
    private DatasetStorageFormat format;

    /*
     * The data compression method used for the blob storage.
     */
    @JsonProperty(value = "typeProperties.compression")
    private DatasetCompression compression;

    /**
     * Get the folderPath property: The path of the Azure Blob storage. Type: string (or Expression with resultType
     * string).
     *
     * @return the folderPath value.
     */
    public Object getFolderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: The path of the Azure Blob storage. Type: string (or Expression with resultType
     * string).
     *
     * @param folderPath the folderPath value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset setFolderPath(Object folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the tableRootLocation property: The root of blob path. Type: string (or Expression with resultType string).
     *
     * @return the tableRootLocation value.
     */
    public Object getTableRootLocation() {
        return this.tableRootLocation;
    }

    /**
     * Set the tableRootLocation property: The root of blob path. Type: string (or Expression with resultType string).
     *
     * @param tableRootLocation the tableRootLocation value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset setTableRootLocation(Object tableRootLocation) {
        this.tableRootLocation = tableRootLocation;
        return this;
    }

    /**
     * Get the fileName property: The name of the Azure Blob. Type: string (or Expression with resultType string).
     *
     * @return the fileName value.
     */
    public Object getFileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: The name of the Azure Blob. Type: string (or Expression with resultType string).
     *
     * @param fileName the fileName value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset setFileName(Object fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of Azure Blob's modified datetime. Type: string (or Expression
     * with resultType string).
     *
     * @return the modifiedDatetimeStart value.
     */
    public Object getModifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the modifiedDatetimeStart property: The start of Azure Blob's modified datetime. Type: string (or Expression
     * with resultType string).
     *
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset setModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of Azure Blob's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @return the modifiedDatetimeEnd value.
     */
    public Object getModifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of Azure Blob's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset setModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /**
     * Get the format property: The format of the Azure Blob storage.
     *
     * @return the format value.
     */
    public DatasetStorageFormat getFormat() {
        return this.format;
    }

    /**
     * Set the format property: The format of the Azure Blob storage.
     *
     * @param format the format value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset setFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the blob storage.
     *
     * @return the compression value.
     */
    public DatasetCompression getCompression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used for the blob storage.
     *
     * @param compression the compression value to set.
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset setCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
