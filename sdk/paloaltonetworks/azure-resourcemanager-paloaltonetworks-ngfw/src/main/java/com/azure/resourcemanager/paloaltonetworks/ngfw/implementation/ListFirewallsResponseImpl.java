// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.ListFirewallsResponseInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ListFirewallsResponse;
import java.util.Collections;
import java.util.List;

public final class ListFirewallsResponseImpl implements ListFirewallsResponse {
    private ListFirewallsResponseInner innerObject;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

    ListFirewallsResponseImpl(
        ListFirewallsResponseInner innerObject,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<String> value() {
        List<String> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public ListFirewallsResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }
}
