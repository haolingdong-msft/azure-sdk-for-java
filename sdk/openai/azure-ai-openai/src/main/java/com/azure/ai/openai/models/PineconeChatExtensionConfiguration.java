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
 * A specific representation of configurable options for Pinecone when using it as an Azure OpenAI chat
 * extension.
 */
@Immutable
public final class PineconeChatExtensionConfiguration extends AzureChatExtensionConfiguration {

    /*
     * The parameters to use when configuring Azure OpenAI chat extensions.
     */
    @Generated
    private final PineconeChatExtensionParameters parameters;

    /**
     * Get the parameters property: The parameters to use when configuring Azure OpenAI chat extensions.
     *
     * @return the parameters value.
     */
    @Generated
    public PineconeChatExtensionParameters getParameters() {
        return this.parameters;
    }

    /**
     * Creates an instance of PineconeChatExtensionConfiguration class.
     *
     * @param parameters the parameters value to set.
     */
    @Generated
    public PineconeChatExtensionConfiguration(PineconeChatExtensionParameters parameters) {
        this.parameters = parameters;
    }

    /*
     * The label for the type of an Azure chat extension. This typically corresponds to a matching Azure resource.
     * Azure chat extensions are only compatible with Azure OpenAI.
     */
    @Generated
    private AzureChatExtensionType type = AzureChatExtensionType.PINECONE;

    /**
     * Get the type property: The label for the type of an Azure chat extension. This typically corresponds to a
     * matching Azure resource.
     * Azure chat extensions are only compatible with Azure OpenAI.
     *
     * @return the type value.
     */
    @Generated
    public AzureChatExtensionType getType() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("parameters", this.parameters);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PineconeChatExtensionConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of PineconeChatExtensionConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PineconeChatExtensionConfiguration.
     */
    @Generated
    public static PineconeChatExtensionConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PineconeChatExtensionParameters parameters = null;
            AzureChatExtensionType type = AzureChatExtensionType.PINECONE;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("parameters".equals(fieldName)) {
                    parameters = PineconeChatExtensionParameters.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    type = AzureChatExtensionType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            PineconeChatExtensionConfiguration deserializedPineconeChatExtensionConfiguration
                = new PineconeChatExtensionConfiguration(parameters);
            deserializedPineconeChatExtensionConfiguration.type = type;
            return deserializedPineconeChatExtensionConfiguration;
        });
    }
}
