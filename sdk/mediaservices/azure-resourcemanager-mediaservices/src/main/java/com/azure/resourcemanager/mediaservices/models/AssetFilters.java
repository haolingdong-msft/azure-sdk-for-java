// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of AssetFilters. */
public interface AssetFilters {
    /**
     * List Asset Filters
     *
     * <p>List Asset Filters associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of AssetFilter items as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AssetFilter> list(String resourceGroupName, String accountName, String assetName);

    /**
     * List Asset Filters
     *
     * <p>List Asset Filters associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of AssetFilter items as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AssetFilter> list(String resourceGroupName, String accountName, String assetName, Context context);

    /**
     * Get an Asset Filter.
     *
     * <p>Get the details of an Asset Filter associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param filterName The Asset Filter name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset Filter associated with the specified Asset.
     */
    AssetFilter get(String resourceGroupName, String accountName, String assetName, String filterName);

    /**
     * Get an Asset Filter.
     *
     * <p>Get the details of an Asset Filter associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param filterName The Asset Filter name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset Filter associated with the specified Asset along with {@link Response}.
     */
    Response<AssetFilter> getWithResponse(
        String resourceGroupName, String accountName, String assetName, String filterName, Context context);

    /**
     * Delete an Asset Filter.
     *
     * <p>Deletes an Asset Filter associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param filterName The Asset Filter name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String assetName, String filterName);

    /**
     * Delete an Asset Filter.
     *
     * <p>Deletes an Asset Filter associated with the specified Asset.
     *
     * @param resourceGroupName The name of the resource group within the Azure subscription.
     * @param accountName The Media Services account name.
     * @param assetName The Asset name.
     * @param filterName The Asset Filter name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String assetName, String filterName, Context context);

    /**
     * Get an Asset Filter.
     *
     * <p>Get the details of an Asset Filter associated with the specified Asset.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset Filter associated with the specified Asset along with {@link Response}.
     */
    AssetFilter getById(String id);

    /**
     * Get an Asset Filter.
     *
     * <p>Get the details of an Asset Filter associated with the specified Asset.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Asset Filter associated with the specified Asset along with {@link Response}.
     */
    Response<AssetFilter> getByIdWithResponse(String id, Context context);

    /**
     * Delete an Asset Filter.
     *
     * <p>Deletes an Asset Filter associated with the specified Asset.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete an Asset Filter.
     *
     * <p>Deletes an Asset Filter associated with the specified Asset.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new AssetFilter resource.
     *
     * @param name resource name.
     * @return the first stage of the new AssetFilter definition.
     */
    AssetFilter.DefinitionStages.Blank define(String name);
}
