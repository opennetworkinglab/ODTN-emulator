#!/bin/bash 

export LD_LIBRARY_PATH=/lib:/usr/lib:/usr/local/lib


# sysrepoctl --uninstall --module=lumentum-ote-port-pluggable --revision=2016-06-01
# sysrepoctl --uninstall --module=lumentum-ote-port-optical --revision=2017-07-25
# sysrepoctl --uninstall --module=lumentum-ote-port-ethernet --revision=2017-06-07
# sysrepoctl --uninstall --module=lumentum-ote-connection --revision=2017-02-13
# sysrepoctl --uninstall --module=lumentum-ote-port --revision=2017-06-21

# sysrepoctl --install --yang=lumentum-ote-port.yang  --owner=root:root --permissions=666
# sysrepoctl --install --yang=lumentum-ote-connection.yang  --owner=root:root --permissions=666
# sysrepoctl --install --yang=lumentum-ote-port-ethernet.yang  --owner=root:root --permissions=666
# sysrepoctl --install --yang=lumentum-ote-port-optical.yang  --owner=root:root --permissions=666
# sysrepoctl --install --yang=lumentum-ote-port-pluggable.yang  --owner=root:root --permissions=666

sysrepod

cd /root/config
# Install custom-list
/root/sysrepo/build/examples/application_example lumentum-ote-custom-list &
sleep 2
sysrepocfg --import=custom-lists.xml --format=xml lumentum-ote-custom-list
# Install physical-ports
/root/sysrepo/build/examples/application_example lumentum-ote-port &
sleep 2
sysrepocfg --import=physical-ports.xml --format=xml lumentum-ote-port
# Install edfas
/root/sysrepo/build/examples/application_example lumentum-ote-edfa &
sleep 2
sysrepocfg --import=edfas.xml --format=xml lumentum-ote-edfa
# Install chassis-list, cards
/root/sysrepo/build/examples/application_example lumentum-ote-equipment &
sleep 2
sysrepocfg --import=ote-equipment.xml --format=xml lumentum-ote-equipment
# Install frus
/root/sysrepo/build/examples/application_example lumentum-ote-fru &
sleep 2
sysrepocfg --import=frus.xml --format=xml lumentum-ote-fru
# Install network-elements
/root/sysrepo/build/examples/application_example lumentum-ote-ne &
sleep 2
sysrepocfg --import=network-elements.xml --format=xml lumentum-ote-ne
# Install monitored-channels
/root/sysrepo/build/examples/application_example lumentum-ote-monitored-channel &
sleep 2
sysrepocfg --import=monitored-channels.xml --format=xml lumentum-ote-monitored-channel
# Install connections
/root/sysrepo/build/examples/application_example lumentum-ote-connection &
sleep 2
sysrepocfg --import=connections.xml --format=xml lumentum-ote-connection


# Start Netconf Server
netopeer2-server

tail -f