# Instructions how to build the Java backend application of BAemtli
# (MySQL Database is built separately, see docker-compose.yaml)
# Java 21 Image
FROM eclipse-temurin:21-jre

# the working directory
WORKDIR /app

# Copy the gradle build file
COPY build/libs/baemtli-app.jar app.jar

# Open port to Spring Boot Application
EXPOSE 8080

# start the app
ENTRYPOINT ["java", "-jar", "app.jar"]
