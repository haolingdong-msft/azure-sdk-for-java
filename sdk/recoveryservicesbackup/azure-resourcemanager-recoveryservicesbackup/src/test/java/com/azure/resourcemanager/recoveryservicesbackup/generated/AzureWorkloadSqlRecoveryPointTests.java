// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSqlRecoveryPoint;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSqlRecoveryPointExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointMoveReadinessInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointProperties;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierInformationV2;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestorePointType;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectory;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSqlRecoveryPointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSqlRecoveryPoint model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadSQLRecoveryPoint\",\"extendedInfo\":{\"dataDirectoryTimeInUTC\":\"2021-07-25T03:23Z\",\"dataDirectoryPaths\":[{\"type\":\"Log\",\"path\":\"yhbxcudchxgs\",\"logicalName\":\"oldforobw\"},{\"type\":\"Log\",\"path\":\"zbfhfovvac\",\"logicalName\":\"btuodxeszabbel\"},{\"type\":\"Invalid\",\"path\":\"ua\",\"logicalName\":\"zkwrrwoyc\"},{\"type\":\"Invalid\",\"path\":\"yhahnomdrkyw\",\"logicalName\":\"psvfuurutlwexxwl\"}]},\"recoveryPointTimeInUTC\":\"2021-07-05T00:05:41Z\",\"type\":\"SnapshotCopyOnlyFull\",\"recoveryPointTierDetails\":[{\"type\":\"InstantRP\",\"status\":\"Deleted\",\"extendedInfo\":{\"wpgdak\":\"pqtybb\",\"jibnxmysu\":\"hzyvlixqnrkcx\"}},{\"type\":\"Invalid\",\"status\":\"Disabled\",\"extendedInfo\":{\"ijpstte\":\"vl\",\"wcyyufmhruncu\":\"oqq\",\"nqndyfpchrqbn\":\"mqspkcdqzhlctdd\",\"gydcw\":\"jrcg\"}},{\"type\":\"InstantRP\",\"status\":\"Deleted\",\"extendedInfo\":{\"r\":\"qqoli\",\"oq\":\"aiouaubrjt\"}}],\"recoveryPointMoveReadinessInfo\":{\"imzdlyj\":{\"isReadyForMove\":false,\"additionalInfo\":\"ngiflrzpasccbi\"},\"ojhp\":{\"isReadyForMove\":true,\"additionalInfo\":\"mkyoqufdvruzsl\"},\"eyzihgrky\":{\"isReadyForMove\":false,\"additionalInfo\":\"mdxotngfdgu\"}},\"recoveryPointProperties\":{\"expiryTime\":\"absnmfpp\",\"ruleName\":\"jee\"}}")
                .toObject(AzureWorkloadSqlRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-05T00:05:41Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.SNAPSHOT_COPY_ONLY_FULL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.INSTANT_RP, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.DELETED, model.recoveryPointTierDetails().get(0).status());
        Assertions.assertEquals("pqtybb", model.recoveryPointTierDetails().get(0).extendedInfo().get("wpgdak"));
        Assertions.assertEquals(false, model.recoveryPointMoveReadinessInfo().get("imzdlyj").isReadyForMove());
        Assertions
            .assertEquals("ngiflrzpasccbi", model.recoveryPointMoveReadinessInfo().get("imzdlyj").additionalInfo());
        Assertions.assertEquals("absnmfpp", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("jee", model.recoveryPointProperties().ruleName());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-07-25T03:23Z"), model.extendedInfo().dataDirectoryTimeInUtc());
        Assertions.assertEquals(SqlDataDirectoryType.LOG, model.extendedInfo().dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("yhbxcudchxgs", model.extendedInfo().dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("oldforobw", model.extendedInfo().dataDirectoryPaths().get(0).logicalName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSqlRecoveryPoint model =
            new AzureWorkloadSqlRecoveryPoint()
                .withRecoveryPointTimeInUtc(OffsetDateTime.parse("2021-07-05T00:05:41Z"))
                .withType(RestorePointType.SNAPSHOT_COPY_ONLY_FULL)
                .withRecoveryPointTierDetails(
                    Arrays
                        .asList(
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.INSTANT_RP)
                                .withStatus(RecoveryPointTierStatus.DELETED)
                                .withExtendedInfo(mapOf("wpgdak", "pqtybb", "jibnxmysu", "hzyvlixqnrkcx")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.INVALID)
                                .withStatus(RecoveryPointTierStatus.DISABLED)
                                .withExtendedInfo(
                                    mapOf(
                                        "ijpstte",
                                        "vl",
                                        "wcyyufmhruncu",
                                        "oqq",
                                        "nqndyfpchrqbn",
                                        "mqspkcdqzhlctdd",
                                        "gydcw",
                                        "jrcg")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.INSTANT_RP)
                                .withStatus(RecoveryPointTierStatus.DELETED)
                                .withExtendedInfo(mapOf("r", "qqoli", "oq", "aiouaubrjt"))))
                .withRecoveryPointMoveReadinessInfo(
                    mapOf(
                        "imzdlyj",
                        new RecoveryPointMoveReadinessInfo()
                            .withIsReadyForMove(false)
                            .withAdditionalInfo("ngiflrzpasccbi"),
                        "ojhp",
                        new RecoveryPointMoveReadinessInfo()
                            .withIsReadyForMove(true)
                            .withAdditionalInfo("mkyoqufdvruzsl"),
                        "eyzihgrky",
                        new RecoveryPointMoveReadinessInfo()
                            .withIsReadyForMove(false)
                            .withAdditionalInfo("mdxotngfdgu")))
                .withRecoveryPointProperties(
                    new RecoveryPointProperties().withExpiryTime("absnmfpp").withRuleName("jee"))
                .withExtendedInfo(
                    new AzureWorkloadSqlRecoveryPointExtendedInfo()
                        .withDataDirectoryTimeInUtc(OffsetDateTime.parse("2021-07-25T03:23Z"))
                        .withDataDirectoryPaths(
                            Arrays
                                .asList(
                                    new SqlDataDirectory()
                                        .withType(SqlDataDirectoryType.LOG)
                                        .withPath("yhbxcudchxgs")
                                        .withLogicalName("oldforobw"),
                                    new SqlDataDirectory()
                                        .withType(SqlDataDirectoryType.LOG)
                                        .withPath("zbfhfovvac")
                                        .withLogicalName("btuodxeszabbel"),
                                    new SqlDataDirectory()
                                        .withType(SqlDataDirectoryType.INVALID)
                                        .withPath("ua")
                                        .withLogicalName("zkwrrwoyc"),
                                    new SqlDataDirectory()
                                        .withType(SqlDataDirectoryType.INVALID)
                                        .withPath("yhahnomdrkyw")
                                        .withLogicalName("psvfuurutlwexxwl"))));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSqlRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-05T00:05:41Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.SNAPSHOT_COPY_ONLY_FULL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.INSTANT_RP, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.DELETED, model.recoveryPointTierDetails().get(0).status());
        Assertions.assertEquals("pqtybb", model.recoveryPointTierDetails().get(0).extendedInfo().get("wpgdak"));
        Assertions.assertEquals(false, model.recoveryPointMoveReadinessInfo().get("imzdlyj").isReadyForMove());
        Assertions
            .assertEquals("ngiflrzpasccbi", model.recoveryPointMoveReadinessInfo().get("imzdlyj").additionalInfo());
        Assertions.assertEquals("absnmfpp", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("jee", model.recoveryPointProperties().ruleName());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-07-25T03:23Z"), model.extendedInfo().dataDirectoryTimeInUtc());
        Assertions.assertEquals(SqlDataDirectoryType.LOG, model.extendedInfo().dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("yhbxcudchxgs", model.extendedInfo().dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("oldforobw", model.extendedInfo().dataDirectoryPaths().get(0).logicalName());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
