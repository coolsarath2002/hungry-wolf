#!/usr/bin/env bash
#rm -r generated
mkdir -r generated
java -jar ../swagger-codegen-cli-2.4.1.jar generate \
  -v -i hungry-wolf-ticket-api .yaml \
  -l spring --library spring-boot \
  -o generated \
  --import-mappings ZonedDateTime=java.time.ZonedDateTime \
  --type-mappings OffsetDateTime=ZonedDateTime \
  -DmodelPackage=com.hungrywolf.facts.model.generated \
  -DapiPackage=com.hungrywolf.feed.api.controller -Djava8=true -DdateLibrary=java8 -DuseBeanValidation=true -DperformBeanValidation=true