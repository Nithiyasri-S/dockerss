FROM eclipse-temurin:17 
COPY target/dockers.jar dockers.jar
CMD ["java","-jar","dockers.jar"]