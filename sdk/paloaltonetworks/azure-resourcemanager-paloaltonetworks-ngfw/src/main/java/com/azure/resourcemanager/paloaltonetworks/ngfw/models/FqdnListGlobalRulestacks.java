// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.FqdnListGlobalRulestackResourceInner;

/**
 * Resource collection API of FqdnListGlobalRulestacks.
 */
public interface FqdnListGlobalRulestacks {
    /**
     * List FqdnListGlobalRulestackResource resources by Tenant.
     * 
     * @param globalRulestackName GlobalRulestack resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FqdnListGlobalRulestackResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<FqdnListGlobalRulestackResource> list(String globalRulestackName);

    /**
     * List FqdnListGlobalRulestackResource resources by Tenant.
     * 
     * @param globalRulestackName GlobalRulestack resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a FqdnListGlobalRulestackResource list operation as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<FqdnListGlobalRulestackResource> list(String globalRulestackName, Context context);

    /**
     * Get a FqdnListGlobalRulestackResource.
     * 
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name fqdn list name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FqdnListGlobalRulestackResource along with {@link Response}.
     */
    Response<FqdnListGlobalRulestackResource> getWithResponse(String globalRulestackName, String name, Context context);

    /**
     * Get a FqdnListGlobalRulestackResource.
     * 
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name fqdn list name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a FqdnListGlobalRulestackResource.
     */
    FqdnListGlobalRulestackResource get(String globalRulestackName, String name);

    /**
     * Create a FqdnListGlobalRulestackResource.
     * 
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name fqdn list name.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return globalRulestack fqdnList.
     */
    FqdnListGlobalRulestackResource createOrUpdate(String globalRulestackName, String name,
        FqdnListGlobalRulestackResourceInner resource);

    /**
     * Create a FqdnListGlobalRulestackResource.
     * 
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name fqdn list name.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return globalRulestack fqdnList.
     */
    FqdnListGlobalRulestackResource createOrUpdate(String globalRulestackName, String name,
        FqdnListGlobalRulestackResourceInner resource, Context context);

    /**
     * Delete a FqdnListGlobalRulestackResource.
     * 
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name fqdn list name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String globalRulestackName, String name);

    /**
     * Delete a FqdnListGlobalRulestackResource.
     * 
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name fqdn list name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String globalRulestackName, String name, Context context);
}
