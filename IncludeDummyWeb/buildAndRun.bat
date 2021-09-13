@echo off
call mvn clean package
call docker build -t com.arelance/IncludeDummyWeb .
call docker rm -f IncludeDummyWeb
call docker run -d -p 9080:9080 -p 9443:9443 --name IncludeDummyWeb com.arelance/IncludeDummyWeb