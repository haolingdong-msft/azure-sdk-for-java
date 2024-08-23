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
 * A tool selection of a specific, named function tool that will limit chat completions to using the named function.
 */
@Immutable
public final class ChatCompletionsNamedFunctionToolSelection extends ChatCompletionsNamedToolSelection {

    /*
     * The function that should be called.
     */
    @Generated
    private final ChatCompletionsFunctionToolSelection function;

    /**
     * Creates an instance of ChatCompletionsNamedFunctionToolSelection class.
     *
     * @param function the function value to set.
     */
    @Generated
    public ChatCompletionsNamedFunctionToolSelection(ChatCompletionsFunctionToolSelection function) {
        this.function = function;
    }

    /**
     * Get the function property: The function that should be called.
     *
     * @return the function value.
     */
    @Generated
    public ChatCompletionsFunctionToolSelection getFunction() {
        return this.function;
    }

    /*
     * The object type.
     */
    @Generated
    private String type = "function";

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
        jsonWriter.writeJsonField("function", this.function);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ChatCompletionsNamedFunctionToolSelection from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ChatCompletionsNamedFunctionToolSelection if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ChatCompletionsNamedFunctionToolSelection.
     */
    @Generated
    public static ChatCompletionsNamedFunctionToolSelection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ChatCompletionsFunctionToolSelection function = null;
            String type = "function";
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("function".equals(fieldName)) {
                    function = ChatCompletionsFunctionToolSelection.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            ChatCompletionsNamedFunctionToolSelection deserializedChatCompletionsNamedFunctionToolSelection
                = new ChatCompletionsNamedFunctionToolSelection(function);
            deserializedChatCompletionsNamedFunctionToolSelection.type = type;
            return deserializedChatCompletionsNamedFunctionToolSelection;
        });
    }
}
