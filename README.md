# ODTN-emulator
There are two kinds of emulators, i.e., the OpenConfig model under directory `emulator-oc-cassini` and the TAPI model under directory `emulator-tapi-2.1`. In this demo, the former describes the line-side and client-side of the terminal device in Open Line System (OLS), and the latter describes the middle components between optical device in OLS.

## I. Build emulators and run them

#### I.a build and run from this project
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
#### I.b build and run from DockerHub
If you don't want to waste time to compile the images, you can also pull images from DockerHub and run them:

```shell
docker pull onosproject/tapi-2.1:0.01
docker pull onosproject/oc-cassini:0.21
docker run -it -d --name odtn-emulator_openconfig_cassini_1_1 -p 11002:830 onosproject/oc-cassini:0.21
docker run -it -d --name odtn-emulator_openconfig_cassini_2_1 -p 11003:830 onosproject/oc-cassini:0.21
docker run -it -d --name odtn-emulator_tapi_ols_1 -p 11000:1234 onosproject/tapi-2.1:0.01
```

#### I.c test if the Cassini docker runs sucessfully
If you want to check whether the containers start up, there are three commands to test three containers respectively:

* `netconf-console --host=127.0.0.1 --port=11002 -u root -p root --rpc=emulator-test/get-terminal-device.xml`
* `netconf-console --host=127.0.0.1 --port=11003 -u root -p root --rpc=emulator-test/get-terminal-device.xml`
* `curl http://localhost:11000/restconf/data/tapi-common:context`


## II. Start onos and activate odtn-service locally

```shell
cd ${ONOS_ROOT}
export ONOS_APPS=odtn-service,roadm
bazel build onos
bazel run onos-local -- clean
```

### 3. Push node and link information

```shell
# The Cassini node owns 32 ports including 16 client-side ports and 16 line-side ports.
# The TAPI node owns 2 ports.
onos-netcfg localhost topo/with-rest-tapi/device.json
# Each Cassini node has one link to the TAPI node.
onos-netcfg localhost topo/with-rest-tapi/link.json
```

### 4. Create/delete the line-side/client-side connectivities

```shell
# Python2.7

# 1. Create line-side connectivity
execute-tapi-post-call.py 127.0.0.1 tapi-connectivity:create-connectivity-service line-side
# 2. Delete all line-side connectivities
execute-tapi-delete-call 127.0.0.1 line
# 3. Create client-side connectivity
execute-tapi-post-call.py 127.0.0.1 tapi-connectivity:create-connectivity-servic client-side
# 4. Delete all connectivities
execute-tapi-delete-call 127.0.0.1 both
```

### Notes about modification in yang files under `emulator-oc-cassini` directory
1. Although openconfig yang models are defined with YANG 1.0, we still add module prefix before identity reference as YANG 1.1 requires. Please see https://github.com/openconfig/public/issues/223.
2. There are operational data ("config false") and configurable data ("config true"). The operational data can not be pushed into sysrepo datastore directly via XML file, but depend on some simple C API. To simplify, the operational data in openconfig-platform.yang, openconfig-platform-transceiver.yang, and openconfig-terminal-device.yang are converted into configurational data. The code block in `push-data.sh` is listed below:

```shell
# cd /root/yang/openconfig-odtn
# Modify operational schema into configurable schema
sed -i '/config false;/d' openconfig-platform-transceiver.yang
sed -i '/config false;/d' openconfig-platform.yang
sed -i '/config false;/d' openconfig-terminal-device.yang
```
3. The last "augment" block in openconfig-platform-transceiver.yang is removed before it's handled by `push-data.sh`, because it causes parsing error of libyang (v0.16-r3).

```shell
# yang/openconfig-odtn/import-yangs.sh
sed -i '481,500d' openconfig-platform-transceiver.yang
```
4. The parsing for `index` leafref in the leaf `logical-channel` of grouping `terminal-logical-chan-assignment-config` fails. So we modify this leafref as 'type uint32;' in `push-data.sh`.
```shell
#cd /root/yang/openconfig-odtn
# Change a leafref to leaf with type uint32, because of parsing errors
sed -i '487,491d' openconfig-terminal-device.yang
sed -i '486a type uint32;' openconfig-terminal-device.yang
```
5. PowerConfig extension.

* openconfig-transport-types.yang
```yang
// grouping definition
    grouping min-max-power-precision2-dbm {
        description 
            "Common grouping for dBm with 2 decimal precision. 
            Values include the minimum and maxminum of the available 
            power range."

        leaf min {
          type decimal64 {
            fraction-digits 2;
          }
          units dBm;
          description
            "The minimum value of the power.";
        }

        leaf max {
          type decimal64 {
            fraction-digits 2;
          }
          units dBm;
          description
            "The maximum value of the power.";
        }
    }
// grouping definition
```
* openconfig-terminal-device.yang
```yang
import openconfig-transport-types { prefix oc-opt-types; }
...
  grouping optical-power-state {
    description
      "Reusable leaves related to optical power state -- these
      are read-only state values. If avg/min/max statistics are
      not supported, the target is expected to just supply the
      instant value";
...
// add power definition
    container input-power-range {
        description 
            "The acceptable range of input optical power level for
            optical transmission.";
        uses oc-opt-types:min-max-power-precision2-dbm
    }

    container target-power-range {
        description 
            "The acceptable range of output optical power level for
            optical transmission.";
        uses oc-opt-types:min-max-power-precision2-dbm
    }
// add power definition
...
  }
...
```

6. TAPI `list` statement error fix
In `emulator-tapi-2.1/tapi/tapi-photonic-media@2018-10-16.yang`, the `list` statements don't contain `key` statement. According to the upgrading 
file `tapi-photonic-media@2019-03-31.yang` defined in https://github.com/OpenNetworkingFoundation/TAPI, we add six `key` statements and build a 
new file `tapi-photonic-media-new.yang` to replace the original one.
