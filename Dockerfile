FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/demoservice-1.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]