FROM openjdk:8-jdk-alpine
ARG JAR_NAME=workspace.jar
ARG JAR_FILE=./target/*.jar
RUN ls ./target
EXPOSE 8091
COPY {JAR_FILE} ${JAR_NAME}
ENTRYPOINT java -jar "/$JAR_NAME"
