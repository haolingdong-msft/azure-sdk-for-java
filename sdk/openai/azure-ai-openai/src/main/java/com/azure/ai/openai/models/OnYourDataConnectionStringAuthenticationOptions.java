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
 * The authentication options for Azure OpenAI On Your Data when using a connection string.
 */
@Immutable
public final class OnYourDataConnectionStringAuthenticationOptions extends OnYourDataAuthenticationOptions {

    /*
     * The connection string to use for authentication.
     */
    @Generated
    private final String connectionString;

    /**
     * Creates an instance of OnYourDataConnectionStringAuthenticationOptions class.
     *
     * @param connectionString the connectionString value to set.
     */
    @Generated
    public OnYourDataConnectionStringAuthenticationOptions(String connectionString) {
        this.connectionString = connectionString;
    }

    /**
     * Get the connectionString property: The connection string to use for authentication.
     *
     * @return the connectionString value.
     */
    @Generated
    public String getConnectionString() {
        return this.connectionString;
    }

    /*
     * The authentication type.
     */
    @Generated
    private OnYourDataAuthenticationType type = OnYourDataAuthenticationType.CONNECTION_STRING;

    /**
     * Get the type property: The authentication type.
     *
     * @return the type value.
     */
    @Generated
    public OnYourDataAuthenticationType getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("connection_string", this.connectionString);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OnYourDataConnectionStringAuthenticationOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of OnYourDataConnectionStringAuthenticationOptions if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the OnYourDataConnectionStringAuthenticationOptions.
     */
    @Generated
    public static OnYourDataConnectionStringAuthenticationOptions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String connectionString = null;
            OnYourDataAuthenticationType type = OnYourDataAuthenticationType.CONNECTION_STRING;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("connection_string".equals(fieldName)) {
                    connectionString = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = OnYourDataAuthenticationType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            OnYourDataConnectionStringAuthenticationOptions deserializedOnYourDataConnectionStringAuthenticationOptions
                = new OnYourDataConnectionStringAuthenticationOptions(connectionString);
            deserializedOnYourDataConnectionStringAuthenticationOptions.type = type;
            return deserializedOnYourDataConnectionStringAuthenticationOptions;
        });
    }
}
