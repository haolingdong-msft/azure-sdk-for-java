// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSapHanaRecoveryPoint;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointMoveReadinessInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointProperties;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierInformationV2;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierStatus;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointTierType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RestorePointType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSapHanaRecoveryPointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSapHanaRecoveryPoint model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadSAPHanaRecoveryPoint\",\"recoveryPointTimeInUTC\":\"2021-02-11T13:33:08Z\",\"type\":\"Incremental\",\"recoveryPointTierDetails\":[{\"type\":\"ArchivedRP\",\"status\":\"Rehydrated\",\"extendedInfo\":{\"tmvpdvjdhtt\":\"nwm\",\"fedxihchrphkm\":\"a\",\"gtgkylkdghr\":\"rjdqnsdfzp\"}},{\"type\":\"ArchivedRP\",\"status\":\"Valid\",\"extendedInfo\":{\"hokvbwnh\":\"xezw\",\"ifhpf\":\"tqlgehgppi\",\"eafidltugsresm\":\"oajvgcxtxjcs\"}},{\"type\":\"ArchivedRP\",\"status\":\"Deleted\",\"extendedInfo\":{\"egprhptil\":\"ftxfkf\",\"qtgdqohmcwsl\":\"ucb\"}}],\"recoveryPointMoveReadinessInfo\":{\"izakak\":{\"isReadyForMove\":true,\"additionalInfo\":\"pwbralllibphbqz\"},\"n\":{\"isReadyForMove\":true,\"additionalInfo\":\"p\"}},\"recoveryPointProperties\":{\"expiryTime\":\"ajoylhjl\",\"ruleName\":\"oyxprimr\",\"isSoftDeleted\":false}}")
                .toObject(AzureWorkloadSapHanaRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-11T13:33:08Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.INCREMENTAL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.ARCHIVED_RP, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.REHYDRATED, model.recoveryPointTierDetails().get(0).status());
        Assertions.assertEquals("nwm", model.recoveryPointTierDetails().get(0).extendedInfo().get("tmvpdvjdhtt"));
        Assertions.assertEquals(true, model.recoveryPointMoveReadinessInfo().get("izakak").isReadyForMove());
        Assertions
            .assertEquals("pwbralllibphbqz", model.recoveryPointMoveReadinessInfo().get("izakak").additionalInfo());
        Assertions.assertEquals("ajoylhjl", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("oyxprimr", model.recoveryPointProperties().ruleName());
        Assertions.assertEquals(false, model.recoveryPointProperties().isSoftDeleted());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSapHanaRecoveryPoint model =
            new AzureWorkloadSapHanaRecoveryPoint()
                .withRecoveryPointTimeInUtc(OffsetDateTime.parse("2021-02-11T13:33:08Z"))
                .withType(RestorePointType.INCREMENTAL)
                .withRecoveryPointTierDetails(
                    Arrays
                        .asList(
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.ARCHIVED_RP)
                                .withStatus(RecoveryPointTierStatus.REHYDRATED)
                                .withExtendedInfo(
                                    mapOf("tmvpdvjdhtt", "nwm", "fedxihchrphkm", "a", "gtgkylkdghr", "rjdqnsdfzp")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.ARCHIVED_RP)
                                .withStatus(RecoveryPointTierStatus.VALID)
                                .withExtendedInfo(
                                    mapOf("hokvbwnh", "xezw", "ifhpf", "tqlgehgppi", "eafidltugsresm", "oajvgcxtxjcs")),
                            new RecoveryPointTierInformationV2()
                                .withType(RecoveryPointTierType.ARCHIVED_RP)
                                .withStatus(RecoveryPointTierStatus.DELETED)
                                .withExtendedInfo(mapOf("egprhptil", "ftxfkf", "qtgdqohmcwsl", "ucb"))))
                .withRecoveryPointMoveReadinessInfo(
                    mapOf(
                        "izakak",
                        new RecoveryPointMoveReadinessInfo()
                            .withIsReadyForMove(true)
                            .withAdditionalInfo("pwbralllibphbqz"),
                        "n",
                        new RecoveryPointMoveReadinessInfo().withIsReadyForMove(true).withAdditionalInfo("p")))
                .withRecoveryPointProperties(
                    new RecoveryPointProperties()
                        .withExpiryTime("ajoylhjl")
                        .withRuleName("oyxprimr")
                        .withIsSoftDeleted(false));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSapHanaRecoveryPoint.class);
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-11T13:33:08Z"), model.recoveryPointTimeInUtc());
        Assertions.assertEquals(RestorePointType.INCREMENTAL, model.type());
        Assertions.assertEquals(RecoveryPointTierType.ARCHIVED_RP, model.recoveryPointTierDetails().get(0).type());
        Assertions.assertEquals(RecoveryPointTierStatus.REHYDRATED, model.recoveryPointTierDetails().get(0).status());
        Assertions.assertEquals("nwm", model.recoveryPointTierDetails().get(0).extendedInfo().get("tmvpdvjdhtt"));
        Assertions.assertEquals(true, model.recoveryPointMoveReadinessInfo().get("izakak").isReadyForMove());
        Assertions
            .assertEquals("pwbralllibphbqz", model.recoveryPointMoveReadinessInfo().get("izakak").additionalInfo());
        Assertions.assertEquals("ajoylhjl", model.recoveryPointProperties().expiryTime());
        Assertions.assertEquals("oyxprimr", model.recoveryPointProperties().ruleName());
        Assertions.assertEquals(false, model.recoveryPointProperties().isSoftDeleted());
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
