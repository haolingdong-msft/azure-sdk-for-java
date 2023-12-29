// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Represents collection of metric namespaces.
 */
@Immutable
public final class MetricNamespaceCollection implements JsonSerializable<MetricNamespaceCollection> {
    /*
     * The values for the metric namespaces.
     */
    @Generated
    private final List<MetricNamespace> value;

    /**
     * Creates an instance of MetricNamespaceCollection class.
     * 
     * @param value the value value to set.
     */
    @Generated
    private MetricNamespaceCollection(List<MetricNamespace> value) {
        this.value = value;
    }

    /**
     * Get the value property: The values for the metric namespaces.
     * 
     * @return the value value.
     */
    @Generated
    public List<MetricNamespace> getValue() {
        return this.value;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricNamespaceCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricNamespaceCollection if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MetricNamespaceCollection.
     */
    public static MetricNamespaceCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            List<MetricNamespace> value = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    value = reader.readArray(reader1 -> MetricNamespace.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            return new MetricNamespaceCollection(value);
        });
    }
}
