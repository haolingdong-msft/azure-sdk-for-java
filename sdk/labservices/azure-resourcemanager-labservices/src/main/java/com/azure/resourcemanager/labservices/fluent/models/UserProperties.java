// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.labservices.models.InvitationState;
import com.azure.resourcemanager.labservices.models.ProvisioningState;
import com.azure.resourcemanager.labservices.models.RegistrationState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/** User resource properties. */
@Fluent
public final class UserProperties extends UserUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserProperties.class);

    /*
     * Current provisioning state of the user resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Display name of the user, for example user's full name.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * Email address of the user.
     */
    @JsonProperty(value = "email", required = true)
    private String email;

    /*
     * State of the user's registration within the lab.
     */
    @JsonProperty(value = "registrationState", access = JsonProperty.Access.WRITE_ONLY)
    private RegistrationState registrationState;

    /*
     * State of the invitation message for the user.
     */
    @JsonProperty(value = "invitationState", access = JsonProperty.Access.WRITE_ONLY)
    private InvitationState invitationState;

    /*
     * Date and time when the invitation message was sent to the user.
     */
    @JsonProperty(value = "invitationSent", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime invitationSent;

    /*
     * How long the user has used their virtual machines in this lab.
     */
    @JsonProperty(value = "totalUsage", access = JsonProperty.Access.WRITE_ONLY)
    private Duration totalUsage;

    /**
     * Get the provisioningState property: Current provisioning state of the user resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the displayName property: Display name of the user, for example user's full name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the email property: Email address of the user.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: Email address of the user.
     *
     * @param email the email value to set.
     * @return the UserProperties object itself.
     */
    public UserProperties withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the registrationState property: State of the user's registration within the lab.
     *
     * @return the registrationState value.
     */
    public RegistrationState registrationState() {
        return this.registrationState;
    }

    /**
     * Get the invitationState property: State of the invitation message for the user.
     *
     * @return the invitationState value.
     */
    public InvitationState invitationState() {
        return this.invitationState;
    }

    /**
     * Get the invitationSent property: Date and time when the invitation message was sent to the user.
     *
     * @return the invitationSent value.
     */
    public OffsetDateTime invitationSent() {
        return this.invitationSent;
    }

    /**
     * Get the totalUsage property: How long the user has used their virtual machines in this lab.
     *
     * @return the totalUsage value.
     */
    public Duration totalUsage() {
        return this.totalUsage;
    }

    /** {@inheritDoc} */
    @Override
    public UserProperties withAdditionalUsageQuota(Duration additionalUsageQuota) {
        super.withAdditionalUsageQuota(additionalUsageQuota);
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
        if (email() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property email in model UserProperties"));
        }
    }
}
