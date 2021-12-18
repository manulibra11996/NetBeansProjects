@echo off
call mvn clean package
call docker build -t com.mycompany/geolocalizacion .
call docker rm -f geolocalizacion
call docker run -d -p 9080:9080 -p 9443:9443 --name geolocalizacion com.mycompany/geolocalizacion