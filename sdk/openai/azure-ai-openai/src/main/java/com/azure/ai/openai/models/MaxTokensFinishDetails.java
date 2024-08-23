// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A structured representation of a stop reason that signifies a token limit was reached before the model could
 * naturally
 * complete.
 */
@Immutable
public final class MaxTokensFinishDetails extends ChatFinishDetails {

    /**
     * Creates an instance of MaxTokensFinishDetails class.
     */
    @Generated
    private MaxTokensFinishDetails() {
    }

    /*
     * The object type.
     */
    @Generated
    private String type = "max_tokens";

    /**
     * Get the type property: The object type.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MaxTokensFinishDetails from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MaxTokensFinishDetails if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MaxTokensFinishDetails.
     */
    @Generated
    public static MaxTokensFinishDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MaxTokensFinishDetails deserializedMaxTokensFinishDetails = new MaxTokensFinishDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    deserializedMaxTokensFinishDetails.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedMaxTokensFinishDetails;
        });
    }
}
