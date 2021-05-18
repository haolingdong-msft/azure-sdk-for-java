// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema of the Data property of an EventGridEvent for a Microsoft.EventGrid.SubscriptionValidationEvent event. */
@Immutable
public final class SubscriptionValidationEventData {
    /*
     * The validation code sent by Azure Event Grid to validate an event
     * subscription. To complete the validation handshake, the subscriber must
     * either respond with this validation code as part of the validation
     * response, or perform a GET request on the validationUrl (available
     * starting version 2018-05-01-preview).
     */
    @JsonProperty(value = "validationCode", access = JsonProperty.Access.WRITE_ONLY)
    private String validationCode;

    /*
     * The validation URL sent by Azure Event Grid (available starting version
     * 2018-05-01-preview). To complete the validation handshake, the
     * subscriber must either respond with the validationCode as part of the
     * validation response, or perform a GET request on the validationUrl
     * (available starting version 2018-05-01-preview).
     */
    @JsonProperty(value = "validationUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String validationUrl;

    /**
     * Get the validationCode property: The validation code sent by Azure Event Grid to validate an event subscription.
     * To complete the validation handshake, the subscriber must either respond with this validation code as part of the
     * validation response, or perform a GET request on the validationUrl (available starting version
     * 2018-05-01-preview).
     *
     * @return the validationCode value.
     */
    public String getValidationCode() {
        return this.validationCode;
    }

    /**
     * Get the validationUrl property: The validation URL sent by Azure Event Grid (available starting version
     * 2018-05-01-preview). To complete the validation handshake, the subscriber must either respond with the
     * validationCode as part of the validation response, or perform a GET request on the validationUrl (available
     * starting version 2018-05-01-preview).
     *
     * @return the validationUrl value.
     */
    public String getValidationUrl() {
        return this.validationUrl;
    }
}
