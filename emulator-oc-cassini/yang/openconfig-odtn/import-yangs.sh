# Clean the yang space
sysrepoctl --uninstall --module=iana-if-type --revision=2014-05-08
sysrepoctl --uninstall --module=ietf-ip --revision=2014-06-16
sysrepoctl --uninstall --module=ietf-interfaces --revision=2014-05-08
# Install new yang files about openconfig
cd /root/yang/openconfig-odtn

# Before importing, you need to remove the last augment block for
# "/oc-if:interfaces/oc-if:interface/oc-if:state" in openconfig-platform-transceiver.yang.
# Because it will cause parsing errors.
# line number between [481, 500]
sed -i '481,500d' openconfig-platform-transceiver.yang
# You can also use the command below, but it's not recommended.
# ls | xargs -I {} sysrepoctl --install --yang={} --owner=root:root --permissions=666
sysrepoctl --install --yang=ietf-interfaces.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=iana-if-type.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-extensions.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-types.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-yang-types.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-platform-types.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-transport-types.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-interfaces.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-if-ethernet.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-alarm-types.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-platform.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-platform-linecard.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-platform-port.yang --owner=root:root --permissions=666
# delete tha last augment block
sysrepoctl --install --yang=openconfig-platform-transceiver.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-terminal-device.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-transport-line-common.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=openconfig-transport-line-protection.yang --owner=root:root --permissions=666
