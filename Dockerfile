FROM openjdk:17-jdk-alpine3.13
ENV APP_HOME = /usr/app/user-service
WORKDIR $APP_HOME
ARG JAR_FILE=target/spring-boot-web.jar
COPY /usr/app/user-service/build/libs/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar", "-Dspring-boot.run.profiles=mysql"]