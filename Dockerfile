FROM openjdk:8
RUN apt-get update && apt-get install -y unzip
WORKDIR /gradle
RUN curl -L https://services.gradle.org/distributions/gradle-6.5.1-bin.zip -o gradle-6.5.1-bin.zip
RUN unzip gradle-6.5.1-bin.zip
ENV GRADLE_HOME=/gradle/gradle-6.5.1
ENV PATH=$PATH:$GRADLE_HOME/bin
RUN gradle --version
COPY . /
#COPY build.gradle /home/demo1
RUN gradle build


ADD build/libs/discount_manager-0.0.1-SNAPSHOT.jar discount_manager-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","discount_manager-0.0.1-SNAPSHOT.jar"]
