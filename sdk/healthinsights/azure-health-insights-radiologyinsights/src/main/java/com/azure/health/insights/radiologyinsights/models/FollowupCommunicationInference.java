// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.health.insights.radiologyinsights.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Follow-up communication involves the exchange of important information, recommendations, or updates between
 * radiologists and other healthcare professionals involved in a patient's care.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "kind",
    defaultImpl = FollowupCommunicationInference.class,
    visible = true)
@JsonTypeName("followupCommunication")
@Immutable
public final class FollowupCommunicationInference extends RadiologyInsightsInference {

    /*
     * Discriminator property for RadiologyInsightsInference.
     */
    @Generated
    @JsonTypeId
    @JsonProperty(value = "kind")
    private RadiologyInsightsInferenceType kind = RadiologyInsightsInferenceType.FOLLOWUP_COMMUNICATION;

    /*
     * Communication date and time.
     */
    @Generated
    @JsonProperty(value = "dateTime")
    private List<OffsetDateTime> dateTime;

    /*
     * Recipient of the communication.
     */
    @Generated
    @JsonProperty(value = "recipient")
    private List<MedicalProfessionalType> recipient;

    /*
     * Communication was acknowledged.
     */
    @Generated
    @JsonProperty(value = "wasAcknowledged")
    private final boolean wasAcknowledged;

    /**
     * Creates an instance of FollowupCommunicationInference class.
     *
     * @param wasAcknowledged the wasAcknowledged value to set.
     */
    @Generated
    @JsonCreator
    private FollowupCommunicationInference(@JsonProperty(value = "wasAcknowledged") boolean wasAcknowledged) {
        this.wasAcknowledged = wasAcknowledged;
    }

    /**
     * Get the kind property: Discriminator property for RadiologyInsightsInference.
     *
     * @return the kind value.
     */
    @Generated
    public RadiologyInsightsInferenceType getKind() {
        return this.kind;
    }

    /**
     * Get the dateTime property: Communication date and time.
     *
     * @return the dateTime value.
     */
    @Generated
    public List<OffsetDateTime> getDateTime() {
        return this.dateTime;
    }

    /**
     * Get the recipient property: Recipient of the communication.
     *
     * @return the recipient value.
     */
    @Generated
    public List<MedicalProfessionalType> getRecipient() {
        return this.recipient;
    }

    /**
     * Get the wasAcknowledged property: Communication was acknowledged.
     *
     * @return the wasAcknowledged value.
     */
    @Generated
    public boolean isWasAcknowledged() {
        return this.wasAcknowledged;
    }
}
