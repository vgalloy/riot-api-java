#!/bin/bash

CURRENT=`pwd`
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
cd $DIR

version=$(grep "<version>" ../pom.xml | head -n 1 | cut -d '>' -f2 | cut -d '<' -f1) 
maj=$(echo $version | cut -d '.' -f1)
min=$(echo $version | cut -d '.' -f2)
hotfix=$(echo $version | cut -d '.' -f3 | cut -d '-' -f1)
new_version=$maj.$min.$hotfix
echo "new_version : "$new_version

sed -i "s/$version/$new_version/g" ../pom.xml

mv Jenkinsfile Jenkinsfile.snapshot
mv Jenkinsfile.release Jenkinsfile
git add Jenkinsfile.snapshot

git commit -am "[ UPD ] : Update version to $new_version"
git tag $new_version
#(cd .. && mvn clean install -DskipTests)
new_version_snapshot=$maj.$min.$(($hotfix+1))-SNAPSHOT

mv Jenkinsfile Jenkinsfile.release
mv Jenkinsfile.snapshot Jenkinsfile
sed -i "s/$new_version/$new_version_snapshot/g" ../pom.xml
git add Jenkinsfile.release
git commit -am "[ UPD ] : Update version to $new_version_snapshot"

cd $CURRENT
