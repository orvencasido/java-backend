#!/bin/bash

set -e

JAVA_FILE="${1:-Day_Seven_Project.java}"

docker run --rm -it \
  -v "$PWD":/app \
  -w /app \
  eclipse-temurin:21 \
  java "$JAVA_FILE"
