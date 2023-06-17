#!/bin/bash
cd EP_DSID/gRPC/Client
mvn package
java -cp /mnt/E/each/2023-1/DSID/EP/EP_DSID/gRPC/Client/target/EP-DSID-1.0-SNAPSHOT.jar Client < /mnt/E/each/2023-1/DSID/EP/client_input
