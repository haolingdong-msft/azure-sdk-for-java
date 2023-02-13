// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.ManagedIdentitySqlControlSettingsModelInner;

/** Resource collection API of WorkspaceManagedIdentitySqlControlSettings. */
public interface WorkspaceManagedIdentitySqlControlSettings {
    /**
     * Get Managed Identity Sql Control Settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Identity Sql Control Settings along with {@link Response}.
     */
    Response<ManagedIdentitySqlControlSettingsModel> getWithResponse(
        String resourceGroupName, String workspaceName, Context context);

    /**
     * Get Managed Identity Sql Control Settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Identity Sql Control Settings.
     */
    ManagedIdentitySqlControlSettingsModel get(String resourceGroupName, String workspaceName);

    /**
     * Create or update Managed Identity Sql Control Settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param managedIdentitySqlControlSettings Managed Identity Sql Control Settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Identity Sql Control Settings.
     */
    ManagedIdentitySqlControlSettingsModel createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        ManagedIdentitySqlControlSettingsModelInner managedIdentitySqlControlSettings);

    /**
     * Create or update Managed Identity Sql Control Settings.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace.
     * @param managedIdentitySqlControlSettings Managed Identity Sql Control Settings.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return managed Identity Sql Control Settings.
     */
    ManagedIdentitySqlControlSettingsModel createOrUpdate(
        String resourceGroupName,
        String workspaceName,
        ManagedIdentitySqlControlSettingsModelInner managedIdentitySqlControlSettings,
        Context context);
}
