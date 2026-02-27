#!/bin/ksh

if [[ -z "$1" ]]; then
  echo "Usage: $0 <ProjectName>"
  exit 1
fi

PROJECT_NAME=$1
GROUP_ID="com.marto"
ARTIFACT_ID=$(echo "$PROJECT_NAME" | tr '[:upper:]' '[:lower:]')

# Explicitly defining the package to match the project name
FULL_PACKAGE="$GROUP_ID.$ARTIFACT_ID"
PACKAGE_DIR=$(echo "$FULL_PACKAGE" | tr '.' '/')

echo "--- Generating Professional Maven Structure: $ARTIFACT_ID ---"

mvn archetype:generate \
  -DgroupId="$GROUP_ID" \
  -DartifactId="$ARTIFACT_ID" \
  -Dpackage="$FULL_PACKAGE" \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DarchetypeVersion=1.5 \
  -DinteractiveMode=false

if [[ $? -eq 0 ]]; then
  echo "\n--- Generation Complete ---"
  echo "1. cd $ARTIFACT_ID"
  echo "2. Edit pom.xml: Set compiler to 25"
  echo "3. nvim src/main/java/$PACKAGE_DIR/App.java"
fi
