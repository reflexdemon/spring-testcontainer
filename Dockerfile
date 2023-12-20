FROM openjdk:21-slim
LABEL authors="reflex"
EXPOSE 8080
ADD build/libs/spring-testcontainer.jar /app/
WORKDIR /app
CMD java -jar spring-testcontainer.jar
