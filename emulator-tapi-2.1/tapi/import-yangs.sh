# remove 'config false' lines in yang files to help stateful data input.
cd /root/yang
sed -i '/config false;/d' tapi-common@2018-10-16.yang
sed -i '/config false;/d' tapi-photonic-media-new.yang

# Clean the yang space
sysrepoctl --uninstall --module=iana-if-type --revision=2014-05-08
sysrepoctl --uninstall --module=ietf-ip revision=2014-06-16
sysrepoctl --uninstall --module=ietf-interfaces revision=2014-05-08

# Install new yang files about tapi
sysrepoctl --install --yang=tapi-common@2018-10-16.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=tapi-topology@2018-10-16.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=tapi-dsr@2018-10-16.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=tapi-path-computation@2018-10-16.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=tapi-connectivity@2018-10-16.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=tapi-oam@2018-10-16.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=tapi-eth@2018-10-16.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=tapi-notification@2018-10-16.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=tapi-odu@2018-10-16.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=tapi-photonic-media-new.yang --owner=root:root --permissions=666
sysrepoctl --install --yang=tapi-virtual-network@2018-10-16.yang --owner=root:root --permissions=666
