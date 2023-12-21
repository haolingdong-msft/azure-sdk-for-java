// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents the result of an individual indexer execution.
 */
@Immutable
public final class IndexerExecutionResult implements JsonSerializable<IndexerExecutionResult> {
    /*
     * The outcome of this indexer execution.
     */
    private final IndexerExecutionStatus status;

    /*
     * The outcome of this indexer execution.
     */
    private IndexerExecutionStatusDetail statusDetail;

    /*
     * All of the state that defines and dictates the indexer's current execution.
     */
    private IndexerCurrentState currentState;

    /*
     * The error message indicating the top-level error, if any.
     */
    private String errorMessage;

    /*
     * The start time of this indexer execution.
     */
    private OffsetDateTime startTime;

    /*
     * The end time of this indexer execution, if the execution has already completed.
     */
    private OffsetDateTime endTime;

    /*
     * The item-level indexing errors.
     */
    private final List<SearchIndexerError> errors;

    /*
     * The item-level indexing warnings.
     */
    private final List<SearchIndexerWarning> warnings;

    /*
     * The number of items that were processed during this indexer execution. This includes both successfully processed
     * items and items where indexing was attempted but failed.
     */
    private final int itemCount;

    /*
     * The number of items that failed to be indexed during this indexer execution.
     */
    private final int failedItemCount;

    /*
     * Change tracking state with which an indexer execution started.
     */
    private String initialTrackingState;

    /*
     * Change tracking state with which an indexer execution finished.
     */
    private String finalTrackingState;

    /**
     * Creates an instance of IndexerExecutionResult class.
     * 
     * @param status the status value to set.
     * @param errors the errors value to set.
     * @param warnings the warnings value to set.
     * @param itemCount the itemCount value to set.
     * @param failedItemCount the failedItemCount value to set.
     */
    public IndexerExecutionResult(IndexerExecutionStatus status, List<SearchIndexerError> errors,
        List<SearchIndexerWarning> warnings, int itemCount, int failedItemCount) {
        this.status = status;
        this.errors = errors;
        this.warnings = warnings;
        this.itemCount = itemCount;
        this.failedItemCount = failedItemCount;
    }

    /**
     * Get the status property: The outcome of this indexer execution.
     * 
     * @return the status value.
     */
    public IndexerExecutionStatus getStatus() {
        return this.status;
    }

    /**
     * Get the statusDetail property: The outcome of this indexer execution.
     * 
     * @return the statusDetail value.
     */
    public IndexerExecutionStatusDetail getStatusDetail() {
        return this.statusDetail;
    }

    /**
     * Get the currentState property: All of the state that defines and dictates the indexer's current execution.
     * 
     * @return the currentState value.
     */
    public IndexerCurrentState getCurrentState() {
        return this.currentState;
    }

    /**
     * Get the errorMessage property: The error message indicating the top-level error, if any.
     * 
     * @return the errorMessage value.
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the startTime property: The start time of this indexer execution.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The end time of this indexer execution, if the execution has already completed.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Get the errors property: The item-level indexing errors.
     * 
     * @return the errors value.
     */
    public List<SearchIndexerError> getErrors() {
        return this.errors;
    }

    /**
     * Get the warnings property: The item-level indexing warnings.
     * 
     * @return the warnings value.
     */
    public List<SearchIndexerWarning> getWarnings() {
        return this.warnings;
    }

    /**
     * Get the itemCount property: The number of items that were processed during this indexer execution. This includes
     * both successfully processed items and items where indexing was attempted but failed.
     * 
     * @return the itemCount value.
     */
    public int getItemCount() {
        return this.itemCount;
    }

    /**
     * Get the failedItemCount property: The number of items that failed to be indexed during this indexer execution.
     * 
     * @return the failedItemCount value.
     */
    public int getFailedItemCount() {
        return this.failedItemCount;
    }

    /**
     * Get the initialTrackingState property: Change tracking state with which an indexer execution started.
     * 
     * @return the initialTrackingState value.
     */
    public String getInitialTrackingState() {
        return this.initialTrackingState;
    }

    /**
     * Get the finalTrackingState property: Change tracking state with which an indexer execution finished.
     * 
     * @return the finalTrackingState value.
     */
    public String getFinalTrackingState() {
        return this.finalTrackingState;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IndexerExecutionResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IndexerExecutionResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IndexerExecutionResult.
     */
    public static IndexerExecutionResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean statusFound = false;
            IndexerExecutionStatus status = null;
            boolean errorsFound = false;
            List<SearchIndexerError> errors = null;
            boolean warningsFound = false;
            List<SearchIndexerWarning> warnings = null;
            boolean itemCountFound = false;
            int itemCount = 0;
            boolean failedItemCountFound = false;
            int failedItemCount = 0;
            IndexerExecutionStatusDetail statusDetail = null;
            IndexerCurrentState currentState = null;
            String errorMessage = null;
            OffsetDateTime startTime = null;
            OffsetDateTime endTime = null;
            String initialTrackingState = null;
            String finalTrackingState = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    status = IndexerExecutionStatus.fromString(reader.getString());
                    statusFound = true;
                } else if ("errors".equals(fieldName)) {
                    errors = reader.readArray(reader1 -> SearchIndexerError.fromJson(reader1));
                    errorsFound = true;
                } else if ("warnings".equals(fieldName)) {
                    warnings = reader.readArray(reader1 -> SearchIndexerWarning.fromJson(reader1));
                    warningsFound = true;
                } else if ("itemsProcessed".equals(fieldName)) {
                    itemCount = reader.getInt();
                    itemCountFound = true;
                } else if ("itemsFailed".equals(fieldName)) {
                    failedItemCount = reader.getInt();
                    failedItemCountFound = true;
                } else if ("statusDetail".equals(fieldName)) {
                    statusDetail = IndexerExecutionStatusDetail.fromString(reader.getString());
                } else if ("currentState".equals(fieldName)) {
                    currentState = IndexerCurrentState.fromJson(reader);
                } else if ("errorMessage".equals(fieldName)) {
                    errorMessage = reader.getString();
                } else if ("startTime".equals(fieldName)) {
                    startTime = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("endTime".equals(fieldName)) {
                    endTime = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("initialTrackingState".equals(fieldName)) {
                    initialTrackingState = reader.getString();
                } else if ("finalTrackingState".equals(fieldName)) {
                    finalTrackingState = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            if (statusFound && errorsFound && warningsFound && itemCountFound && failedItemCountFound) {
                IndexerExecutionResult deserializedIndexerExecutionResult
                    = new IndexerExecutionResult(status, errors, warnings, itemCount, failedItemCount);
                deserializedIndexerExecutionResult.statusDetail = statusDetail;
                deserializedIndexerExecutionResult.currentState = currentState;
                deserializedIndexerExecutionResult.errorMessage = errorMessage;
                deserializedIndexerExecutionResult.startTime = startTime;
                deserializedIndexerExecutionResult.endTime = endTime;
                deserializedIndexerExecutionResult.initialTrackingState = initialTrackingState;
                deserializedIndexerExecutionResult.finalTrackingState = finalTrackingState;

                return deserializedIndexerExecutionResult;
            }
            List<String> missingProperties = new ArrayList<>();
            if (!statusFound) {
                missingProperties.add("status");
            }
            if (!errorsFound) {
                missingProperties.add("errors");
            }
            if (!warningsFound) {
                missingProperties.add("warnings");
            }
            if (!itemCountFound) {
                missingProperties.add("itemsProcessed");
            }
            if (!failedItemCountFound) {
                missingProperties.add("itemsFailed");
            }

            throw new IllegalStateException(
                "Missing required property/properties: " + String.join(", ", missingProperties));
        });
    }
}
