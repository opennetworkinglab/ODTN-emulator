This directory contains several xml files for NetConf RPC test and RestConf test.
The target machine of NetConf test is the emulator, while the target machine of RestConf test is the ONOS instance.

## 1. NetConf
The suggested command to use these files is listed:
```shell
netconf-console --host=127.0.0.1 --port=11003 -u root -p root --rpc={XML}.xml
```

* **get-components.xml** - This file requests content under path "/openconfig-platform:components" via <get\> operation. The response is saved in `out-get-components.xml`.
* **get-terminal-device.xml** - This file requests content under path "/openconfig-terminal-device:terminal-device" via <get\> operation. The response is saved in `out-get-terminal-device.xml`.
* **merge.xml** - This file modifis the frequency of specific optical channel via <edit-config\> operation.

## 2. RestConf
After topology discovery, there is a TAPI data tree is built based on optical network topology inside ONOS instance, which is aimed to control the connectivity service as a standard northbound API.
* **command in ONOS CLI** - We can use command `odtn-show-tapi-context` in ONOS CLI to get the tapi context defined in `tapi-common@2018-12-10.yang` and its augments. The output is in XML format, which is saved in `out-tapi-context.xml`.
* **curl** - We can also use command `curl -u onos:rocks -X GET http://localhost:8181/onos/restconf/data/tapi-common:context` to get the tapi context. The output is in JSON format by default, so you can add `| jq` at the end of the command to format the output. The output is saved in `out-tapi-context.json`.
