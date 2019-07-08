# Notes about modification in yang files under `emulator-oc-cassini` directory
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
