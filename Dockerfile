FROM openjdk:8
ADD build/libs/discount_manager-0.0.1-SNAPSHOT.jar discount_manager-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","discount_manager-0.0.1-SNAPSHOT.jar"]
