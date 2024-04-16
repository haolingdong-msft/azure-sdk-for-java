// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A policy that defines actions to execute when exception are triggered.
 */
@Fluent
public final class ExceptionPolicyInternal implements JsonSerializable<ExceptionPolicyInternal> {

    /*
     * Id of an exception policy.
     */
    @Generated
    private String id;

    /*
     * Friendly name of this policy.
     */
    @Generated
    private String name;

    /*
     * A collection of exception rules on the exception policy.
     */
    @Generated
    private List<ExceptionRuleInternal> exceptionRules;

    /**
     * Creates an instance of ExceptionPolicyInternal class.
     */
    @Generated
    public ExceptionPolicyInternal() {
    }

    /**
     * Get the id property: Id of an exception policy.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: Friendly name of this policy.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Friendly name of this policy.
     *
     * @param name the name value to set.
     * @return the ExceptionPolicyInternal object itself.
     */
    @Generated
    public ExceptionPolicyInternal setName(String name) {
        this.name = name;
        this.updatedProperties.add("name");
        return this;
    }

    /**
     * Get the exceptionRules property: A collection of exception rules on the exception policy.
     *
     * @return the exceptionRules value.
     */
    @Generated
    public List<ExceptionRuleInternal> getExceptionRules() {
        return this.exceptionRules;
    }

    /*
     * The entity tag for this resource.
     */
    @Generated
    private String etag;

    /**
     * Get the etag property: The entity tag for this resource.
     *
     * @return the etag value.
     */
    @Generated
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the exceptionRules property: A collection of exception rules on the exception policy.
     *
     * @param exceptionRules the exceptionRules value to set.
     * @return the ExceptionPolicyInternal object itself.
     */
    @Generated
    public ExceptionPolicyInternal setExceptionRules(List<ExceptionRuleInternal> exceptionRules) {
        this.exceptionRules = exceptionRules;
        this.updatedProperties.add("exceptionRules");
        return this;
    }

    /**
     * Set id.
     *
     * @param id id.
     * @return this.
     */
    public ExceptionPolicyInternal setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Set etag
     *
     * @param etag etag.
     * @return this.
     */
    public ExceptionPolicyInternal setEtag(String etag) {
        this.etag = etag;
        return this;
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
        JsonMergePatchHelper.setExceptionPolicyInternalAccessor((model, jsonMergePatchEnabled) -> {
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
            jsonWriter.writeStringField("name", this.name);
            jsonWriter.writeArrayField("exceptionRules", this.exceptionRules,
                (writer, element) -> writer.writeJson(element));
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("name")) {
            if (this.name == null) {
                jsonWriter.writeNullField("name");
            } else {
                jsonWriter.writeStringField("name", this.name);
            }
        }
        if (updatedProperties.contains("exceptionRules")) {
            if (this.exceptionRules == null) {
                jsonWriter.writeNullField("exceptionRules");
            } else {
                jsonWriter.writeArrayField("exceptionRules", this.exceptionRules,
                    (writer, element) -> writer.writeJson(element));
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExceptionPolicyInternal from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExceptionPolicyInternal if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExceptionPolicyInternal.
     */
    @Generated
    public static ExceptionPolicyInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String etag = null;
            String id = null;
            String name = null;
            List<ExceptionRuleInternal> exceptionRules = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("etag".equals(fieldName)) {
                    etag = reader.getString();
                } else if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("exceptionRules".equals(fieldName)) {
                    exceptionRules = reader.readArray(reader1 -> ExceptionRuleInternal.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            ExceptionPolicyInternal deserializedExceptionPolicyInternal = new ExceptionPolicyInternal();
            deserializedExceptionPolicyInternal.etag = etag;
            deserializedExceptionPolicyInternal.id = id;
            deserializedExceptionPolicyInternal.name = name;
            deserializedExceptionPolicyInternal.exceptionRules = exceptionRules;
            return deserializedExceptionPolicyInternal;
        });
    }
}
