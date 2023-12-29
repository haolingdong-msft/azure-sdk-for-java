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

/**
 * Configuration for quick load test.
 */
@Fluent
public final class OptionalLoadTestConfig implements JsonSerializable<OptionalLoadTestConfig> {
    /*
     * Test URL. Provide the complete HTTP URL. For example, https://contoso-app.azurewebsites.net/login
     */
    @Generated
    private String endpointUrl;

    /*
     * Target throughput (requests per second). This may not be necessarily achieved. The actual throughput will be
     * lower if the application is not capable of handling it.
     */
    @Generated
    private Integer requestsPerSecond;

    /*
     * Maximum response time in milliseconds of the API/endpoint.
     */
    @Generated
    private Integer maxResponseTimeInMs;

    /*
     * No of concurrent virtual users.
     */
    @Generated
    private Integer virtualUsers;

    /*
     * Ramp up time in seconds.
     */
    @Generated
    private Integer rampUpTime;

    /*
     * Test run duration in seconds.
     */
    @Generated
    private Integer duration;

    /**
     * Creates an instance of OptionalLoadTestConfig class.
     */
    @Generated
    public OptionalLoadTestConfig() {
    }

    /**
     * Get the endpointUrl property: Test URL. Provide the complete HTTP URL. For example,
     * https://contoso-app.azurewebsites.net/login.
     * 
     * @return the endpointUrl value.
     */
    @Generated
    public String getEndpointUrl() {
        return this.endpointUrl;
    }

    /**
     * Set the endpointUrl property: Test URL. Provide the complete HTTP URL. For example,
     * https://contoso-app.azurewebsites.net/login.
     * 
     * @param endpointUrl the endpointUrl value to set.
     * @return the OptionalLoadTestConfig object itself.
     */
    @Generated
    public OptionalLoadTestConfig setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
        return this;
    }

    /**
     * Get the requestsPerSecond property: Target throughput (requests per second). This may not be necessarily
     * achieved. The actual throughput will be lower if the application is not capable of handling it.
     * 
     * @return the requestsPerSecond value.
     */
    @Generated
    public Integer getRequestsPerSecond() {
        return this.requestsPerSecond;
    }

    /**
     * Set the requestsPerSecond property: Target throughput (requests per second). This may not be necessarily
     * achieved. The actual throughput will be lower if the application is not capable of handling it.
     * 
     * @param requestsPerSecond the requestsPerSecond value to set.
     * @return the OptionalLoadTestConfig object itself.
     */
    @Generated
    public OptionalLoadTestConfig setRequestsPerSecond(Integer requestsPerSecond) {
        this.requestsPerSecond = requestsPerSecond;
        return this;
    }

    /**
     * Get the maxResponseTimeInMs property: Maximum response time in milliseconds of the API/endpoint.
     * 
     * @return the maxResponseTimeInMs value.
     */
    @Generated
    public Integer getMaxResponseTimeInMs() {
        return this.maxResponseTimeInMs;
    }

    /**
     * Set the maxResponseTimeInMs property: Maximum response time in milliseconds of the API/endpoint.
     * 
     * @param maxResponseTimeInMs the maxResponseTimeInMs value to set.
     * @return the OptionalLoadTestConfig object itself.
     */
    @Generated
    public OptionalLoadTestConfig setMaxResponseTimeInMs(Integer maxResponseTimeInMs) {
        this.maxResponseTimeInMs = maxResponseTimeInMs;
        return this;
    }

    /**
     * Get the virtualUsers property: No of concurrent virtual users.
     * 
     * @return the virtualUsers value.
     */
    @Generated
    public Integer getVirtualUsers() {
        return this.virtualUsers;
    }

    /**
     * Set the virtualUsers property: No of concurrent virtual users.
     * 
     * @param virtualUsers the virtualUsers value to set.
     * @return the OptionalLoadTestConfig object itself.
     */
    @Generated
    public OptionalLoadTestConfig setVirtualUsers(Integer virtualUsers) {
        this.virtualUsers = virtualUsers;
        return this;
    }

    /**
     * Get the rampUpTime property: Ramp up time in seconds.
     * 
     * @return the rampUpTime value.
     */
    @Generated
    public Integer getRampUpTime() {
        return this.rampUpTime;
    }

    /**
     * Set the rampUpTime property: Ramp up time in seconds.
     * 
     * @param rampUpTime the rampUpTime value to set.
     * @return the OptionalLoadTestConfig object itself.
     */
    @Generated
    public OptionalLoadTestConfig setRampUpTime(Integer rampUpTime) {
        this.rampUpTime = rampUpTime;
        return this;
    }

    /**
     * Get the duration property: Test run duration in seconds.
     * 
     * @return the duration value.
     */
    @Generated
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * Set the duration property: Test run duration in seconds.
     * 
     * @param duration the duration value to set.
     * @return the OptionalLoadTestConfig object itself.
     */
    @Generated
    public OptionalLoadTestConfig setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("endpointUrl", this.endpointUrl);
        jsonWriter.writeNumberField("requestsPerSecond", this.requestsPerSecond);
        jsonWriter.writeNumberField("maxResponseTimeInMs", this.maxResponseTimeInMs);
        jsonWriter.writeNumberField("virtualUsers", this.virtualUsers);
        jsonWriter.writeNumberField("rampUpTime", this.rampUpTime);
        jsonWriter.writeNumberField("duration", this.duration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OptionalLoadTestConfig from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OptionalLoadTestConfig if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OptionalLoadTestConfig.
     */
    public static OptionalLoadTestConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OptionalLoadTestConfig deserializedOptionalLoadTestConfig = new OptionalLoadTestConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("endpointUrl".equals(fieldName)) {
                    deserializedOptionalLoadTestConfig.endpointUrl = reader.getString();
                } else if ("requestsPerSecond".equals(fieldName)) {
                    deserializedOptionalLoadTestConfig.requestsPerSecond = reader.getNullable(JsonReader::getInt);
                } else if ("maxResponseTimeInMs".equals(fieldName)) {
                    deserializedOptionalLoadTestConfig.maxResponseTimeInMs = reader.getNullable(JsonReader::getInt);
                } else if ("virtualUsers".equals(fieldName)) {
                    deserializedOptionalLoadTestConfig.virtualUsers = reader.getNullable(JsonReader::getInt);
                } else if ("rampUpTime".equals(fieldName)) {
                    deserializedOptionalLoadTestConfig.rampUpTime = reader.getNullable(JsonReader::getInt);
                } else if ("duration".equals(fieldName)) {
                    deserializedOptionalLoadTestConfig.duration = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOptionalLoadTestConfig;
        });
    }
}
