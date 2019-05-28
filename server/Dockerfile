FROM openjdk:8-jre-alpine
RUN mkdir /opt/server
COPY build/libs/server-0.0.1-SNAPSHOT.jar /opt/server/server-0.0.1-SNAPSHOT.jar
CMD  exec java -jar /opt/server/server-0.0.1-SNAPSHOT.jar