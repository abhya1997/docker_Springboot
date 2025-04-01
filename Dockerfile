# Use an official OpenJDK image as the base
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the host machine to the container
COPY target/DockerTest-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080
EXPOSE 9595

# Command to run the JAR file
CMD ["java", "-jar", "app.jar"]
