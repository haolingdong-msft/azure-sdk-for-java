// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Representation of a single embeddings relatedness comparison.
 */
@Immutable
public final class EmbeddingItem {

    /*
     * List of embeddings value for the input prompt. These represent a measurement of the
     * vector-based relatedness of the provided input.
     */
    @Generated
    @JsonProperty(value = "embedding")
    private List<Double> embedding;

    /**
     * Creates an instance of EmbeddingItem class.
     *
     * @param embedding the embedding value to set.
     * @param promptIndex the promptIndex value to set.
     */
    @Generated
    @JsonCreator
    private EmbeddingItem(@JsonProperty(value = "embedding") List<Double> embedding,
        @JsonProperty(value = "index") int promptIndex) {
        this.embedding = embedding;
        this.promptIndex = promptIndex;
    }

    /**
     * Get the embedding property: List of embeddings value for the input prompt. These represent a measurement of the
     * vector-based relatedness of the provided input.
     *
     * @return the embedding value.
     */
    @Generated
    public List<Double> getEmbedding() {
        return this.embedding;
    }

    /*
     * Index of the prompt to which the EmbeddingItem corresponds.
     */
    @Generated
    @JsonProperty(value = "index")
    private int promptIndex;

    /**
     * Get the promptIndex property: Index of the prompt to which the EmbeddingItem corresponds.
     *
     * @return the promptIndex value.
     */
    @Generated
    public int getPromptIndex() {
        return this.promptIndex;
    }
}
