# LindaMaven

Servicio Web Linda Polania

Este repositorio contiene los archivos:

carpeta MisServiciosLinda dentro de ella esta contenido lo siguiente:

src: codigo fuente de mi servicio, el cual al ser invocado retorna hola mundo son las: e imprime la hora actual

DockerFile: archivo para despliegue del docker, este setea el usuario de ejecución del jboss wildfly 8 que contiene el docker, y copia el .war generado de la compilacion con maven al directorio de despliegue del jboss que esta en el docker creado.

DeployContainerLinda.sh: archivo ejecutable en Linux que clona el git, descargando el codigo, el pom, el dockerfile, hace build del mi codigo con maven y build de la imagen creada en mi dockerhub lindajineth/miprimerdocker:lindaflyservices

El dockerfile, toma el .war generado de la compilacion con maven y lo copia en el directorio de despliege del jboss que esta en el docker.

Se debe descargar el DeployContainerLinda.sh y ejecutarlo, recuerde que debe verificar los permisos del archivo en 755, se le desplegara una imagen del docker y correra el container con el tag lindaflyservices.


