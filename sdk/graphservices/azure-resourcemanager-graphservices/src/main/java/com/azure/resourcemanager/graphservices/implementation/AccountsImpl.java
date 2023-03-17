// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.graphservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.graphservices.fluent.AccountsClient;
import com.azure.resourcemanager.graphservices.fluent.models.AccountResourceInner;
import com.azure.resourcemanager.graphservices.models.AccountResource;
import com.azure.resourcemanager.graphservices.models.Accounts;

public final class AccountsImpl implements Accounts {
    private static final ClientLogger LOGGER = new ClientLogger(AccountsImpl.class);

    private final AccountsClient innerClient;

    private final com.azure.resourcemanager.graphservices.GraphServicesManager serviceManager;

    public AccountsImpl(
        AccountsClient innerClient, com.azure.resourcemanager.graphservices.GraphServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AccountResource> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AccountResourceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AccountResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<AccountResource> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AccountResourceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new AccountResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<AccountResource> list() {
        PagedIterable<AccountResourceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AccountResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<AccountResource> list(Context context) {
        PagedIterable<AccountResourceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new AccountResourceImpl(inner1, this.manager()));
    }

    private AccountsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.graphservices.GraphServicesManager manager() {
        return this.serviceManager;
    }
}
