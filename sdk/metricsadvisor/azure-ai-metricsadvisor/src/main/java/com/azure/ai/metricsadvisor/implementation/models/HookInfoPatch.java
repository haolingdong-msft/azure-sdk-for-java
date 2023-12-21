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
import java.util.List;

/**
 * The HookInfoPatch model.
 */
@Fluent
public class HookInfoPatch implements JsonSerializable<HookInfoPatch> {
    /*
     * hook unique name
     */
    private String hookName;

    /*
     * hook description
     */
    private String description;

    /*
     * hook external link
     */
    private String externalLink;

    /*
     * hook administrators
     */
    private List<String> admins;

    /**
     * Creates an instance of HookInfoPatch class.
     */
    public HookInfoPatch() {
    }

    /**
     * Get the hookName property: hook unique name.
     * 
     * @return the hookName value.
     */
    public String getHookName() {
        return this.hookName;
    }

    /**
     * Set the hookName property: hook unique name.
     * 
     * @param hookName the hookName value to set.
     * @return the HookInfoPatch object itself.
     */
    public HookInfoPatch setHookName(String hookName) {
        this.hookName = hookName;
        return this;
    }

    /**
     * Get the description property: hook description.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: hook description.
     * 
     * @param description the description value to set.
     * @return the HookInfoPatch object itself.
     */
    public HookInfoPatch setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the externalLink property: hook external link.
     * 
     * @return the externalLink value.
     */
    public String getExternalLink() {
        return this.externalLink;
    }

    /**
     * Set the externalLink property: hook external link.
     * 
     * @param externalLink the externalLink value to set.
     * @return the HookInfoPatch object itself.
     */
    public HookInfoPatch setExternalLink(String externalLink) {
        this.externalLink = externalLink;
        return this;
    }

    /**
     * Get the admins property: hook administrators.
     * 
     * @return the admins value.
     */
    public List<String> getAdmins() {
        return this.admins;
    }

    /**
     * Set the admins property: hook administrators.
     * 
     * @param admins the admins value to set.
     * @return the HookInfoPatch object itself.
     */
    public HookInfoPatch setAdmins(List<String> admins) {
        this.admins = admins;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("hookName", this.hookName);
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("externalLink", this.externalLink);
        jsonWriter.writeArrayField("admins", this.admins, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HookInfoPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HookInfoPatch if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing the polymorphic discriminator.
     * @throws IOException If an error occurs while reading the HookInfoPatch.
     */
    public static HookInfoPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String discriminatorValue = null;
            JsonReader readerToUse = reader.bufferObject();

            readerToUse.nextToken(); // Prepare for reading
            while (readerToUse.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = readerToUse.getFieldName();
                readerToUse.nextToken();
                if ("hookType".equals(fieldName)) {
                    discriminatorValue = readerToUse.getString();
                    break;
                } else {
                    readerToUse.skipChildren();
                }
            }

            if (discriminatorValue != null) {
                readerToUse = readerToUse.reset();
            }
            // Use the discriminator value to determine which subtype should be deserialized.
            if ("Email".equals(discriminatorValue)) {
                return EmailHookInfoPatch.fromJson(readerToUse);
            } else if ("Webhook".equals(discriminatorValue)) {
                return WebhookHookInfoPatch.fromJson(readerToUse);
            } else {
                throw new IllegalStateException(
                    "Discriminator field 'hookType' didn't match one of the expected values 'Email', or 'Webhook'. It was: '"
                        + discriminatorValue + "'.");
            }
        });
    }
}
