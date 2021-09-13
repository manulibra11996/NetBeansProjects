#!/bin/sh
mvn clean package && docker build -t com.arelance/IncludeDummyWeb .
docker rm -f IncludeDummyWeb || true && docker run -d -p 9080:9080 -p 9443:9443 --name IncludeDummyWeb com.arelance/IncludeDummyWeb