#!/bin/bash
cd EP_DSID/jax/Server
mvn package
java -cp /mnt/E/each/2023-1/DSID/EP/EP_DSID/jax/Server/target/com.vogella.xml.jaxb.maven-0.0.1-SNAPSHOT.jar Publisher
