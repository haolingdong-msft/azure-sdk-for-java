// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** Specifies the identity for a datasource to use. */
@Immutable
public final class SearchIndexerDataUserAssignedIdentity extends SearchIndexerDataIdentity {
    /*
     * Identifies the concrete type of the identity.
     */
    private static final String ODATA_TYPE = "#Microsoft.Azure.Search.DataUserAssignedIdentity";

    /*
     * The fully qualified Azure resource Id of a user assigned managed identity typically in the form
     * "/subscriptions/12345678-1234-1234-1234-1234567890ab/resourceGroups/rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myId"
     * that should have been assigned to the search service.
     */
    private final String userAssignedIdentity;

    /**
     * Creates an instance of SearchIndexerDataUserAssignedIdentity class.
     *
     * @param userAssignedIdentity the userAssignedIdentity value to set.
     */
    public SearchIndexerDataUserAssignedIdentity(String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
    }

    /**
     * Get the userAssignedIdentity property: The fully qualified Azure resource Id of a user assigned managed identity
     * typically in the form
     * "/subscriptions/12345678-1234-1234-1234-1234567890ab/resourceGroups/rg/providers/Microsoft.ManagedIdentity/userAssignedIdentities/myId"
     * that should have been assigned to the search service.
     *
     * @return the userAssignedIdentity value.
     */
    public String getUserAssignedIdentity() {
        return this.userAssignedIdentity;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", ODATA_TYPE);
        jsonWriter.writeStringField("userAssignedIdentity", this.userAssignedIdentity);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SearchIndexerDataUserAssignedIdentity from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SearchIndexerDataUserAssignedIdentity if the JsonReader was pointing to an instance of it,
     *     or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the SearchIndexerDataUserAssignedIdentity.
     */
    public static SearchIndexerDataUserAssignedIdentity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean userAssignedIdentityFound = false;
                    String userAssignedIdentity = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!ODATA_TYPE.equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '"
                                                + ODATA_TYPE
                                                + "'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("userAssignedIdentity".equals(fieldName)) {
                            userAssignedIdentity = reader.getString();
                            userAssignedIdentityFound = true;
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (userAssignedIdentityFound) {
                        SearchIndexerDataUserAssignedIdentity deserializedValue =
                                new SearchIndexerDataUserAssignedIdentity(userAssignedIdentity);

                        return deserializedValue;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!userAssignedIdentityFound) {
                        missingProperties.add("userAssignedIdentity");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
