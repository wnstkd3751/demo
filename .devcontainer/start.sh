#!/bin/bash

echo "JAVA VERSION:"
java -version

echo "Starting EurekaServer..."
cd EurekaServer && ./gradlew bootRun &

echo "Starting ApiGateWay..."
cd ../ApiGateWay && ./gradlew bootRun &

echo "Starting UserService..."
cd ../UserService && ./gradlew bootRun &

echo "Starting StorageService..."
cd ../StorageService && ./gradlew bootRun &