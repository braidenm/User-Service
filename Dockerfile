FROM openjdk:17-jdk-alpine3.13
ENV APP_HOME = /usr/app/user-service
WORKDIR $APP_HOME
COPY *.gradle gradle.* gradlew ./
COPY gradle ./gradle
RUN ./gradlew build || return 0
ARG JAR_FILE=target/spring-boot-web.jar
COPY build/libs/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar", "-Dspring-boot.run.profiles=mysql", "./gradlew", "-q", "--no-daemon"]