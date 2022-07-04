// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.fluent.models.ContentKeyPolicyInner;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicy;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyOption;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyProperties;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public final class ContentKeyPolicyImpl
    implements ContentKeyPolicy, ContentKeyPolicy.Definition, ContentKeyPolicy.Update {
    private ContentKeyPolicyInner innerObject;

    private final com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager;

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

    public UUID policyId() {
        return this.innerModel().policyId();
    }

    public OffsetDateTime created() {
        return this.innerModel().created();
    }

    public OffsetDateTime lastModified() {
        return this.innerModel().lastModified();
    }

    public String description() {
        return this.innerModel().description();
    }

    public List<ContentKeyPolicyOption> options() {
        List<ContentKeyPolicyOption> inner = this.innerModel().options();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ContentKeyPolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mediaservices.MediaServicesManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String contentKeyPolicyName;

    public ContentKeyPolicyImpl withExistingMediaService(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public ContentKeyPolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContentKeyPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, contentKeyPolicyName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ContentKeyPolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContentKeyPolicies()
                .createOrUpdateWithResponse(
                    resourceGroupName, accountName, contentKeyPolicyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ContentKeyPolicyImpl(String name, com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerObject = new ContentKeyPolicyInner();
        this.serviceManager = serviceManager;
        this.contentKeyPolicyName = name;
    }

    public ContentKeyPolicyImpl update() {
        return this;
    }

    public ContentKeyPolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContentKeyPolicies()
                .updateWithResponse(
                    resourceGroupName, accountName, contentKeyPolicyName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public ContentKeyPolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContentKeyPolicies()
                .updateWithResponse(resourceGroupName, accountName, contentKeyPolicyName, this.innerModel(), context)
                .getValue();
        return this;
    }

    ContentKeyPolicyImpl(
        ContentKeyPolicyInner innerObject,
        com.azure.resourcemanager.mediaservices.MediaServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "mediaServices");
        this.contentKeyPolicyName = Utils.getValueFromIdByName(innerObject.id(), "contentKeyPolicies");
    }

    public ContentKeyPolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContentKeyPolicies()
                .getWithResponse(resourceGroupName, accountName, contentKeyPolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public ContentKeyPolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContentKeyPolicies()
                .getWithResponse(resourceGroupName, accountName, contentKeyPolicyName, context)
                .getValue();
        return this;
    }

    public ContentKeyPolicyProperties getPolicyPropertiesWithSecrets() {
        return serviceManager
            .contentKeyPolicies()
            .getPolicyPropertiesWithSecrets(resourceGroupName, accountName, contentKeyPolicyName);
    }

    public Response<ContentKeyPolicyProperties> getPolicyPropertiesWithSecretsWithResponse(Context context) {
        return serviceManager
            .contentKeyPolicies()
            .getPolicyPropertiesWithSecretsWithResponse(resourceGroupName, accountName, contentKeyPolicyName, context);
    }

    public ContentKeyPolicyImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public ContentKeyPolicyImpl withOptions(List<ContentKeyPolicyOption> options) {
        this.innerModel().withOptions(options);
        return this;
    }
}
