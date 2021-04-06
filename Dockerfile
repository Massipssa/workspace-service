FROM adoptopenjdk/openjdk11
ARG JAR_NAME=workspace.jar
ARG JAR_FILE=target/*.jar

COPY "${JAR_FILE}" "${JAR_NAME}"
EXPOSE 8091
ENTRYPOINT ["java","-jar","/workspace.jar"]