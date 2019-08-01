# Start ONOS and Execute connectivity requests
## Start ONOS and activate odtn-service locally

```shell
cd ${ONOS_ROOT}
export ONOS_APPS=odtn-service,roadm,gui2
bazel build onos
bazel run onos-local -- clean
```

## Push node and link information
To push node and link information, you can use *onos-netcfg* script [onos-netcfg](https://github.com/opennetworkinglab/onos/tree/master/tools/package/runtime/bin/onos-netcfg)  that wraps the REST API to provide a more convenient mechanism to upload configuration from the command line. 

If you have doloaded the `ODTN-emulator` repo please go into this folder
```shell
cd topo/
```
If you deployment includes an OLS please go into
```shell
cd with-rest-tapi/
```
if not
```shell
cd without-tapi/
```
**Note** If you are using the emulators pleas skip to `Send information to ONOS`

If you are not using the emulators the files need to be changes by substituting Ips and port accordingly.
Please modify `device.json` and `link.json`. 

### Send information to ONOS
```shell
# The Cassini node owns 32 ports including 16 client-side ports and 16 line-side ports.
# The TAPI node owns 2 ports.
onos-netcfg localhost device.json
# Each Cassini node has one link to the TAPI node.
onos-netcfg localhost link.json
```

After running the above commands, you should be able to see the list of devices and links using ONOS CLI as follows:

To login to ONOS CLI use the following command:
```bash
$ONOS_ROOT/tools/test/bin/onos localhost
```
To retrieve the list of devices, run the following command from ONOS CLI:
```bash
> devices                                                           14:32:02
id=netconf:127.0.0.1:11002, available=true, local-status=connected 33s ago, role=MASTER, type=TERMINAL_DEVICE, mfr=EDGECORE, hw=Cassini, sw=OcNOS, serial=, chassis=1, driver=cassini-ocnos, ipaddress=127.0.0.1, locType=none, name=cassini2, port=11002, protocol=NETCONF
id=netconf:127.0.0.1:11003, available=true, local-status=connected 33s ago, role=MASTER, type=TERMINAL_DEVICE, mfr=EDGECORE, hw=Cassini, sw=OcNOS, serial=, chassis=1, driver=cassini-ocnos, ipaddress=127.0.0.1, locType=none, name=cassini1, port=11003, protocol=NETCONF
id=rest:127.0.0.1:11000, available=true, local-status=connected 34s ago, role=MASTER, type=OLS, mfr=Tapi, hw=0, sw=2.1, serial=Unknown, chassis=0, driver=ols, locType=none, name=rest:127.0.0.1:11000, protocol=REST
```
To retrieve the list of links run the following command from ONOS CLI:

```bash
> links                                                             14:32:04
src=netconf:127.0.0.1:11002/201, dst=rest:127.0.0.1:11000/UNKNOWN(100000035178), type=OPTICAL, state=ACTIVE, durable=true, metric=1.0, expected=true
src=netconf:127.0.0.1:11003/201, dst=rest:127.0.0.1:11000/UNKNOWN(100000035182), type=OPTICAL, state=ACTIVE, durable=true, metric=1.0, expected=true
src=rest:127.0.0.1:11000/UNKNOWN(100000035178), dst=netconf:127.0.0.1:11002/201, type=OPTICAL, state=ACTIVE, durable=true, metric=1.0, expected=true
src=rest:127.0.0.1:11000/UNKNOWN(100000035182), dst=netconf:127.0.0.1:11003/201, type=OPTICAL, state=ACTIVE, durable=true, metric=1.0, expected=true
```

## Create/Delete the line-side/client-side connectivities
If you have the ONOS code locally go into this folder:
```shell
/Users/andrea/onos/tools/test/scenarios/bin/execute-tapi-context-get-call.py
```
if not please pull the scritps from here:  
- [execute-tapi-post-call.py](https://github.com/opennetworkinglab/onos/blob/master/tools/test/scenarios/bin/execute-tapi-delete-call.py)
- [execute-tapi-delete-call.py](https://github.com/opennetworkinglab/onos/blob/master/tools/test/scenarios/bin/execute-tapi-post-call.py)

Then you can run them like this:
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

## Enable the optical channel and tune the wavelength via a flow rule

To enable the optical channel and tune the wavelength via a flow rule, you should do the following steps:

- Activate [optical-model](https://github.com/opennetworkinglab/onos/tree/master/apps/optical-model) using the following command: 
```bash
app activate org.onosproject.optical-model
```

- You can use port-wavelength command to add a flow rule by providing a connectPoint and signal: For example:
```bash
port-wavelength netconf:127.0.0.1:11002/201 4/50/1/dwdm
```

- if you run *flows* command, you should be able to see the list of flows as follows:
```bash
flows                                              08:42:17
deviceId=netconf:127.0.0.1:11002, flowRuleCount=1
    id=90000a7b0d126, state=PENDING_ADD, bytes=0, packets=0, duration=0, liveType=UNKNOWN, priority=100, tableId=0, appId=org.onosproject.optical-model, selector=[IN_PORT:201], treatment=DefaultTrafficTreatment{immediate=[OCH:OchSignal{+1 x 50.00GHz +/- 25.00GHz}, OUTPUT:201], deferred=[], transition=None, meter=[], cleared=false, StatTrigger=null, metadata=null}
deviceId=netconf:127.0.0.1:11003, flowRuleCount=0
```
