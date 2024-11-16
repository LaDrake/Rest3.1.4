FROM openjdk:17-jdk-slim
COPY target/SPRINGBOOT3-0.0.1-SNAPSHOT.jar mycontainer.jar
ENTRYPOINT ["java", "-jar", "mycontainer.jar"]