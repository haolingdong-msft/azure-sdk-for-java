// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;

/**
 * The WholeMetricConfigurationPatch model.
 */
@Fluent
public final class WholeMetricConfigurationPatch implements JsonSerializable<WholeMetricConfigurationPatch> {
    /*
     * condition operator
     * 
     * should be specified when combining multiple detection conditions
     */
    private AnomalyDetectionConfigurationLogicType conditionOperator;

    /*
     * The smartDetectionCondition property.
     */
    private SmartDetectionConditionPatch smartDetectionCondition;

    /*
     * The hardThresholdCondition property.
     */
    private HardThresholdConditionPatch hardThresholdCondition;

    /*
     * The changeThresholdCondition property.
     */
    private ChangeThresholdConditionPatch changeThresholdCondition;

    /**
     * Creates an instance of WholeMetricConfigurationPatch class.
     */
    public WholeMetricConfigurationPatch() {
    }

    /**
     * Get the conditionOperator property: condition operator
     * 
     * should be specified when combining multiple detection conditions.
     * 
     * @return the conditionOperator value.
     */
    public AnomalyDetectionConfigurationLogicType getConditionOperator() {
        return this.conditionOperator;
    }

    /**
     * Set the conditionOperator property: condition operator
     * 
     * should be specified when combining multiple detection conditions.
     * 
     * @param conditionOperator the conditionOperator value to set.
     * @return the WholeMetricConfigurationPatch object itself.
     */
    public WholeMetricConfigurationPatch
        setConditionOperator(AnomalyDetectionConfigurationLogicType conditionOperator) {
        this.conditionOperator = conditionOperator;
        return this;
    }

    /**
     * Get the smartDetectionCondition property: The smartDetectionCondition property.
     * 
     * @return the smartDetectionCondition value.
     */
    public SmartDetectionConditionPatch getSmartDetectionCondition() {
        return this.smartDetectionCondition;
    }

    /**
     * Set the smartDetectionCondition property: The smartDetectionCondition property.
     * 
     * @param smartDetectionCondition the smartDetectionCondition value to set.
     * @return the WholeMetricConfigurationPatch object itself.
     */
    public WholeMetricConfigurationPatch
        setSmartDetectionCondition(SmartDetectionConditionPatch smartDetectionCondition) {
        this.smartDetectionCondition = smartDetectionCondition;
        return this;
    }

    /**
     * Get the hardThresholdCondition property: The hardThresholdCondition property.
     * 
     * @return the hardThresholdCondition value.
     */
    public HardThresholdConditionPatch getHardThresholdCondition() {
        return this.hardThresholdCondition;
    }

    /**
     * Set the hardThresholdCondition property: The hardThresholdCondition property.
     * 
     * @param hardThresholdCondition the hardThresholdCondition value to set.
     * @return the WholeMetricConfigurationPatch object itself.
     */
    public WholeMetricConfigurationPatch setHardThresholdCondition(HardThresholdConditionPatch hardThresholdCondition) {
        this.hardThresholdCondition = hardThresholdCondition;
        return this;
    }

    /**
     * Get the changeThresholdCondition property: The changeThresholdCondition property.
     * 
     * @return the changeThresholdCondition value.
     */
    public ChangeThresholdConditionPatch getChangeThresholdCondition() {
        return this.changeThresholdCondition;
    }

    /**
     * Set the changeThresholdCondition property: The changeThresholdCondition property.
     * 
     * @param changeThresholdCondition the changeThresholdCondition value to set.
     * @return the WholeMetricConfigurationPatch object itself.
     */
    public WholeMetricConfigurationPatch
        setChangeThresholdCondition(ChangeThresholdConditionPatch changeThresholdCondition) {
        this.changeThresholdCondition = changeThresholdCondition;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("conditionOperator", Objects.toString(this.conditionOperator, null));
        jsonWriter.writeJsonField("smartDetectionCondition", this.smartDetectionCondition);
        jsonWriter.writeJsonField("hardThresholdCondition", this.hardThresholdCondition);
        jsonWriter.writeJsonField("changeThresholdCondition", this.changeThresholdCondition);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WholeMetricConfigurationPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WholeMetricConfigurationPatch if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WholeMetricConfigurationPatch.
     */
    public static WholeMetricConfigurationPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WholeMetricConfigurationPatch deserializedWholeMetricConfigurationPatch
                = new WholeMetricConfigurationPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("conditionOperator".equals(fieldName)) {
                    deserializedWholeMetricConfigurationPatch.conditionOperator
                        = AnomalyDetectionConfigurationLogicType.fromString(reader.getString());
                } else if ("smartDetectionCondition".equals(fieldName)) {
                    deserializedWholeMetricConfigurationPatch.smartDetectionCondition
                        = SmartDetectionConditionPatch.fromJson(reader);
                } else if ("hardThresholdCondition".equals(fieldName)) {
                    deserializedWholeMetricConfigurationPatch.hardThresholdCondition
                        = HardThresholdConditionPatch.fromJson(reader);
                } else if ("changeThresholdCondition".equals(fieldName)) {
                    deserializedWholeMetricConfigurationPatch.changeThresholdCondition
                        = ChangeThresholdConditionPatch.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWholeMetricConfigurationPatch;
        });
    }
}
