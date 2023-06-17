#!/bin/bash
cd EP_DSID/gRPC/Server
mvn package
java -cp /mnt/E/each/2023-1/DSID/EP/EP_DSID/gRPC/Server/target/ep-dsid-1.0-SNAPSHOT.jar AppServer
