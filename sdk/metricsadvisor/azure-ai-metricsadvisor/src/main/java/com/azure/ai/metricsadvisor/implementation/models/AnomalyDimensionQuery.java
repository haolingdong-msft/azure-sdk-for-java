// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The AnomalyDimensionQuery model.
 */
@Fluent
public final class AnomalyDimensionQuery implements JsonSerializable<AnomalyDimensionQuery> {
    /*
     * start time
     */
    private OffsetDateTime startTime;

    /*
     * end time
     */
    private OffsetDateTime endTime;

    /*
     * dimension to query
     */
    private String dimensionName;

    /*
     * The dimensionFilter property.
     */
    private DimensionGroupIdentity dimensionFilter;

    /**
     * Creates an instance of AnomalyDimensionQuery class.
     */
    public AnomalyDimensionQuery() {
    }

    /**
     * Get the startTime property: start time.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: start time.
     * 
     * @param startTime the startTime value to set.
     * @return the AnomalyDimensionQuery object itself.
     */
    public AnomalyDimensionQuery setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: end time.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: end time.
     * 
     * @param endTime the endTime value to set.
     * @return the AnomalyDimensionQuery object itself.
     */
    public AnomalyDimensionQuery setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the dimensionName property: dimension to query.
     * 
     * @return the dimensionName value.
     */
    public String getDimensionName() {
        return this.dimensionName;
    }

    /**
     * Set the dimensionName property: dimension to query.
     * 
     * @param dimensionName the dimensionName value to set.
     * @return the AnomalyDimensionQuery object itself.
     */
    public AnomalyDimensionQuery setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    /**
     * Get the dimensionFilter property: The dimensionFilter property.
     * 
     * @return the dimensionFilter value.
     */
    public DimensionGroupIdentity getDimensionFilter() {
        return this.dimensionFilter;
    }

    /**
     * Set the dimensionFilter property: The dimensionFilter property.
     * 
     * @param dimensionFilter the dimensionFilter value to set.
     * @return the AnomalyDimensionQuery object itself.
     */
    public AnomalyDimensionQuery setDimensionFilter(DimensionGroupIdentity dimensionFilter) {
        this.dimensionFilter = dimensionFilter;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("startTime", Objects.toString(this.startTime, null));
        jsonWriter.writeStringField("endTime", Objects.toString(this.endTime, null));
        jsonWriter.writeStringField("dimensionName", this.dimensionName);
        jsonWriter.writeJsonField("dimensionFilter", this.dimensionFilter);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AnomalyDimensionQuery from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AnomalyDimensionQuery if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AnomalyDimensionQuery.
     */
    public static AnomalyDimensionQuery fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AnomalyDimensionQuery deserializedAnomalyDimensionQuery = new AnomalyDimensionQuery();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("startTime".equals(fieldName)) {
                    deserializedAnomalyDimensionQuery.startTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("endTime".equals(fieldName)) {
                    deserializedAnomalyDimensionQuery.endTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("dimensionName".equals(fieldName)) {
                    deserializedAnomalyDimensionQuery.dimensionName = reader.getString();
                } else if ("dimensionFilter".equals(fieldName)) {
                    deserializedAnomalyDimensionQuery.dimensionFilter = DimensionGroupIdentity.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAnomalyDimensionQuery;
        });
    }
}
