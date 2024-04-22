// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.devcenter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Stop on disconnect configuration settings for Dev Boxes created in this pool.
 */
@Immutable
public final class StopOnDisconnectConfiguration implements JsonSerializable<StopOnDisconnectConfiguration> {

    /*
     * Indicates whether the feature to stop the devbox on disconnect once the grace
     * period has lapsed is enabled.
     */
    @Generated
    private final StopOnDisconnectStatus status;

    /*
     * The specified time in minutes to wait before stopping a Dev Box once disconnect
     * is detected.
     */
    @Generated
    private Integer gracePeriodMinutes;

    /**
     * Creates an instance of StopOnDisconnectConfiguration class.
     *
     * @param status the status value to set.
     */
    @Generated
    private StopOnDisconnectConfiguration(StopOnDisconnectStatus status) {
        this.status = status;
    }

    /**
     * Get the status property: Indicates whether the feature to stop the devbox on disconnect once the grace
     * period has lapsed is enabled.
     *
     * @return the status value.
     */
    @Generated
    public StopOnDisconnectStatus getStatus() {
        return this.status;
    }

    /**
     * Get the gracePeriodMinutes property: The specified time in minutes to wait before stopping a Dev Box once
     * disconnect
     * is detected.
     *
     * @return the gracePeriodMinutes value.
     */
    @Generated
    public Integer getGracePeriodMinutes() {
        return this.gracePeriodMinutes;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeNumberField("gracePeriodMinutes", this.gracePeriodMinutes);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of StopOnDisconnectConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of StopOnDisconnectConfiguration if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the StopOnDisconnectConfiguration.
     */
    @Generated
    public static StopOnDisconnectConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            StopOnDisconnectStatus status = null;
            Integer gracePeriodMinutes = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("status".equals(fieldName)) {
                    status = StopOnDisconnectStatus.fromString(reader.getString());
                } else if ("gracePeriodMinutes".equals(fieldName)) {
                    gracePeriodMinutes = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }
            StopOnDisconnectConfiguration deserializedStopOnDisconnectConfiguration
                = new StopOnDisconnectConfiguration(status);
            deserializedStopOnDisconnectConfiguration.gracePeriodMinutes = gracePeriodMinutes;
            return deserializedStopOnDisconnectConfiguration;
        });
    }
}
