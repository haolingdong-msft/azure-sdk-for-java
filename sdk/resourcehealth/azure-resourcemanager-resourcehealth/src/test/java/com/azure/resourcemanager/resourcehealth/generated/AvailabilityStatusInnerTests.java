// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcehealth.fluent.models.AvailabilityStatusInner;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStateValues;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStatusProperties;
import com.azure.resourcemanager.resourcehealth.models.AvailabilityStatusPropertiesRecentlyResolved;
import com.azure.resourcemanager.resourcehealth.models.ReasonChronicityTypes;
import com.azure.resourcemanager.resourcehealth.models.RecommendedAction;
import com.azure.resourcemanager.resourcehealth.models.ServiceImpactingEvent;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AvailabilityStatusInnerTests {
    @Test
    public void testDeserialize() {
        AvailabilityStatusInner model =
            BinaryData
                .fromString(
                    "{\"id\":\"audccsnhs\",\"name\":\"nyejhkryhtnap\",\"type\":\"wlokjyem\",\"location\":\"vnipjox\",\"properties\":{\"availabilityState\":\"Degraded\",\"title\":\"gejspodmailzyde\",\"summary\":\"jwyahuxinpmqnja\",\"detailedStatus\":\"ixjsprozvcputeg\",\"reasonType\":\"wmfdatscmdvpjhul\",\"rootCauseAttributionTime\":\"2021-11-19T18:36:28Z\",\"healthEventType\":\"mkjozkrwf\",\"healthEventCause\":\"iodjp\",\"healthEventCategory\":\"w\",\"healthEventId\":\"dpvwryoqpsoaccta\",\"resolutionETA\":\"2021-06-15T10:03:50Z\",\"occuredTime\":\"2020-12-25T20:04:21Z\",\"reasonChronicity\":\"Transient\",\"reportedTime\":\"2021-04-22T04:07:25Z\",\"recentlyResolved\":{\"unavailableOccuredTime\":\"2021-10-01T21:39:25Z\",\"resolvedTime\":\"2021-02-13T07:50:35Z\",\"unavailableSummary\":\"fdosyg\"},\"recommendedActions\":[{\"action\":\"ojakhmsbzjhcrze\",\"actionUrl\":\"phlxa\",\"actionUrlText\":\"thqt\"},{\"action\":\"qjbpfzfsin\",\"actionUrl\":\"v\",\"actionUrlText\":\"jrwzox\"},{\"action\":\"tfell\",\"actionUrl\":\"fziton\",\"actionUrlText\":\"qfpjk\"},{\"action\":\"xofpdvhpfxxypi\",\"actionUrl\":\"nmayhuybb\",\"actionUrlText\":\"odepoogin\"}],\"serviceImpactingEvents\":[{\"eventStartTime\":\"2021-11-03T11:27:22Z\",\"eventStatusLastModifiedTime\":\"2021-01-18T07:52:25Z\",\"correlationId\":\"gnarxzxtheo\"},{\"eventStartTime\":\"2021-09-30T22:34:52Z\",\"eventStatusLastModifiedTime\":\"2021-11-04T11:49:42Z\",\"correlationId\":\"cciqihnhungbwjz\"},{\"eventStartTime\":\"2021-11-04T09:44:48Z\",\"eventStatusLastModifiedTime\":\"2021-05-21T15:18:02Z\",\"correlationId\":\"pemvtzfkufubljof\"}]}}")
                .toObject(AvailabilityStatusInner.class);
        Assertions.assertEquals("audccsnhs", model.id());
        Assertions.assertEquals("nyejhkryhtnap", model.name());
        Assertions.assertEquals("wlokjyem", model.type());
        Assertions.assertEquals("vnipjox", model.location());
        Assertions.assertEquals(AvailabilityStateValues.DEGRADED, model.properties().availabilityState());
        Assertions.assertEquals("gejspodmailzyde", model.properties().title());
        Assertions.assertEquals("jwyahuxinpmqnja", model.properties().summary());
        Assertions.assertEquals("ixjsprozvcputeg", model.properties().detailedStatus());
        Assertions.assertEquals("wmfdatscmdvpjhul", model.properties().reasonType());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-11-19T18:36:28Z"), model.properties().rootCauseAttributionTime());
        Assertions.assertEquals("mkjozkrwf", model.properties().healthEventType());
        Assertions.assertEquals("iodjp", model.properties().healthEventCause());
        Assertions.assertEquals("w", model.properties().healthEventCategory());
        Assertions.assertEquals("dpvwryoqpsoaccta", model.properties().healthEventId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-15T10:03:50Z"), model.properties().resolutionEta());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-25T20:04:21Z"), model.properties().occuredTime());
        Assertions.assertEquals(ReasonChronicityTypes.TRANSIENT, model.properties().reasonChronicity());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-22T04:07:25Z"), model.properties().reportedTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-10-01T21:39:25Z"),
                model.properties().recentlyResolved().unavailableOccuredTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-02-13T07:50:35Z"), model.properties().recentlyResolved().resolvedTime());
        Assertions.assertEquals("fdosyg", model.properties().recentlyResolved().unavailableSummary());
        Assertions.assertEquals("ojakhmsbzjhcrze", model.properties().recommendedActions().get(0).action());
        Assertions.assertEquals("phlxa", model.properties().recommendedActions().get(0).actionUrl());
        Assertions.assertEquals("thqt", model.properties().recommendedActions().get(0).actionUrlText());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-11-03T11:27:22Z"),
                model.properties().serviceImpactingEvents().get(0).eventStartTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-01-18T07:52:25Z"),
                model.properties().serviceImpactingEvents().get(0).eventStatusLastModifiedTime());
        Assertions.assertEquals("gnarxzxtheo", model.properties().serviceImpactingEvents().get(0).correlationId());
    }

    @Test
    public void testSerialize() {
        AvailabilityStatusInner model =
            new AvailabilityStatusInner()
                .withId("audccsnhs")
                .withName("nyejhkryhtnap")
                .withType("wlokjyem")
                .withLocation("vnipjox")
                .withProperties(
                    new AvailabilityStatusProperties()
                        .withAvailabilityState(AvailabilityStateValues.DEGRADED)
                        .withTitle("gejspodmailzyde")
                        .withSummary("jwyahuxinpmqnja")
                        .withDetailedStatus("ixjsprozvcputeg")
                        .withReasonType("wmfdatscmdvpjhul")
                        .withRootCauseAttributionTime(OffsetDateTime.parse("2021-11-19T18:36:28Z"))
                        .withHealthEventType("mkjozkrwf")
                        .withHealthEventCause("iodjp")
                        .withHealthEventCategory("w")
                        .withHealthEventId("dpvwryoqpsoaccta")
                        .withResolutionEta(OffsetDateTime.parse("2021-06-15T10:03:50Z"))
                        .withOccuredTime(OffsetDateTime.parse("2020-12-25T20:04:21Z"))
                        .withReasonChronicity(ReasonChronicityTypes.TRANSIENT)
                        .withReportedTime(OffsetDateTime.parse("2021-04-22T04:07:25Z"))
                        .withRecentlyResolved(
                            new AvailabilityStatusPropertiesRecentlyResolved()
                                .withUnavailableOccuredTime(OffsetDateTime.parse("2021-10-01T21:39:25Z"))
                                .withResolvedTime(OffsetDateTime.parse("2021-02-13T07:50:35Z"))
                                .withUnavailableSummary("fdosyg"))
                        .withRecommendedActions(
                            Arrays
                                .asList(
                                    new RecommendedAction()
                                        .withAction("ojakhmsbzjhcrze")
                                        .withActionUrl("phlxa")
                                        .withActionUrlText("thqt"),
                                    new RecommendedAction()
                                        .withAction("qjbpfzfsin")
                                        .withActionUrl("v")
                                        .withActionUrlText("jrwzox"),
                                    new RecommendedAction()
                                        .withAction("tfell")
                                        .withActionUrl("fziton")
                                        .withActionUrlText("qfpjk"),
                                    new RecommendedAction()
                                        .withAction("xofpdvhpfxxypi")
                                        .withActionUrl("nmayhuybb")
                                        .withActionUrlText("odepoogin")))
                        .withServiceImpactingEvents(
                            Arrays
                                .asList(
                                    new ServiceImpactingEvent()
                                        .withEventStartTime(OffsetDateTime.parse("2021-11-03T11:27:22Z"))
                                        .withEventStatusLastModifiedTime(OffsetDateTime.parse("2021-01-18T07:52:25Z"))
                                        .withCorrelationId("gnarxzxtheo"),
                                    new ServiceImpactingEvent()
                                        .withEventStartTime(OffsetDateTime.parse("2021-09-30T22:34:52Z"))
                                        .withEventStatusLastModifiedTime(OffsetDateTime.parse("2021-11-04T11:49:42Z"))
                                        .withCorrelationId("cciqihnhungbwjz"),
                                    new ServiceImpactingEvent()
                                        .withEventStartTime(OffsetDateTime.parse("2021-11-04T09:44:48Z"))
                                        .withEventStatusLastModifiedTime(OffsetDateTime.parse("2021-05-21T15:18:02Z"))
                                        .withCorrelationId("pemvtzfkufubljof"))));
        model = BinaryData.fromObject(model).toObject(AvailabilityStatusInner.class);
        Assertions.assertEquals("audccsnhs", model.id());
        Assertions.assertEquals("nyejhkryhtnap", model.name());
        Assertions.assertEquals("wlokjyem", model.type());
        Assertions.assertEquals("vnipjox", model.location());
        Assertions.assertEquals(AvailabilityStateValues.DEGRADED, model.properties().availabilityState());
        Assertions.assertEquals("gejspodmailzyde", model.properties().title());
        Assertions.assertEquals("jwyahuxinpmqnja", model.properties().summary());
        Assertions.assertEquals("ixjsprozvcputeg", model.properties().detailedStatus());
        Assertions.assertEquals("wmfdatscmdvpjhul", model.properties().reasonType());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-11-19T18:36:28Z"), model.properties().rootCauseAttributionTime());
        Assertions.assertEquals("mkjozkrwf", model.properties().healthEventType());
        Assertions.assertEquals("iodjp", model.properties().healthEventCause());
        Assertions.assertEquals("w", model.properties().healthEventCategory());
        Assertions.assertEquals("dpvwryoqpsoaccta", model.properties().healthEventId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-15T10:03:50Z"), model.properties().resolutionEta());
        Assertions.assertEquals(OffsetDateTime.parse("2020-12-25T20:04:21Z"), model.properties().occuredTime());
        Assertions.assertEquals(ReasonChronicityTypes.TRANSIENT, model.properties().reasonChronicity());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-22T04:07:25Z"), model.properties().reportedTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-10-01T21:39:25Z"),
                model.properties().recentlyResolved().unavailableOccuredTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-02-13T07:50:35Z"), model.properties().recentlyResolved().resolvedTime());
        Assertions.assertEquals("fdosyg", model.properties().recentlyResolved().unavailableSummary());
        Assertions.assertEquals("ojakhmsbzjhcrze", model.properties().recommendedActions().get(0).action());
        Assertions.assertEquals("phlxa", model.properties().recommendedActions().get(0).actionUrl());
        Assertions.assertEquals("thqt", model.properties().recommendedActions().get(0).actionUrlText());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-11-03T11:27:22Z"),
                model.properties().serviceImpactingEvents().get(0).eventStartTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-01-18T07:52:25Z"),
                model.properties().serviceImpactingEvents().get(0).eventStatusLastModifiedTime());
        Assertions.assertEquals("gnarxzxtheo", model.properties().serviceImpactingEvents().get(0).correlationId());
    }
}
