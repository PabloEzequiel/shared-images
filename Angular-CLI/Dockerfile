FROM node:6-alpine

ARG NG_CLI_VERSION=latest


LABEL author="Pablo Ezequiel <@pab_ezequiel>

RUN apk update \
  && apk add --update alpine-sdk \
  && apk add bash \
  && npm install -g @angular/cli@1.0.0-beta.32.3 \
  && apk del alpine-sdk \
  && rm -rf /tmp/* /var/cache/apk/* *.tar.gz ~/.npm \
  && npm cache clear
