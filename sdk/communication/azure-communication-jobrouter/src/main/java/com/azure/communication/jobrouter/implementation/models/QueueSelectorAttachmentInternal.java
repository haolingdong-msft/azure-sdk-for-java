// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.communication.jobrouter.models.QueueSelectorAttachmentKind;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * An attachment of queue selectors to resolve a queue to a job from a classification policy.
 */
@Immutable
public class QueueSelectorAttachmentInternal implements JsonSerializable<QueueSelectorAttachmentInternal> {

    /**
     * Creates an instance of QueueSelectorAttachmentInternal class.
     */
    @Generated
    public QueueSelectorAttachmentInternal() {
        this.kind = QueueSelectorAttachmentKind.fromString("QueueSelectorAttachmentInternal");
        this.updatedProperties.add("kind");
    }

    /*
     * The type discriminator describing a sub-type of QueueSelectorAttachment.
     */
    @Generated
    private QueueSelectorAttachmentKind kind;

    /**
     * Get the kind property: The type discriminator describing a sub-type of QueueSelectorAttachment.
     *
     * @return the kind value.
     */
    @Generated
    public QueueSelectorAttachmentKind getKind() {
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
        JsonMergePatchHelper.setQueueSelectorAttachmentInternalAccessor((model, jsonMergePatchEnabled) -> {
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of QueueSelectorAttachmentInternal from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of QueueSelectorAttachmentInternal if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the QueueSelectorAttachmentInternal.
     */
    @Generated
    public static QueueSelectorAttachmentInternal fromJson(JsonReader jsonReader) throws IOException {
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
                if ("conditional".equals(discriminatorValue)) {
                    return ConditionalQueueSelectorAttachmentInternal.fromJson(readerToUse.reset());
                } else if ("passThrough".equals(discriminatorValue)) {
                    return PassThroughQueueSelectorAttachmentInternal.fromJson(readerToUse.reset());
                } else if ("ruleEngine".equals(discriminatorValue)) {
                    return RuleEngineQueueSelectorAttachmentInternal.fromJson(readerToUse.reset());
                } else if ("static".equals(discriminatorValue)) {
                    return StaticQueueSelectorAttachmentInternal.fromJson(readerToUse.reset());
                } else if ("weightedAllocation".equals(discriminatorValue)) {
                    return WeightedAllocationQueueSelectorAttachmentInternal.fromJson(readerToUse.reset());
                } else {
                    return fromJsonKnownDiscriminator(readerToUse.reset());
                }
            }
        });
    }

    @Generated
    static QueueSelectorAttachmentInternal fromJsonKnownDiscriminator(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            QueueSelectorAttachmentInternal deserializedQueueSelectorAttachmentInternal
                = new QueueSelectorAttachmentInternal();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("kind".equals(fieldName)) {
                    deserializedQueueSelectorAttachmentInternal.kind
                        = QueueSelectorAttachmentKind.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedQueueSelectorAttachmentInternal;
        });
    }
}
