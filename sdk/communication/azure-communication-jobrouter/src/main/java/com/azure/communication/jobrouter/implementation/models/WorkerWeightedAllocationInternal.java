// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.implementation.JsonMergePatchHelper;
import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Contains the weight percentage and worker selectors to be applied if selected for weighted distributions.
 */
@Fluent
public final class WorkerWeightedAllocationInternal implements JsonSerializable<WorkerWeightedAllocationInternal> {

    /*
     * The percentage of this weight, expressed as a fraction of 1.
     */
    @Generated
    private double weight;

    /*
     * A collection of worker selectors that will be applied if this allocation is selected.
     */
    @Generated
    private List<RouterWorkerSelectorInternal> workerSelectors;

    /**
     * Get the weight property: The percentage of this weight, expressed as a fraction of 1.
     *
     * @return the weight value.
     */
    @Generated
    public double getWeight() {
        return this.weight;
    }

    /**
     * Get the workerSelectors property: A collection of worker selectors that will be applied if this allocation is
     * selected.
     *
     * @return the workerSelectors value.
     */
    @Generated
    public List<RouterWorkerSelectorInternal> getWorkerSelectors() {
        return this.workerSelectors;
    }

    @Generated
    private boolean jsonMergePatch;

    /**
     * Stores updated model property, the value is property name, not serialized name.
     */
    @Generated
    private final Set<String> updatedProperties = new HashSet<>();

    @Generated
    void serializeAsJsonMergePatch(boolean jsonMergePatch) {
        this.jsonMergePatch = jsonMergePatch;
    }

    static {
        JsonMergePatchHelper.setWorkerWeightedAllocationInternalAccessor((model, jsonMergePatchEnabled) -> {
            model.serializeAsJsonMergePatch(jsonMergePatchEnabled);
            return model;
        });
    }

    /**
     * Creates an instance of WorkerWeightedAllocationInternal class.
     */
    @Generated
    public WorkerWeightedAllocationInternal() {
    }

    /**
     * Set the weight property: The percentage of this weight, expressed as a fraction of 1.
     * <p>Required when create the resource.</p>
     *
     * @param weight the weight value to set.
     * @return the WorkerWeightedAllocationInternal object itself.
     */
    @Generated
    public WorkerWeightedAllocationInternal setWeight(double weight) {
        this.weight = weight;
        this.updatedProperties.add("weight");
        return this;
    }

    /**
     * Set the workerSelectors property: A collection of worker selectors that will be applied if this allocation is
     * selected.
     * <p>Required when create the resource.</p>
     *
     * @param workerSelectors the workerSelectors value to set.
     * @return the WorkerWeightedAllocationInternal object itself.
     */
    @Generated
    public WorkerWeightedAllocationInternal setWorkerSelectors(List<RouterWorkerSelectorInternal> workerSelectors) {
        this.workerSelectors = workerSelectors;
        this.updatedProperties.add("workerSelectors");
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        if (jsonMergePatch) {
            return toJsonMergePatch(jsonWriter);
        } else {
            jsonWriter.writeStartObject();
            jsonWriter.writeDoubleField("weight", this.weight);
            jsonWriter.writeArrayField("workerSelectors", this.workerSelectors,
                (writer, element) -> writer.writeJson(element));
            return jsonWriter.writeEndObject();
        }
    }

    @Generated
    private JsonWriter toJsonMergePatch(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeDoubleField("weight", this.weight);
        if (updatedProperties.contains("workerSelectors")) {
            if (this.workerSelectors == null) {
                jsonWriter.writeNullField("workerSelectors");
            } else {
                jsonWriter.writeArrayField("workerSelectors", this.workerSelectors,
                    (writer, element) -> writer.writeJson(element));
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WorkerWeightedAllocationInternal from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of WorkerWeightedAllocationInternal if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WorkerWeightedAllocationInternal.
     */
    @Generated
    public static WorkerWeightedAllocationInternal fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WorkerWeightedAllocationInternal deserializedWorkerWeightedAllocationInternal
                = new WorkerWeightedAllocationInternal();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("weight".equals(fieldName)) {
                    deserializedWorkerWeightedAllocationInternal.weight = reader.getDouble();
                } else if ("workerSelectors".equals(fieldName)) {
                    List<RouterWorkerSelectorInternal> workerSelectors
                        = reader.readArray(reader1 -> RouterWorkerSelectorInternal.fromJson(reader1));
                    deserializedWorkerWeightedAllocationInternal.workerSelectors = workerSelectors;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedWorkerWeightedAllocationInternal;
        });
    }
}
