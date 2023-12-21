// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A specific representation of configurable options for Elasticsearch when using it as an Azure OpenAI chat
 * extension.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Elasticsearch")
@Immutable
public final class ElasticsearchChatExtensionConfiguration extends AzureChatExtensionConfiguration {

    /*
     * The parameters to use when configuring Elasticsearch®.
     */
    @Generated
    @JsonProperty(value = "parameters")
    private ElasticsearchChatExtensionParameters parameters;

    /**
     * Get the parameters property: The parameters to use when configuring Elasticsearch®.
     *
     * @return the parameters value.
     */
    @Generated
    public ElasticsearchChatExtensionParameters getParameters() {
        return this.parameters;
    }

    /**
     * Creates an instance of ElasticsearchChatExtensionConfiguration class.
     *
     * @param parameters the parameters value to set.
     */
    @Generated
    @JsonCreator
    public ElasticsearchChatExtensionConfiguration(
        @JsonProperty(value = "parameters") ElasticsearchChatExtensionParameters parameters) {
        this.parameters = parameters;
    }
}
