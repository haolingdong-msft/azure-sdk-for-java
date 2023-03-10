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
import java.util.Objects;

/**
 * Forms bigrams of CJK terms that are generated from the standard tokenizer. This token filter is implemented using
 * Apache Lucene.
 */
@Fluent
public final class CjkBigramTokenFilter extends TokenFilter {
    /*
     * Identifies the concrete type of the token filter.
     */
    private static final String ODATA_TYPE = "#Microsoft.Azure.Search.CjkBigramTokenFilter";

    /*
     * The scripts to ignore.
     */
    private List<CjkBigramTokenFilterScripts> ignoreScripts;

    /*
     * A value indicating whether to output both unigrams and bigrams (if true), or just bigrams (if false). Default is
     * false.
     */
    private Boolean outputUnigrams;

    /**
     * Creates an instance of CjkBigramTokenFilter class.
     *
     * @param name the name value to set.
     */
    public CjkBigramTokenFilter(String name) {
        super(name);
    }

    /**
     * Get the ignoreScripts property: The scripts to ignore.
     *
     * @return the ignoreScripts value.
     */
    public List<CjkBigramTokenFilterScripts> getIgnoreScripts() {
        return this.ignoreScripts;
    }

    /**
     * Set the ignoreScripts property: The scripts to ignore.
     *
     * @param ignoreScripts the ignoreScripts value to set.
     * @return the CjkBigramTokenFilter object itself.
     */
    public CjkBigramTokenFilter setIgnoreScripts(List<CjkBigramTokenFilterScripts> ignoreScripts) {
        this.ignoreScripts = ignoreScripts;
        return this;
    }

    /**
     * Get the outputUnigrams property: A value indicating whether to output both unigrams and bigrams (if true), or
     * just bigrams (if false). Default is false.
     *
     * @return the outputUnigrams value.
     */
    public Boolean areOutputUnigrams() {
        return this.outputUnigrams;
    }

    /**
     * Set the outputUnigrams property: A value indicating whether to output both unigrams and bigrams (if true), or
     * just bigrams (if false). Default is false.
     *
     * @param outputUnigrams the outputUnigrams value to set.
     * @return the CjkBigramTokenFilter object itself.
     */
    public CjkBigramTokenFilter setOutputUnigrams(Boolean outputUnigrams) {
        this.outputUnigrams = outputUnigrams;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", ODATA_TYPE);
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeArrayField(
                "ignoreScripts",
                this.ignoreScripts,
                (writer, element) -> writer.writeString(Objects.toString(element, null)));
        jsonWriter.writeBooleanField("outputUnigrams", this.outputUnigrams);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CjkBigramTokenFilter from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of CjkBigramTokenFilter if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the CjkBigramTokenFilter.
     */
    public static CjkBigramTokenFilter fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean nameFound = false;
                    String name = null;
                    List<CjkBigramTokenFilterScripts> ignoreScripts = null;
                    Boolean outputUnigrams = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!ODATA_TYPE.equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '"
                                                + ODATA_TYPE
                                                + "'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                            nameFound = true;
                        } else if ("ignoreScripts".equals(fieldName)) {
                            ignoreScripts =
                                    reader.readArray(
                                            reader1 -> CjkBigramTokenFilterScripts.fromString(reader1.getString()));
                        } else if ("outputUnigrams".equals(fieldName)) {
                            outputUnigrams = reader.getNullable(JsonReader::getBoolean);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (nameFound) {
                        CjkBigramTokenFilter deserializedValue = new CjkBigramTokenFilter(name);
                        deserializedValue.ignoreScripts = ignoreScripts;
                        deserializedValue.outputUnigrams = outputUnigrams;

                        return deserializedValue;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!nameFound) {
                        missingProperties.add("name");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }

    /**
     * Set the ignoreScripts property: The scripts to ignore.
     *
     * @param ignoreScripts the ignoreScripts value to set.
     * @return the CjkBigramTokenFilter object itself.
     */
    public CjkBigramTokenFilter setIgnoreScripts(CjkBigramTokenFilterScripts... ignoreScripts) {
        this.ignoreScripts = (ignoreScripts == null) ? null : java.util.Arrays.asList(ignoreScripts);
        return this;
    }
}
