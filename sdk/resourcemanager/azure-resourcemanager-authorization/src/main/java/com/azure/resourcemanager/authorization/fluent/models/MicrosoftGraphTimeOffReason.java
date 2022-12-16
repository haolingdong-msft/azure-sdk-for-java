// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** timeOffReason. */
@Fluent
public final class MicrosoftGraphTimeOffReason extends MicrosoftGraphChangeTrackedEntity {
    /*
     * The name of the timeOffReason. Required.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * timeOffReasonIconType
     */
    @JsonProperty(value = "iconType")
    private MicrosoftGraphTimeOffReasonIconType iconType;

    /*
     * Indicates whether the timeOffReason can be used when creating new entities or updating existing ones. Required.
     */
    @JsonProperty(value = "isActive")
    private Boolean isActive;

    /*
     * timeOffReason
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphTimeOffReason class. */
    public MicrosoftGraphTimeOffReason() {
    }

    /**
     * Get the displayName property: The name of the timeOffReason. Required.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the timeOffReason. Required.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphTimeOffReason object itself.
     */
    public MicrosoftGraphTimeOffReason withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the iconType property: timeOffReasonIconType.
     *
     * @return the iconType value.
     */
    public MicrosoftGraphTimeOffReasonIconType iconType() {
        return this.iconType;
    }

    /**
     * Set the iconType property: timeOffReasonIconType.
     *
     * @param iconType the iconType value to set.
     * @return the MicrosoftGraphTimeOffReason object itself.
     */
    public MicrosoftGraphTimeOffReason withIconType(MicrosoftGraphTimeOffReasonIconType iconType) {
        this.iconType = iconType;
        return this;
    }

    /**
     * Get the isActive property: Indicates whether the timeOffReason can be used when creating new entities or updating
     * existing ones. Required.
     *
     * @return the isActive value.
     */
    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * Set the isActive property: Indicates whether the timeOffReason can be used when creating new entities or updating
     * existing ones. Required.
     *
     * @param isActive the isActive value to set.
     * @return the MicrosoftGraphTimeOffReason object itself.
     */
    public MicrosoftGraphTimeOffReason withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     * Get the additionalProperties property: timeOffReason.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: timeOffReason.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTimeOffReason object itself.
     */
    public MicrosoftGraphTimeOffReason withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTimeOffReason withCreatedDateTime(OffsetDateTime createdDateTime) {
        super.withCreatedDateTime(createdDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTimeOffReason withLastModifiedBy(MicrosoftGraphIdentitySet lastModifiedBy) {
        super.withLastModifiedBy(lastModifiedBy);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTimeOffReason withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        super.withLastModifiedDateTime(lastModifiedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTimeOffReason withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
