// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Associated metric definition for particular metrics of the azure resource (
 * Refer :
 * https://docs.microsoft.com/en-us/rest/api/monitor/metric-definitions/list#metricdefinition).
 */
@Fluent
public final class ResourceMetric implements JsonSerializable<ResourceMetric> {
    /*
     * Unique name for metric.
     */
    @Generated
    private String id;

    /*
     * Azure resource id.
     */
    @Generated
    private final String resourceId;

    /*
     * Metric name space.
     */
    @Generated
    private final String metricNamespace;

    /*
     * Metric description.
     */
    @Generated
    private String displayDescription;

    /*
     * The invariant value of metric name
     */
    @Generated
    private final String name;

    /*
     * Metric aggregation.
     */
    @Generated
    private final String aggregation;

    /*
     * Metric unit.
     */
    @Generated
    private String unit;

    /*
     * Azure resource type.
     */
    @Generated
    private final String resourceType;

    /**
     * Creates an instance of ResourceMetric class.
     * 
     * @param resourceId the resourceId value to set.
     * @param metricNamespace the metricNamespace value to set.
     * @param name the name value to set.
     * @param aggregation the aggregation value to set.
     * @param resourceType the resourceType value to set.
     */
    @Generated
    public ResourceMetric(String resourceId, String metricNamespace, String name, String aggregation,
        String resourceType) {
        this.resourceId = resourceId;
        this.metricNamespace = metricNamespace;
        this.name = name;
        this.aggregation = aggregation;
        this.resourceType = resourceType;
    }

    /**
     * Get the id property: Unique name for metric.
     * 
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the resourceId property: Azure resource id.
     * 
     * @return the resourceId value.
     */
    @Generated
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Get the metricNamespace property: Metric name space.
     * 
     * @return the metricNamespace value.
     */
    @Generated
    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    /**
     * Get the displayDescription property: Metric description.
     * 
     * @return the displayDescription value.
     */
    @Generated
    public String getDisplayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: Metric description.
     * 
     * @param displayDescription the displayDescription value to set.
     * @return the ResourceMetric object itself.
     */
    @Generated
    public ResourceMetric setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the name property: The invariant value of metric name.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the aggregation property: Metric aggregation.
     * 
     * @return the aggregation value.
     */
    @Generated
    public String getAggregation() {
        return this.aggregation;
    }

    /**
     * Get the unit property: Metric unit.
     * 
     * @return the unit value.
     */
    @Generated
    public String getUnit() {
        return this.unit;
    }

    /**
     * Set the unit property: Metric unit.
     * 
     * @param unit the unit value to set.
     * @return the ResourceMetric object itself.
     */
    @Generated
    public ResourceMetric setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the resourceType property: Azure resource type.
     * 
     * @return the resourceType value.
     */
    @Generated
    public String getResourceType() {
        return this.resourceType;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeStringField("metricNamespace", this.metricNamespace);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("aggregation", this.aggregation);
        jsonWriter.writeStringField("resourceType", this.resourceType);
        jsonWriter.writeStringField("displayDescription", this.displayDescription);
        jsonWriter.writeStringField("unit", this.unit);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceMetric from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceMetric if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ResourceMetric.
     */
    public static ResourceMetric fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String resourceId = null;
            String metricNamespace = null;
            String name = null;
            String aggregation = null;
            String resourceType = null;
            String id = null;
            String displayDescription = null;
            String unit = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("resourceId".equals(fieldName)) {
                    resourceId = reader.getString();
                } else if ("metricNamespace".equals(fieldName)) {
                    metricNamespace = reader.getString();
                } else if ("name".equals(fieldName)) {
                    name = reader.getString();
                } else if ("aggregation".equals(fieldName)) {
                    aggregation = reader.getString();
                } else if ("resourceType".equals(fieldName)) {
                    resourceType = reader.getString();
                } else if ("id".equals(fieldName)) {
                    id = reader.getString();
                } else if ("displayDescription".equals(fieldName)) {
                    displayDescription = reader.getString();
                } else if ("unit".equals(fieldName)) {
                    unit = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            ResourceMetric deserializedResourceMetric
                = new ResourceMetric(resourceId, metricNamespace, name, aggregation, resourceType);
            deserializedResourceMetric.id = id;
            deserializedResourceMetric.displayDescription = displayDescription;
            deserializedResourceMetric.unit = unit;

            return deserializedResourceMetric;
        });
    }
}
