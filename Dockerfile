FROM openjdk:8
EXPOSE 8080
ADD D:\jenkins\target/abc2.jar abc2.jar
ENTRYPOINT ["jar", "-jar", "/abc2.jar"]