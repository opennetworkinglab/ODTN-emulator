#!/bin/bash

export LD_LIBRARY_PATH=/lib:/usr/lib:/usr/local/lib
sysrepod
# Push openconfig-platform and openconfig-terminal-device data into sysrepo
cd /root/config
/root/sysrepo/build/examples/application_example tapi-common &

# Start Netconf Server
netopeer2-server

# start the java server stub
cd /root/tapi2.1-javaServer
~/apache-maven-3.3.9/bin/mvn clean package jetty:run