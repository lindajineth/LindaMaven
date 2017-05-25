#!/bin/bash
cd /tmp
git clone https://github.com/lindajineth/LindaMaven.git
cd LindaMaven/MisServiciosLinda/

mvn clean package

#Crea la Imagen del Proyecto Apartir del Archivo DockerFile Descargado
docker build -t lindajineth/miprimerdocker:lindaflyservices  -f DockerFile .

#Ejecut un Container en Background de la Imagen Creada Se Redirecciona los puertos 8080 al Container
docker run -d -ti -p 8080:8080 lindajineth/miprimerdocker:lindaflyservices
