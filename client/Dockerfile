FROM openjdk:8-jre-alpine
RUN mkdir /opt/client
COPY build/libs/client-0.0.1-SNAPSHOT.jar /opt/client/client-0.0.1-SNAPSHOT.jar
CMD  exec java -jar /opt/client/client-0.0.1-SNAPSHOT.jar