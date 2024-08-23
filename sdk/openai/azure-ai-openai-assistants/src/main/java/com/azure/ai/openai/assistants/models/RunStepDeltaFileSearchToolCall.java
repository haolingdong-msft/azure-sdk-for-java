// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.assistants.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Represents a file search tool call within a streaming run step's tool call details.
 */
@Immutable
public final class RunStepDeltaFileSearchToolCall extends RunStepDeltaToolCall {

    /*
     * The type of the tool call detail item in a streaming run step's details.
     */
    @Generated
    private String type = "file_search";

    /*
     * Reserved for future use.
     */
    @Generated
    private Map<String, String> fileSearch;

    /**
     * Creates an instance of RunStepDeltaFileSearchToolCall class.
     *
     * @param index the index value to set.
     * @param id the id value to set.
     */
    @Generated
    private RunStepDeltaFileSearchToolCall(int index, String id) {
        super(index, id);
    }

    /**
     * Get the type property: The type of the tool call detail item in a streaming run step's details.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Get the fileSearch property: Reserved for future use.
     *
     * @return the fileSearch value.
     */
    @Generated
    public Map<String, String> getFileSearch() {
        return this.fileSearch;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("index", getIndex());
        jsonWriter.writeStringField("id", getId());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeMapField("file_search", this.fileSearch, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDeltaFileSearchToolCall from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDeltaFileSearchToolCall if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDeltaFileSearchToolCall.
     */
    @Generated
    public static RunStepDeltaFileSearchToolCall fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int index = 0;
            String id = null;
            String type = "file_search";
            Map<String, String> fileSearch = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("index".equals(fieldName)) {
                    index = reader.getInt();
                } else if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else if ("file_search".equals(fieldName)) {
                    fileSearch = reader.readMap(reader1 -> reader1.getString());
                } else {
                    reader.skipChildren();
                }
            }
            RunStepDeltaFileSearchToolCall deserializedRunStepDeltaFileSearchToolCall
                = new RunStepDeltaFileSearchToolCall(index, id);
            deserializedRunStepDeltaFileSearchToolCall.type = type;
            deserializedRunStepDeltaFileSearchToolCall.fileSearch = fileSearch;
            return deserializedRunStepDeltaFileSearchToolCall;
        });
    }
}
