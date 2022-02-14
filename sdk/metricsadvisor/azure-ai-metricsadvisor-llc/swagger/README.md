# Azure Cognitive Service - Metric Advisor for Java

> see https://aka.ms/autorest

### Setup
```ps
Fork and clone https://github.com/Azure/autorest.java
git checkout main
git submodule update --init --recursive
mvn package -Dlocal
npm install
npm install -g autorest
```

### Generation
```ps
cd <swagger-folder>
autorest --java --use=C:/work/autorest.java
```

### Code generation settings
```yaml
input-file: ./metricsadvisor_1.20200903_openapi.v2.json
java: true
output-folder: ../
regenerate-pom: false
title: MetricsAdvisorClient
generate-sync-async-clients: true
generate-client-as-impl: true
generate-client-interfaces: false
add-context-parameter: true
low-level-client: true
sync-methods: all
generate-samples: true
license-header: MICROSOFT_MIT_SMALL
namespace: com.azure.ai.metricsadvisor
service-name: MetricsAdvisor
context-client-method-parameter: true
azure-arm: false
credential-types: tokencredential
credential-scopes: https://cognitiveservices.azure.com/.default
service-versions:
  - 'v1.0'
```

### Generated types renamed and moved to model

