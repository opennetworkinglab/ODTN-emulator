# ODTN-emulator
Emulator's implementation based on [Netopeer2](https://github.com/CESNET/Netopeer2) in [ODTN project](https://www.opennetworking.org/odtn/). The steps listed below show a simple tutorial for this emulator. For more details, please see [ODTN Wiki Page](https://wiki.onosproject.org/display/ODTN/ODTN).

The directory `emulator-test` is used to test if the emulator and the controller work well.

## 1. Run the emulators

The image could be built by yourself through the command listed below:

```shell
docker-compose up -d
```
After this command, the names of these two emulators should be `odtn-emulator_openconfig_cassini_2_1` and `odtn-emulator_openconfig_cassini_1_1`.

Or you can just pull the personal docker image and create two emulators by using commands:

```shell
docker pull boyuanyan/oc-cassini:0.2
docker run -it -d --name openconfig_cassini_1 -p 11002:830 boyuanyan/oc-cassini:0.2
docker run -it -d --name openconfig_cassini_2 -p 11003:830 boyuanyan/oc-cassini:0.2
```

## 2. Start onos and activate odtn-service locally

```shell
cd ${ONOS_ROOT}
export ONOS_APPS=odtn-service
bazel build onos
bazel run onos-local -- clean
```

## 3. Push node and link information

```shell
# Two nodes with total 32 ports
onos-netcfg localhost device.json
# 23 links
onos-netcfg localhost link.json

# Then create line-side connection
execute-tapi-post-call.py 127.0.0.1 tapi-connectivity:create-connectivity-service line-side
```

## 4. Create/delete the line-side/client-side connectivities

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

## Notes about modification in yang files
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
sed -i '467,486d' openconfig-platform-transceiver.yang
```
4. The parsing for `index` leafref in the leaf `logical-channel` of grouping `terminal-logical-chan-assignment-config` fails. So we modify this leafref as 'type uint32;' in `push-data.sh`.
```shell
#cd /root/yang/openconfig-odtn
# Change a leafref to leaf with type uint32, because of parsing errors
sed -i '487,491d' openconfig-terminal-device.yang
sed -i '486a type uint32;' openconfig-terminal-device.yang
```
