// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.contentsafety.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The text analysis request.
 */
@Fluent
public final class AnalyzeTextOptions implements JsonSerializable<AnalyzeTextOptions> {

    /*
     * The text needs to be analyzed. We support a maximum of 10k Unicode characters (Unicode code points) in the text of one request.
     */
    @Generated
    private final String text;

    /*
     * The categories will be analyzed. If they are not assigned, a default set of analysis results for the categories will be returned.
     */
    @Generated
    private List<TextCategory> categories;

    /*
     * The names of blocklists.
     */
    @Generated
    private List<String> blocklistNames;

    /*
     * When set to true, further analyses of harmful content will not be performed in cases where blocklists are hit. When set to false, all analyses of harmful content will be performed, whether or not blocklists are hit.
     */
    @Generated
    private Boolean haltOnBlocklistHit;

    /*
     * This refers to the type of text analysis output. If no value is assigned, the default value will be "FourSeverityLevels".
     */
    @Generated
    private AnalyzeTextOutputType outputType;

    /**
     * Creates an instance of AnalyzeTextOptions class.
     *
     * @param text the text value to set.
     */
    @Generated
    public AnalyzeTextOptions(String text) {
        this.text = text;
    }

    /**
     * Get the text property: The text needs to be analyzed. We support a maximum of 10k Unicode characters (Unicode code points) in the text of one request.
     *
     * @return the text value.
     */
    @Generated
    public String getText() {
        return this.text;
    }

    /**
     * Get the categories property: The categories will be analyzed. If they are not assigned, a default set of analysis results for the categories will be returned.
     *
     * @return the categories value.
     */
    @Generated
    public List<TextCategory> getCategories() {
        return this.categories;
    }

    /**
     * Set the categories property: The categories will be analyzed. If they are not assigned, a default set of analysis results for the categories will be returned.
     *
     * @param categories the categories value to set.
     * @return the AnalyzeTextOptions object itself.
     */
    @Generated
    public AnalyzeTextOptions setCategories(List<TextCategory> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the blocklistNames property: The names of blocklists.
     *
     * @return the blocklistNames value.
     */
    @Generated
    public List<String> getBlocklistNames() {
        return this.blocklistNames;
    }

    /**
     * Set the blocklistNames property: The names of blocklists.
     *
     * @param blocklistNames the blocklistNames value to set.
     * @return the AnalyzeTextOptions object itself.
     */
    @Generated
    public AnalyzeTextOptions setBlocklistNames(List<String> blocklistNames) {
        this.blocklistNames = blocklistNames;
        return this;
    }

    /**
     * Get the haltOnBlocklistHit property: When set to true, further analyses of harmful content will not be performed in cases where blocklists are hit. When set to false, all analyses of harmful content will be performed, whether or not blocklists are hit.
     *
     * @return the haltOnBlocklistHit value.
     */
    @Generated
    public Boolean isHaltOnBlocklistHit() {
        return this.haltOnBlocklistHit;
    }

    /**
     * Set the haltOnBlocklistHit property: When set to true, further analyses of harmful content will not be performed in cases where blocklists are hit. When set to false, all analyses of harmful content will be performed, whether or not blocklists are hit.
     *
     * @param haltOnBlocklistHit the haltOnBlocklistHit value to set.
     * @return the AnalyzeTextOptions object itself.
     */
    @Generated
    public AnalyzeTextOptions setHaltOnBlocklistHit(Boolean haltOnBlocklistHit) {
        this.haltOnBlocklistHit = haltOnBlocklistHit;
        return this;
    }

    /**
     * Get the outputType property: This refers to the type of text analysis output. If no value is assigned, the default value will be "FourSeverityLevels".
     *
     * @return the outputType value.
     */
    @Generated
    public AnalyzeTextOutputType getOutputType() {
        return this.outputType;
    }

    /**
     * Set the outputType property: This refers to the type of text analysis output. If no value is assigned, the default value will be "FourSeverityLevels".
     *
     * @param outputType the outputType value to set.
     * @return the AnalyzeTextOptions object itself.
     */
    @Generated
    public AnalyzeTextOptions setOutputType(AnalyzeTextOutputType outputType) {
        this.outputType = outputType;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("text", this.text);
        jsonWriter.writeArrayField("categories", this.categories,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeArrayField("blocklistNames", this.blocklistNames,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeBooleanField("haltOnBlocklistHit", this.haltOnBlocklistHit);
        jsonWriter.writeStringField("outputType", this.outputType == null ? null : this.outputType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AnalyzeTextOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnalyzeTextOptions if the JsonReader was pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AnalyzeTextOptions.
     */
    @Generated
    public static AnalyzeTextOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String text = null;
            List<TextCategory> categories = null;
            List<String> blocklistNames = null;
            Boolean haltOnBlocklistHit = null;
            AnalyzeTextOutputType outputType = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("text".equals(fieldName)) {
                    text = reader.getString();
                } else if ("categories".equals(fieldName)) {
                    categories = reader.readArray(reader1 -> TextCategory.fromString(reader1.getString()));
                } else if ("blocklistNames".equals(fieldName)) {
                    blocklistNames = reader.readArray(reader1 -> reader1.getString());
                } else if ("haltOnBlocklistHit".equals(fieldName)) {
                    haltOnBlocklistHit = reader.getNullable(JsonReader::getBoolean);
                } else if ("outputType".equals(fieldName)) {
                    outputType = AnalyzeTextOutputType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            AnalyzeTextOptions deserializedAnalyzeTextOptions = new AnalyzeTextOptions(text);
            deserializedAnalyzeTextOptions.categories = categories;
            deserializedAnalyzeTextOptions.blocklistNames = blocklistNames;
            deserializedAnalyzeTextOptions.haltOnBlocklistHit = haltOnBlocklistHit;
            deserializedAnalyzeTextOptions.outputType = outputType;
            return deserializedAnalyzeTextOptions;
        });
    }
}
