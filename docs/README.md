# Build and Run ODTN Emulators 

## Build and run from this project
You can run the command `docker-compose up -d` to start two OpenConfig emulators (open ports 11002 and 11003) and one TAPI emulator (open port 11000). 
* The implemention of TAPI emulator is based on the [TAPI2.1 emulator instruction](https://docs.google.com/document/d/1YvtFbmir9jxbDp1hJHtYr9tPtDz6_tsxx9xkmG689Ik/edit).
* OpenConfig Emulator's implementation based on [Netopeer2](https://github.com/CESNET/Netopeer2) in [ODTN project](https://www.opennetworking.org/odtn/). 

The steps listed below show a simple tutorial for this emulator. For more details, please see [ODTN Wiki Page](https://wiki.onosproject.org/display/ODTN/ODTN). Then you will get the docker images and containers as listed:
```
$ docker images
REPOSITORY                           TAG                                IMAGE ID            CREATED             SIZE
odtn-emulator_tapi_ols               latest                             d824a8dba57d        13 seconds ago      712MB
odtn-emulator_openconfig_cassini_1   latest                             a6c9fd1f6269        4 minutes ago       1.05GB
odtn-emulator_openconfig_cassini_2   latest                             a6c9fd1f6269        8 minutes ago       1.05GB

$ docker ps -a
CONTAINER ID        IMAGE                                COMMAND                  CREATED              STATUS                      PORTS                                      NAMES
a0a32ad5a798        odtn-emulator_openconfig_cassini_1   "sh /root/push-data.…"   About a minute ago   Up About a minute           22/tcp, 8080/tcp, 0.0.0.0:11002->830/tcp   odtn-emulator_openconfig_cassini_1_1
3b6de0eca93d        odtn-emulator_tapi_ols               "sh /root/script/ent…"   About a minute ago   Up About a minute           0.0.0.0:11000->1234/tcp                    odtn-emulator_tapi_ols_1
deeafac40dd0        odtn-emulator_openconfig_cassini_2   "sh /root/push-data.…"   About a minute ago   Up About a minute           22/tcp, 8080/tcp, 0.0.0.0:11003->830/tcp   odtn-emulator_openconfig_cassini_2_1
```
## Build and run from DockerHub
If you don't want to waste time to compile the images, you can also pull images from DockerHub and run them:

```shell
docker pull onosproject/tapi-2.1:0.01
docker pull onosproject/oc-cassini:0.21
docker run -it -d --name odtn-emulator_openconfig_cassini_1_1 -p 11002:830 onosproject/oc-cassini:0.21
docker run -it -d --name odtn-emulator_openconfig_cassini_2_1 -p 11003:830 onosproject/oc-cassini:0.21
docker run -it -d --name odtn-emulator_tapi_ols_1 -p 11000:1234 onosproject/tapi-2.1:0.01
```

## Test if the Cassini docker runs sucessfully
If you want to check whether the containers start up, you can use *netconf-console* and *curl*. To install *netconf-console* which is a  console application for interacting with NETCONF servers built on top of ncclient as follows.

```bash
pip3 install netconf-console
```

**Note**: You also need to make sure   *ncclient* version **0.6.3**  is installed on your machine. To check the version of *ncclient* on your machine, you can use the following command:
```bash
pip3  show ncclient
```

And the output will be like this:
```bash
Name: ncclient
Version: 0.6.3
Summary: Python library for NETCONF clients
Home-page: https://github.com/ncclient/ncclient
Author: Shikhar Bhushan, Leonidas Poulopoulos, Ebben Aries, Einar Nilsen-Nygaard
Author-email: shikhar@schmizz.net, lpoulopoulos@verisign.com, earies@juniper.net, einarnn@gmail.com
License: Apache 2.0
Location: /usr/local/lib/python3.7/site-packages
Requires: lxml, six, setuptools, paramiko, selectors2
Required-by: netconf-console
```


 If higher versions of ncclient installed on your machine, you need to reinstall it as follows:

```bash
pip3 install ncclient==0.6.3
```


There are three commands to test three containers respectively as follows:

* `netconf-console --host=127.0.0.1 --port=11002 -u root -p root --rpc=emulator-test/get-terminal-device.xml`
* `netconf-console --host=127.0.0.1 --port=11003 -u root -p root --rpc=emulator-test/get-terminal-device.xml`
* `curl http://localhost:11000/restconf/data/tapi-common:context`


