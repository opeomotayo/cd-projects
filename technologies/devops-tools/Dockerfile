FROM alpine:latest

RUN apk update && apk upgrade && \
    apk add --no-cache bash git curl openssh openssl && \
    rm -rf /var/cache/apk/*

#docker
RUN apk add --update docker openrc
RUN rc-update add docker boot

#helm
RUN curl -sSL https://raw.githubusercontent.com/helm/helm/master/scripts/get-helm-3 | bash
