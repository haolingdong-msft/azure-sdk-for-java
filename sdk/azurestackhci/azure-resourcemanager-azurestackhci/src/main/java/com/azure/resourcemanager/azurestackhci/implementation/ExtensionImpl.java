// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestackhci.fluent.models.ExtensionInner;
import com.azure.resourcemanager.azurestackhci.models.Extension;
import com.azure.resourcemanager.azurestackhci.models.ExtensionAggregateState;
import com.azure.resourcemanager.azurestackhci.models.PerNodeExtensionState;
import com.azure.resourcemanager.azurestackhci.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class ExtensionImpl implements Extension, Extension.Definition, Extension.Update {
    private ExtensionInner innerObject;

    private final com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager;

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

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ExtensionAggregateState aggregateState() {
        return this.innerModel().aggregateState();
    }

    public List<PerNodeExtensionState> perNodeExtensionDetails() {
        List<PerNodeExtensionState> inner = this.innerModel().perNodeExtensionDetails();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String forceUpdateTag() {
        return this.innerModel().forceUpdateTag();
    }

    public String publisher() {
        return this.innerModel().publisher();
    }

    public String typePropertiesType() {
        return this.innerModel().typePropertiesType();
    }

    public String typeHandlerVersion() {
        return this.innerModel().typeHandlerVersion();
    }

    public Boolean autoUpgradeMinorVersion() {
        return this.innerModel().autoUpgradeMinorVersion();
    }

    public Object settings() {
        return this.innerModel().settings();
    }

    public Object protectedSettings() {
        return this.innerModel().protectedSettings();
    }

    public ExtensionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String arcSettingName;

    private String extensionName;

    public ExtensionImpl withExistingArcSetting(String resourceGroupName, String clusterName, String arcSettingName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        this.arcSettingName = arcSettingName;
        return this;
    }

    public Extension create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtensions()
                .create(resourceGroupName, clusterName, arcSettingName, extensionName, this.innerModel(), Context.NONE);
        return this;
    }

    public Extension create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtensions()
                .create(resourceGroupName, clusterName, arcSettingName, extensionName, this.innerModel(), context);
        return this;
    }

    ExtensionImpl(String name, com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager) {
        this.innerObject = new ExtensionInner();
        this.serviceManager = serviceManager;
        this.extensionName = name;
    }

    public ExtensionImpl update() {
        return this;
    }

    public Extension apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtensions()
                .update(resourceGroupName, clusterName, arcSettingName, extensionName, this.innerModel(), Context.NONE);
        return this;
    }

    public Extension apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtensions()
                .update(resourceGroupName, clusterName, arcSettingName, extensionName, this.innerModel(), context);
        return this;
    }

    ExtensionImpl(
        ExtensionInner innerObject, com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "clusters");
        this.arcSettingName = Utils.getValueFromIdByName(innerObject.id(), "arcSettings");
        this.extensionName = Utils.getValueFromIdByName(innerObject.id(), "extensions");
    }

    public Extension refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtensions()
                .getWithResponse(resourceGroupName, clusterName, arcSettingName, extensionName, Context.NONE)
                .getValue();
        return this;
    }

    public Extension refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getExtensions()
                .getWithResponse(resourceGroupName, clusterName, arcSettingName, extensionName, context)
                .getValue();
        return this;
    }

    public ExtensionImpl withForceUpdateTag(String forceUpdateTag) {
        this.innerModel().withForceUpdateTag(forceUpdateTag);
        return this;
    }

    public ExtensionImpl withPublisher(String publisher) {
        this.innerModel().withPublisher(publisher);
        return this;
    }

    public ExtensionImpl withTypePropertiesType(String typePropertiesType) {
        this.innerModel().withTypePropertiesType(typePropertiesType);
        return this;
    }

    public ExtensionImpl withTypeHandlerVersion(String typeHandlerVersion) {
        this.innerModel().withTypeHandlerVersion(typeHandlerVersion);
        return this;
    }

    public ExtensionImpl withAutoUpgradeMinorVersion(Boolean autoUpgradeMinorVersion) {
        this.innerModel().withAutoUpgradeMinorVersion(autoUpgradeMinorVersion);
        return this;
    }

    public ExtensionImpl withSettings(Object settings) {
        this.innerModel().withSettings(settings);
        return this;
    }

    public ExtensionImpl withProtectedSettings(Object protectedSettings) {
        this.innerModel().withProtectedSettings(protectedSettings);
        return this;
    }
}
