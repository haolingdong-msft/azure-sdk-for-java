// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

/**
 * An offer of a job to a worker.
 */
@Immutable
public final class RouterJobOffer implements JsonSerializable<RouterJobOffer> {

    /*
     * Id of an offer.
     */
    @Generated
    private String offerId;

    /*
     * Id of the job.
     */
    @Generated
    private String jobId;

    /*
     * The capacity cost consumed by the job offer.
     */
    @Generated
    private int capacityCost;

    /*
     * Timestamp when the offer was created in UTC.
     */
    @Generated
    private OffsetDateTime offeredAt;

    /*
     * Timestamp when the offer will expire in UTC.
     */
    @Generated
    private OffsetDateTime expiresAt;

    /**
     * Get the offerId property: Id of an offer.
     *
     * @return the offerId value.
     */
    @Generated
    public String getOfferId() {
        return this.offerId;
    }

    /**
     * Get the jobId property: Id of the job.
     *
     * @return the jobId value.
     */
    @Generated
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Get the capacityCost property: The capacity cost consumed by the job offer.
     *
     * @return the capacityCost value.
     */
    @Generated
    public int getCapacityCost() {
        return this.capacityCost;
    }

    /**
     * Get the offeredAt property: Timestamp when the offer was created in UTC.
     *
     * @return the offeredAt value.
     */
    @Generated
    public OffsetDateTime getOfferedAt() {
        return this.offeredAt;
    }

    /**
     * Get the expiresAt property: Timestamp when the offer will expire in UTC.
     *
     * @return the expiresAt value.
     */
    @Generated
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }

    @Generated
    private boolean jsonMergePatch;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setRouterJobOfferAccessor((model, jsonMergePatchEnabled) -> {
            model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
            return model;
        });
    }

    /**
     * Creates an instance of RouterJobOffer class.
     */
    @Generated
    private RouterJobOffer() {
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeStringField("jobId", this.jobId);
            jsonWriter.writeIntField("capacityCost", this.capacityCost);
            jsonWriter.writeStringField("offeredAt",
                this.offeredAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.offeredAt));
            jsonWriter.writeStringField("expiresAt",
                this.expiresAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expiresAt));
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (updatedProperties.contains("jobId")) {
            if (this.jobId == null) {
                jsonWriter.writeNullField("jobId");
            } else {
                jsonWriter.writeStringField("jobId", this.jobId);
            }
        }
        jsonWriter.writeIntField("capacityCost", this.capacityCost);
        if (updatedProperties.contains("offeredAt")) {
            if (this.offeredAt == null) {
                jsonWriter.writeNullField("offeredAt");
            } else {
                jsonWriter.writeStringField("offeredAt",
                    this.offeredAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.offeredAt));
            }
        }
        if (updatedProperties.contains("expiresAt")) {
            if (this.expiresAt == null) {
                jsonWriter.writeNullField("expiresAt");
            } else {
                jsonWriter.writeStringField("expiresAt",
                    this.expiresAt == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.expiresAt));
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RouterJobOffer from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of RouterJobOffer if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RouterJobOffer.
     */
    @Generated
    public static RouterJobOffer fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String offerId = null;
            String jobId = null;
            int capacityCost = 0;
            OffsetDateTime offeredAt = null;
            OffsetDateTime expiresAt = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("offerId".equals(fieldName)) {
                    offerId = reader.getString();
                } else if ("jobId".equals(fieldName)) {
                    jobId = reader.getString();
                } else if ("capacityCost".equals(fieldName)) {
                    capacityCost = reader.getInt();
                } else if ("offeredAt".equals(fieldName)) {
                    offeredAt = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("expiresAt".equals(fieldName)) {
                    expiresAt = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }
            RouterJobOffer deserializedRouterJobOffer = new RouterJobOffer();
            deserializedRouterJobOffer.offerId = offerId;
            deserializedRouterJobOffer.jobId = jobId;
            deserializedRouterJobOffer.capacityCost = capacityCost;
            deserializedRouterJobOffer.offeredAt = offeredAt;
            deserializedRouterJobOffer.expiresAt = expiresAt;
            return deserializedRouterJobOffer;
        });
    }
}
