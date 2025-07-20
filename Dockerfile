# ------------ Stage 1: Build the JAR -------------
FROM maven:3.9.5-eclipse-temurin-17 AS builder

WORKDIR /app

# Copy all source files
COPY . .

# Build the application
RUN mvn clean package -DskipTests

# ------------ Stage 2: Run the JAR ----------------
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the built jar from the builder image
COPY --from=builder /app/target/*.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
