#!/bin/sh
cd ~/git/aws_v1;
git fetch;
git merge gh/development;
mvn clean install;
nohup mvn spring-boot:run &