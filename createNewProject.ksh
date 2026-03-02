#!/bin/ksh

# Exit if no project name is provided
if [[ -z "$1" ]]; then
  echo "Usage: $0 <ProjectName>"
  exit 1
fi

PROJECT_NAME=$1
GROUP_ID="com.marto"

# 1. ARTIFACT_ID (The Folder Name) matches your input exactly (e.g. FirstJavaProject)
ARTIFACT_ID="$PROJECT_NAME"

# 2. Determine the SUB_PACKAGE
if [[ -n "$2" ]]; then
  SUB_PACKAGE="$2"
else
  # Fallback: lowercase the project name
  SUB_PACKAGE=$(echo "$PROJECT_NAME" | tr '[:upper:]' '[:lower:]')
fi

FULL_PACKAGE="$GROUP_ID.$SUB_PACKAGE"

# 3. Calculate path for the success message
PACKAGE_DIR=$(echo "$FULL_PACKAGE" | tr '.' '/')

echo "--- Generating Project: $ARTIFACT_ID ---"
echo "--- Java Package: $FULL_PACKAGE ---"

mvn archetype:generate \
  -DgroupId="$GROUP_ID" \
  -DartifactId="$ARTIFACT_ID" \
  -Dpackage="$FULL_PACKAGE" \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DarchetypeVersion=1.5 \
  -DinteractiveMode=false

if [[ $? -eq 0 ]]; then
  echo "\n--- Generation Complete ---"
  echo "Next steps:"
  echo "1. cd $ARTIFACT_ID"
  echo "2. Edit pom.xml: Set <maven.compiler.source> and <target> to 25"
  echo "3. nvim src/main/java/$PACKAGE_DIR/App.java"
fi
