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

/**
 * Represents a function tool call within a streaming run step's tool call details.
 */
@Immutable
public final class RunStepDeltaFunctionToolCall extends RunStepDeltaToolCall {

    /*
     * The type of the tool call detail item in a streaming run step's details.
     */
    @Generated
    private String type = "function";

    /*
     * The function data for the tool call.
     */
    @Generated
    private RunStepDeltaFunction function;

    /**
     * Creates an instance of RunStepDeltaFunctionToolCall class.
     *
     * @param index the index value to set.
     * @param id the id value to set.
     */
    @Generated
    private RunStepDeltaFunctionToolCall(int index, String id) {
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
     * Get the function property: The function data for the tool call.
     *
     * @return the function value.
     */
    @Generated
    public RunStepDeltaFunction getFunction() {
        return this.function;
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
        jsonWriter.writeJsonField("function", this.function);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDeltaFunctionToolCall from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDeltaFunctionToolCall if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDeltaFunctionToolCall.
     */
    @Generated
    public static RunStepDeltaFunctionToolCall fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int index = 0;
            String id = null;
            String type = "function";
            RunStepDeltaFunction function = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("index".equals(fieldName)) {
                    index = reader.getInt();
                } else if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else if ("function".equals(fieldName)) {
                    function = RunStepDeltaFunction.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            RunStepDeltaFunctionToolCall deserializedRunStepDeltaFunctionToolCall
                = new RunStepDeltaFunctionToolCall(index, id);
            deserializedRunStepDeltaFunctionToolCall.type = type;
            deserializedRunStepDeltaFunctionToolCall.function = function;
            return deserializedRunStepDeltaFunctionToolCall;
        });
    }
}
