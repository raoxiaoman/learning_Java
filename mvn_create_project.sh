#!/bin/bash
if [ $# -gt 2 ];then
echo "USAGE: $0 DgroupId DartifactId"
echo "e.g.: $0 com.raohui test"
exit 1;
fi
#echo $1
#echo $2
mvn archetype:generate -DgroupId=$1 -DartifactId=$2 -DarchetypeArtifactId=maven-archetype-quickstart  -DinteractiveMode=false \
    -DarchetypeCatalog=local
    #-DarchetypeCatalog=internal
