FROM amazoncorretto:17-al2023-headless

RUN useradd -ms /bin/bash spring

WORKDIR /app

COPY ./build/libs/spring-boot-payments.jar /app/spring-boot-payments.jar

RUN chown -R spring:spring /app

USER spring

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/spring-boot-payments.jar"]