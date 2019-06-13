#!/bin/bash

# start the java server stub
cd /root/tapi2.1-javaServer
~/apache-maven-3.3.9/bin/mvn clean package jetty:run
