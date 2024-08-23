// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The details of a a vectorization source, used by Azure OpenAI On Your Data when applying vector search, that is based
 * on an internal embeddings model deployment name in the same Azure OpenAI resource.
 */
@Fluent
public final class OnYourDataDeploymentNameVectorizationSource extends OnYourDataVectorizationSource {

    /*
     * The embedding model deployment name within the same Azure OpenAI resource. This enables you to use vector search
     * without Azure OpenAI api-key and without Azure OpenAI public network access.
     */
    @Generated
    private final String deploymentName;

    /**
     * Creates an instance of OnYourDataDeploymentNameVectorizationSource class.
     *
     * @param deploymentName the deploymentName value to set.
     */
    @Generated
    public OnYourDataDeploymentNameVectorizationSource(String deploymentName) {
        this.deploymentName = deploymentName;
    }

    /**
     * Get the deploymentName property: The embedding model deployment name within the same Azure OpenAI resource. This
     * enables you to use vector search without Azure OpenAI api-key and without Azure OpenAI public network access.
     *
     * @return the deploymentName value.
     */
    @Generated
    public String getDeploymentName() {
        return this.deploymentName;
    }

    /*
     * The type of vectorization source to use.
     */
    @Generated
    private OnYourDataVectorizationSourceType type = OnYourDataVectorizationSourceType.DEPLOYMENT_NAME;

    /**
     * Get the type property: The type of vectorization source to use.
     *
     * @return the type value.
     */
    @Generated
    public OnYourDataVectorizationSourceType getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("deployment_name", this.deploymentName);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeNumberField("dimensions", this.dimensions);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OnYourDataDeploymentNameVectorizationSource from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of OnYourDataDeploymentNameVectorizationSource if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OnYourDataDeploymentNameVectorizationSource.
     */
    @Generated
    public static OnYourDataDeploymentNameVectorizationSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String deploymentName = null;
            OnYourDataVectorizationSourceType type = OnYourDataVectorizationSourceType.DEPLOYMENT_NAME;
            Integer dimensions = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("deployment_name".equals(fieldName)) {
                    deploymentName = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = OnYourDataVectorizationSourceType.fromString(reader.getString());
                } else if ("dimensions".equals(fieldName)) {
                    dimensions = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            OnYourDataDeploymentNameVectorizationSource deserializedOnYourDataDeploymentNameVectorizationSource
                = new OnYourDataDeploymentNameVectorizationSource(deploymentName);
            deserializedOnYourDataDeploymentNameVectorizationSource.type = type;
            deserializedOnYourDataDeploymentNameVectorizationSource.dimensions = dimensions;
            return deserializedOnYourDataDeploymentNameVectorizationSource;
        });
    }

    /*
     * The number of dimensions the embeddings should have. Only supported in `text-embedding-3` and later models.
     */
    @Generated
    private Integer dimensions;

    /**
     * Get the dimensions property: The number of dimensions the embeddings should have. Only supported in
     * `text-embedding-3` and later models.
     *
     * @return the dimensions value.
     */
    @Generated
    public Integer getDimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: The number of dimensions the embeddings should have. Only supported in
     * `text-embedding-3` and later models.
     *
     * @param dimensions the dimensions value to set.
     * @return the OnYourDataDeploymentNameVectorizationSource object itself.
     */
    @Generated
    public OnYourDataDeploymentNameVectorizationSource setDimensions(Integer dimensions) {
        this.dimensions = dimensions;
        return this;
    }
}
