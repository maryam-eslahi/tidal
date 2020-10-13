FROM openjdk:8-jdk-alpine


WORKDIR /app
copy gs-spring-boot-0.1.0.jar /app/

#RUN java -jar /app/gs-spring-boot-0.1.0.jar

ENV SERVER_PORT 80

EXPOSE ${SERVER_PORT}

ENTRYPOINT java -jar /app/gs-spring-boot-0.1.0.jar
ENV NAME unknown