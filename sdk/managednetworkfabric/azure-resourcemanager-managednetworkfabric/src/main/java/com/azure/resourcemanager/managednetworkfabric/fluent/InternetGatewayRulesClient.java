// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InternetGatewayRuleInner;
import com.azure.resourcemanager.managednetworkfabric.models.InternetGatewayRulePatch;

/** An instance of this class provides access to all the operations defined in InternetGatewayRulesClient. */
public interface InternetGatewayRulesClient {
    /**
     * Creates an Internet Gateway rule.
     *
     * <p>Creates an Internet Gateway rule resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param internetGatewayRuleName Name of the Internet Gateway rule.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Internet Gateway Rule resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<InternetGatewayRuleInner>, InternetGatewayRuleInner> beginCreate(
        String resourceGroupName, String internetGatewayRuleName, InternetGatewayRuleInner body);

    /**
     * Creates an Internet Gateway rule.
     *
     * <p>Creates an Internet Gateway rule resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param internetGatewayRuleName Name of the Internet Gateway rule.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Internet Gateway Rule resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<InternetGatewayRuleInner>, InternetGatewayRuleInner> beginCreate(
        String resourceGroupName, String internetGatewayRuleName, InternetGatewayRuleInner body, Context context);

    /**
     * Creates an Internet Gateway rule.
     *
     * <p>Creates an Internet Gateway rule resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param internetGatewayRuleName Name of the Internet Gateway rule.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Internet Gateway Rule resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InternetGatewayRuleInner create(
        String resourceGroupName, String internetGatewayRuleName, InternetGatewayRuleInner body);

    /**
     * Creates an Internet Gateway rule.
     *
     * <p>Creates an Internet Gateway rule resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param internetGatewayRuleName Name of the Internet Gateway rule.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Internet Gateway Rule resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InternetGatewayRuleInner create(
        String resourceGroupName, String internetGatewayRuleName, InternetGatewayRuleInner body, Context context);

    /**
     * Gets an Internet Gateway Rule.
     *
     * <p>Gets an Internet Gateway Rule resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param internetGatewayRuleName Name of the Internet Gateway rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Internet Gateway Rule resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<InternetGatewayRuleInner> getByResourceGroupWithResponse(
        String resourceGroupName, String internetGatewayRuleName, Context context);

    /**
     * Gets an Internet Gateway Rule.
     *
     * <p>Gets an Internet Gateway Rule resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param internetGatewayRuleName Name of the Internet Gateway rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Internet Gateway Rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InternetGatewayRuleInner getByResourceGroup(String resourceGroupName, String internetGatewayRuleName);

    /**
     * Updates an Internet Gateway Rule.
     *
     * <p>API to update certain properties of the Internet Gateway Rule resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param internetGatewayRuleName Name of the Internet Gateway rule.
     * @param body Internet Gateway Rule properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Internet Gateway Rule resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<InternetGatewayRuleInner>, InternetGatewayRuleInner> beginUpdate(
        String resourceGroupName, String internetGatewayRuleName, InternetGatewayRulePatch body);

    /**
     * Updates an Internet Gateway Rule.
     *
     * <p>API to update certain properties of the Internet Gateway Rule resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param internetGatewayRuleName Name of the Internet Gateway rule.
     * @param body Internet Gateway Rule properties to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Internet Gateway Rule resource definition.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<InternetGatewayRuleInner>, InternetGatewayRuleInner> beginUpdate(
        String resourceGroupName, String internetGatewayRuleName, InternetGatewayRulePatch body, Context context);

    /**
     * Updates an Internet Gateway Rule.
     *
     * <p>API to update certain properties of the Internet Gateway Rule resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param internetGatewayRuleName Name of the Internet Gateway rule.
     * @param body Internet Gateway Rule properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Internet Gateway Rule resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InternetGatewayRuleInner update(
        String resourceGroupName, String internetGatewayRuleName, InternetGatewayRulePatch body);

    /**
     * Updates an Internet Gateway Rule.
     *
     * <p>API to update certain properties of the Internet Gateway Rule resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param internetGatewayRuleName Name of the Internet Gateway rule.
     * @param body Internet Gateway Rule properties to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Internet Gateway Rule resource definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    InternetGatewayRuleInner update(
        String resourceGroupName, String internetGatewayRuleName, InternetGatewayRulePatch body, Context context);

    /**
     * Deletes an Internet Gateway Rule.
     *
     * <p>Implements Internet Gateway Rules DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param internetGatewayRuleName Name of the Internet Gateway rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String internetGatewayRuleName);

    /**
     * Deletes an Internet Gateway Rule.
     *
     * <p>Implements Internet Gateway Rules DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param internetGatewayRuleName Name of the Internet Gateway rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String internetGatewayRuleName, Context context);

    /**
     * Deletes an Internet Gateway Rule.
     *
     * <p>Implements Internet Gateway Rules DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param internetGatewayRuleName Name of the Internet Gateway rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String internetGatewayRuleName);

    /**
     * Deletes an Internet Gateway Rule.
     *
     * <p>Implements Internet Gateway Rules DELETE method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param internetGatewayRuleName Name of the Internet Gateway rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String internetGatewayRuleName, Context context);

    /**
     * List Internet Gateway Rules by resource group.
     *
     * <p>Implements Internet Gateway Rules list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Internet Gateway Rules as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InternetGatewayRuleInner> listByResourceGroup(String resourceGroupName);

    /**
     * List Internet Gateway Rules by resource group.
     *
     * <p>Implements Internet Gateway Rules list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Internet Gateway Rules as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InternetGatewayRuleInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List Internet Gateway Rules by subscription.
     *
     * <p>List all Internet Gateway rules in the given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Internet Gateway Rules as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InternetGatewayRuleInner> list();

    /**
     * List Internet Gateway Rules by subscription.
     *
     * <p>List all Internet Gateway rules in the given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Internet Gateway Rules as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<InternetGatewayRuleInner> list(Context context);
}
