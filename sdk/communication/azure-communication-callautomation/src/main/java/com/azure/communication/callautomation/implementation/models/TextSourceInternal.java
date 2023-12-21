// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.callautomation.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TextSourceInternal model. */
@Fluent
public final class TextSourceInternal {
    /*
     * Text for the cognitive service to be played
     */
    @JsonProperty(value = "text", required = true)
    private String text;

    /*
     * Source language locale to be played
     * Refer to available locales here: <seealso
     * href="https://learn.microsoft.com/en-us/azure/cognitive-services/speech-service/language-support?tabs=stt-tts"
     * />
     */
    @JsonProperty(value = "sourceLocale")
    private String sourceLocale;

    /*
     * Voice kind type
     */
    @JsonProperty(value = "voiceKind")
    private VoiceKindInternal voiceKind;

    /*
     * Voice name to be played
     * Refer to available Text-to-speech voices here: <seealso
     * href="https://learn.microsoft.com/en-us/azure/cognitive-services/speech-service/language-support?tabs=stt-tts"
     * />
     */
    @JsonProperty(value = "voiceName")
    private String voiceName;

    /*
     * Endpoint where the custom voice was deployed.
     */
    @JsonProperty(value = "customVoiceEndpointId")
    private String customVoiceEndpointId;

    /**
     * Get the text property: Text for the cognitive service to be played.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: Text for the cognitive service to be played.
     *
     * @param text the text value to set.
     * @return the TextSourceInternal object itself.
     */
    public TextSourceInternal setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the sourceLocale property: Source language locale to be played Refer to available locales here: &lt;seealso
     * href="https://learn.microsoft.com/en-us/azure/cognitive-services/speech-service/language-support?tabs=stt-tts"
     * /&gt;.
     *
     * @return the sourceLocale value.
     */
    public String getSourceLocale() {
        return this.sourceLocale;
    }

    /**
     * Set the sourceLocale property: Source language locale to be played Refer to available locales here: &lt;seealso
     * href="https://learn.microsoft.com/en-us/azure/cognitive-services/speech-service/language-support?tabs=stt-tts"
     * /&gt;.
     *
     * @param sourceLocale the sourceLocale value to set.
     * @return the TextSourceInternal object itself.
     */
    public TextSourceInternal setSourceLocale(String sourceLocale) {
        this.sourceLocale = sourceLocale;
        return this;
    }

    /**
     * Get the voiceKind property: Voice kind type.
     *
     * @return the voiceKind value.
     */
    public VoiceKindInternal getVoiceKind() {
        return this.voiceKind;
    }

    /**
     * Set the voiceKind property: Voice kind type.
     *
     * @param voiceKind the voiceKind value to set.
     * @return the TextSourceInternal object itself.
     */
    public TextSourceInternal setVoiceKind(VoiceKindInternal voiceKind) {
        this.voiceKind = voiceKind;
        return this;
    }

    /**
     * Get the voiceName property: Voice name to be played Refer to available Text-to-speech voices here: &lt;seealso
     * href="https://learn.microsoft.com/en-us/azure/cognitive-services/speech-service/language-support?tabs=stt-tts"
     * /&gt;.
     *
     * @return the voiceName value.
     */
    public String getVoiceName() {
        return this.voiceName;
    }

    /**
     * Set the voiceName property: Voice name to be played Refer to available Text-to-speech voices here: &lt;seealso
     * href="https://learn.microsoft.com/en-us/azure/cognitive-services/speech-service/language-support?tabs=stt-tts"
     * /&gt;.
     *
     * @param voiceName the voiceName value to set.
     * @return the TextSourceInternal object itself.
     */
    public TextSourceInternal setVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }

    /**
     * Get the customVoiceEndpointId property: Endpoint where the custom voice was deployed.
     *
     * @return the customVoiceEndpointId value.
     */
    public String getCustomVoiceEndpointId() {
        return this.customVoiceEndpointId;
    }

    /**
     * Set the customVoiceEndpointId property: Endpoint where the custom voice was deployed.
     *
     * @param customVoiceEndpointId the customVoiceEndpointId value to set.
     * @return the TextSourceInternal object itself.
     */
    public TextSourceInternal setCustomVoiceEndpointId(String customVoiceEndpointId) {
        this.customVoiceEndpointId = customVoiceEndpointId;
        return this;
    }
}
