// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Detection request for batch inference. This is an asynchronous inference that will need another API to get detection
 * results.
 */
@Immutable
public final class MultivariateBatchDetectionOptions {
    /*
     * Source link to the input data to indicate an accessible Azure Storage URI.
     * It either points to an Azure Blob Storage folder or points to a CSV file in
     * Azure Blob Storage, based on your data schema selection. The data schema should
     * be exactly the same as those used in the training phase.
     */
    @JsonProperty(value = "dataSource", required = true)
    private String dataSource;

    /*
     * Number of top contributed
     * variables for one anomalous time stamp in the response. The default is
     * 10.
     */
    @JsonProperty(value = "topContributorCount", required = true)
    private int topContributorCount;

    /*
     * Start date/time of data for detection, which should
     * be in ISO 8601 format.
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * End date/time of data for detection, which should
     * be in ISO 8601 format.
     */
    @JsonProperty(value = "endTime", required = true)
    private OffsetDateTime endTime;

    /**
     * Creates an instance of MultivariateBatchDetectionOptions class.
     *
     * @param dataSource the dataSource value to set.
     * @param topContributorCount the topContributorCount value to set.
     * @param startTime the startTime value to set.
     * @param endTime the endTime value to set.
     */
    @JsonCreator
    public MultivariateBatchDetectionOptions(
            @JsonProperty(value = "dataSource", required = true) String dataSource,
            @JsonProperty(value = "topContributorCount", required = true) int topContributorCount,
            @JsonProperty(value = "startTime", required = true) OffsetDateTime startTime,
            @JsonProperty(value = "endTime", required = true) OffsetDateTime endTime) {
        this.dataSource = dataSource;
        this.topContributorCount = topContributorCount;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * Get the dataSource property: Source link to the input data to indicate an accessible Azure Storage URI. It either
     * points to an Azure Blob Storage folder or points to a CSV file in Azure Blob Storage, based on your data schema
     * selection. The data schema should be exactly the same as those used in the training phase.
     *
     * @return the dataSource value.
     */
    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * Get the topContributorCount property: Number of top contributed variables for one anomalous time stamp in the
     * response. The default is 10.
     *
     * @return the topContributorCount value.
     */
    public int getTopContributorCount() {
        return this.topContributorCount;
    }

    /**
     * Get the startTime property: Start date/time of data for detection, which should be in ISO 8601 format.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: End date/time of data for detection, which should be in ISO 8601 format.
     *
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }
}
