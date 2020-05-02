FROM maven:3.6.3 AS build
COPY . /opt/app/
WORKDIR /opt/app
RUN mvn -f pom.xml clean package

FROM openjdk:11.0.7-jre
WORKDIR /home/app
COPY --from=build /opt/app/target/spring-boot-demo-1.0.0-SNAPSHOT.jar spring-boot-demo.jar
EXPOSE 3360
ENTRYPOINT ["java", "-jar", "/home/app/spring-boot-demo.jar"]
