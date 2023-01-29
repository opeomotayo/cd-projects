FROM alpine:latest

RUN apk update

#bash
RUN apk add bash

#curl
RUN apk --no-cache add curl

#docker
RUN apk add --update docker openrc
RUN rc-update add docker boot

#helm
RUN curl -sSfL https://raw.githubusercontent.com/helm/helm/master/scripts/get-helm-3 | sh -s -- -b /usr/local/bin

# ENV BASE_URL="https://get.helm.sh"

# RUN case `uname -m` in \
#         x86_64) ARCH=amd64; ;; \
#         armv7l) ARCH=arm; ;; \
#         aarch64) ARCH=arm64; ;; \
#         ppc64le) ARCH=ppc64le; ;; \
#         s390x) ARCH=s390x; ;; \
#         *) echo "un-supported arch, exit ..."; exit 1; ;; \
#     esac && \
#     apk add --update --no-cache wget git curl && \
#     wget ${BASE_URL}/helm-v${VERSION}-linux-${ARCH}.tar.gz -O - | tar -xz && \
#     mv linux-${ARCH}/helm /usr/bin/helm && \
#     chmod +x /usr/bin/helm && \
#     rm -rf linux-${ARCH}

# RUN chmod +x /usr/bin/helm


# RUN curl -L https://storage.googleapis.com/kubernetes-release/release/${K8S_VERSION}/bin/linux/amd64/kubectl -o /usr/local/bin/kubectl \
#  && curl -L https://storage.googleapis.com/kubernetes-helm/${HELM_FILENAME} | tar xz && mv linux-amd64/helm /bin/helm && rm -rf linux-amd64