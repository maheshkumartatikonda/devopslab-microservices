# --- Stage 1: Build the JAR ---
FROM maven:3.9.9-eclipse-temurin-21-alpine AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
# Build the application, skipping tests to save time
RUN mvn clean package -DskipTests

# --- Stage 2: Run the Application ---
FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app

# Install tzdata and set timezone in the runtime image
RUN apk add --no-cache tzdata
ENV TZ=Asia/Kolkata

# Copy the built JAR from the previous stage
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]