FROM openjdk:8
EXPOSE 8080
ADD target/DockerDemo-0.0.1-SNAPSHOT.jar DockerDemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/DockerDemo-0.0.1-SNAPSHOT.jar"]
