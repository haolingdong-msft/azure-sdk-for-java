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

/**
 * Specifies a user-defined vectorizer for generating the vector embedding of a query string. Integration of an
 * external vectorizer is achieved using the custom Web API interface of a skillset.
 */
@Fluent
public final class CustomVectorizer extends VectorSearchVectorizer {
    /*
     * Specifies the properties of the user-defined vectorizer.
     */
    private CustomWebApiParameters customWebApiParameters;

    /**
     * Creates an instance of CustomVectorizer class.
     * 
     * @param name the name value to set.
     */
    public CustomVectorizer(String name) {
        super(name);
    }

    /**
     * Get the customWebApiParameters property: Specifies the properties of the user-defined vectorizer.
     * 
     * @return the customWebApiParameters value.
     */
    public CustomWebApiParameters getCustomWebApiParameters() {
        return this.customWebApiParameters;
    }

    /**
     * Set the customWebApiParameters property: Specifies the properties of the user-defined vectorizer.
     * 
     * @param customWebApiParameters the customWebApiParameters value to set.
     * @return the CustomVectorizer object itself.
     */
    public CustomVectorizer setCustomWebApiParameters(CustomWebApiParameters customWebApiParameters) {
        this.customWebApiParameters = customWebApiParameters;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", VectorSearchVectorizerKind.CUSTOM_WEB_API == null ? null
            : VectorSearchVectorizerKind.CUSTOM_WEB_API.toString());
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeJsonField("customWebApiParameters", this.customWebApiParameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomVectorizer from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomVectorizer if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     * polymorphic discriminator.
     * @throws IOException If an error occurs while reading the CustomVectorizer.
     */
    public static CustomVectorizer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean nameFound = false;
            String name = null;
            CustomWebApiParameters customWebApiParameters = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("kind".equals(fieldName)) {
                    String kind = reader.getString();
                    if (!"customWebApi".equals(kind)) {
                        throw new IllegalStateException(
                            "'kind' was expected to be non-null and equal to 'customWebApi'. The found 'kind' was '"
                                + kind + "'.");
                    }
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                    nameFound = true;
                } else if ("customWebApiParameters".equals(fieldName)) {
                    customWebApiParameters = CustomWebApiParameters.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            if (nameFound) {
                CustomVectorizer deserializedCustomVectorizer = new CustomVectorizer(name);
                deserializedCustomVectorizer.customWebApiParameters = customWebApiParameters;

                return deserializedCustomVectorizer;
            }
            throw new IllegalStateException("Missing required property: name");
        });
    }
}
