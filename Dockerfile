FROM openjdk:17-jdk-alpine3.13
ENV APP_HOME = /usr/app/user-service
WORKDIR $APP_HOME
ARG JAR_FILE=target/spring-boot-web.jar
COPY build/libs/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar", "spring-boot:run", "-Dspring-boot.run.profiles=mysql"]