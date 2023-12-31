# Installer et executer JBOSS 7.4 sous windows avec WSL2
telecharger [JBOSS 7.4 windows](https://access.redhat.com/jbossnetwork/restricted/softwareDownload.html?softwareId=99481)
```
unzip jboss-eap-7.4.0.zip
cd jboss-eap-7.4
export JBOSS_HOME=$PWD
PATH=$PATH:$PWD/bin
bin/add-user.sh admin tralala
bin/standalone.sh
```

# Quelques commandes
```
jboss-cli.sh --connect
ls -l deployment
ls -l subsystem=datasources/data-source=ExampleDS
/subsystem=datasources/data-source=ExampleDS:test-connection-in-pool
```
