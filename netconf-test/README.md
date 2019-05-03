This directory contains several xml files for Netconf RPC test.
The suggested command to use these files is listed:
```shell
netconf-console --host=127.0.0.1 --port=11003 -u root -p root --rpc={XML}.xml
```
* **get-components.xml** - This file requests content under path "/openconfig-platform:components" via <get\> operation.
* **get-terminal-device.xml** - This file requests content under path "/openconfig-terminal-device:terminal-device" via <get\> operation.
* **merge.xml** - This file modifis the frequency of specific optical channel via <edit-config\> operation.
