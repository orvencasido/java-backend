#!/bin/bash

set -e

JAVA_FILE="${1:-Day_Three/Day_Three_Challenge_Two_NumberGuessingGame.java}"

docker run --rm -it \
  -v "$PWD":/app \
  -w /app \
  eclipse-temurin:21 \
  java "$JAVA_FILE"
