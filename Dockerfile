# docker build -t spring-in-docker:1.1 .

FROM adoptopenjdk/openjdk11:alpine-slim as build                         

MAINTAINER Figsystems@hotmail.com

RUN apk add --no-cache curl
COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .
COPY src src
RUN ./mvnw package -DskipTests

FROM adoptopenjdk/openjdk11:alpine-jre                                   

COPY --from=build target/spring-boot-test-0.0.1-SNAPSHOT.jar spring-boot-web.jar  

EXPOSE 8080/tcp
EXPOSE 8080/udp

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=dev", "spring-boot-web.jar"]
