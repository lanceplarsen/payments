FROM amazoncorretto:17-al2023-headless

WORKDIR /app

COPY ./build/libs/spring-boot-payments.jar /app/spring-boot-payments.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/spring-boot-payments.jar"]