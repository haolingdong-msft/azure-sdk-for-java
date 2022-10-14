// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.GovernanceRulesOperationsClient;
import com.azure.resourcemanager.security.fluent.models.GovernanceRuleInner;
import com.azure.resourcemanager.security.models.ExecuteGovernanceRuleParams;
import com.azure.resourcemanager.security.models.GovernanceRule;
import com.azure.resourcemanager.security.models.GovernanceRulesOperations;

public final class GovernanceRulesOperationsImpl implements GovernanceRulesOperations {
    private static final ClientLogger LOGGER = new ClientLogger(GovernanceRulesOperationsImpl.class);

    private final GovernanceRulesOperationsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public GovernanceRulesOperationsImpl(
        GovernanceRulesOperationsClient innerClient,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public GovernanceRule get(String ruleId) {
        GovernanceRuleInner inner = this.serviceClient().get(ruleId);
        if (inner != null) {
            return new GovernanceRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GovernanceRule> getWithResponse(String ruleId, Context context) {
        Response<GovernanceRuleInner> inner = this.serviceClient().getWithResponse(ruleId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GovernanceRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String ruleId) {
        this.serviceClient().delete(ruleId);
    }

    public Response<Void> deleteWithResponse(String ruleId, Context context) {
        return this.serviceClient().deleteWithResponse(ruleId, context);
    }

    public void ruleIdExecuteSingleSubscription(
        String ruleId, ExecuteGovernanceRuleParams executeGovernanceRuleParams) {
        this.serviceClient().ruleIdExecuteSingleSubscription(ruleId, executeGovernanceRuleParams);
    }

    public void ruleIdExecuteSingleSubscription(String ruleId) {
        this.serviceClient().ruleIdExecuteSingleSubscription(ruleId);
    }

    public void ruleIdExecuteSingleSubscription(
        String ruleId, ExecuteGovernanceRuleParams executeGovernanceRuleParams, Context context) {
        this.serviceClient().ruleIdExecuteSingleSubscription(ruleId, executeGovernanceRuleParams, context);
    }

    public void ruleIdExecuteSingleSecurityConnector(
        String resourceGroupName,
        String securityConnectorName,
        String ruleId,
        ExecuteGovernanceRuleParams executeGovernanceRuleParams) {
        this
            .serviceClient()
            .ruleIdExecuteSingleSecurityConnector(
                resourceGroupName, securityConnectorName, ruleId, executeGovernanceRuleParams);
    }

    public void ruleIdExecuteSingleSecurityConnector(
        String resourceGroupName, String securityConnectorName, String ruleId) {
        this.serviceClient().ruleIdExecuteSingleSecurityConnector(resourceGroupName, securityConnectorName, ruleId);
    }

    public void ruleIdExecuteSingleSecurityConnector(
        String resourceGroupName,
        String securityConnectorName,
        String ruleId,
        ExecuteGovernanceRuleParams executeGovernanceRuleParams,
        Context context) {
        this
            .serviceClient()
            .ruleIdExecuteSingleSecurityConnector(
                resourceGroupName, securityConnectorName, ruleId, executeGovernanceRuleParams, context);
    }

    public GovernanceRule getById(String id) {
        String ruleId = Utils.getValueFromIdByName(id, "governanceRules");
        if (ruleId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'governanceRules'.", id)));
        }
        return this.getWithResponse(ruleId, Context.NONE).getValue();
    }

    public Response<GovernanceRule> getByIdWithResponse(String id, Context context) {
        String ruleId = Utils.getValueFromIdByName(id, "governanceRules");
        if (ruleId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'governanceRules'.", id)));
        }
        return this.getWithResponse(ruleId, context);
    }

    public void deleteById(String id) {
        String ruleId = Utils.getValueFromIdByName(id, "governanceRules");
        if (ruleId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'governanceRules'.", id)));
        }
        this.deleteWithResponse(ruleId, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String ruleId = Utils.getValueFromIdByName(id, "governanceRules");
        if (ruleId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'governanceRules'.", id)));
        }
        return this.deleteWithResponse(ruleId, context);
    }

    private GovernanceRulesOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    public GovernanceRuleImpl define(String name) {
        return new GovernanceRuleImpl(name, this.manager());
    }
}
