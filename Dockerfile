# Use an openjdk base image
FROM openjdk:11-jre-slim

# Copy the built jar into the container
COPY target/secondapp.jar /usr/app/secondapp.jar

# Set the working directory
WORKDIR /usr/app

# Run the jar file
CMD ["java", "-jar", "secondapp.jar"]

