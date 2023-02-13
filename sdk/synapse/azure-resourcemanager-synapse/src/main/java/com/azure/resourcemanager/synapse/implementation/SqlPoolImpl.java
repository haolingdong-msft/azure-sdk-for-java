// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolInner;
import com.azure.resourcemanager.synapse.models.CreateMode;
import com.azure.resourcemanager.synapse.models.ResourceMoveDefinition;
import com.azure.resourcemanager.synapse.models.Sku;
import com.azure.resourcemanager.synapse.models.SqlPool;
import com.azure.resourcemanager.synapse.models.SqlPoolPatchInfo;
import com.azure.resourcemanager.synapse.models.StorageAccountType;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.Map;

public final class SqlPoolImpl implements SqlPool, SqlPool.Definition, SqlPool.Update {
    private SqlPoolInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

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

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Long maxSizeBytes() {
        return this.innerModel().maxSizeBytes();
    }

    public String collation() {
        return this.innerModel().collation();
    }

    public String sourceDatabaseId() {
        return this.innerModel().sourceDatabaseId();
    }

    public String recoverableDatabaseId() {
        return this.innerModel().recoverableDatabaseId();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String status() {
        return this.innerModel().status();
    }

    public OffsetDateTime restorePointInTime() {
        return this.innerModel().restorePointInTime();
    }

    public CreateMode createMode() {
        return this.innerModel().createMode();
    }

    public OffsetDateTime creationDate() {
        return this.innerModel().creationDate();
    }

    public StorageAccountType storageAccountType() {
        return this.innerModel().storageAccountType();
    }

    public OffsetDateTime sourceDatabaseDeletionDate() {
        return this.innerModel().sourceDatabaseDeletionDate();
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

    public SqlPoolInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String sqlPoolName;

    private SqlPoolPatchInfo updateSqlPoolInfo;

    public SqlPoolImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public SqlPool create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlPools()
                .create(resourceGroupName, workspaceName, sqlPoolName, this.innerModel(), Context.NONE);
        return this;
    }

    public SqlPool create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlPools()
                .create(resourceGroupName, workspaceName, sqlPoolName, this.innerModel(), context);
        return this;
    }

    SqlPoolImpl(String name, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = new SqlPoolInner();
        this.serviceManager = serviceManager;
        this.sqlPoolName = name;
    }

    public SqlPoolImpl update() {
        this.updateSqlPoolInfo = new SqlPoolPatchInfo();
        return this;
    }

    public SqlPool apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlPools()
                .update(resourceGroupName, workspaceName, sqlPoolName, updateSqlPoolInfo, Context.NONE);
        return this;
    }

    public SqlPool apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlPools()
                .update(resourceGroupName, workspaceName, sqlPoolName, updateSqlPoolInfo, context);
        return this;
    }

    SqlPoolImpl(SqlPoolInner innerObject, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.sqlPoolName = Utils.getValueFromIdByName(innerObject.id(), "sqlPools");
    }

    public SqlPool refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlPools()
                .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, Context.NONE)
                .getValue();
        return this;
    }

    public SqlPool refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSqlPools()
                .getWithResponse(resourceGroupName, workspaceName, sqlPoolName, context)
                .getValue();
        return this;
    }

    public SqlPool pause() {
        return serviceManager.sqlPools().pause(resourceGroupName, workspaceName, sqlPoolName);
    }

    public SqlPool pause(Context context) {
        return serviceManager.sqlPools().pause(resourceGroupName, workspaceName, sqlPoolName, context);
    }

    public SqlPool resume() {
        return serviceManager.sqlPools().resume(resourceGroupName, workspaceName, sqlPoolName);
    }

    public SqlPool resume(Context context) {
        return serviceManager.sqlPools().resume(resourceGroupName, workspaceName, sqlPoolName, context);
    }

    public Response<Void> renameWithResponse(ResourceMoveDefinition parameters, Context context) {
        return serviceManager
            .sqlPools()
            .renameWithResponse(resourceGroupName, workspaceName, sqlPoolName, parameters, context);
    }

    public void rename(ResourceMoveDefinition parameters) {
        serviceManager.sqlPools().rename(resourceGroupName, workspaceName, sqlPoolName, parameters);
    }

    public SqlPoolImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SqlPoolImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SqlPoolImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateSqlPoolInfo.withTags(tags);
            return this;
        }
    }

    public SqlPoolImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateSqlPoolInfo.withSku(sku);
            return this;
        }
    }

    public SqlPoolImpl withMaxSizeBytes(Long maxSizeBytes) {
        if (isInCreateMode()) {
            this.innerModel().withMaxSizeBytes(maxSizeBytes);
            return this;
        } else {
            this.updateSqlPoolInfo.withMaxSizeBytes(maxSizeBytes);
            return this;
        }
    }

    public SqlPoolImpl withCollation(String collation) {
        this.innerModel().withCollation(collation);
        return this;
    }

    public SqlPoolImpl withSourceDatabaseId(String sourceDatabaseId) {
        if (isInCreateMode()) {
            this.innerModel().withSourceDatabaseId(sourceDatabaseId);
            return this;
        } else {
            this.updateSqlPoolInfo.withSourceDatabaseId(sourceDatabaseId);
            return this;
        }
    }

    public SqlPoolImpl withRecoverableDatabaseId(String recoverableDatabaseId) {
        if (isInCreateMode()) {
            this.innerModel().withRecoverableDatabaseId(recoverableDatabaseId);
            return this;
        } else {
            this.updateSqlPoolInfo.withRecoverableDatabaseId(recoverableDatabaseId);
            return this;
        }
    }

    public SqlPoolImpl withProvisioningState(String provisioningState) {
        if (isInCreateMode()) {
            this.innerModel().withProvisioningState(provisioningState);
            return this;
        } else {
            this.updateSqlPoolInfo.withProvisioningState(provisioningState);
            return this;
        }
    }

    public SqlPoolImpl withRestorePointInTime(OffsetDateTime restorePointInTime) {
        this.innerModel().withRestorePointInTime(restorePointInTime);
        return this;
    }

    public SqlPoolImpl withCreateMode(CreateMode createMode) {
        if (isInCreateMode()) {
            this.innerModel().withCreateMode(createMode);
            return this;
        } else {
            this.updateSqlPoolInfo.withCreateMode(createMode);
            return this;
        }
    }

    public SqlPoolImpl withStorageAccountType(StorageAccountType storageAccountType) {
        if (isInCreateMode()) {
            this.innerModel().withStorageAccountType(storageAccountType);
            return this;
        } else {
            this.updateSqlPoolInfo.withStorageAccountType(storageAccountType);
            return this;
        }
    }

    public SqlPoolImpl withSourceDatabaseDeletionDate(OffsetDateTime sourceDatabaseDeletionDate) {
        this.innerModel().withSourceDatabaseDeletionDate(sourceDatabaseDeletionDate);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
