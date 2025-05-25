# example-rest-api-spring
An example REST API written in Kotlin with Spring Boot

## Prerequisites
* Java 21 (temurin is recommended)

## Setup
Run `./gradlew build` to build the project and run tests.
Run `docker compose up -d postgres` to start only the database.
Run `./gradlew bootRun` to run the application from Gradle (requires a running database).

The API will be served at [http://localhost:8080/]()
