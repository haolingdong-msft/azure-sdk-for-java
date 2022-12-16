// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties specific to the monitor resource. */
@Fluent
public final class MonitorProperties {
    /*
     * ProvisioningState
     *
     * Provisioning state of the monitor resource.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /*
     * Flag specifying if the resource monitoring is enabled or disabled.
     */
    @JsonProperty(value = "monitoringStatus")
    private MonitoringStatus monitoringStatus;

    /*
     * Elastic cloud properties.
     */
    @JsonProperty(value = "elasticProperties")
    private ElasticProperties elasticProperties;

    /*
     * User information.
     */
    @JsonProperty(value = "userInfo")
    private UserInfo userInfo;

    /*
     * Version of elastic of the monitor resource
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * The liftrResourceCategory property.
     */
    @JsonProperty(value = "liftrResourceCategory", access = JsonProperty.Access.WRITE_ONLY)
    private LiftrResourceCategories liftrResourceCategory;

    /*
     * The priority of the resource.
     */
    @JsonProperty(value = "liftrResourcePreference", access = JsonProperty.Access.WRITE_ONLY)
    private Integer liftrResourcePreference;

    /** Creates an instance of MonitorProperties class. */
    public MonitorProperties() {
    }

    /**
     * Get the provisioningState property: ProvisioningState
     *
     * <p>Provisioning state of the monitor resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: ProvisioningState
     *
     * <p>Provisioning state of the monitor resource.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the monitoringStatus property: Flag specifying if the resource monitoring is enabled or disabled.
     *
     * @return the monitoringStatus value.
     */
    public MonitoringStatus monitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * Set the monitoringStatus property: Flag specifying if the resource monitoring is enabled or disabled.
     *
     * @param monitoringStatus the monitoringStatus value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withMonitoringStatus(MonitoringStatus monitoringStatus) {
        this.monitoringStatus = monitoringStatus;
        return this;
    }

    /**
     * Get the elasticProperties property: Elastic cloud properties.
     *
     * @return the elasticProperties value.
     */
    public ElasticProperties elasticProperties() {
        return this.elasticProperties;
    }

    /**
     * Set the elasticProperties property: Elastic cloud properties.
     *
     * @param elasticProperties the elasticProperties value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withElasticProperties(ElasticProperties elasticProperties) {
        this.elasticProperties = elasticProperties;
        return this;
    }

    /**
     * Get the userInfo property: User information.
     *
     * @return the userInfo value.
     */
    public UserInfo userInfo() {
        return this.userInfo;
    }

    /**
     * Set the userInfo property: User information.
     *
     * @param userInfo the userInfo value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    /**
     * Get the version property: Version of elastic of the monitor resource.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version of elastic of the monitor resource.
     *
     * @param version the version value to set.
     * @return the MonitorProperties object itself.
     */
    public MonitorProperties withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the liftrResourceCategory property: The liftrResourceCategory property.
     *
     * @return the liftrResourceCategory value.
     */
    public LiftrResourceCategories liftrResourceCategory() {
        return this.liftrResourceCategory;
    }

    /**
     * Get the liftrResourcePreference property: The priority of the resource.
     *
     * @return the liftrResourcePreference value.
     */
    public Integer liftrResourcePreference() {
        return this.liftrResourcePreference;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (elasticProperties() != null) {
            elasticProperties().validate();
        }
        if (userInfo() != null) {
            userInfo().validate();
        }
    }
}
