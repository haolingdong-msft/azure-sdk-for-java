// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes an available Compute SKU Location Information.
 */
@Immutable
public final class ResourceSkuLocationInfo implements JsonSerializable<ResourceSkuLocationInfo> {
    /*
     * Location of the SKU
     */
    private String location;

    /*
     * List of availability zones where the SKU is supported.
     */
    private List<String> zones;

    /*
     * Details of capabilities available to a SKU in specific zones.
     */
    private List<ResourceSkuZoneDetails> zoneDetails;

    /*
     * The names of extended locations.
     */
    private List<String> extendedLocations;

    /*
     * The type of the extended location.
     */
    private ExtendedLocationType type;

    /**
     * Creates an instance of ResourceSkuLocationInfo class.
     */
    public ResourceSkuLocationInfo() {
    }

    /**
     * Get the location property: Location of the SKU.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the zones property: List of availability zones where the SKU is supported.
     * 
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Get the zoneDetails property: Details of capabilities available to a SKU in specific zones.
     * 
     * @return the zoneDetails value.
     */
    public List<ResourceSkuZoneDetails> zoneDetails() {
        return this.zoneDetails;
    }

    /**
     * Get the extendedLocations property: The names of extended locations.
     * 
     * @return the extendedLocations value.
     */
    public List<String> extendedLocations() {
        return this.extendedLocations;
    }

    /**
     * Get the type property: The type of the extended location.
     * 
     * @return the type value.
     */
    public ExtendedLocationType type() {
        return this.type;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (zoneDetails() != null) {
            zoneDetails().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceSkuLocationInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceSkuLocationInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceSkuLocationInfo.
     */
    public static ResourceSkuLocationInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceSkuLocationInfo deserializedResourceSkuLocationInfo = new ResourceSkuLocationInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedResourceSkuLocationInfo.location = reader.getString();
                } else if ("zones".equals(fieldName)) {
                    List<String> zones = reader.readArray(reader1 -> reader1.getString());
                    deserializedResourceSkuLocationInfo.zones = zones;
                } else if ("zoneDetails".equals(fieldName)) {
                    List<ResourceSkuZoneDetails> zoneDetails
                        = reader.readArray(reader1 -> ResourceSkuZoneDetails.fromJson(reader1));
                    deserializedResourceSkuLocationInfo.zoneDetails = zoneDetails;
                } else if ("extendedLocations".equals(fieldName)) {
                    List<String> extendedLocations = reader.readArray(reader1 -> reader1.getString());
                    deserializedResourceSkuLocationInfo.extendedLocations = extendedLocations;
                } else if ("type".equals(fieldName)) {
                    deserializedResourceSkuLocationInfo.type = ExtendedLocationType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceSkuLocationInfo;
        });
    }
}
