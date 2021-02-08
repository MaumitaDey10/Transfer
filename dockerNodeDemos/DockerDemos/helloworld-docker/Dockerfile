FROM java:8

 EXPOSE 8080

 ADD /target/helloworld-docker-0.0.1-SNAPSHOT.jar helloworld-docker.jar

 ARG JAR_FILE=target/*.jar

 COPY ${​​​​JAR_FILE}​​​​ app.jar

 ENTRYPOINT ["java","-jar","/app.jar"]