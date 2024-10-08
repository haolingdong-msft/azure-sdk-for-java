// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.fluent.models.OperationInner;
import java.io.IOException;
import java.util.List;

/**
 * Result of the request to list CDN operations. It contains a list of operations and a URL link to get the next set of
 * results.
 */
@Fluent
public final class OperationsListResult implements JsonSerializable<OperationsListResult> {
    /*
     * List of CDN operations supported by the CDN resource provider.
     */
    private List<OperationInner> value;

    /*
     * URL to get the next set of operation list results if there are any.
     */
    private String nextLink;

    /**
     * Creates an instance of OperationsListResult class.
     */
    public OperationsListResult() {
    }

    /**
     * Get the value property: List of CDN operations supported by the CDN resource provider.
     * 
     * @return the value value.
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of CDN operations supported by the CDN resource provider.
     * 
     * @param value the value value to set.
     * @return the OperationsListResult object itself.
     */
    public OperationsListResult withValue(List<OperationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of operation list results if there are any.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of operation list results if there are any.
     * 
     * @param nextLink the nextLink value to set.
     * @return the OperationsListResult object itself.
     */
    public OperationsListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationsListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationsListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationsListResult.
     */
    public static OperationsListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationsListResult deserializedOperationsListResult = new OperationsListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<OperationInner> value = reader.readArray(reader1 -> OperationInner.fromJson(reader1));
                    deserializedOperationsListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedOperationsListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationsListResult;
        });
    }
}
