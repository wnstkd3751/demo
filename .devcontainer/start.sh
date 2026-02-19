#!/bin/bash
set -e

echo "JAVA VERSION:"
java -version

echo "Starting EurekaServer..."
(cd EurekaServer && chmod +x gradlew && ./gradlew bootRun) &

echo "Starting ApiGateWay..."
(cd ApiGateWay && chmod +x gradlew && ./gradlew bootRun) &

echo "Starting UserService..."
(cd UserService && chmod +x gradlew && ./gradlew bootRun) &

echo "Starting StorageService..."
(cd StorageService && chmod +x gradlew && ./gradlew bootRun) &

wait
