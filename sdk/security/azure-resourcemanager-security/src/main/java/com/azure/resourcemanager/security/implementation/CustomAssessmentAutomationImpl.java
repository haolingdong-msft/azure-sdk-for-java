// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.CustomAssessmentAutomationInner;
import com.azure.resourcemanager.security.models.CustomAssessmentAutomation;
import com.azure.resourcemanager.security.models.CustomAssessmentAutomationRequest;
import com.azure.resourcemanager.security.models.SeverityEnum;
import com.azure.resourcemanager.security.models.SupportedCloudEnum;

public final class CustomAssessmentAutomationImpl
    implements CustomAssessmentAutomation, CustomAssessmentAutomation.Definition {
    private CustomAssessmentAutomationInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    CustomAssessmentAutomationImpl(
        CustomAssessmentAutomationInner innerObject,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String compressedQuery() {
        return this.innerModel().compressedQuery();
    }

    public SupportedCloudEnum supportedCloud() {
        return this.innerModel().supportedCloud();
    }

    public SeverityEnum severity() {
        return this.innerModel().severity();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String remediationDescription() {
        return this.innerModel().remediationDescription();
    }

    public String assessmentKey() {
        return this.innerModel().assessmentKey();
    }

    public CustomAssessmentAutomationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String customAssessmentAutomationName;

    private CustomAssessmentAutomationRequest createCustomAssessmentAutomationBody;

    public CustomAssessmentAutomationImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public CustomAssessmentAutomation create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomAssessmentAutomations()
                .createWithResponse(
                    resourceGroupName,
                    customAssessmentAutomationName,
                    createCustomAssessmentAutomationBody,
                    Context.NONE)
                .getValue();
        return this;
    }

    public CustomAssessmentAutomation create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomAssessmentAutomations()
                .createWithResponse(
                    resourceGroupName, customAssessmentAutomationName, createCustomAssessmentAutomationBody, context)
                .getValue();
        return this;
    }

    CustomAssessmentAutomationImpl(String name, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = new CustomAssessmentAutomationInner();
        this.serviceManager = serviceManager;
        this.customAssessmentAutomationName = name;
        this.createCustomAssessmentAutomationBody = new CustomAssessmentAutomationRequest();
    }

    public CustomAssessmentAutomation refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomAssessmentAutomations()
                .getByResourceGroupWithResponse(resourceGroupName, customAssessmentAutomationName, Context.NONE)
                .getValue();
        return this;
    }

    public CustomAssessmentAutomation refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getCustomAssessmentAutomations()
                .getByResourceGroupWithResponse(resourceGroupName, customAssessmentAutomationName, context)
                .getValue();
        return this;
    }

    public CustomAssessmentAutomationImpl withCompressedQuery(String compressedQuery) {
        this.createCustomAssessmentAutomationBody.withCompressedQuery(compressedQuery);
        return this;
    }

    public CustomAssessmentAutomationImpl withSupportedCloud(SupportedCloudEnum supportedCloud) {
        this.createCustomAssessmentAutomationBody.withSupportedCloud(supportedCloud);
        return this;
    }

    public CustomAssessmentAutomationImpl withSeverity(SeverityEnum severity) {
        this.createCustomAssessmentAutomationBody.withSeverity(severity);
        return this;
    }

    public CustomAssessmentAutomationImpl withDisplayName(String displayName) {
        this.createCustomAssessmentAutomationBody.withDisplayName(displayName);
        return this;
    }

    public CustomAssessmentAutomationImpl withDescription(String description) {
        this.createCustomAssessmentAutomationBody.withDescription(description);
        return this;
    }

    public CustomAssessmentAutomationImpl withRemediationDescription(String remediationDescription) {
        this.createCustomAssessmentAutomationBody.withRemediationDescription(remediationDescription);
        return this;
    }
}
