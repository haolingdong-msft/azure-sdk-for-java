// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ScheduleTriggerTypeProperties;
import com.azure.resourcemanager.datafactory.models.DayOfWeek;
import com.azure.resourcemanager.datafactory.models.DaysOfWeek;
import com.azure.resourcemanager.datafactory.models.RecurrenceFrequency;
import com.azure.resourcemanager.datafactory.models.RecurrenceSchedule;
import com.azure.resourcemanager.datafactory.models.RecurrenceScheduleOccurrence;
import com.azure.resourcemanager.datafactory.models.ScheduleTriggerRecurrence;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScheduleTriggerTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleTriggerTypeProperties model = BinaryData.fromString(
            "{\"recurrence\":{\"frequency\":\"Day\",\"interval\":665115764,\"startTime\":\"2021-06-20T22:00:28Z\",\"endTime\":\"2021-02-19T00:10:50Z\",\"timeZone\":\"mlgmgcnllqfbeuug\",\"schedule\":{\"minutes\":[1684959388,468220489,595739482,1958046175],\"hours\":[648581162],\"weekDays\":[\"Wednesday\",\"Thursday\",\"Thursday\"],\"monthDays\":[828575448],\"monthlyOccurrences\":[{\"day\":\"Sunday\",\"occurrence\":1247863559,\"\":{\"ecmjgbzhdonyle\":\"dataozdcth\"}}],\"\":{\"r\":\"datawvdwmuytkkfoton\"}},\"\":{\"udkyzyiyvhgdkb\":\"datazuoopo\"}}}")
            .toObject(ScheduleTriggerTypeProperties.class);
        Assertions.assertEquals(RecurrenceFrequency.DAY, model.recurrence().frequency());
        Assertions.assertEquals(665115764, model.recurrence().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-20T22:00:28Z"), model.recurrence().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-19T00:10:50Z"), model.recurrence().endTime());
        Assertions.assertEquals("mlgmgcnllqfbeuug", model.recurrence().timeZone());
        Assertions.assertEquals(1684959388, model.recurrence().schedule().minutes().get(0));
        Assertions.assertEquals(648581162, model.recurrence().schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.WEDNESDAY, model.recurrence().schedule().weekDays().get(0));
        Assertions.assertEquals(828575448, model.recurrence().schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.SUNDAY, model.recurrence().schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(1247863559, model.recurrence().schedule().monthlyOccurrences().get(0).occurrence());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleTriggerTypeProperties model
            = new ScheduleTriggerTypeProperties()
                .withRecurrence(new ScheduleTriggerRecurrence().withFrequency(RecurrenceFrequency.DAY)
                    .withInterval(665115764).withStartTime(OffsetDateTime.parse("2021-06-20T22:00:28Z"))
                    .withEndTime(OffsetDateTime.parse("2021-02-19T00:10:50Z")).withTimeZone("mlgmgcnllqfbeuug")
                    .withSchedule(new RecurrenceSchedule()
                        .withMinutes(Arrays.asList(1684959388, 468220489, 595739482, 1958046175))
                        .withHours(Arrays.asList(648581162))
                        .withWeekDays(Arrays.asList(DaysOfWeek.WEDNESDAY, DaysOfWeek.THURSDAY, DaysOfWeek.THURSDAY))
                        .withMonthDays(Arrays.asList(828575448))
                        .withMonthlyOccurrences(Arrays.asList(new RecurrenceScheduleOccurrence()
                            .withDay(DayOfWeek.SUNDAY).withOccurrence(1247863559).withAdditionalProperties(mapOf())))
                        .withAdditionalProperties(mapOf()))
                    .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(ScheduleTriggerTypeProperties.class);
        Assertions.assertEquals(RecurrenceFrequency.DAY, model.recurrence().frequency());
        Assertions.assertEquals(665115764, model.recurrence().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-20T22:00:28Z"), model.recurrence().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-19T00:10:50Z"), model.recurrence().endTime());
        Assertions.assertEquals("mlgmgcnllqfbeuug", model.recurrence().timeZone());
        Assertions.assertEquals(1684959388, model.recurrence().schedule().minutes().get(0));
        Assertions.assertEquals(648581162, model.recurrence().schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.WEDNESDAY, model.recurrence().schedule().weekDays().get(0));
        Assertions.assertEquals(828575448, model.recurrence().schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.SUNDAY, model.recurrence().schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(1247863559, model.recurrence().schedule().monthlyOccurrences().get(0).occurrence());
    }

    // Use "Map.of" if available
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
