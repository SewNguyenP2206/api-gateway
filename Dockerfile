FROM openjdk:oraclelinux8
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY ./mvnw dependency:go-offline
COPY src ./src
CMD ["./mvnw","spring-boot:run"]




