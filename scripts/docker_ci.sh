#!/bin/bash
USER="massipssa"
REPO="devs"
docker build -t devs/workspace .
echo "$DOCKER_PASSWORD" | docker login -u "$DOCKER_USERNAME" --password-stdin
docker push "$USER"/"$REPO"