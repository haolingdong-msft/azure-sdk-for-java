// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The configuration parameters used while performing resilient VM deletion.
 */
@Fluent
public final class ResilientVMDeletionPolicy implements JsonSerializable<ResilientVMDeletionPolicy> {
    /*
     * Specifies whether resilient VM deletion should be enabled on the virtual machine scale set. The default value is
     * false.
     */
    private Boolean enabled;

    /**
     * Creates an instance of ResilientVMDeletionPolicy class.
     */
    public ResilientVMDeletionPolicy() {
    }

    /**
     * Get the enabled property: Specifies whether resilient VM deletion should be enabled on the virtual machine scale
     * set. The default value is false.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Specifies whether resilient VM deletion should be enabled on the virtual machine scale
     * set. The default value is false.
     * 
     * @param enabled the enabled value to set.
     * @return the ResilientVMDeletionPolicy object itself.
     */
    public ResilientVMDeletionPolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", this.enabled);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResilientVMDeletionPolicy from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResilientVMDeletionPolicy if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResilientVMDeletionPolicy.
     */
    public static ResilientVMDeletionPolicy fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResilientVMDeletionPolicy deserializedResilientVMDeletionPolicy = new ResilientVMDeletionPolicy();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedResilientVMDeletionPolicy.enabled = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResilientVMDeletionPolicy;
        });
    }
}
