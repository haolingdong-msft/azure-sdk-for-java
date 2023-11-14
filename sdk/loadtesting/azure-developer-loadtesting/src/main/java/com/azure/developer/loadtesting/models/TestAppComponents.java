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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Test app components.
 */
@Immutable
public final class TestAppComponents implements JsonSerializable<TestAppComponents> {

    /*
     * Azure resource collection { resource id (fully qualified resource Id e.g
     * subscriptions/{subId}/resourceGroups/{rg}/providers/Microsoft.LoadTestService/loadtests/{resName})
     * : resource object }
     */
    @Generated
    private final Map<String, AppComponent> components;

    /*
     * Test identifier
     */
    @Generated
    private String testId;

    /*
     * The creation datetime(ISO 8601 literal format).
     */
    @Generated
    private OffsetDateTime createdDateTime;

    /*
     * The user that created.
     */
    @Generated
    private String createdBy;

    /*
     * The last Modified datetime(ISO 8601 literal format).
     */
    @Generated
    private OffsetDateTime lastModifiedDateTime;

    /*
     * The user that last modified.
     */
    @Generated
    private String lastModifiedBy;

    /**
     * Creates an instance of TestAppComponents class.
     *
     * @param components the components value to set.
     */
    @Generated
    public TestAppComponents(Map<String, AppComponent> components) {
        this.components = components;
    }

    /**
     * Get the components property: Azure resource collection { resource id (fully qualified resource Id e.g
     * subscriptions/{subId}/resourceGroups/{rg}/providers/Microsoft.LoadTestService/loadtests/{resName})
     * : resource object }.
     *
     * @return the components value.
     */
    @Generated
    public Map<String, AppComponent> getComponents() {
        return this.components;
    }

    /**
     * Get the testId property: Test identifier.
     *
     * @return the testId value.
     */
    @Generated
    public String getTestId() {
        return this.testId;
    }

    /**
     * Get the createdDateTime property: The creation datetime(ISO 8601 literal format).
     *
     * @return the createdDateTime value.
     */
    @Generated
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the createdBy property: The user that created.
     *
     * @return the createdBy value.
     */
    @Generated
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Get the lastModifiedDateTime property: The last Modified datetime(ISO 8601 literal format).
     *
     * @return the lastModifiedDateTime value.
     */
    @Generated
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Get the lastModifiedBy property: The user that last modified.
     *
     * @return the lastModifiedBy value.
     */
    @Generated
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("components", this.components, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TestAppComponents from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TestAppComponents if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TestAppComponents.
     */
    public static TestAppComponents fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean componentsFound = false;
            Map<String, AppComponent> components = null;
            String testId = null;
            OffsetDateTime createdDateTime = null;
            String createdBy = null;
            OffsetDateTime lastModifiedDateTime = null;
            String lastModifiedBy = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("components".equals(fieldName)) {
                    components = reader.readMap(reader1 -> AppComponent.fromJson(reader1));
                    componentsFound = true;
                } else if ("testId".equals(fieldName)) {
                    testId = reader.getString();
                } else if ("createdDateTime".equals(fieldName)) {
                    createdDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("createdBy".equals(fieldName)) {
                    createdBy = reader.getString();
                } else if ("lastModifiedDateTime".equals(fieldName)) {
                    lastModifiedDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("lastModifiedBy".equals(fieldName)) {
                    lastModifiedBy = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (componentsFound) {
                TestAppComponents deserializedTestAppComponents = new TestAppComponents(components);
                deserializedTestAppComponents.testId = testId;
                deserializedTestAppComponents.createdDateTime = createdDateTime;
                deserializedTestAppComponents.createdBy = createdBy;
                deserializedTestAppComponents.lastModifiedDateTime = lastModifiedDateTime;
                deserializedTestAppComponents.lastModifiedBy = lastModifiedBy;
                return deserializedTestAppComponents;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!componentsFound) {
                missingProperties.add("components");
            }
            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
