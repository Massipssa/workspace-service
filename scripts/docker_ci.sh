#!/bin/bash
REGISTRY="hub.docker.com"
USER="massipssa"
REPO="devs"
docker build -t devs/workspace .
echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin "$REGISTRY"
docker push "$USER"/"$REPO":workspace
