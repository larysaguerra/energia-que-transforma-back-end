FROM amazoncorretto:24-alpine-jdk

COPY target/apienergia-0.0.1-SNAPSHOT.jar /api-v1.jar

ENTRYPOINT ["java", "-jar", "/api-v1.jar"]