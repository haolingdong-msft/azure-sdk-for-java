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
 * The authentication options for Azure OpenAI On Your Data when using a system-assigned managed identity.
 */
@Immutable
public final class OnYourDataSystemAssignedManagedIdentityAuthenticationOptions
    extends OnYourDataAuthenticationOptions {

    /**
     * Creates an instance of OnYourDataSystemAssignedManagedIdentityAuthenticationOptions class.
     */
    @Generated
    public OnYourDataSystemAssignedManagedIdentityAuthenticationOptions() {
    }

    /*
     * The authentication type.
     */
    @Generated
    private OnYourDataAuthenticationType type = OnYourDataAuthenticationType.SYSTEM_ASSIGNED_MANAGED_IDENTITY;

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
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OnYourDataSystemAssignedManagedIdentityAuthenticationOptions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of OnYourDataSystemAssignedManagedIdentityAuthenticationOptions if the JsonReader was
     * pointing to an instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the
     * OnYourDataSystemAssignedManagedIdentityAuthenticationOptions.
     */
    @Generated
    public static OnYourDataSystemAssignedManagedIdentityAuthenticationOptions fromJson(JsonReader jsonReader)
        throws IOException {
        return jsonReader.readObject(reader -> {
            OnYourDataSystemAssignedManagedIdentityAuthenticationOptions deserializedOnYourDataSystemAssignedManagedIdentityAuthenticationOptions
                = new OnYourDataSystemAssignedManagedIdentityAuthenticationOptions();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("type".equals(fieldName)) {
                    deserializedOnYourDataSystemAssignedManagedIdentityAuthenticationOptions.type
                        = OnYourDataAuthenticationType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedOnYourDataSystemAssignedManagedIdentityAuthenticationOptions;
        });
    }
}
