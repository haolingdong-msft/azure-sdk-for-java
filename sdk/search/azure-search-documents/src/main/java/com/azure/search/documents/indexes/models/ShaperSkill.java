// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A skill for reshaping the outputs. It creates a complex type to support composite fields (also known as multipart
 * fields).
 */
@Fluent
public final class ShaperSkill extends SearchIndexerSkill {
    /**
     * Creates an instance of ShaperSkill class.
     * 
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    public ShaperSkill(List<InputFieldMappingEntry> inputs, List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShaperSkill setName(String name) {
        super.setName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShaperSkill setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ShaperSkill setContext(String context) {
        super.setContext(context);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", "#Microsoft.Skills.Util.ShaperSkill");
        jsonWriter.writeArrayField("inputs", getInputs(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("outputs", getOutputs(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeStringField("context", getContext());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ShaperSkill from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ShaperSkill if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the ShaperSkill.
     */
    public static ShaperSkill fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean inputsFound = false;
            List<InputFieldMappingEntry> inputs = null;
            boolean outputsFound = false;
            List<OutputFieldMappingEntry> outputs = null;
            String name = null;
            String description = null;
            String context = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("@odata.type".equals(fieldName)) {
                    String odataType = reader.getString();
                    if (!"#Microsoft.Skills.Util.ShaperSkill".equals(odataType)) {
                        throw new IllegalStateException(
                            "'@odata.type' was expected to be non-null and equal to '#Microsoft.Skills.Util.ShaperSkill'. The found '@odata.type' was '"
                                + odataType + "'.");
                    }
                } else if ("inputs".equals(fieldName)) {
                    inputs = reader.readArray(reader1 -> InputFieldMappingEntry.fromJson(reader1));
                    inputsFound = true;
                } else if ("outputs".equals(fieldName)) {
                    outputs = reader.readArray(reader1 -> OutputFieldMappingEntry.fromJson(reader1));
                    outputsFound = true;
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("description".equals(fieldName)) {
                    description = reader.getString();
                } else if ("context".equals(fieldName)) {
                    context = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (inputsFound && outputsFound) {
                ShaperSkill deserializedShaperSkill = new ShaperSkill(inputs, outputs);
                deserializedShaperSkill.setName(name);
                deserializedShaperSkill.setDescription(description);
                deserializedShaperSkill.setContext(context);

                return deserializedShaperSkill;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!inputsFound) {
                missingProperties.add("inputs");
            }
            if (!outputsFound) {
                missingProperties.add("outputs");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
