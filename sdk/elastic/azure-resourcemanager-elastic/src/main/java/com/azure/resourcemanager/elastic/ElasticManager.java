// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elastic.fluent.MicrosoftElastic;
import com.azure.resourcemanager.elastic.implementation.AllTrafficFiltersImpl;
import com.azure.resourcemanager.elastic.implementation.AssociateTrafficFiltersImpl;
import com.azure.resourcemanager.elastic.implementation.CreateAndAssociateIpFiltersImpl;
import com.azure.resourcemanager.elastic.implementation.CreateAndAssociatePLFiltersImpl;
import com.azure.resourcemanager.elastic.implementation.DeploymentInfoesImpl;
import com.azure.resourcemanager.elastic.implementation.DetachAndDeleteTrafficFiltersImpl;
import com.azure.resourcemanager.elastic.implementation.DetachTrafficFiltersImpl;
import com.azure.resourcemanager.elastic.implementation.ElasticVersionsImpl;
import com.azure.resourcemanager.elastic.implementation.ExternalUsersImpl;
import com.azure.resourcemanager.elastic.implementation.ListAssociatedTrafficFiltersImpl;
import com.azure.resourcemanager.elastic.implementation.MicrosoftElasticBuilder;
import com.azure.resourcemanager.elastic.implementation.MonitorOperationsImpl;
import com.azure.resourcemanager.elastic.implementation.MonitoredResourcesImpl;
import com.azure.resourcemanager.elastic.implementation.MonitorsImpl;
import com.azure.resourcemanager.elastic.implementation.OperationsImpl;
import com.azure.resourcemanager.elastic.implementation.OrganizationsImpl;
import com.azure.resourcemanager.elastic.implementation.TagRulesImpl;
import com.azure.resourcemanager.elastic.implementation.TrafficFiltersImpl;
import com.azure.resourcemanager.elastic.implementation.UpgradableVersionsImpl;
import com.azure.resourcemanager.elastic.implementation.VMCollectionsImpl;
import com.azure.resourcemanager.elastic.implementation.VMHostsImpl;
import com.azure.resourcemanager.elastic.implementation.VMIngestionsImpl;
import com.azure.resourcemanager.elastic.models.AllTrafficFilters;
import com.azure.resourcemanager.elastic.models.AssociateTrafficFilters;
import com.azure.resourcemanager.elastic.models.CreateAndAssociateIpFilters;
import com.azure.resourcemanager.elastic.models.CreateAndAssociatePLFilters;
import com.azure.resourcemanager.elastic.models.DeploymentInfoes;
import com.azure.resourcemanager.elastic.models.DetachAndDeleteTrafficFilters;
import com.azure.resourcemanager.elastic.models.DetachTrafficFilters;
import com.azure.resourcemanager.elastic.models.ElasticVersions;
import com.azure.resourcemanager.elastic.models.ExternalUsers;
import com.azure.resourcemanager.elastic.models.ListAssociatedTrafficFilters;
import com.azure.resourcemanager.elastic.models.MonitorOperations;
import com.azure.resourcemanager.elastic.models.MonitoredResources;
import com.azure.resourcemanager.elastic.models.Monitors;
import com.azure.resourcemanager.elastic.models.Operations;
import com.azure.resourcemanager.elastic.models.Organizations;
import com.azure.resourcemanager.elastic.models.TagRules;
import com.azure.resourcemanager.elastic.models.TrafficFilters;
import com.azure.resourcemanager.elastic.models.UpgradableVersions;
import com.azure.resourcemanager.elastic.models.VMCollections;
import com.azure.resourcemanager.elastic.models.VMHosts;
import com.azure.resourcemanager.elastic.models.VMIngestions;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/** Entry point to ElasticManager. */
public final class ElasticManager {
    private Operations operations;

    private Monitors monitors;

    private ElasticVersions elasticVersions;

    private MonitoredResources monitoredResources;

    private DeploymentInfoes deploymentInfoes;

    private ExternalUsers externalUsers;

    private TagRules tagRules;

    private VMHosts vMHosts;

    private VMIngestions vMIngestions;

    private VMCollections vMCollections;

    private UpgradableVersions upgradableVersions;

    private MonitorOperations monitorOperations;

    private AllTrafficFilters allTrafficFilters;

    private ListAssociatedTrafficFilters listAssociatedTrafficFilters;

    private CreateAndAssociateIpFilters createAndAssociateIpFilters;

    private CreateAndAssociatePLFilters createAndAssociatePLFilters;

    private AssociateTrafficFilters associateTrafficFilters;

    private DetachAndDeleteTrafficFilters detachAndDeleteTrafficFilters;

    private DetachTrafficFilters detachTrafficFilters;

    private TrafficFilters trafficFilters;

    private Organizations organizations;

    private final MicrosoftElastic clientObject;

    private ElasticManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject =
            new MicrosoftElasticBuilder()
                .pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .defaultPollInterval(defaultPollInterval)
                .buildClient();
    }

    /**
     * Creates an instance of elastic service API entry point.
     *
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the elastic service API instance.
     */
    public static ElasticManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of elastic service API entry point.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the elastic service API instance.
     */
    public static ElasticManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new ElasticManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create ElasticManager with optional configuration.
     *
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new ElasticManager.Configurable();
    }

    /** The Configurable allowing configurations to be set. */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         *
         * <p>This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval =
                Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of elastic service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the elastic service API instance.
         */
        public ElasticManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder
                .append("azsdk-java")
                .append("-")
                .append("com.azure.resourcemanager.elastic")
                .append("/")
                .append("1.0.0-beta.3");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder
                    .append(" (")
                    .append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.name"))
                    .append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version"))
                    .append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies
                .addAll(
                    this
                        .policies
                        .stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                    .httpClient(httpClient)
                    .policies(policies.toArray(new HttpPipelinePolicy[0]))
                    .build();
            return new ElasticManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of Operations.
     *
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of Monitors. It manages ElasticMonitorResource.
     *
     * @return Resource collection API of Monitors.
     */
    public Monitors monitors() {
        if (this.monitors == null) {
            this.monitors = new MonitorsImpl(clientObject.getMonitors(), this);
        }
        return monitors;
    }

    /**
     * Gets the resource collection API of ElasticVersions.
     *
     * @return Resource collection API of ElasticVersions.
     */
    public ElasticVersions elasticVersions() {
        if (this.elasticVersions == null) {
            this.elasticVersions = new ElasticVersionsImpl(clientObject.getElasticVersions(), this);
        }
        return elasticVersions;
    }

    /**
     * Gets the resource collection API of MonitoredResources.
     *
     * @return Resource collection API of MonitoredResources.
     */
    public MonitoredResources monitoredResources() {
        if (this.monitoredResources == null) {
            this.monitoredResources = new MonitoredResourcesImpl(clientObject.getMonitoredResources(), this);
        }
        return monitoredResources;
    }

    /**
     * Gets the resource collection API of DeploymentInfoes.
     *
     * @return Resource collection API of DeploymentInfoes.
     */
    public DeploymentInfoes deploymentInfoes() {
        if (this.deploymentInfoes == null) {
            this.deploymentInfoes = new DeploymentInfoesImpl(clientObject.getDeploymentInfoes(), this);
        }
        return deploymentInfoes;
    }

    /**
     * Gets the resource collection API of ExternalUsers.
     *
     * @return Resource collection API of ExternalUsers.
     */
    public ExternalUsers externalUsers() {
        if (this.externalUsers == null) {
            this.externalUsers = new ExternalUsersImpl(clientObject.getExternalUsers(), this);
        }
        return externalUsers;
    }

    /**
     * Gets the resource collection API of TagRules. It manages MonitoringTagRules.
     *
     * @return Resource collection API of TagRules.
     */
    public TagRules tagRules() {
        if (this.tagRules == null) {
            this.tagRules = new TagRulesImpl(clientObject.getTagRules(), this);
        }
        return tagRules;
    }

    /**
     * Gets the resource collection API of VMHosts.
     *
     * @return Resource collection API of VMHosts.
     */
    public VMHosts vMHosts() {
        if (this.vMHosts == null) {
            this.vMHosts = new VMHostsImpl(clientObject.getVMHosts(), this);
        }
        return vMHosts;
    }

    /**
     * Gets the resource collection API of VMIngestions.
     *
     * @return Resource collection API of VMIngestions.
     */
    public VMIngestions vMIngestions() {
        if (this.vMIngestions == null) {
            this.vMIngestions = new VMIngestionsImpl(clientObject.getVMIngestions(), this);
        }
        return vMIngestions;
    }

    /**
     * Gets the resource collection API of VMCollections.
     *
     * @return Resource collection API of VMCollections.
     */
    public VMCollections vMCollections() {
        if (this.vMCollections == null) {
            this.vMCollections = new VMCollectionsImpl(clientObject.getVMCollections(), this);
        }
        return vMCollections;
    }

    /**
     * Gets the resource collection API of UpgradableVersions.
     *
     * @return Resource collection API of UpgradableVersions.
     */
    public UpgradableVersions upgradableVersions() {
        if (this.upgradableVersions == null) {
            this.upgradableVersions = new UpgradableVersionsImpl(clientObject.getUpgradableVersions(), this);
        }
        return upgradableVersions;
    }

    /**
     * Gets the resource collection API of MonitorOperations.
     *
     * @return Resource collection API of MonitorOperations.
     */
    public MonitorOperations monitorOperations() {
        if (this.monitorOperations == null) {
            this.monitorOperations = new MonitorOperationsImpl(clientObject.getMonitorOperations(), this);
        }
        return monitorOperations;
    }

    /**
     * Gets the resource collection API of AllTrafficFilters.
     *
     * @return Resource collection API of AllTrafficFilters.
     */
    public AllTrafficFilters allTrafficFilters() {
        if (this.allTrafficFilters == null) {
            this.allTrafficFilters = new AllTrafficFiltersImpl(clientObject.getAllTrafficFilters(), this);
        }
        return allTrafficFilters;
    }

    /**
     * Gets the resource collection API of ListAssociatedTrafficFilters.
     *
     * @return Resource collection API of ListAssociatedTrafficFilters.
     */
    public ListAssociatedTrafficFilters listAssociatedTrafficFilters() {
        if (this.listAssociatedTrafficFilters == null) {
            this.listAssociatedTrafficFilters =
                new ListAssociatedTrafficFiltersImpl(clientObject.getListAssociatedTrafficFilters(), this);
        }
        return listAssociatedTrafficFilters;
    }

    /**
     * Gets the resource collection API of CreateAndAssociateIpFilters.
     *
     * @return Resource collection API of CreateAndAssociateIpFilters.
     */
    public CreateAndAssociateIpFilters createAndAssociateIpFilters() {
        if (this.createAndAssociateIpFilters == null) {
            this.createAndAssociateIpFilters =
                new CreateAndAssociateIpFiltersImpl(clientObject.getCreateAndAssociateIpFilters(), this);
        }
        return createAndAssociateIpFilters;
    }

    /**
     * Gets the resource collection API of CreateAndAssociatePLFilters.
     *
     * @return Resource collection API of CreateAndAssociatePLFilters.
     */
    public CreateAndAssociatePLFilters createAndAssociatePLFilters() {
        if (this.createAndAssociatePLFilters == null) {
            this.createAndAssociatePLFilters =
                new CreateAndAssociatePLFiltersImpl(clientObject.getCreateAndAssociatePLFilters(), this);
        }
        return createAndAssociatePLFilters;
    }

    /**
     * Gets the resource collection API of AssociateTrafficFilters.
     *
     * @return Resource collection API of AssociateTrafficFilters.
     */
    public AssociateTrafficFilters associateTrafficFilters() {
        if (this.associateTrafficFilters == null) {
            this.associateTrafficFilters =
                new AssociateTrafficFiltersImpl(clientObject.getAssociateTrafficFilters(), this);
        }
        return associateTrafficFilters;
    }

    /**
     * Gets the resource collection API of DetachAndDeleteTrafficFilters.
     *
     * @return Resource collection API of DetachAndDeleteTrafficFilters.
     */
    public DetachAndDeleteTrafficFilters detachAndDeleteTrafficFilters() {
        if (this.detachAndDeleteTrafficFilters == null) {
            this.detachAndDeleteTrafficFilters =
                new DetachAndDeleteTrafficFiltersImpl(clientObject.getDetachAndDeleteTrafficFilters(), this);
        }
        return detachAndDeleteTrafficFilters;
    }

    /**
     * Gets the resource collection API of DetachTrafficFilters.
     *
     * @return Resource collection API of DetachTrafficFilters.
     */
    public DetachTrafficFilters detachTrafficFilters() {
        if (this.detachTrafficFilters == null) {
            this.detachTrafficFilters = new DetachTrafficFiltersImpl(clientObject.getDetachTrafficFilters(), this);
        }
        return detachTrafficFilters;
    }

    /**
     * Gets the resource collection API of TrafficFilters.
     *
     * @return Resource collection API of TrafficFilters.
     */
    public TrafficFilters trafficFilters() {
        if (this.trafficFilters == null) {
            this.trafficFilters = new TrafficFiltersImpl(clientObject.getTrafficFilters(), this);
        }
        return trafficFilters;
    }

    /**
     * Gets the resource collection API of Organizations.
     *
     * @return Resource collection API of Organizations.
     */
    public Organizations organizations() {
        if (this.organizations == null) {
            this.organizations = new OrganizationsImpl(clientObject.getOrganizations(), this);
        }
        return organizations;
    }

    /**
     * @return Wrapped service client MicrosoftElastic providing direct access to the underlying auto-generated API
     *     implementation, based on Azure REST API.
     */
    public MicrosoftElastic serviceClient() {
        return this.clientObject;
    }
}
