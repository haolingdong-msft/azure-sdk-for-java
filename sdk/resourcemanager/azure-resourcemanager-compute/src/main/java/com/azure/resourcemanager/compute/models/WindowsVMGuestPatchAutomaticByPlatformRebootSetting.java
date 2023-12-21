// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the reboot setting for all AutomaticByPlatform patch installation operations.
 */
public final class WindowsVMGuestPatchAutomaticByPlatformRebootSetting
    extends ExpandableStringEnum<WindowsVMGuestPatchAutomaticByPlatformRebootSetting> {
    /**
     * Static value Unknown for WindowsVMGuestPatchAutomaticByPlatformRebootSetting.
     */
    public static final WindowsVMGuestPatchAutomaticByPlatformRebootSetting UNKNOWN = fromString("Unknown");

    /**
     * Static value IfRequired for WindowsVMGuestPatchAutomaticByPlatformRebootSetting.
     */
    public static final WindowsVMGuestPatchAutomaticByPlatformRebootSetting IF_REQUIRED = fromString("IfRequired");

    /**
     * Static value Never for WindowsVMGuestPatchAutomaticByPlatformRebootSetting.
     */
    public static final WindowsVMGuestPatchAutomaticByPlatformRebootSetting NEVER = fromString("Never");

    /**
     * Static value Always for WindowsVMGuestPatchAutomaticByPlatformRebootSetting.
     */
    public static final WindowsVMGuestPatchAutomaticByPlatformRebootSetting ALWAYS = fromString("Always");

    /**
     * Creates a new instance of WindowsVMGuestPatchAutomaticByPlatformRebootSetting value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WindowsVMGuestPatchAutomaticByPlatformRebootSetting() {
    }

    /**
     * Creates or finds a WindowsVMGuestPatchAutomaticByPlatformRebootSetting from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding WindowsVMGuestPatchAutomaticByPlatformRebootSetting.
     */
    @JsonCreator
    public static WindowsVMGuestPatchAutomaticByPlatformRebootSetting fromString(String name) {
        return fromString(name, WindowsVMGuestPatchAutomaticByPlatformRebootSetting.class);
    }

    /**
     * Gets known WindowsVMGuestPatchAutomaticByPlatformRebootSetting values.
     * 
     * @return known WindowsVMGuestPatchAutomaticByPlatformRebootSetting values.
     */
    public static Collection<WindowsVMGuestPatchAutomaticByPlatformRebootSetting> values() {
        return values(WindowsVMGuestPatchAutomaticByPlatformRebootSetting.class);
    }
}
