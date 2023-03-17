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
                    "{\"objectType\":\"AzureWorkloadSQLRecoveryPoint\",\"extendedInfo\":{\"dataDirectoryTimeInUTC\":\"2021-04-03T06:57:50Z\",\"dataDirectoryPaths\":[{\"type\":\"Data\",\"path\":\"woycqucwyha\",\"logicalName\":\"omd\"},{\"type\":\"Data\",\"path\":\"uh\",\"logicalName\":\"vfuuru\"}]},\"recoveryPointTimeInUTC\":\"2021-02-19T02:51:01Z\",\"type\":\"SnapshotFull\",\"recoveryPointTierDetails\":[{\"type\":\"HardenedRP\",\"status\":\"Valid\",\"extendedInfo\":{\"q\":\"xzsrzpge\",\"wwpgdakchzyvlixq\":\"yb\"}},{\"type\":\"Invalid\",\"status\":\"Deleted\",\"extendedInfo\":{\"mysu\":\"ibn\",\"ttexoqqpwcyyufmh\":\"swqrntvlwijp\",\"qspkcdqzhlctd\":\"uncuw\"}},{\"type\":\"ArchivedRP\",\"status\":\"Rehydrated\",\"extendedInfo\":{\"qbnj\":\"fpch\"}},{\"type\":\"HardenedRP\",\"status\":\"Rehydrated\",\"extendedInfo\":{\"qqoli\":\"dcwboxjum\",\"aiouaubrjt\":\"r\",\"fuojrngif\":\"oq\"}}],\"recoveryPointMoveReadinessInfo\":{\"mkyoqufdvruzsl\":{\"isReadyForMove\":false,\"additionalInfo\":\"ccbiuimzdlyjdfq\"}},\"recoveryPointProperties\":{\"expiryTime\":\"hpc\",\"ruleName\":\"nmdxotngfd\",\"isSoftDeleted\":true}}")
                .toObject(AzureWorkloadSqlRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-19T02:51:01Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.SNAPSHOT_FULL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.HARDENED_RP, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.VALID, model.recoveryPointTierDetails().get(0).status());
        Assertions.assertEquals("xzsrzpge", model.recoveryPointTierDetails().get(0).extendedInfo().get("q"));
        Assertions.assertEquals(false, model.recoveryPointMoveReadinessInfo().get("mkyoqufdvruzsl").isReadyForMove());
        Assertions
            .assertEquals(
                "ccbiuimzdlyjdfq", model.recoveryPointMoveReadinessInfo().get("mkyoqufdvruzsl").additionalInfo());
        Assertions.assertEquals("hpc", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("nmdxotngfd", model.recoveryPointProperties().ruleName());
        Assertions.assertEquals(true, model.recoveryPointProperties().isSoftDeleted());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-04-03T06:57:50Z"), model.extendedInfo().dataDirectoryTimeInUtc());
        Assertions.assertEquals(SqlDataDirectoryType.DATA, model.extendedInfo().dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("woycqucwyha", model.extendedInfo().dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("omd", model.extendedInfo().dataDirectoryPaths().get(0).logicalName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSqlRecoveryPoint model =
            new AzureWorkloadSqlRecoveryPoint()
                .withRecoveryPointTimeInUtc(OffsetDateTime.parse("2021-02-19T02:51:01Z"))
                .withType(RestorePointType.SNAPSHOT_FULL)
                .withRecoveryPointTierDetails(
                    Arrays
                        .asList(
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.HARDENED_RP)
                                .withStatus(RecoveryPointTierStatus.VALID)
                                .withExtendedInfo(mapOf("q", "xzsrzpge", "wwpgdakchzyvlixq", "yb")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.INVALID)
                                .withStatus(RecoveryPointTierStatus.DELETED)
                                .withExtendedInfo(
                                    mapOf("mysu", "ibn", "ttexoqqpwcyyufmh", "swqrntvlwijp", "qspkcdqzhlctd", "uncuw")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.ARCHIVED_RP)
                                .withStatus(RecoveryPointTierStatus.REHYDRATED)
                                .withExtendedInfo(mapOf("qbnj", "fpch")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.HARDENED_RP)
                                .withStatus(RecoveryPointTierStatus.REHYDRATED)
                                .withExtendedInfo(mapOf("qqoli", "dcwboxjum", "aiouaubrjt", "r", "fuojrngif", "oq"))))
                .withRecoveryPointMoveReadinessInfo(
                    mapOf(
                        "mkyoqufdvruzsl",
                        new RecoveryPointMoveReadinessInfo()
                            .withIsReadyForMove(false)
                            .withAdditionalInfo("ccbiuimzdlyjdfq")))
                .withRecoveryPointProperties(
                    new RecoveryPointProperties()
                        .withExpiryTime("hpc")
                        .withRuleName("nmdxotngfd")
                        .withIsSoftDeleted(true))
                .withExtendedInfo(
                    new AzureWorkloadSqlRecoveryPointExtendedInfo()
                        .withDataDirectoryTimeInUtc(OffsetDateTime.parse("2021-04-03T06:57:50Z"))
                        .withDataDirectoryPaths(
                            Arrays
                                .asList(
                                    new SqlDataDirectory()
                                        .withType(SqlDataDirectoryType.DATA)
                                        .withPath("woycqucwyha")
                                        .withLogicalName("omd"),
                                    new SqlDataDirectory()
                                        .withType(SqlDataDirectoryType.DATA)
                                        .withPath("uh")
                                        .withLogicalName("vfuuru"))));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSqlRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-19T02:51:01Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.SNAPSHOT_FULL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.HARDENED_RP, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.VALID, model.recoveryPointTierDetails().get(0).status());
        Assertions.assertEquals("xzsrzpge", model.recoveryPointTierDetails().get(0).extendedInfo().get("q"));
        Assertions.assertEquals(false, model.recoveryPointMoveReadinessInfo().get("mkyoqufdvruzsl").isReadyForMove());
        Assertions
            .assertEquals(
                "ccbiuimzdlyjdfq", model.recoveryPointMoveReadinessInfo().get("mkyoqufdvruzsl").additionalInfo());
        Assertions.assertEquals("hpc", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("nmdxotngfd", model.recoveryPointProperties().ruleName());
        Assertions.assertEquals(true, model.recoveryPointProperties().isSoftDeleted());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-04-03T06:57:50Z"), model.extendedInfo().dataDirectoryTimeInUtc());
        Assertions.assertEquals(SqlDataDirectoryType.DATA, model.extendedInfo().dataDirectoryPaths().get(0).type());
        Assertions.assertEquals("woycqucwyha", model.extendedInfo().dataDirectoryPaths().get(0).path());
        Assertions.assertEquals("omd", model.extendedInfo().dataDirectoryPaths().get(0).logicalName());
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
