// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.PreRulesResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ActionEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.BooleanEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.Category;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DecryptionRuleTypeEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DestinationAddr;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PreRulesResource;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ProvisioningState;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SourceAddr;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.StateEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.TagInfo;
import java.util.Collections;
import java.util.List;

public final class PreRulesResourceImpl implements PreRulesResource {
    private PreRulesResourceInner innerObject;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

    PreRulesResourceImpl(
        PreRulesResourceInner innerObject,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String ruleName() {
        return this.innerModel().ruleName();
    }

    public Integer priority() {
        return this.innerModel().priority();
    }

    public String description() {
        return this.innerModel().description();
    }

    public StateEnum ruleState() {
        return this.innerModel().ruleState();
    }

    public SourceAddr source() {
        return this.innerModel().source();
    }

    public BooleanEnum negateSource() {
        return this.innerModel().negateSource();
    }

    public DestinationAddr destination() {
        return this.innerModel().destination();
    }

    public BooleanEnum negateDestination() {
        return this.innerModel().negateDestination();
    }

    public List<String> applications() {
        List<String> inner = this.innerModel().applications();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Category category() {
        return this.innerModel().category();
    }

    public String protocol() {
        return this.innerModel().protocol();
    }

    public List<String> protocolPortList() {
        List<String> inner = this.innerModel().protocolPortList();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String inboundInspectionCertificate() {
        return this.innerModel().inboundInspectionCertificate();
    }

    public String auditComment() {
        return this.innerModel().auditComment();
    }

    public ActionEnum actionType() {
        return this.innerModel().actionType();
    }

    public StateEnum enableLogging() {
        return this.innerModel().enableLogging();
    }

    public DecryptionRuleTypeEnum decryptionRuleType() {
        return this.innerModel().decryptionRuleType();
    }

    public List<TagInfo> tags() {
        List<TagInfo> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PreRulesResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }
}
