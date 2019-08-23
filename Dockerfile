# 2 Step Docker File for Prod.
#Step-1 Copy and Build the Java code.
FROM gradle:jdk11-slim as javabuild
USER root
WORKDIR /app
COPY ./ /app/
RUN gradle clean build --no-daemon --info
 
#Step-2 Copy the app.jar to new POD or Container to Run the Application 
FROM openjdk:11-jdk-slim
WORKDIR /app
COPY --from=javabuild /app/build/libs/app.jar /app/
ENTRYPOINT ["java","-XX:MinRAMPercentage=50","-XX:MaxRAMPercentage=90","-XX:+PrintFlagsFinal","-jar","-Dserver.port=80","/app/app.jar"]
