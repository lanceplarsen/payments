FROM amazoncorretto:17-al2023-headless

WORKDIR /app

RUN dnf install -y curl && dnf clean all

COPY ./build/libs/spring-boot-payments.jar /app/spring-boot-payments.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/spring-boot-payments.jar"]