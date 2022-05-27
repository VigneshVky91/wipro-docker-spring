FROM openjdk
EXPOSE 8085
ADD /target/wipro-spring.jar /wipro-spring.jar
ENTRYPOINT ["java", "-jar", "/wipro-spring.jar"]