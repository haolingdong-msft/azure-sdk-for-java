// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.communication.jobrouter.models.ExceptionActionKind;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * The action to take when the exception is triggered.
 */
@Fluent
public class ExceptionActionInternal implements JsonSerializable<ExceptionActionInternal> {

    /*
     * Unique Id of the exception action.
     */
    @Generated
    private String id;

    /**
     * Creates an instance of ExceptionActionInternal class.
     */
    @Generated
    public ExceptionActionInternal() {
        this.kind = ExceptionActionKind.fromString("ExceptionActionInternal");
    }

    /**
     * Get the id property: Unique Id of the exception action.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Unique Id of the exception action.
     *
     * @param id the id value to set.
     * @return the ExceptionActionInternal object itself.
     */
    @Generated
    public ExceptionActionInternal setId(String id) {
        this.id = id;
        this.updatedProperties.add("id");
        return this;
    }

    /*
     * The type discriminator describing a sub-type of ExceptionAction.
     */
    @Generated
    private ExceptionActionKind kind;

    /**
     * Get the kind property: The type discriminator describing a sub-type of ExceptionAction.
     *
     * @return the kind value.
     */
    @Generated
    public ExceptionActionKind getKind() {
        return this.kind;
    }

    @Generated
    private boolean jsonMergePatch;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setExceptionActionInternalAccessor((model, jsonMergePatchEnabled) -> {
            model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
            return model;
        });
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
            jsonWriter.writeStringField("id", this.id);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("kind")) {
            if (this.kind == null) {
                jsonWriter.writeNullField("kind");
            } else {
                jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
            }
        }
        if (updatedProperties.contains("id")) {
            if (this.id == null) {
                jsonWriter.writeNullField("id");
            } else {
                jsonWriter.writeStringField("id", this.id);
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExceptionActionInternal from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExceptionActionInternal if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExceptionActionInternal.
     */
    @Generated
    public static ExceptionActionInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            try (JsonReader readerToUse = reader.bufferObject()) {
                // Prepare for reading
                readerToUse.nextToken();
                while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                    String fieldName = readerToUse.getFieldName();
                    readerToUse.nextToken();
                    if ("kind".equals(fieldName)) {
                        discriminatorValue = readerToUse.getString();
                        break;
                    } else {
                        readerToUse.skipChildren();
                    }
                }
                // Use the discriminator value to determine which subtype should be deserialized.
                if ("cancel".equals(discriminatorValue)) {
                    return CancelExceptionActionInternal.fromJson(readerToUse.reset());
                } else if ("manualReclassify".equals(discriminatorValue)) {
                    return ManualReclassifyExceptionActionInternal.fromJson(readerToUse.reset());
                } else if ("reclassify".equals(discriminatorValue)) {
                    return ReclassifyExceptionActionInternal.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static ExceptionActionInternal fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExceptionActionInternal deserializedExceptionActionInternal = new ExceptionActionInternal();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("kind".equals(fieldName)) {
                    deserializedExceptionActionInternal.kind = ExceptionActionKind.fromString(reader.getString());
                } else if ("id".equals(fieldName)) {
                    deserializedExceptionActionInternal.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedExceptionActionInternal;
        });
    }
}
