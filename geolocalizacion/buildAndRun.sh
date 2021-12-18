#!/bin/sh
mvn clean package && docker build -t com.mycompany/geolocalizacion .
docker rm -f geolocalizacion || true && docker run -d -p 9080:9080 -p 9443:9443 --name geolocalizacion com.mycompany/geolocalizacion