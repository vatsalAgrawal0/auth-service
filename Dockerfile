FROM eclipse-temurin:23-jre-alpine
EXPOSE 8085

WORKDIR /app
COPY target/auth-service-*.jar ./auth-service.jar

ENTRYPOINT ["java", "-jar", "auth-service.jar"]
