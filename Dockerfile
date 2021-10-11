FROM openjdk:11
ARG JAR_FILE=target/azuregithub-0.0.1.jar
COPY ${JAR_FILE} azuregithub.jar
ENTRYPOINT ["java","-jar","/azuregithub.jar"]
