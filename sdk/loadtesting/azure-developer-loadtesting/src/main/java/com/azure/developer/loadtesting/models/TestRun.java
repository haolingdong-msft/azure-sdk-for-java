// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.loadtesting.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Load test run model.
 */
@Fluent
public final class TestRun implements JsonSerializable<TestRun> {

    /*
     * Unique test run identifier for the load test run, must contain only lower-case alphabetic, numeric, underscore
     * or hyphen characters.
     */
    @Generated
    private String testRunId;

    /*
     * Pass fail criteria for a test.
     */
    @Generated
    private PassFailCriteria passFailCriteria;

    /*
     * Auto stop criteria for a test. This will automatically stop a load test if the error percentage is high for a
     * certain time window.
     */
    @Generated
    private AutoStopCriteria autoStopCriteria;

    /*
     * Secrets can be stored in an Azure Key Vault or any other secret store. If the
     * secret is stored in an Azure Key Vault, the value should be the secret
     * identifier and the type should be AKV_SECRET_URI. If the secret is stored
     * elsewhere, the secret value should be provided directly and the type should be
     * SECRET_VALUE.
     */
    @Generated
    private Map<String, Secret> secrets;

    /*
     * Certificates metadata
     */
    @Generated
    private CertificateMetadata certificate;

    /*
     * Environment variables which are defined as a set of <name,value> pairs.
     */
    @Generated
    private Map<String, String> environmentVariables;

    /*
     * Error details if there is any failure in load test run
     */
    @Generated
    private List<ErrorDetails> errorDetails;

    /*
     * Test run statistics.
     */
    @Generated
    private Map<String, TestRunStatistics> testRunStatistics;

    /*
     * The load test configuration.
     */
    @Generated
    private LoadTestConfiguration loadTestConfiguration;

    /*
     * Collection of test run artifacts
     */
    @Generated
    private TestRunArtifacts testArtifacts;

    /*
     * Test result for pass/Fail criteria used during the test run.
     */
    @Generated
    private PFTestResult testResult;

    /*
     * Number of virtual users, for which test has been run.
     */
    @Generated
    private Integer virtualUsers;

    /*
     * Display name of a testRun.
     */
    @Generated
    private String displayName;

    /*
     * Associated test Id.
     */
    @Generated
    private String testId;

    /*
     * The test run description.
     */
    @Generated
    private String description;

    /*
     * The test run status.
     */
    @Generated
    private Status status;

    /*
     * The test run start DateTime(RFC 3339 literal format).
     */
    @Generated
    private OffsetDateTime startDateTime;

    /*
     * The test run end DateTime(RFC 3339 literal format).
     */
    @Generated
    private OffsetDateTime endDateTime;

    /*
     * Test run initiated time.
     */
    @Generated
    private OffsetDateTime executedDateTime;

    /*
     * Portal url.
     */
    @Generated
    private String portalUrl;

    /*
     * Test run duration in milliseconds.
     */
    @Generated
    private Long duration;

    /*
     * Subnet ID on which the load test instances should run.
     */
    @Generated
    private String subnetId;

    /*
     * The creation datetime(RFC 3339 literal format).
     */
    @Generated
    private OffsetDateTime createdDateTime;

    /*
     * The user that created.
     */
    @Generated
    private String createdBy;

    /*
     * The last Modified datetime(RFC 3339 literal format).
     */
    @Generated
    private OffsetDateTime lastModifiedDateTime;

    /*
     * The user that last modified.
     */
    @Generated
    private String lastModifiedBy;

    /**
     * Creates an instance of TestRun class.
     */
    @Generated
    public TestRun() {
    }

    /**
     * Get the testRunId property: Unique test run identifier for the load test run, must contain only lower-case
     * alphabetic, numeric, underscore or hyphen characters.
     *
     * @return the testRunId value.
     */
    @Generated
    public String getTestRunId() {
        return this.testRunId;
    }

    /**
     * Get the passFailCriteria property: Pass fail criteria for a test.
     *
     * @return the passFailCriteria value.
     */
    @Generated
    public PassFailCriteria getPassFailCriteria() {
        return this.passFailCriteria;
    }

    /**
     * Set the passFailCriteria property: Pass fail criteria for a test.
     *
     * @param passFailCriteria the passFailCriteria value to set.
     * @return the TestRun object itself.
     */
    @Generated
    public TestRun setPassFailCriteria(PassFailCriteria passFailCriteria) {
        this.passFailCriteria = passFailCriteria;
        return this;
    }

    /**
     * Get the autoStopCriteria property: Auto stop criteria for a test. This will automatically stop a load test if
     * the error percentage is high for a certain time window.
     *
     * @return the autoStopCriteria value.
     */
    @Generated
    public AutoStopCriteria getAutoStopCriteria() {
        return this.autoStopCriteria;
    }

    /**
     * Set the autoStopCriteria property: Auto stop criteria for a test. This will automatically stop a load test if
     * the error percentage is high for a certain time window.
     *
     * @param autoStopCriteria the autoStopCriteria value to set.
     * @return the TestRun object itself.
     */
    @Generated
    public TestRun setAutoStopCriteria(AutoStopCriteria autoStopCriteria) {
        this.autoStopCriteria = autoStopCriteria;
        return this;
    }

    /**
     * Get the secrets property: Secrets can be stored in an Azure Key Vault or any other secret store. If the
     * secret is stored in an Azure Key Vault, the value should be the secret
     * identifier and the type should be AKV_SECRET_URI. If the secret is stored
     * elsewhere, the secret value should be provided directly and the type should be
     * SECRET_VALUE.
     *
     * @return the secrets value.
     */
    @Generated
    public Map<String, Secret> getSecrets() {
        return this.secrets;
    }

    /**
     * Set the secrets property: Secrets can be stored in an Azure Key Vault or any other secret store. If the
     * secret is stored in an Azure Key Vault, the value should be the secret
     * identifier and the type should be AKV_SECRET_URI. If the secret is stored
     * elsewhere, the secret value should be provided directly and the type should be
     * SECRET_VALUE.
     *
     * @param secrets the secrets value to set.
     * @return the TestRun object itself.
     */
    @Generated
    public TestRun setSecrets(Map<String, Secret> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Get the certificate property: Certificates metadata.
     *
     * @return the certificate value.
     */
    @Generated
    public CertificateMetadata getCertificate() {
        return this.certificate;
    }

    /**
     * Set the certificate property: Certificates metadata.
     *
     * @param certificate the certificate value to set.
     * @return the TestRun object itself.
     */
    @Generated
    public TestRun setCertificate(CertificateMetadata certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get the environmentVariables property: Environment variables which are defined as a set of &lt;name,value&gt;
     * pairs.
     *
     * @return the environmentVariables value.
     */
    @Generated
    public Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environmentVariables property: Environment variables which are defined as a set of &lt;name,value&gt;
     * pairs.
     *
     * @param environmentVariables the environmentVariables value to set.
     * @return the TestRun object itself.
     */
    @Generated
    public TestRun setEnvironmentVariables(Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the errorDetails property: Error details if there is any failure in load test run.
     *
     * @return the errorDetails value.
     */
    @Generated
    public List<ErrorDetails> getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * Get the testRunStatistics property: Test run statistics.
     *
     * @return the testRunStatistics value.
     */
    @Generated
    public Map<String, TestRunStatistics> getTestRunStatistics() {
        return this.testRunStatistics;
    }

    /**
     * Get the loadTestConfiguration property: The load test configuration.
     *
     * @return the loadTestConfiguration value.
     */
    @Generated
    public LoadTestConfiguration getLoadTestConfiguration() {
        return this.loadTestConfiguration;
    }

    /**
     * Set the loadTestConfiguration property: The load test configuration.
     *
     * @param loadTestConfiguration the loadTestConfiguration value to set.
     * @return the TestRun object itself.
     */
    @Generated
    public TestRun setLoadTestConfiguration(LoadTestConfiguration loadTestConfiguration) {
        this.loadTestConfiguration = loadTestConfiguration;
        return this;
    }

    /**
     * Get the testArtifacts property: Collection of test run artifacts.
     *
     * @return the testArtifacts value.
     */
    @Generated
    public TestRunArtifacts getTestArtifacts() {
        return this.testArtifacts;
    }

    /**
     * Get the testResult property: Test result for pass/Fail criteria used during the test run.
     *
     * @return the testResult value.
     */
    @Generated
    public PFTestResult getTestResult() {
        return this.testResult;
    }

    /**
     * Get the virtualUsers property: Number of virtual users, for which test has been run.
     *
     * @return the virtualUsers value.
     */
    @Generated
    public Integer getVirtualUsers() {
        return this.virtualUsers;
    }

    /**
     * Get the displayName property: Display name of a testRun.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of a testRun.
     *
     * @param displayName the displayName value to set.
     * @return the TestRun object itself.
     */
    @Generated
    public TestRun setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the testId property: Associated test Id.
     *
     * @return the testId value.
     */
    @Generated
    public String getTestId() {
        return this.testId;
    }

    /**
     * Set the testId property: Associated test Id.
     *
     * @param testId the testId value to set.
     * @return the TestRun object itself.
     */
    @Generated
    public TestRun setTestId(String testId) {
        this.testId = testId;
        return this;
    }

    /**
     * Get the description property: The test run description.
     *
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The test run description.
     *
     * @param description the description value to set.
     * @return the TestRun object itself.
     */
    @Generated
    public TestRun setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the status property: The test run status.
     *
     * @return the status value.
     */
    @Generated
    public Status getStatus() {
        return this.status;
    }

    /**
     * Get the startDateTime property: The test run start DateTime(RFC 3339 literal format).
     *
     * @return the startDateTime value.
     */
    @Generated
    public OffsetDateTime getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * Get the endDateTime property: The test run end DateTime(RFC 3339 literal format).
     *
     * @return the endDateTime value.
     */
    @Generated
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * Get the executedDateTime property: Test run initiated time.
     *
     * @return the executedDateTime value.
     */
    @Generated
    public OffsetDateTime getExecutedDateTime() {
        return this.executedDateTime;
    }

    /**
     * Get the portalUrl property: Portal url.
     *
     * @return the portalUrl value.
     */
    @Generated
    public String getPortalUrl() {
        return this.portalUrl;
    }

    /**
     * Get the duration property: Test run duration in milliseconds.
     *
     * @return the duration value.
     */
    @Generated
    public Long getDuration() {
        return this.duration;
    }

    /**
     * Get the subnetId property: Subnet ID on which the load test instances should run.
     *
     * @return the subnetId value.
     */
    @Generated
    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * Get the createdDateTime property: The creation datetime(RFC 3339 literal format).
     *
     * @return the createdDateTime value.
     */
    @Generated
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    /**
     * Get the createdBy property: The user that created.
     *
     * @return the createdBy value.
     */
    @Generated
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Get the lastModifiedDateTime property: The last Modified datetime(RFC 3339 literal format).
     *
     * @return the lastModifiedDateTime value.
     */
    @Generated
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Get the lastModifiedBy property: The user that last modified.
     *
     * @return the lastModifiedBy value.
     */
    @Generated
    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("passFailCriteria", this.passFailCriteria);
        jsonWriter.writeJsonField("autoStopCriteria", this.autoStopCriteria);
        jsonWriter.writeMapField("secrets", this.secrets, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("certificate", this.certificate);
        jsonWriter.writeMapField("environmentVariables", this.environmentVariables,
            (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("loadTestConfiguration", this.loadTestConfiguration);
        jsonWriter.writeStringField("displayName", this.displayName);
        jsonWriter.writeStringField("testId", this.testId);
        jsonWriter.writeStringField("description", this.description);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TestRun from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of TestRun if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the TestRun.
     */
    public static TestRun fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String testRunId = null;
            PassFailCriteria passFailCriteria = null;
            AutoStopCriteria autoStopCriteria = null;
            Map<String, Secret> secrets = null;
            CertificateMetadata certificate = null;
            Map<String, String> environmentVariables = null;
            List<ErrorDetails> errorDetails = null;
            Map<String, TestRunStatistics> testRunStatistics = null;
            LoadTestConfiguration loadTestConfiguration = null;
            TestRunArtifacts testArtifacts = null;
            PFTestResult testResult = null;
            Integer virtualUsers = null;
            String displayName = null;
            String testId = null;
            String description = null;
            Status status = null;
            OffsetDateTime startDateTime = null;
            OffsetDateTime endDateTime = null;
            OffsetDateTime executedDateTime = null;
            String portalUrl = null;
            Long duration = null;
            String subnetId = null;
            TestType testType = null;
            OffsetDateTime createdDateTime = null;
            String createdBy = null;
            OffsetDateTime lastModifiedDateTime = null;
            String lastModifiedBy = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("testRunId".equals(fieldName)) {
                    testRunId = reader.getString();
                } else if ("passFailCriteria".equals(fieldName)) {
                    passFailCriteria = PassFailCriteria.fromJson(reader);
                } else if ("autoStopCriteria".equals(fieldName)) {
                    autoStopCriteria = AutoStopCriteria.fromJson(reader);
                } else if ("secrets".equals(fieldName)) {
                    secrets = reader.readMap(reader1 -> Secret.fromJson(reader1));
                } else if ("certificate".equals(fieldName)) {
                    certificate = CertificateMetadata.fromJson(reader);
                } else if ("environmentVariables".equals(fieldName)) {
                    environmentVariables = reader.readMap(reader1 -> reader1.getString());
                } else if ("errorDetails".equals(fieldName)) {
                    errorDetails = reader.readArray(reader1 -> ErrorDetails.fromJson(reader1));
                } else if ("testRunStatistics".equals(fieldName)) {
                    testRunStatistics = reader.readMap(reader1 -> TestRunStatistics.fromJson(reader1));
                } else if ("loadTestConfiguration".equals(fieldName)) {
                    loadTestConfiguration = LoadTestConfiguration.fromJson(reader);
                } else if ("testArtifacts".equals(fieldName)) {
                    testArtifacts = TestRunArtifacts.fromJson(reader);
                } else if ("testResult".equals(fieldName)) {
                    testResult = PFTestResult.fromString(reader.getString());
                } else if ("virtualUsers".equals(fieldName)) {
                    virtualUsers = reader.getNullable(JsonReader::getInt);
                } else if ("displayName".equals(fieldName)) {
                    displayName = reader.getString();
                } else if ("testId".equals(fieldName)) {
                    testId = reader.getString();
                } else if ("description".equals(fieldName)) {
                    description = reader.getString();
                } else if ("status".equals(fieldName)) {
                    status = Status.fromString(reader.getString());
                } else if ("startDateTime".equals(fieldName)) {
                    startDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("endDateTime".equals(fieldName)) {
                    endDateTime = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("executedDateTime".equals(fieldName)) {
                    executedDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("portalUrl".equals(fieldName)) {
                    portalUrl = reader.getString();
                } else if ("duration".equals(fieldName)) {
                    duration = reader.getNullable(JsonReader::getLong);
                } else if ("subnetId".equals(fieldName)) {
                    subnetId = reader.getString();
                } else if ("testType".equals(fieldName)) {
                    testType = TestType.fromString(reader.getString());
                } else if ("createdDateTime".equals(fieldName)) {
                    createdDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("createdBy".equals(fieldName)) {
                    createdBy = reader.getString();
                } else if ("lastModifiedDateTime".equals(fieldName)) {
                    lastModifiedDateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("lastModifiedBy".equals(fieldName)) {
                    lastModifiedBy = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            TestRun deserializedTestRun = new TestRun();
            deserializedTestRun.testRunId = testRunId;
            deserializedTestRun.passFailCriteria = passFailCriteria;
            deserializedTestRun.autoStopCriteria = autoStopCriteria;
            deserializedTestRun.secrets = secrets;
            deserializedTestRun.certificate = certificate;
            deserializedTestRun.environmentVariables = environmentVariables;
            deserializedTestRun.errorDetails = errorDetails;
            deserializedTestRun.testRunStatistics = testRunStatistics;
            deserializedTestRun.loadTestConfiguration = loadTestConfiguration;
            deserializedTestRun.testArtifacts = testArtifacts;
            deserializedTestRun.testResult = testResult;
            deserializedTestRun.virtualUsers = virtualUsers;
            deserializedTestRun.displayName = displayName;
            deserializedTestRun.testId = testId;
            deserializedTestRun.description = description;
            deserializedTestRun.status = status;
            deserializedTestRun.startDateTime = startDateTime;
            deserializedTestRun.endDateTime = endDateTime;
            deserializedTestRun.executedDateTime = executedDateTime;
            deserializedTestRun.portalUrl = portalUrl;
            deserializedTestRun.duration = duration;
            deserializedTestRun.subnetId = subnetId;
            deserializedTestRun.testType = testType;
            deserializedTestRun.createdDateTime = createdDateTime;
            deserializedTestRun.createdBy = createdBy;
            deserializedTestRun.lastModifiedDateTime = lastModifiedDateTime;
            deserializedTestRun.lastModifiedBy = lastModifiedBy;
            return deserializedTestRun;
        });
    }

    /*
     * Type of test.
     */
    @Generated
    private TestKind kind;

    /*
     * Inject load test engines without deploying public IP for outbound access
     */
    @Generated
    private Boolean publicIPDisabled;

    /**
     * Get the kind property: Type of test.
     *
     * @return the kind value.
     */
    @Generated
    public TestKind getKind() {
        return this.kind;
    }

    /**
     * Get the publicIPDisabled property: Inject load test engines without deploying public IP for outbound access.
     *
     * @return the publicIPDisabled value.
     */
    @Generated
    public Boolean isPublicIPDisabled() {
        return this.publicIPDisabled;
    }
}
