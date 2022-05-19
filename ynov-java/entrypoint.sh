#!/bin/sh

set -e

cd /jail

mkdir project

mkdir project/src
mkdir project/src/main
mkdir project/src/main/java
mkdir project/src/test
mkdir project/src/test/java

cp -rf ./student/*.java ./project/src/main/java

cp -rf "/app/${EXERCISE}Test"/*.java ./project/src/test/java

cd project

find -name "*.java" > sources.txt

javac -cp /app/setup/lib/assertj-core-3.22.0.jar:/app/setup/lib/junit-jupiter-api-5.8.2.jar:/app/setup/lib/apiguardian-api-1.1.2.jar @sources.txt -d build

java -XX:MaxJavaStackTraceDepth=0 -jar /app/setup/lib/junit-platform-console-standalone-1.8.2.jar --details=tree -cp /app/setup/lib/junit-jupiter-engine-5.8.2.jar:/app/setup/lib/assertj-core-3.22.0.jar:build --scan-classpath --disable-banner --details-theme=ascii | grep "[+']--"