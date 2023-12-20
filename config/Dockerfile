FROM alpine:latest

RUN apk add openjdk17
COPY build/libs/app.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]