# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine
# Add Maintainer Info
LABEL maintainer="naman11396@gmail.com"
# Add a volume pointing to /tmp
VOLUME /tmp
EXPOSE 8087
# The application's jar file
ARG WAR_FILE=target/ComplaintPortal2-0.0.1-SNAPSHOT.war
# Add the application's jar to the container
ADD ${WAR_FILE} ComplaintPortal2-0.0.1-SNAPSHOT.war
# Run the jar file
ENTRYPOINT ["java","-jar","/ComplaintPortal2-0.0.1-SNAPSHOT.war"]