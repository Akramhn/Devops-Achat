FROM openjdk:11
WORKDIR /achat
COPY ./target/achat-1.0.jar achat.jar
CMD ["java", "-jar", "achat.jar"]