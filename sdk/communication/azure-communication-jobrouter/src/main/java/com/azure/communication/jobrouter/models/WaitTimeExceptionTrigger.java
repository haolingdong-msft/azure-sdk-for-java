// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.time.Duration;
import com.azure.communication.jobrouter.implementation.utils.CustomizationHelper;

/**
 * Trigger for an exception action on exceeding wait time.
 */
@Fluent
public final class WaitTimeExceptionTrigger extends ExceptionTrigger {

    /*
     * The type discriminator describing a sub-type of ExceptionTrigger.
     */
    @Generated
    private ExceptionTriggerKind kind = ExceptionTriggerKind.WAIT_TIME;

    /*
     * Threshold for wait time for this trigger.
     */
    @Generated
    private Duration thresholdSeconds;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    /**
     * Creates an instance of WaitTimeExceptionTrigger class.
     */
    @Generated
    public WaitTimeExceptionTrigger() {
    }

    /**
     * Get the kind property: The type discriminator describing a sub-type of ExceptionTrigger.
     *
     * @return the kind value.
     */
    @Generated
    public ExceptionTriggerKind getKind() {
        return this.kind;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (JsonMergePatchHelper.getExceptionTriggerAccessor().isJsonMergePatch(this)) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
            CustomizationHelper.serializeDurationToSeconds(jsonWriter, "thresholdSeconds", this.thresholdSeconds);
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("kind", this.kind.toString());
        if (updatedProperties.contains("thresholdSeconds")) {
            CustomizationHelper.serializeDurationToSeconds(jsonWriter, "thresholdSeconds", this.thresholdSeconds);
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WaitTimeExceptionTrigger from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of WaitTimeExceptionTrigger if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WaitTimeExceptionTrigger.
     */
    @Generated
    public static WaitTimeExceptionTrigger fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WaitTimeExceptionTrigger deserializedWaitTimeExceptionTrigger = new WaitTimeExceptionTrigger();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("kind".equals(fieldName)) {
                    deserializedWaitTimeExceptionTrigger.kind = ExceptionTriggerKind.fromString(reader.getString());
                } else if ("thresholdSeconds".equals(fieldName)) {
                    deserializedWaitTimeExceptionTrigger.thresholdSeconds
                        = CustomizationHelper.deserializeDurationFromSeconds(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedWaitTimeExceptionTrigger;
        });
    }

    /**
     * Get the thresholdSeconds property: Threshold for wait time for this trigger.
     *
     * @return the thresholdSeconds value.
     */
    @Generated
    public Duration getThreshold() {
        return this.thresholdSeconds;
    }

    /**
     * Set the thresholdSeconds property: Threshold for wait time for this trigger.
     * <p>Required when create the resource.</p>
     *
     * @param thresholdSeconds the thresholdSeconds value to set.
     * @return the WaitTimeExceptionTrigger object itself.
     */
    @Generated
    public WaitTimeExceptionTrigger setThreshold(Duration thresholdSeconds) {
        this.thresholdSeconds = thresholdSeconds;
        this.updatedProperties.add("thresholdSeconds");
        return this;
    }

    /**
     * Creates an instance of WaitTimeExceptionTrigger class.
     *
     * @param thresholdSeconds the thresholdSeconds value to set.
     */
    public WaitTimeExceptionTrigger(Duration thresholdSeconds) {
        this.thresholdSeconds = thresholdSeconds;
        this.updatedProperties.add("thresholdSeconds");
    }
}
