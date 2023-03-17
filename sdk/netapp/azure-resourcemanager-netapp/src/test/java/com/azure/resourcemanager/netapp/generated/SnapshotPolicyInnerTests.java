// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotPolicyInner;
import com.azure.resourcemanager.netapp.models.DailySchedule;
import com.azure.resourcemanager.netapp.models.HourlySchedule;
import com.azure.resourcemanager.netapp.models.MonthlySchedule;
import com.azure.resourcemanager.netapp.models.WeeklySchedule;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SnapshotPolicyInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SnapshotPolicyInner model =
            BinaryData
                .fromString(
                    "{\"etag\":\"xb\",\"properties\":{\"hourlySchedule\":{\"snapshotsToKeep\":592118206,\"minute\":2111014163,\"usedBytes\":6393280056529572651},\"dailySchedule\":{\"snapshotsToKeep\":157171235,\"hour\":2146010865,\"minute\":22179172,\"usedBytes\":9027138809470227979},\"weeklySchedule\":{\"snapshotsToKeep\":1616367631,\"day\":\"exilzznfqqnvwpmq\",\"hour\":1628769376,\"minute\":1284168772,\"usedBytes\":2678080660083018694},\"monthlySchedule\":{\"snapshotsToKeep\":994022828,\"daysOfMonth\":\"wqytjrybnwjewgdr\",\"hour\":452547665,\"minute\":1059734695,\"usedBytes\":2844407552586736400},\"enabled\":true,\"provisioningState\":\"hin\"},\"location\":\"ygmi\",\"tags\":{\"qig\":\"nzdndslgna\",\"qolbgyc\":\"nduhavhqlkthum\",\"tgccymvaolpss\":\"uie\",\"lzpswiydm\":\"qlfmmdnbb\"},\"id\":\"wyhzdx\",\"name\":\"sadbz\",\"type\":\"nvdfznuda\"}")
                .toObject(SnapshotPolicyInner.class);
        Assertions.assertEquals("ygmi", model.location());
        Assertions.assertEquals("nzdndslgna", model.tags().get("qig"));
        Assertions.assertEquals(592118206, model.hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(2111014163, model.hourlySchedule().minute());
        Assertions.assertEquals(6393280056529572651L, model.hourlySchedule().usedBytes());
        Assertions.assertEquals(157171235, model.dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(2146010865, model.dailySchedule().hour());
        Assertions.assertEquals(22179172, model.dailySchedule().minute());
        Assertions.assertEquals(9027138809470227979L, model.dailySchedule().usedBytes());
        Assertions.assertEquals(1616367631, model.weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("exilzznfqqnvwpmq", model.weeklySchedule().day());
        Assertions.assertEquals(1628769376, model.weeklySchedule().hour());
        Assertions.assertEquals(1284168772, model.weeklySchedule().minute());
        Assertions.assertEquals(2678080660083018694L, model.weeklySchedule().usedBytes());
        Assertions.assertEquals(994022828, model.monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("wqytjrybnwjewgdr", model.monthlySchedule().daysOfMonth());
        Assertions.assertEquals(452547665, model.monthlySchedule().hour());
        Assertions.assertEquals(1059734695, model.monthlySchedule().minute());
        Assertions.assertEquals(2844407552586736400L, model.monthlySchedule().usedBytes());
        Assertions.assertEquals(true, model.enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SnapshotPolicyInner model =
            new SnapshotPolicyInner()
                .withLocation("ygmi")
                .withTags(
                    mapOf(
                        "qig",
                        "nzdndslgna",
                        "qolbgyc",
                        "nduhavhqlkthum",
                        "tgccymvaolpss",
                        "uie",
                        "lzpswiydm",
                        "qlfmmdnbb"))
                .withHourlySchedule(
                    new HourlySchedule()
                        .withSnapshotsToKeep(592118206)
                        .withMinute(2111014163)
                        .withUsedBytes(6393280056529572651L))
                .withDailySchedule(
                    new DailySchedule()
                        .withSnapshotsToKeep(157171235)
                        .withHour(2146010865)
                        .withMinute(22179172)
                        .withUsedBytes(9027138809470227979L))
                .withWeeklySchedule(
                    new WeeklySchedule()
                        .withSnapshotsToKeep(1616367631)
                        .withDay("exilzznfqqnvwpmq")
                        .withHour(1628769376)
                        .withMinute(1284168772)
                        .withUsedBytes(2678080660083018694L))
                .withMonthlySchedule(
                    new MonthlySchedule()
                        .withSnapshotsToKeep(994022828)
                        .withDaysOfMonth("wqytjrybnwjewgdr")
                        .withHour(452547665)
                        .withMinute(1059734695)
                        .withUsedBytes(2844407552586736400L))
                .withEnabled(true);
        model = BinaryData.fromObject(model).toObject(SnapshotPolicyInner.class);
        Assertions.assertEquals("ygmi", model.location());
        Assertions.assertEquals("nzdndslgna", model.tags().get("qig"));
        Assertions.assertEquals(592118206, model.hourlySchedule().snapshotsToKeep());
        Assertions.assertEquals(2111014163, model.hourlySchedule().minute());
        Assertions.assertEquals(6393280056529572651L, model.hourlySchedule().usedBytes());
        Assertions.assertEquals(157171235, model.dailySchedule().snapshotsToKeep());
        Assertions.assertEquals(2146010865, model.dailySchedule().hour());
        Assertions.assertEquals(22179172, model.dailySchedule().minute());
        Assertions.assertEquals(9027138809470227979L, model.dailySchedule().usedBytes());
        Assertions.assertEquals(1616367631, model.weeklySchedule().snapshotsToKeep());
        Assertions.assertEquals("exilzznfqqnvwpmq", model.weeklySchedule().day());
        Assertions.assertEquals(1628769376, model.weeklySchedule().hour());
        Assertions.assertEquals(1284168772, model.weeklySchedule().minute());
        Assertions.assertEquals(2678080660083018694L, model.weeklySchedule().usedBytes());
        Assertions.assertEquals(994022828, model.monthlySchedule().snapshotsToKeep());
        Assertions.assertEquals("wqytjrybnwjewgdr", model.monthlySchedule().daysOfMonth());
        Assertions.assertEquals(452547665, model.monthlySchedule().hour());
        Assertions.assertEquals(1059734695, model.monthlySchedule().minute());
        Assertions.assertEquals(2844407552586736400L, model.monthlySchedule().usedBytes());
        Assertions.assertEquals(true, model.enabled());
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
