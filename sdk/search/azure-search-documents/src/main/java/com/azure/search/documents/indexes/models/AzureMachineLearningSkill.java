// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The AML skill allows you to extend AI enrichment with a custom Azure Machine Learning (AML) model. Once an AML model
 * is trained and deployed, an AML skill integrates it into AI enrichment.
 */
@Fluent
public final class AzureMachineLearningSkill extends SearchIndexerSkill {
    /*
     * Identifies the concrete type of the skill.
     */
    private static final String ODATA_TYPE = "#Microsoft.Skills.Custom.AmlSkill";

    /*
     * (Required for no authentication or key authentication) The scoring URI of the AML service to which the JSON
     * payload will be sent. Only the https URI scheme is allowed.
     */
    private String scoringUri;

    /*
     * (Required for key authentication) The key for the AML service.
     */
    private String authenticationKey;

    /*
     * (Required for token authentication). The Azure Resource Manager resource ID of the AML service. It should be in
     * the format
     * subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.MachineLearningServices/workspaces/{workspace-name}/services/{service_name}.
     */
    private String resourceId;

    /*
     * (Optional) When specified, indicates the timeout for the http client making the API call.
     */
    private Duration timeout;

    /*
     * (Optional for token authentication). The region the AML service is deployed in.
     */
    private String region;

    /*
     * (Optional) When specified, indicates the number of calls the indexer will make in parallel to the endpoint you
     * have provided. You can decrease this value if your endpoint is failing under too high of a request load, or
     * raise it if your endpoint is able to accept more requests and you would like an increase in the performance of
     * the indexer. If not set, a default value of 5 is used. The degreeOfParallelism can be set to a maximum of 10 and
     * a minimum of 1.
     */
    private Integer degreeOfParallelism;

    /**
     * Creates an instance of AzureMachineLearningSkill class.
     *
     * @param inputs the inputs value to set.
     * @param outputs the outputs value to set.
     */
    public AzureMachineLearningSkill(List<InputFieldMappingEntry> inputs, List<OutputFieldMappingEntry> outputs) {
        super(inputs, outputs);
    }

    /**
     * Get the scoringUri property: (Required for no authentication or key authentication) The scoring URI of the AML
     * service to which the JSON payload will be sent. Only the https URI scheme is allowed.
     *
     * @return the scoringUri value.
     */
    public String getScoringUri() {
        return this.scoringUri;
    }

    /**
     * Set the scoringUri property: (Required for no authentication or key authentication) The scoring URI of the AML
     * service to which the JSON payload will be sent. Only the https URI scheme is allowed.
     *
     * @param scoringUri the scoringUri value to set.
     * @return the AzureMachineLearningSkill object itself.
     */
    public AzureMachineLearningSkill setScoringUri(String scoringUri) {
        this.scoringUri = scoringUri;
        return this;
    }

    /**
     * Get the authenticationKey property: (Required for key authentication) The key for the AML service.
     *
     * @return the authenticationKey value.
     */
    public String getAuthenticationKey() {
        return this.authenticationKey;
    }

    /**
     * Set the authenticationKey property: (Required for key authentication) The key for the AML service.
     *
     * @param authenticationKey the authenticationKey value to set.
     * @return the AzureMachineLearningSkill object itself.
     */
    public AzureMachineLearningSkill setAuthenticationKey(String authenticationKey) {
        this.authenticationKey = authenticationKey;
        return this;
    }

    /**
     * Get the resourceId property: (Required for token authentication). The Azure Resource Manager resource ID of the
     * AML service. It should be in the format
     * subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.MachineLearningServices/workspaces/{workspace-name}/services/{service_name}.
     *
     * @return the resourceId value.
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: (Required for token authentication). The Azure Resource Manager resource ID of the
     * AML service. It should be in the format
     * subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.MachineLearningServices/workspaces/{workspace-name}/services/{service_name}.
     *
     * @param resourceId the resourceId value to set.
     * @return the AzureMachineLearningSkill object itself.
     */
    public AzureMachineLearningSkill setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the timeout property: (Optional) When specified, indicates the timeout for the http client making the API
     * call.
     *
     * @return the timeout value.
     */
    public Duration getTimeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: (Optional) When specified, indicates the timeout for the http client making the API
     * call.
     *
     * @param timeout the timeout value to set.
     * @return the AzureMachineLearningSkill object itself.
     */
    public AzureMachineLearningSkill setTimeout(Duration timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the region property: (Optional for token authentication). The region the AML service is deployed in.
     *
     * @return the region value.
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * Set the region property: (Optional for token authentication). The region the AML service is deployed in.
     *
     * @param region the region value to set.
     * @return the AzureMachineLearningSkill object itself.
     */
    public AzureMachineLearningSkill setRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the degreeOfParallelism property: (Optional) When specified, indicates the number of calls the indexer will
     * make in parallel to the endpoint you have provided. You can decrease this value if your endpoint is failing under
     * too high of a request load, or raise it if your endpoint is able to accept more requests and you would like an
     * increase in the performance of the indexer. If not set, a default value of 5 is used. The degreeOfParallelism can
     * be set to a maximum of 10 and a minimum of 1.
     *
     * @return the degreeOfParallelism value.
     */
    public Integer getDegreeOfParallelism() {
        return this.degreeOfParallelism;
    }

    /**
     * Set the degreeOfParallelism property: (Optional) When specified, indicates the number of calls the indexer will
     * make in parallel to the endpoint you have provided. You can decrease this value if your endpoint is failing under
     * too high of a request load, or raise it if your endpoint is able to accept more requests and you would like an
     * increase in the performance of the indexer. If not set, a default value of 5 is used. The degreeOfParallelism can
     * be set to a maximum of 10 and a minimum of 1.
     *
     * @param degreeOfParallelism the degreeOfParallelism value to set.
     * @return the AzureMachineLearningSkill object itself.
     */
    public AzureMachineLearningSkill setDegreeOfParallelism(Integer degreeOfParallelism) {
        this.degreeOfParallelism = degreeOfParallelism;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureMachineLearningSkill setName(String name) {
        super.setName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureMachineLearningSkill setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureMachineLearningSkill setContext(String context) {
        super.setContext(context);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("@odata.type", ODATA_TYPE);
        jsonWriter.writeArrayField("inputs", getInputs(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("outputs", getOutputs(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("name", getName());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeStringField("context", getContext());
        jsonWriter.writeStringField("uri", this.scoringUri);
        jsonWriter.writeStringField("key", this.authenticationKey);
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeStringField("timeout", Objects.toString(this.timeout, null));
        jsonWriter.writeStringField("region", this.region);
        jsonWriter.writeNumberField("degreeOfParallelism", this.degreeOfParallelism);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureMachineLearningSkill from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureMachineLearningSkill if the JsonReader was pointing to an instance of it, or null if
     *     it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties or the
     *     polymorphic discriminator.
     * @throws IOException If an error occurs while reading the AzureMachineLearningSkill.
     */
    public static AzureMachineLearningSkill fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean inputsFound = false;
                    List<InputFieldMappingEntry> inputs = null;
                    boolean outputsFound = false;
                    List<OutputFieldMappingEntry> outputs = null;
                    String name = null;
                    String description = null;
                    String context = null;
                    String scoringUri = null;
                    String authenticationKey = null;
                    String resourceId = null;
                    Duration timeout = null;
                    String region = null;
                    Integer degreeOfParallelism = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("@odata.type".equals(fieldName)) {
                            String odataType = reader.getString();
                            if (!ODATA_TYPE.equals(odataType)) {
                                throw new IllegalStateException(
                                        "'@odata.type' was expected to be non-null and equal to '"
                                                + ODATA_TYPE
                                                + "'. The found '@odata.type' was '"
                                                + odataType
                                                + "'.");
                            }
                        } else if ("inputs".equals(fieldName)) {
                            inputs = reader.readArray(reader1 -> InputFieldMappingEntry.fromJson(reader1));
                            inputsFound = true;
                        } else if ("outputs".equals(fieldName)) {
                            outputs = reader.readArray(reader1 -> OutputFieldMappingEntry.fromJson(reader1));
                            outputsFound = true;
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                        } else if ("description".equals(fieldName)) {
                            description = reader.getString();
                        } else if ("context".equals(fieldName)) {
                            context = reader.getString();
                        } else if ("uri".equals(fieldName)) {
                            scoringUri = reader.getString();
                        } else if ("key".equals(fieldName)) {
                            authenticationKey = reader.getString();
                        } else if ("resourceId".equals(fieldName)) {
                            resourceId = reader.getString();
                        } else if ("timeout".equals(fieldName)) {
                            timeout = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                        } else if ("region".equals(fieldName)) {
                            region = reader.getString();
                        } else if ("degreeOfParallelism".equals(fieldName)) {
                            degreeOfParallelism = reader.getNullable(JsonReader::getInt);
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (inputsFound && outputsFound) {
                        AzureMachineLearningSkill deserializedValue = new AzureMachineLearningSkill(inputs, outputs);
                        deserializedValue.setName(name);
                        deserializedValue.setDescription(description);
                        deserializedValue.setContext(context);
                        deserializedValue.scoringUri = scoringUri;
                        deserializedValue.authenticationKey = authenticationKey;
                        deserializedValue.resourceId = resourceId;
                        deserializedValue.timeout = timeout;
                        deserializedValue.region = region;
                        deserializedValue.degreeOfParallelism = degreeOfParallelism;

                        return deserializedValue;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!inputsFound) {
                        missingProperties.add("inputs");
                    }
                    if (!outputsFound) {
                        missingProperties.add("outputs");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
