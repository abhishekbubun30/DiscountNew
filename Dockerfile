FROM openjdk:8
EXPOSE 8080
ENTRYPOINT ["java","-jar","discount_manager-0.0.1-SNAPSHOT.jar"]
