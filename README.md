# Configurable Widget
The project contains an MFE (simple-mfe) with associated (simple-mfe-config) for Entando 7.1. It also includes a simple Spring Boot microservice (spring-ms) connected to the simple-mfe via an API claim.

## Prerequisites
1. Docker account
2. attach ent to an Entando platform (e.g. ent attach-kubeconfig config-file)

## Build and publish steps  
1. ent bundle pack 
2. ent bundle publish
3. ent bundle deploy
4. ent bundle install
