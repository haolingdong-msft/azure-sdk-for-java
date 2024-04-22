// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.communication.jobrouter.models.ExceptionActionKind;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * An action that modifies labels on a job and then reclassifies it.
 */
@Fluent
public final class ReclassifyExceptionActionInternal extends ExceptionActionInternal {

    /*
     * The new classification policy that will determine queue, priority and worker selectors.
     */
    @Generated
    private String classificationPolicyId;

    /*
     * Dictionary containing the labels to update (or add if not existing) in key-value pairs.  Values must be primitive values - number, string, boolean.
     */
    @Generated
    private Map<String, Object> labelsToUpsert;

    /**
     * Creates an instance of ReclassifyExceptionActionInternal class.
     */
    @Generated
    public ReclassifyExceptionActionInternal() {
        this.updatedProperties.add("kind");
    }

    /**
     * Get the classificationPolicyId property: The new classification policy that will determine queue, priority and
     * worker selectors.
     *
     * @return the classificationPolicyId value.
     */
    @Generated
    public String getClassificationPolicyId() {
        return this.classificationPolicyId;
    }

    /**
     * Set the classificationPolicyId property: The new classification policy that will determine queue, priority and
     * worker selectors.
     *
     * @param classificationPolicyId the classificationPolicyId value to set.
     * @return the ReclassifyExceptionActionInternal object itself.
     */
    @Generated
    public ReclassifyExceptionActionInternal setClassificationPolicyId(String classificationPolicyId) {
        this.classificationPolicyId = classificationPolicyId;
        this.updatedProperties.add("classificationPolicyId");
        return this;
    }

    /**
     * Get the labelsToUpsert property: Dictionary containing the labels to update (or add if not existing) in key-value
     * pairs. Values must be primitive values - number, string, boolean.
     *
     * @return the labelsToUpsert value.
     */
    @Generated
    public Map<String, Object> getLabelsToUpsert() {
        return this.labelsToUpsert;
    }

    /**
     * Set the labelsToUpsert property: Dictionary containing the labels to update (or add if not existing) in key-value
     * pairs. Values must be primitive values - number, string, boolean.
     *
     * @param labelsToUpsert the labelsToUpsert value to set.
     * @return the ReclassifyExceptionActionInternal object itself.
     */
    @Generated
    public ReclassifyExceptionActionInternal setLabelsToUpsert(Map<String, Object> labelsToUpsert) {
        this.labelsToUpsert = labelsToUpsert;
        this.updatedProperties.add("labelsToUpsert");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public ReclassifyExceptionActionInternal setId(String id) {
        super.setId(id);
        this.updatedProperties.add("id");
        return this;
    }

    /*
     * The type discriminator describing a sub-type of ExceptionAction.
     */
    @Generated
    private ExceptionActionKind kind = ExceptionActionKind.RECLASSIFY;

    /**
     * Get the kind property: The type discriminator describing a sub-type of ExceptionAction.
     *
     * @return the kind value.
     */
    @Generated
    @Override
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
        JsonMergePatchHelper.setReclassifyExceptionActionInternalAccessor((model, jsonMergePatchEnabled) -> {
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
            jsonWriter.writeStringField("id", getId());
            jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
            jsonWriter.writeStringField("classificationPolicyId", this.classificationPolicyId);
            jsonWriter.writeMapField("labelsToUpsert", this.labelsToUpsert,
                (writer, element) -> writer.writeUntyped(element));
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("id")) {
            if (getId() == null) {
                jsonWriter.writeNullField("id");
            } else {
                jsonWriter.writeStringField("id", getId());
            }
        }
        if (updatedProperties.contains("kind")) {
            if (this.kind == null) {
                jsonWriter.writeNullField("kind");
            } else {
                jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
            }
        }
        if (updatedProperties.contains("classificationPolicyId")) {
            if (this.classificationPolicyId == null) {
                jsonWriter.writeNullField("classificationPolicyId");
            } else {
                jsonWriter.writeStringField("classificationPolicyId", this.classificationPolicyId);
            }
        }
        if (updatedProperties.contains("labelsToUpsert")) {
            if (this.labelsToUpsert == null) {
                jsonWriter.writeNullField("labelsToUpsert");
            } else {
                jsonWriter.writeMapField("labelsToUpsert", this.labelsToUpsert,
                    (writer, element) -> writer.writeUntyped(element));
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ReclassifyExceptionActionInternal from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ReclassifyExceptionActionInternal if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ReclassifyExceptionActionInternal.
     */
    @Generated
    public static ReclassifyExceptionActionInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ReclassifyExceptionActionInternal deserializedReclassifyExceptionActionInternal
                = new ReclassifyExceptionActionInternal();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("id".equals(fieldName)) {
                    deserializedReclassifyExceptionActionInternal.setId(reader.getString());
                } else if ("kind".equals(fieldName)) {
                    deserializedReclassifyExceptionActionInternal.kind
                        = ExceptionActionKind.fromString(reader.getString());
                } else if ("classificationPolicyId".equals(fieldName)) {
                    deserializedReclassifyExceptionActionInternal.classificationPolicyId = reader.getString();
                } else if ("labelsToUpsert".equals(fieldName)) {
                    Map<String, Object> labelsToUpsert = reader.readMap(reader1 -> reader1.readUntyped());
                    deserializedReclassifyExceptionActionInternal.labelsToUpsert = labelsToUpsert;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedReclassifyExceptionActionInternal;
        });
    }
}
