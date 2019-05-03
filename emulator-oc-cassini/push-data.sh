#!/bin/bash 

export LD_LIBRARY_PATH=/lib:/usr/lib:/usr/local/lib
# Clean the yang space
sysrepoctl --uninstall --module=openconfig-terminal-device --revision=2017-07-08
sysrepoctl --uninstall --module=openconfig-platform-transceiver revision=2018-05-15
sysrepoctl --uninstall --module=openconfig-platform-port revision=2018-01-20
sysrepoctl --uninstall --module=openconfig-if-ethernet revision=2018-04-10
sysrepoctl --uninstall --module=openconfig-transport-line-common revision=2017-09-08
sysrepoctl --uninstall --module=openconfig-interfaces revision=2018-04-24
sysrepoctl --uninstall --module=openconfig-platform-linecard revision=2017-08-03
sysrepoctl --uninstall --module=openconfig-transport-line-protection revision=2017-09-08
sysrepoctl --uninstall --module=openconfig-platform revision=2018-06-13

cd /root/yang/openconfig-odtn
# Change a leafref to leaf with type uint32, because of parsing errors
sed -i '487,491d' openconfig-terminal-device.yang
sed -i '486a type uint32;' openconfig-terminal-device.yang
# Modify operational schema into configurable schema
sed -i '/config false;/d' openconfig-platform-transceiver.yang
sed -i '/config false;/d' openconfig-platform.yang
sed -i '/config false;/d' openconfig-terminal-device.yang

# Re-install modified yang files
# Start sysrepo
sysrepod
sysrepoctl --install --yang=openconfig-terminal-device.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-interfaces.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-if-ethernet.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-platform.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-platform-linecard.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-platform-port.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-platform-transceiver.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-transport-line-common.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-transport-line-protection.yang --owner=root:root --permissions=666

# Push openconfig-platform and openconfig-terminal-device data into sysrepo
cd /root/config
/root/sysrepo/build/examples/application_example openconfig-platform &
sysrepocfg --import=init-components.xml --format=xml openconfig-platform
/root/sysrepo/build/examples/application_example openconfig-terminal-device &
sysrepocfg --import=init-terminal-device.xml --format=xml openconfig-terminal-device

# Start Netconf Server
netopeer2-server
tail -f
