// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.resourcemanager.datafactory.fluent.models.GitHubAccessTokenResponseInner;

/**
 * An immutable client-side representation of GitHubAccessTokenResponse.
 */
public interface GitHubAccessTokenResponse {
    /**
     * Gets the gitHubAccessToken property: GitHub access token.
     * 
     * @return the gitHubAccessToken value.
     */
    String gitHubAccessToken();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.GitHubAccessTokenResponseInner object.
     * 
     * @return the inner object.
     */
    GitHubAccessTokenResponseInner innerModel();
}
