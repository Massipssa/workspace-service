FROM openjdk:8-jdk-alpine
ARG JAR_NAME=workspace.jar
ARG JAR_FILE=target/*.jar
EXPOSE 8091
COPY --from=build ${JAR_FILE} ${JAR_NAME}
ENTRYPOINT java -jar "/$JAR_NAME"
