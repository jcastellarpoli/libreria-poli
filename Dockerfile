FROM openjdk:11

COPY libreria-poli/target/libreria-poli-0.0.1-SNAPSHOT.jar libreria-poli.jar

ENTRYPOINT ["java", "-jar", "/libreria-poli.jar"]

EXPOSE 8080