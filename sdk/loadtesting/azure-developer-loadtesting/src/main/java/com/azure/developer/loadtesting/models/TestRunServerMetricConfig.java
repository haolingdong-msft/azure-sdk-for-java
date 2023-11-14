// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Test run server metrics configuration.
 */
@Fluent
public final class TestRunServerMetricConfig implements JsonSerializable<TestRunServerMetricConfig> {

    /*
     * Test run identifier
     */
    @Generated
    private String testRunId;

    /*
     * Azure resource metrics collection {metric id : metrics object} (Refer :
     * https://docs.microsoft.com/en-us/rest/api/monitor/metric-definitions/list#metricdefinition
     * for metric id).
     */
    @Generated
    private Map<String, ResourceMetric> metrics;

    /*
     * The creation datetime(ISO 8601 literal format).
     */
    @Generated
    private OffsetDateTime createdDateTime;

    /*
     * The user that created.
     */
    @Generated
    private String createdBy;

    /*
     * The last Modified datetime(ISO 8601 literal format).
     */
    @Generated
    private OffsetDateTime lastModifiedDateTime;

    /*
     * The user that last modified.
     */
    @Generated
    private String lastModifiedBy;

    /**
     * Creates an instance of TestRunServerMetricConfig class.
     */
    @Generated
    public TestRunServerMetricConfig() {
    }

    /**
     * Get the testRunId property: Test run identifier.
     *
     * @return the testRunId value.
     */
    @Generated
    public String getTestRunId() {
        return this.testRunId;
    }

    /**
     * Get the metrics property: Azure resource metrics collection {metric id : metrics object} (Refer :
     * https://docs.microsoft.com/en-us/rest/api/monitor/metric-definitions/list#metricdefinition
     * for metric id).
     *
     * @return the metrics value.
     */
    @Generated
    public Map<String, ResourceMetric> getMetrics() {
        return this.metrics;
    }

    /**
     * Set the metrics property: Azure resource metrics collection {metric id : metrics object} (Refer :
     * https://docs.microsoft.com/en-us/rest/api/monitor/metric-definitions/list#metricdefinition
     * for metric id).
     *
     * @param metrics the metrics value to set.
     * @return the TestRunServerMetricConfig object itself.
     */
    @Generated
    public TestRunServerMetricConfig setMetrics(Map<String, ResourceMetric> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Get the createdDateTime property: The creation datetime(ISO 8601 literal format).
     *
     * @return the createdDateTime value.
     */
    @Generated
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the createdBy property: The user that created.
     *
     * @return the createdBy value.
     */
    @Generated
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Get the lastModifiedDateTime property: The last Modified datetime(ISO 8601 literal format).
     *
     * @return the lastModifiedDateTime value.
     */
    @Generated
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Get the lastModifiedBy property: The user that last modified.
     *
     * @return the lastModifiedBy value.
     */
    @Generated
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeMapField("metrics", this.metrics, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TestRunServerMetricConfig from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TestRunServerMetricConfig if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TestRunServerMetricConfig.
     */
    public static TestRunServerMetricConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TestRunServerMetricConfig deserializedTestRunServerMetricConfig = new TestRunServerMetricConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("testRunId".equals(fieldName)) {
                    deserializedTestRunServerMetricConfig.testRunId = reader.getString();
                } else if ("metrics".equals(fieldName)) {
                    Map<String, ResourceMetric> metrics = reader.readMap(reader1 -> ResourceMetric.fromJson(reader1));
                    deserializedTestRunServerMetricConfig.metrics = metrics;
                } else if ("createdDateTime".equals(fieldName)) {
                    deserializedTestRunServerMetricConfig.createdDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("createdBy".equals(fieldName)) {
                    deserializedTestRunServerMetricConfig.createdBy = reader.getString();
                } else if ("lastModifiedDateTime".equals(fieldName)) {
                    deserializedTestRunServerMetricConfig.lastModifiedDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("lastModifiedBy".equals(fieldName)) {
                    deserializedTestRunServerMetricConfig.lastModifiedBy = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedTestRunServerMetricConfig;
        });
    }
}
