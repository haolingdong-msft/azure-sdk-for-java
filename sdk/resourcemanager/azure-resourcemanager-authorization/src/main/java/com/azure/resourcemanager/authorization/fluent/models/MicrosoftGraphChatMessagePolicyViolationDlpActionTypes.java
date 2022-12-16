// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** chatMessagePolicyViolationDlpActionTypes. */
public final class MicrosoftGraphChatMessagePolicyViolationDlpActionTypes
    extends ExpandableStringEnum<MicrosoftGraphChatMessagePolicyViolationDlpActionTypes> {
    /** Static value none for MicrosoftGraphChatMessagePolicyViolationDlpActionTypes. */
    public static final MicrosoftGraphChatMessagePolicyViolationDlpActionTypes NONE = fromString("none");

    /** Static value notifySender for MicrosoftGraphChatMessagePolicyViolationDlpActionTypes. */
    public static final MicrosoftGraphChatMessagePolicyViolationDlpActionTypes NOTIFY_SENDER =
        fromString("notifySender");

    /** Static value blockAccess for MicrosoftGraphChatMessagePolicyViolationDlpActionTypes. */
    public static final MicrosoftGraphChatMessagePolicyViolationDlpActionTypes BLOCK_ACCESS = fromString("blockAccess");

    /** Static value blockAccessExternal for MicrosoftGraphChatMessagePolicyViolationDlpActionTypes. */
    public static final MicrosoftGraphChatMessagePolicyViolationDlpActionTypes BLOCK_ACCESS_EXTERNAL =
        fromString("blockAccessExternal");

    /**
     * Creates or finds a MicrosoftGraphChatMessagePolicyViolationDlpActionTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphChatMessagePolicyViolationDlpActionTypes.
     */
    @JsonCreator
    public static MicrosoftGraphChatMessagePolicyViolationDlpActionTypes fromString(String name) {
        return fromString(name, MicrosoftGraphChatMessagePolicyViolationDlpActionTypes.class);
    }

    /**
     * Gets known MicrosoftGraphChatMessagePolicyViolationDlpActionTypes values.
     *
     * @return known MicrosoftGraphChatMessagePolicyViolationDlpActionTypes values.
     */
    public static Collection<MicrosoftGraphChatMessagePolicyViolationDlpActionTypes> values() {
        return values(MicrosoftGraphChatMessagePolicyViolationDlpActionTypes.class);
    }
}
