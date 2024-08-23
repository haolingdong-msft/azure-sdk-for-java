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
 * Represents an image output as produced the Code interpreter tool and as represented in a streaming run step's delta
 * tool calls collection.
 */
@Immutable
public final class RunStepDeltaCodeInterpreterImageOutput extends RunStepDeltaCodeInterpreterOutput {

    /*
     * The type of the streaming run step tool call's Code Interpreter output.
     */
    @Generated
    private String type = "image";

    /*
     * The image data for the Code Interpreter tool call output.
     */
    @Generated
    private RunStepDeltaCodeInterpreterImageOutputObject image;

    /**
     * Creates an instance of RunStepDeltaCodeInterpreterImageOutput class.
     *
     * @param index the index value to set.
     */
    @Generated
    private RunStepDeltaCodeInterpreterImageOutput(int index) {
        super(index);
    }

    /**
     * Get the type property: The type of the streaming run step tool call's Code Interpreter output.
     *
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Get the image property: The image data for the Code Interpreter tool call output.
     *
     * @return the image value.
     */
    @Generated
    public RunStepDeltaCodeInterpreterImageOutputObject getImage() {
        return this.image;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("index", getIndex());
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("image", this.image);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RunStepDeltaCodeInterpreterImageOutput from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RunStepDeltaCodeInterpreterImageOutput if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RunStepDeltaCodeInterpreterImageOutput.
     */
    @Generated
    public static RunStepDeltaCodeInterpreterImageOutput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            int index = 0;
            String type = "image";
            RunStepDeltaCodeInterpreterImageOutputObject image = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("index".equals(fieldName)) {
                    index = reader.getInt();
                } else if ("type".equals(fieldName)) {
                    type = reader.getString();
                } else if ("image".equals(fieldName)) {
                    image = RunStepDeltaCodeInterpreterImageOutputObject.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            RunStepDeltaCodeInterpreterImageOutput deserializedRunStepDeltaCodeInterpreterImageOutput
                = new RunStepDeltaCodeInterpreterImageOutput(index);
            deserializedRunStepDeltaCodeInterpreterImageOutput.type = type;
            deserializedRunStepDeltaCodeInterpreterImageOutput.image = image;
            return deserializedRunStepDeltaCodeInterpreterImageOutput;
        });
    }
}
