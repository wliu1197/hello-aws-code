FROM openjdk:17-jdk-slim
ADD /target/hello-aws-code-0.0.1-SNAPSHOT.jar /home/app/springboot.jar
EXPOSE 80
CMD exec java -jar /home/app/springboot.jar