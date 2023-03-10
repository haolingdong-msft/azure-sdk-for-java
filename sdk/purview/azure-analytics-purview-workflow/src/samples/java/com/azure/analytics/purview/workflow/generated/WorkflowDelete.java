// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow.generated;

import com.azure.analytics.purview.workflow.PurviewWorkflowClient;
import com.azure.analytics.purview.workflow.PurviewWorkflowClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class WorkflowDelete {
    public static void main(String[] args) {
        PurviewWorkflowClient purviewWorkflowClient =
                new PurviewWorkflowClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT"))
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.workflow.generated.deleteworkflow.workflowdelete
        RequestOptions requestOptions = new RequestOptions();
        String workflowId = "4afb5752-e47f-43a1-8ba7-c696bf8d2745";
        Response<Void> response =
                purviewWorkflowClient.deleteWorkflowWithResponse(
                    workflowId, requestOptions);
        // END:com.azure.analytics.purview.workflow.generated.deleteworkflow.workflowdelete
    }
}
