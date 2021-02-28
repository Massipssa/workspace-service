#!/bin/bash
USER="massipssa"
REPO="devs"
TAG="workspace"
docker build -t "$USER"/"$REPO":"$TAG" .
echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker push "$USER"/"$REPO":"$TAG"
