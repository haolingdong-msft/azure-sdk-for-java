// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sqlvirtualmachine.fluent.models.SqlVirtualMachineGroupInner;
import com.azure.resourcemanager.sqlvirtualmachine.models.ClusterConfiguration;
import com.azure.resourcemanager.sqlvirtualmachine.models.ClusterManagerType;
import com.azure.resourcemanager.sqlvirtualmachine.models.ScaleType;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlVirtualMachineGroup;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlVirtualMachineGroupUpdate;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlVmGroupImageSku;
import com.azure.resourcemanager.sqlvirtualmachine.models.WsfcDomainProfile;
import java.util.Collections;
import java.util.Map;

public final class SqlVirtualMachineGroupImpl
    implements SqlVirtualMachineGroup, SqlVirtualMachineGroup.Definition, SqlVirtualMachineGroup.Update {
    private SqlVirtualMachineGroupInner innerObject;

    private final com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager serviceManager;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String sqlImageOffer() {
        return this.innerModel().sqlImageOffer();
    }

    public SqlVmGroupImageSku sqlImageSku() {
        return this.innerModel().sqlImageSku();
    }

    public ScaleType scaleType() {
        return this.innerModel().scaleType();
    }

    public ClusterManagerType clusterManagerType() {
        return this.innerModel().clusterManagerType();
    }

    public ClusterConfiguration clusterConfiguration() {
        return this.innerModel().clusterConfiguration();
    }

    public WsfcDomainProfile wsfcDomainProfile() {
        return this.innerModel().wsfcDomainProfile();
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

    public SqlVirtualMachineGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String sqlVirtualMachineGroupName;

    private SqlVirtualMachineGroupUpdate updateParameters;

    public SqlVirtualMachineGroupImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public SqlVirtualMachineGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlVirtualMachineGroups()
                .createOrUpdate(resourceGroupName, sqlVirtualMachineGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public SqlVirtualMachineGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlVirtualMachineGroups()
                .createOrUpdate(resourceGroupName, sqlVirtualMachineGroupName, this.innerModel(), context);
        return this;
    }

    SqlVirtualMachineGroupImpl(
        String name, com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager serviceManager) {
        this.innerObject = new SqlVirtualMachineGroupInner();
        this.serviceManager = serviceManager;
        this.sqlVirtualMachineGroupName = name;
    }

    public SqlVirtualMachineGroupImpl update() {
        this.updateParameters = new SqlVirtualMachineGroupUpdate();
        return this;
    }

    public SqlVirtualMachineGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlVirtualMachineGroups()
                .update(resourceGroupName, sqlVirtualMachineGroupName, updateParameters, Context.NONE);
        return this;
    }

    public SqlVirtualMachineGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlVirtualMachineGroups()
                .update(resourceGroupName, sqlVirtualMachineGroupName, updateParameters, context);
        return this;
    }

    SqlVirtualMachineGroupImpl(
        SqlVirtualMachineGroupInner innerObject,
        com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.sqlVirtualMachineGroupName = Utils.getValueFromIdByName(innerObject.id(), "sqlVirtualMachineGroups");
    }

    public SqlVirtualMachineGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlVirtualMachineGroups()
                .getByResourceGroupWithResponse(resourceGroupName, sqlVirtualMachineGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public SqlVirtualMachineGroup refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlVirtualMachineGroups()
                .getByResourceGroupWithResponse(resourceGroupName, sqlVirtualMachineGroupName, context)
                .getValue();
        return this;
    }

    public SqlVirtualMachineGroupImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SqlVirtualMachineGroupImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SqlVirtualMachineGroupImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public SqlVirtualMachineGroupImpl withSqlImageOffer(String sqlImageOffer) {
        this.innerModel().withSqlImageOffer(sqlImageOffer);
        return this;
    }

    public SqlVirtualMachineGroupImpl withSqlImageSku(SqlVmGroupImageSku sqlImageSku) {
        this.innerModel().withSqlImageSku(sqlImageSku);
        return this;
    }

    public SqlVirtualMachineGroupImpl withWsfcDomainProfile(WsfcDomainProfile wsfcDomainProfile) {
        this.innerModel().withWsfcDomainProfile(wsfcDomainProfile);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
