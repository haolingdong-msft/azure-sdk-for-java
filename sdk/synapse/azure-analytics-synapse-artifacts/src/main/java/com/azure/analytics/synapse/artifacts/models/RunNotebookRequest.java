// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Run notebook request.
 */
@Fluent
public final class RunNotebookRequest {
    /*
     * Notebook name.
     */
    @JsonProperty(value = "notebook")
    private String notebook;

    /*
     * SparkPool name.
     */
    @JsonProperty(value = "sparkPool")
    private String sparkPool;

    /*
     * Session properties.
     */
    @JsonProperty(value = "sessionOptions")
    private RunNotebookSparkSessionOptions sessionOptions;

    /*
     * Whether session should run till time to live after run completes.
     */
    @JsonProperty(value = "honorSessionTimeToLive")
    private Boolean honorSessionTimeToLive;

    /*
     * Run notebook parameters
     */
    @JsonProperty(value = "parameters")
    private Map<String, RunNotebookParameter> parameters;

    /**
     * Creates an instance of RunNotebookRequest class.
     */
    public RunNotebookRequest() {
    }

    /**
     * Get the notebook property: Notebook name.
     * 
     * @return the notebook value.
     */
    public String getNotebook() {
        return this.notebook;
    }

    /**
     * Set the notebook property: Notebook name.
     * 
     * @param notebook the notebook value to set.
     * @return the RunNotebookRequest object itself.
     */
    public RunNotebookRequest setNotebook(String notebook) {
        this.notebook = notebook;
        return this;
    }

    /**
     * Get the sparkPool property: SparkPool name.
     * 
     * @return the sparkPool value.
     */
    public String getSparkPool() {
        return this.sparkPool;
    }

    /**
     * Set the sparkPool property: SparkPool name.
     * 
     * @param sparkPool the sparkPool value to set.
     * @return the RunNotebookRequest object itself.
     */
    public RunNotebookRequest setSparkPool(String sparkPool) {
        this.sparkPool = sparkPool;
        return this;
    }

    /**
     * Get the sessionOptions property: Session properties.
     * 
     * @return the sessionOptions value.
     */
    public RunNotebookSparkSessionOptions getSessionOptions() {
        return this.sessionOptions;
    }

    /**
     * Set the sessionOptions property: Session properties.
     * 
     * @param sessionOptions the sessionOptions value to set.
     * @return the RunNotebookRequest object itself.
     */
    public RunNotebookRequest setSessionOptions(RunNotebookSparkSessionOptions sessionOptions) {
        this.sessionOptions = sessionOptions;
        return this;
    }

    /**
     * Get the honorSessionTimeToLive property: Whether session should run till time to live after run completes.
     * 
     * @return the honorSessionTimeToLive value.
     */
    public Boolean isHonorSessionTimeToLive() {
        return this.honorSessionTimeToLive;
    }

    /**
     * Set the honorSessionTimeToLive property: Whether session should run till time to live after run completes.
     * 
     * @param honorSessionTimeToLive the honorSessionTimeToLive value to set.
     * @return the RunNotebookRequest object itself.
     */
    public RunNotebookRequest setHonorSessionTimeToLive(Boolean honorSessionTimeToLive) {
        this.honorSessionTimeToLive = honorSessionTimeToLive;
        return this;
    }

    /**
     * Get the parameters property: Run notebook parameters.
     * 
     * @return the parameters value.
     */
    public Map<String, RunNotebookParameter> getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Run notebook parameters.
     * 
     * @param parameters the parameters value to set.
     * @return the RunNotebookRequest object itself.
     */
    public RunNotebookRequest setParameters(Map<String, RunNotebookParameter> parameters) {
        this.parameters = parameters;
        return this;
    }
}
