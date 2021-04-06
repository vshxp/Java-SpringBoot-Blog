FROM maven:3.8.1-jdk-11 AS MAVEN_BUILD
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn clean package

FROM openjdk:16-jdk-alpine3.12
COPY --from=MAVEN_BUILD /build/target/appteste-0.0.1-SNAPSHOT.jar /appteste.jar
CMD ["java", "-jar", "/appteste.jar"]
