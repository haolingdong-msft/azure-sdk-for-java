// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.models.ChannelProvisioningState;
import com.azure.resourcemanager.eventgrid.models.ChannelType;
import com.azure.resourcemanager.eventgrid.models.PartnerTopicInfo;
import com.azure.resourcemanager.eventgrid.models.ReadinessState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of the Channel. */
@Fluent
public final class ChannelProperties {
    /*
     * The type of the event channel which represents the direction flow of
     * events.
     */
    @JsonProperty(value = "channelType")
    private ChannelType channelType;

    /*
     * This property should be populated when channelType is PartnerTopic and
     * represents information about the partner topic resource corresponding to
     * the channel.
     */
    @JsonProperty(value = "partnerTopicInfo")
    private PartnerTopicInfo partnerTopicInfo;

    /*
     * Context or helpful message that can be used during the approval process
     * by the subscriber.
     */
    @JsonProperty(value = "messageForActivation")
    private String messageForActivation;

    /*
     * Provisioning state of the channel.
     */
    @JsonProperty(value = "provisioningState")
    private ChannelProvisioningState provisioningState;

    /*
     * The readiness state of the corresponding partner topic.
     */
    @JsonProperty(value = "readinessState")
    private ReadinessState readinessState;

    /*
     * Expiration time of the channel. If this timer expires while the
     * corresponding partner topic is never activated,
     * the channel and corresponding partner topic are deleted.
     */
    @JsonProperty(value = "expirationTimeIfNotActivatedUtc")
    private OffsetDateTime expirationTimeIfNotActivatedUtc;

    /**
     * Get the channelType property: The type of the event channel which represents the direction flow of events.
     *
     * @return the channelType value.
     */
    public ChannelType channelType() {
        return this.channelType;
    }

    /**
     * Set the channelType property: The type of the event channel which represents the direction flow of events.
     *
     * @param channelType the channelType value to set.
     * @return the ChannelProperties object itself.
     */
    public ChannelProperties withChannelType(ChannelType channelType) {
        this.channelType = channelType;
        return this;
    }

    /**
     * Get the partnerTopicInfo property: This property should be populated when channelType is PartnerTopic and
     * represents information about the partner topic resource corresponding to the channel.
     *
     * @return the partnerTopicInfo value.
     */
    public PartnerTopicInfo partnerTopicInfo() {
        return this.partnerTopicInfo;
    }

    /**
     * Set the partnerTopicInfo property: This property should be populated when channelType is PartnerTopic and
     * represents information about the partner topic resource corresponding to the channel.
     *
     * @param partnerTopicInfo the partnerTopicInfo value to set.
     * @return the ChannelProperties object itself.
     */
    public ChannelProperties withPartnerTopicInfo(PartnerTopicInfo partnerTopicInfo) {
        this.partnerTopicInfo = partnerTopicInfo;
        return this;
    }

    /**
     * Get the messageForActivation property: Context or helpful message that can be used during the approval process by
     * the subscriber.
     *
     * @return the messageForActivation value.
     */
    public String messageForActivation() {
        return this.messageForActivation;
    }

    /**
     * Set the messageForActivation property: Context or helpful message that can be used during the approval process by
     * the subscriber.
     *
     * @param messageForActivation the messageForActivation value to set.
     * @return the ChannelProperties object itself.
     */
    public ChannelProperties withMessageForActivation(String messageForActivation) {
        this.messageForActivation = messageForActivation;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the channel.
     *
     * @return the provisioningState value.
     */
    public ChannelProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the channel.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ChannelProperties object itself.
     */
    public ChannelProperties withProvisioningState(ChannelProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the readinessState property: The readiness state of the corresponding partner topic.
     *
     * @return the readinessState value.
     */
    public ReadinessState readinessState() {
        return this.readinessState;
    }

    /**
     * Set the readinessState property: The readiness state of the corresponding partner topic.
     *
     * @param readinessState the readinessState value to set.
     * @return the ChannelProperties object itself.
     */
    public ChannelProperties withReadinessState(ReadinessState readinessState) {
        this.readinessState = readinessState;
        return this;
    }

    /**
     * Get the expirationTimeIfNotActivatedUtc property: Expiration time of the channel. If this timer expires while the
     * corresponding partner topic is never activated, the channel and corresponding partner topic are deleted.
     *
     * @return the expirationTimeIfNotActivatedUtc value.
     */
    public OffsetDateTime expirationTimeIfNotActivatedUtc() {
        return this.expirationTimeIfNotActivatedUtc;
    }

    /**
     * Set the expirationTimeIfNotActivatedUtc property: Expiration time of the channel. If this timer expires while the
     * corresponding partner topic is never activated, the channel and corresponding partner topic are deleted.
     *
     * @param expirationTimeIfNotActivatedUtc the expirationTimeIfNotActivatedUtc value to set.
     * @return the ChannelProperties object itself.
     */
    public ChannelProperties withExpirationTimeIfNotActivatedUtc(OffsetDateTime expirationTimeIfNotActivatedUtc) {
        this.expirationTimeIfNotActivatedUtc = expirationTimeIfNotActivatedUtc;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (partnerTopicInfo() != null) {
            partnerTopicInfo().validate();
        }
    }
}
