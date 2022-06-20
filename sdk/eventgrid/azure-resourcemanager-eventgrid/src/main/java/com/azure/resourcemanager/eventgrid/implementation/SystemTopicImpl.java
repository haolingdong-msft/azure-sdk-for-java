// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.fluent.models.SystemTopicInner;
import com.azure.resourcemanager.eventgrid.models.IdentityInfo;
import com.azure.resourcemanager.eventgrid.models.ResourceProvisioningState;
import com.azure.resourcemanager.eventgrid.models.SystemTopic;
import com.azure.resourcemanager.eventgrid.models.SystemTopicUpdateParameters;
import java.util.Collections;
import java.util.Map;

public final class SystemTopicImpl implements SystemTopic, SystemTopic.Definition, SystemTopic.Update {
    private SystemTopicInner innerObject;

    private final com.azure.resourcemanager.eventgrid.EventGridManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public IdentityInfo identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ResourceProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String source() {
        return this.innerModel().source();
    }

    public String topicType() {
        return this.innerModel().topicType();
    }

    public String metricResourceId() {
        return this.innerModel().metricResourceId();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public SystemTopicInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.EventGridManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String systemTopicName;

    private SystemTopicUpdateParameters updateSystemTopicUpdateParameters;

    public SystemTopicImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public SystemTopic create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSystemTopics()
                .createOrUpdate(resourceGroupName, systemTopicName, this.innerModel(), Context.NONE);
        return this;
    }

    public SystemTopic create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSystemTopics()
                .createOrUpdate(resourceGroupName, systemTopicName, this.innerModel(), context);
        return this;
    }

    SystemTopicImpl(String name, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerObject = new SystemTopicInner();
        this.serviceManager = serviceManager;
        this.systemTopicName = name;
    }

    public SystemTopicImpl update() {
        this.updateSystemTopicUpdateParameters = new SystemTopicUpdateParameters();
        return this;
    }

    public SystemTopic apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSystemTopics()
                .update(resourceGroupName, systemTopicName, updateSystemTopicUpdateParameters, Context.NONE);
        return this;
    }

    public SystemTopic apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSystemTopics()
                .update(resourceGroupName, systemTopicName, updateSystemTopicUpdateParameters, context);
        return this;
    }

    SystemTopicImpl(SystemTopicInner innerObject, com.azure.resourcemanager.eventgrid.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.systemTopicName = Utils.getValueFromIdByName(innerObject.id(), "systemTopics");
    }

    public SystemTopic refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSystemTopics()
                .getByResourceGroupWithResponse(resourceGroupName, systemTopicName, Context.NONE)
                .getValue();
        return this;
    }

    public SystemTopic refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSystemTopics()
                .getByResourceGroupWithResponse(resourceGroupName, systemTopicName, context)
                .getValue();
        return this;
    }

    public SystemTopicImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SystemTopicImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SystemTopicImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateSystemTopicUpdateParameters.withTags(tags);
            return this;
        }
    }

    public SystemTopicImpl withIdentity(IdentityInfo identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateSystemTopicUpdateParameters.withIdentity(identity);
            return this;
        }
    }

    public SystemTopicImpl withSource(String source) {
        this.innerModel().withSource(source);
        return this;
    }

    public SystemTopicImpl withTopicType(String topicType) {
        this.innerModel().withTopicType(topicType);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
