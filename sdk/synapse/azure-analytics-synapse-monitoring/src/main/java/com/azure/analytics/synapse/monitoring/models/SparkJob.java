// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.monitoring.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * The SparkJob model.
 */
@Fluent
public final class SparkJob implements JsonSerializable<SparkJob> {
    /*
     * The state property.
     */
    private String state;

    /*
     * The name property.
     */
    private String name;

    /*
     * The submitter property.
     */
    private String submitter;

    /*
     * The compute property.
     */
    private String compute;

    /*
     * The sparkApplicationId property.
     */
    private String sparkApplicationId;

    /*
     * The livyId property.
     */
    private String livyId;

    /*
     * The timing property.
     */
    private List<String> timing;

    /*
     * The sparkJobDefinition property.
     */
    private String sparkJobDefinition;

    /*
     * The pipeline property.
     */
    private List<SparkJob> pipeline;

    /*
     * The jobType property.
     */
    private String jobType;

    /*
     * The submitTime property.
     */
    private OffsetDateTime submitTime;

    /*
     * The endTime property.
     */
    private OffsetDateTime endTime;

    /*
     * The queuedDuration property.
     */
    private String queuedDuration;

    /*
     * The runningDuration property.
     */
    private String runningDuration;

    /*
     * The totalDuration property.
     */
    private String totalDuration;

    /**
     * Creates an instance of SparkJob class.
     */
    public SparkJob() {
    }

    /**
     * Get the state property: The state property.
     * 
     * @return the state value.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Set the state property: The state property.
     * 
     * @param state the state value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the submitter property: The submitter property.
     * 
     * @return the submitter value.
     */
    public String getSubmitter() {
        return this.submitter;
    }

    /**
     * Set the submitter property: The submitter property.
     * 
     * @param submitter the submitter value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setSubmitter(String submitter) {
        this.submitter = submitter;
        return this;
    }

    /**
     * Get the compute property: The compute property.
     * 
     * @return the compute value.
     */
    public String getCompute() {
        return this.compute;
    }

    /**
     * Set the compute property: The compute property.
     * 
     * @param compute the compute value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setCompute(String compute) {
        this.compute = compute;
        return this;
    }

    /**
     * Get the sparkApplicationId property: The sparkApplicationId property.
     * 
     * @return the sparkApplicationId value.
     */
    public String getSparkApplicationId() {
        return this.sparkApplicationId;
    }

    /**
     * Set the sparkApplicationId property: The sparkApplicationId property.
     * 
     * @param sparkApplicationId the sparkApplicationId value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setSparkApplicationId(String sparkApplicationId) {
        this.sparkApplicationId = sparkApplicationId;
        return this;
    }

    /**
     * Get the livyId property: The livyId property.
     * 
     * @return the livyId value.
     */
    public String getLivyId() {
        return this.livyId;
    }

    /**
     * Set the livyId property: The livyId property.
     * 
     * @param livyId the livyId value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setLivyId(String livyId) {
        this.livyId = livyId;
        return this;
    }

    /**
     * Get the timing property: The timing property.
     * 
     * @return the timing value.
     */
    public List<String> getTiming() {
        return this.timing;
    }

    /**
     * Set the timing property: The timing property.
     * 
     * @param timing the timing value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setTiming(List<String> timing) {
        this.timing = timing;
        return this;
    }

    /**
     * Get the sparkJobDefinition property: The sparkJobDefinition property.
     * 
     * @return the sparkJobDefinition value.
     */
    public String getSparkJobDefinition() {
        return this.sparkJobDefinition;
    }

    /**
     * Set the sparkJobDefinition property: The sparkJobDefinition property.
     * 
     * @param sparkJobDefinition the sparkJobDefinition value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setSparkJobDefinition(String sparkJobDefinition) {
        this.sparkJobDefinition = sparkJobDefinition;
        return this;
    }

    /**
     * Get the pipeline property: The pipeline property.
     * 
     * @return the pipeline value.
     */
    public List<SparkJob> getPipeline() {
        return this.pipeline;
    }

    /**
     * Set the pipeline property: The pipeline property.
     * 
     * @param pipeline the pipeline value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setPipeline(List<SparkJob> pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /**
     * Get the jobType property: The jobType property.
     * 
     * @return the jobType value.
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * Set the jobType property: The jobType property.
     * 
     * @param jobType the jobType value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get the submitTime property: The submitTime property.
     * 
     * @return the submitTime value.
     */
    public OffsetDateTime getSubmitTime() {
        return this.submitTime;
    }

    /**
     * Set the submitTime property: The submitTime property.
     * 
     * @param submitTime the submitTime value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setSubmitTime(OffsetDateTime submitTime) {
        this.submitTime = submitTime;
        return this;
    }

    /**
     * Get the endTime property: The endTime property.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The endTime property.
     * 
     * @param endTime the endTime value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the queuedDuration property: The queuedDuration property.
     * 
     * @return the queuedDuration value.
     */
    public String getQueuedDuration() {
        return this.queuedDuration;
    }

    /**
     * Set the queuedDuration property: The queuedDuration property.
     * 
     * @param queuedDuration the queuedDuration value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setQueuedDuration(String queuedDuration) {
        this.queuedDuration = queuedDuration;
        return this;
    }

    /**
     * Get the runningDuration property: The runningDuration property.
     * 
     * @return the runningDuration value.
     */
    public String getRunningDuration() {
        return this.runningDuration;
    }

    /**
     * Set the runningDuration property: The runningDuration property.
     * 
     * @param runningDuration the runningDuration value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setRunningDuration(String runningDuration) {
        this.runningDuration = runningDuration;
        return this;
    }

    /**
     * Get the totalDuration property: The totalDuration property.
     * 
     * @return the totalDuration value.
     */
    public String getTotalDuration() {
        return this.totalDuration;
    }

    /**
     * Set the totalDuration property: The totalDuration property.
     * 
     * @param totalDuration the totalDuration value to set.
     * @return the SparkJob object itself.
     */
    public SparkJob setTotalDuration(String totalDuration) {
        this.totalDuration = totalDuration;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("state", this.state);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("submitter", this.submitter);
        jsonWriter.writeStringField("compute", this.compute);
        jsonWriter.writeStringField("sparkApplicationId", this.sparkApplicationId);
        jsonWriter.writeStringField("livyId", this.livyId);
        jsonWriter.writeArrayField("timing", this.timing, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("sparkJobDefinition", this.sparkJobDefinition);
        jsonWriter.writeArrayField("pipeline", this.pipeline, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("jobType", this.jobType);
        jsonWriter.writeStringField("submitTime",
            this.submitTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.submitTime));
        jsonWriter.writeStringField("endTime",
            this.endTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.endTime));
        jsonWriter.writeStringField("queuedDuration", this.queuedDuration);
        jsonWriter.writeStringField("runningDuration", this.runningDuration);
        jsonWriter.writeStringField("totalDuration", this.totalDuration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SparkJob from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SparkJob if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the SparkJob.
     */
    public static SparkJob fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SparkJob deserializedSparkJob = new SparkJob();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("state".equals(fieldName)) {
                    deserializedSparkJob.state = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedSparkJob.name = reader.getString();
                } else if ("submitter".equals(fieldName)) {
                    deserializedSparkJob.submitter = reader.getString();
                } else if ("compute".equals(fieldName)) {
                    deserializedSparkJob.compute = reader.getString();
                } else if ("sparkApplicationId".equals(fieldName)) {
                    deserializedSparkJob.sparkApplicationId = reader.getString();
                } else if ("livyId".equals(fieldName)) {
                    deserializedSparkJob.livyId = reader.getString();
                } else if ("timing".equals(fieldName)) {
                    List<String> timing = reader.readArray(reader1 -> reader1.getString());
                    deserializedSparkJob.timing = timing;
                } else if ("sparkJobDefinition".equals(fieldName)) {
                    deserializedSparkJob.sparkJobDefinition = reader.getString();
                } else if ("pipeline".equals(fieldName)) {
                    List<SparkJob> pipeline = reader.readArray(reader1 -> SparkJob.fromJson(reader1));
                    deserializedSparkJob.pipeline = pipeline;
                } else if ("jobType".equals(fieldName)) {
                    deserializedSparkJob.jobType = reader.getString();
                } else if ("submitTime".equals(fieldName)) {
                    deserializedSparkJob.submitTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("endTime".equals(fieldName)) {
                    deserializedSparkJob.endTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("queuedDuration".equals(fieldName)) {
                    deserializedSparkJob.queuedDuration = reader.getString();
                } else if ("runningDuration".equals(fieldName)) {
                    deserializedSparkJob.runningDuration = reader.getString();
                } else if ("totalDuration".equals(fieldName)) {
                    deserializedSparkJob.totalDuration = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSparkJob;
        });
    }
}
