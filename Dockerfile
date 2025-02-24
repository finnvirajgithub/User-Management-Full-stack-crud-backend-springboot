FROM openjdk:17-jdk

COPY target/fullstackcrud.jar .

ENTRYPOINT ["java", "-jar", "fullstackcrud.jar"]