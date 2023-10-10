FROM amazoncorretto:21-alpine-jdk

WORKDIR /app

COPY target/aspring-0.0.1-SNAPSHOT.jar /app/aspring.jar

EXPOSE 8080

CMD ["java", "-jar", "aspring.jar"]
