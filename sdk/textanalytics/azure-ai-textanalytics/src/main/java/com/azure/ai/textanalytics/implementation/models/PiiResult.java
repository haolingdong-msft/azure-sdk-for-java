// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PiiResult model. */
@Fluent
public final class PiiResult extends PreBuiltResult {
    /*
     * Response by document
     */
    @JsonProperty(value = "documents", required = true)
    private List<PiiResultDocumentsItem> documents;

    /**
     * Get the documents property: Response by document.
     *
     * @return the documents value.
     */
    public List<PiiResultDocumentsItem> getDocuments() {
        return this.documents;
    }

    /**
     * Set the documents property: Response by document.
     *
     * @param documents the documents value to set.
     * @return the PiiResult object itself.
     */
    public PiiResult setDocuments(List<PiiResultDocumentsItem> documents) {
        this.documents = documents;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PiiResult setErrors(List<InputError> errors) {
        super.setErrors(errors);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PiiResult setStatistics(RequestStatistics statistics) {
        super.setStatistics(statistics);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PiiResult setModelVersion(String modelVersion) {
        super.setModelVersion(modelVersion);
        return this;
    }
}
