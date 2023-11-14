FROM openjdk:8

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ARG LIBS=antlr-4.13.1-complete.jar

ENTRYPOINT ["java", "-cp", "/app.jar:${LIBS}", "Main"]
