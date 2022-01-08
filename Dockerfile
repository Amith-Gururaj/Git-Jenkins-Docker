FROM openjdk:8
EXPOSE 8080
ADD target/spring-docker-jenkins-demo.jar spring-docker-jenkins-demo.jar
ENTRYPOINT ["java","-jar","/spring-docker-jenkins-demo.jar"]
