# This dockerfile bakes github-oauth-plugin into Nexus image
ARG NEXUS_VERSION=3.53.0

FROM alpine AS build

RUN wget -O /opt/nexus3-github-oauth-plugin.kar https://github.com/larscheid-schmitzhermes/nexus3-github-oauth-plugin/releases/download/3.0.0/nexus3-github-oauth-plugin.kar

FROM sonatype/nexus3:$NEXUS_VERSION

ARG DEPLOY_DIR=/opt/sonatype/nexus/deploy/
USER root
COPY --from=build /opt/nexus3-github-oauth-plugin.kar ${DEPLOY_DIR}
RUN echo "github.api.url=https://api.github.com" >> /opt/sonatype/nexus/etc/githuboauth.properties &&\
    echo "github.principal.cache.ttl=PT1H" >> /opt/sonatype/nexus/etc/githuboauth.properties
USER nexus
