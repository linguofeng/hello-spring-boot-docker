FROM openjdk:alpine

ADD build/libs/hello-spring-boot-docker-0.1.0.jar /app.jar

EXPOSE 8080

CMD ["java", "-jar", "/app.jar"]
