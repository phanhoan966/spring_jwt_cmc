FROM openjdk:8
EXPOSE 8080
ADD target/spring_jwt_cmc.jar spring_jwt_cmc.jar
ENTRYPOINT ["java", "-jar", "spring_jwt_cmc.jar"]