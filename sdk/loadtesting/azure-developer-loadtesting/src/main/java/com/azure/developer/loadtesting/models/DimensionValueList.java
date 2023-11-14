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
 * Metrics dimension values.
 */
@Immutable
public final class DimensionValueList implements JsonSerializable<DimensionValueList> {

    /*
     * The dimension name
     */
    @Generated
    private String name;

    /*
     * The dimension value
     */
    @Generated
    private List<String> value;

    /*
     * Link for the next set of values in case of paginated results, if applicable.
     */
    @Generated
    private String nextLink;

    /**
     * Creates an instance of DimensionValueList class.
     */
    @Generated
    private DimensionValueList() {
    }

    /**
     * Get the name property: The dimension name.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the value property: The dimension value.
     *
     * @return the value value.
     */
    @Generated
    public List<String> getValue() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link for the next set of values in case of paginated results, if applicable.
     *
     * @return the nextLink value.
     */
    @Generated
    public String getNextLink() {
        return this.nextLink;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DimensionValueList from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DimensionValueList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the DimensionValueList.
     */
    public static DimensionValueList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DimensionValueList deserializedDimensionValueList = new DimensionValueList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("name".equals(fieldName)) {
                    deserializedDimensionValueList.name = reader.getString();
                } else if ("value".equals(fieldName)) {
                    List<String> value = reader.readArray(reader1 -> reader1.getString());
                    deserializedDimensionValueList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedDimensionValueList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedDimensionValueList;
        });
    }
}
