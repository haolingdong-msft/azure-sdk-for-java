// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of the scheduled action notification. */
@Fluent
public final class NotificationProperties {
    /*
     * Array of email addresses.
     */
    @JsonProperty(value = "to", required = true)
    private List<String> to;

    /*
     * Locale of the email.
     */
    @JsonProperty(value = "language")
    private String language;

    /*
     * Optional message to be added in the email. Length is limited to 250 characters.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Regional format used for formatting date/time and currency values in the email.
     */
    @JsonProperty(value = "regionalFormat")
    private String regionalFormat;

    /*
     * Subject of the email. Length is limited to 70 characters.
     */
    @JsonProperty(value = "subject", required = true)
    private String subject;

    /** Creates an instance of NotificationProperties class. */
    public NotificationProperties() {
    }

    /**
     * Get the to property: Array of email addresses.
     *
     * @return the to value.
     */
    public List<String> to() {
        return this.to;
    }

    /**
     * Set the to property: Array of email addresses.
     *
     * @param to the to value to set.
     * @return the NotificationProperties object itself.
     */
    public NotificationProperties withTo(List<String> to) {
        this.to = to;
        return this;
    }

    /**
     * Get the language property: Locale of the email.
     *
     * @return the language value.
     */
    public String language() {
        return this.language;
    }

    /**
     * Set the language property: Locale of the email.
     *
     * @param language the language value to set.
     * @return the NotificationProperties object itself.
     */
    public NotificationProperties withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the message property: Optional message to be added in the email. Length is limited to 250 characters.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Optional message to be added in the email. Length is limited to 250 characters.
     *
     * @param message the message value to set.
     * @return the NotificationProperties object itself.
     */
    public NotificationProperties withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the regionalFormat property: Regional format used for formatting date/time and currency values in the email.
     *
     * @return the regionalFormat value.
     */
    public String regionalFormat() {
        return this.regionalFormat;
    }

    /**
     * Set the regionalFormat property: Regional format used for formatting date/time and currency values in the email.
     *
     * @param regionalFormat the regionalFormat value to set.
     * @return the NotificationProperties object itself.
     */
    public NotificationProperties withRegionalFormat(String regionalFormat) {
        this.regionalFormat = regionalFormat;
        return this;
    }

    /**
     * Get the subject property: Subject of the email. Length is limited to 70 characters.
     *
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set the subject property: Subject of the email. Length is limited to 70 characters.
     *
     * @param subject the subject value to set.
     * @return the NotificationProperties object itself.
     */
    public NotificationProperties withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (to() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property to in model NotificationProperties"));
        }
        if (subject() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property subject in model NotificationProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NotificationProperties.class);
}
