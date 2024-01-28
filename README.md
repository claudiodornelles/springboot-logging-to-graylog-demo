# Graylog-Integration-SpringBoot-Java21

## Description
This Java 21 Spring Boot application serves as a testbed for Graylog integration. It exposes an endpoint `/v1/values/odd/next/` that generates a random integer between 0 and 50. If the generated number is not odd, it throws an exception. All HTTP requests are filtered through a Jakarta Servlet Filter, which adds a `trace_id` to `org.slf4j.MDC` for tracing purposes.

The project uses Gradle as the build tool, Lombok for code simplification, and includes a Docker Compose file for setting up Graylog with Elasticsearch and MongoDB.

## Prerequisites
Before running the application, ensure you have the following installed:

- Docker
- Docker Compose
- Java 21

## Logging and Tracing
Logs are structured for easy integration with Graylog. The `trace_id` is added to the Mapped Diagnostic Context (MDC) for better traceability.

### Logback GELF Appender
For sending logs to Graylog, this project utilizes [Logback GELF](https://github.com/osiegmar/logback-gelf), a Logback appender for sending GELF (Graylog Extended Log Format) messages with zero additional dependencies.

## Getting Started
1. Clone the repository:
    ```bash
    git clone https://github.com/claudiodornelles/springboot-logging-to-graylog-demo.git
    cd springboot-logging-to-graylog-demo
    ```

2. Build the application:
    ```bash
    ./gradlew clean build
    ```

3. Start the Docker services using Docker Compose:
    ```bash
    docker-compose up -d
    ```

4. Run the application:
    ```bash
    ./gradlew bootRun
    ```

## Usage
- Access the application at [http://localhost:8080/v1/values/odd/next/](http://localhost:8080/v1/values/odd/next/) to trigger the endpoint.
- Access **Graylog** to see application logs at [http://localhost:9000](http://localhost:9000) using the following credentials
```
Username: admin
Password: admin
```

## Docker Compose Services
- **Graylog**: Access at [http://localhost:9000](http://localhost:9000)
- **Elasticsearch**: Default port [http://localhost:9200](http://localhost:9200)
- **MongoDB**: Default port [http://localhost:27017](http://localhost:27017)

## Acknowledgments
- [Logback GELF](https://github.com/osiegmar/logback-gelf) - Logback appender for sending GELF messages.
