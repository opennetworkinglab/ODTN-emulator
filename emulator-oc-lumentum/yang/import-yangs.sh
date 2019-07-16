# Clean the yang space
sysrepoctl --uninstall --module=iana-if-type --revision=2014-05-08
sysrepoctl --uninstall --module=ietf-ip --revision=2014-06-16
sysrepoctl --uninstall --module=ietf-interfaces --revision=2014-05-08
sysrepoctl --uninstall --module=ietf-netconf-with-defaults --revision=2011-06-01

cd /root/yang
# Make all nodes in data tree configurable.
ls *.yang | xargs -n 1 -I {} sed -i '/config false;/d' {}
# Comment all "when" conditions in "augment" statement
ls *.yang | xargs -n 1 -I {} python comment-when.py {}
# Install all yang modules
ls *.yang | xargs -n 1 -I {} sysrepoctl --install --yang={}  --owner=root:root --permissions=666
