FROM openjdk:17.0.1-jdk-slim
COPY build/libs/orderService-0.0.1-SNAPSHOT.jar /app/orderService.jar
EXPOSE 8000
CMD ["java", "-jar", "/app/orderService.jar"]